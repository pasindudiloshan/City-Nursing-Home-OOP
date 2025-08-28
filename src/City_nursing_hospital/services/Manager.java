package City_nursing_hospital.services;

// Concrete class representing a Manager in the hospital

import City_nursing_hospital.models.Cashier;
import City_nursing_hospital.models.Consultant;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Manager extends HospitalService {
    
private static final String CASHIER_FILE_NAME = "cashiers.txt"; // For managing cashiers
private static final String CONSULTANT_FILE_NAME = "consultants.txt"; // For managing consultants

    
    public void addCashier(String employeeId, String username, String email, String contactNumber, String password, JTable jTable) {
        if (employeeId.isEmpty() || username.isEmpty() || email.isEmpty() || contactNumber.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all fields.");
            return;
        }

        // Create a new Cashier object
        Cashier newCashier = new Cashier(employeeId, username, email, contactNumber, password);

        // Prepare new cashier record
        String newRecord = newCashier.toString(); // Ensure Cashier class has a proper toString() implementation

        // Write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CASHIER_FILE_NAME, true))) {
            writer.write(newRecord);
            writer.flush();
            JOptionPane.showMessageDialog(null, "Cashier added successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error writing to file.");
        }

        // Update the JTable
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.addRow(new Object[]{employeeId, username, email, contactNumber});
    }
    
    public void loadCashierData(JTable jTable) {
    DefaultTableModel model = (DefaultTableModel) jTable.getModel(); // Get the table model

    // Clear existing rows to avoid duplication
    model.setRowCount(0); 

    try (BufferedReader reader = new BufferedReader(new FileReader(CASHIER_FILE_NAME))) {
        String line;
        String employeeId = "", username = "", email = "", contactNumber = "", password = "";

        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Employee ID: ")) {
                employeeId = line.substring("Employee ID: ".length());
            } else if (line.startsWith("Username: ")) {
                username = line.substring("Username: ".length());
            } else if (line.startsWith("E-mail: ")) {
                email = line.substring("E-mail: ".length());
            } else if (line.startsWith("Contact Number: ")) {
                contactNumber = line.substring("Contact Number: ".length());
            } else if (line.startsWith("Password: ")) {
                password = line.substring("Password: ".length());
                // Add the read data to the table
                model.addRow(new Object[]{employeeId, username, email, contactNumber, password});
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error loading cashier data: " + e.getMessage());
    }
}

    
    // Method to delete cashier details
    public void deleteCashier(JTable jTable) {
        int selectedRow = jTable.getSelectedRow(); // Get the selected row

        if (selectedRow >= 0) {
            String cashierIdToDelete = jTable.getValueAt(selectedRow, 0).toString(); // Get the cashier ID

            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            model.removeRow(selectedRow); // Remove from the table

            try {
                StringBuilder fileContent = new StringBuilder();
                BufferedReader reader = new BufferedReader(new FileReader(CASHIER_FILE_NAME));
                String line;
                boolean isRecordDeleted = false;

                while ((line = reader.readLine()) != null) {
                    if (line.startsWith("Employee ID: ") && line.substring("Employee ID: ".length()).equals(cashierIdToDelete)) {
                        // Skip the record to delete it
                        while (line != null && !line.isEmpty()) {
                            line = reader.readLine(); // Skip entire block
                        }
                        isRecordDeleted = true; // Mark as deleted
                    } else {
                        fileContent.append(line).append("\n"); // Keep other records
                    }
                }
                reader.close();

                if (!isRecordDeleted) {
                    JOptionPane.showMessageDialog(null, "Cashier ID not found in file.");
                    return;
                }

                // Write the updated content back to the file
                BufferedWriter writer = new BufferedWriter(new FileWriter(CASHIER_FILE_NAME));
                writer.write(fileContent.toString());
                writer.close();

                JOptionPane.showMessageDialog(null, "Cashier details deleted successfully!");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error deleting cashier details: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No cashier selected for deletion.");
        }
    }
    
     // Method to add a consultant
     public void addConsultant(String conId, String name, String email, String contactNumber, String specialization, String department, JTable jTable) {
    if (conId.isEmpty() || name.isEmpty() || email.isEmpty() || contactNumber.isEmpty() || specialization.isEmpty() || department.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill all fields.");
        return;
    }

    // Create a new Consultant object
    Consultant newConsultant = new Consultant(conId, name, email, contactNumber, specialization, department);

    // Prepare new consultant record
    String newRecord = newConsultant.toString(); 

    // Write to consultant file
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(CONSULTANT_FILE_NAME, true))) {
        writer.write(newRecord);
        writer.flush();
        JOptionPane.showMessageDialog(null, "Consultant added successfully!");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error writing to file.");
    }

    // Update the JTable
    DefaultTableModel model = (DefaultTableModel) jTable.getModel();
    model.addRow(new Object[]{conId, name, email, contactNumber, specialization, department});
}

@Override
// Method for loading consultant data into a table model
public void loadConsultantData(DefaultTableModel model) {
    try (BufferedReader reader = new BufferedReader(new FileReader(CONSULTANT_FILE_NAME))) {
        String line;
        String id = "", name = "", email = "", contact = "", specialization = "", department = "";

        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Consultant ID: ")) {
                id = line.substring("Consultant ID: ".length()).trim();
            } else if (line.startsWith("Name: ")) {
                name = line.substring("Name: ".length()).trim();
            } else if (line.startsWith("E-mail: ")) {
                email = line.substring("E-mail: ".length()).trim();
            } else if (line.startsWith("Contact Number: ")) {
                contact = line.substring("Contact Number: ".length()).trim();
            } else if (line.startsWith("Specialization: ")) {
                specialization = line.substring("Specialization: ".length()).trim();
            } else if (line.startsWith("Department: ")) {
                department = line.substring("Department: ".length()).trim();

                // After all details for the consultant are captured, add a new row to the table model
                model.addRow(new Object[]{id, name, email, contact, specialization, department});
                
                // Reset values for the next consultant
                id = ""; name = ""; email = ""; contact = ""; specialization = ""; department = "";
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error loading consultant data: " + e.getMessage());
    }
}

   
     // Method to delete a consultant
    public void deleteConsultant(String conIdToDelete, JTable jTable) {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        int rowCount = model.getRowCount();

        // Find the row to delete
        for (int i = 0; i < rowCount; i++) {
            if (model.getValueAt(i, 0).toString().equals(conIdToDelete)) {
                model.removeRow(i);
                break;
            }
        }

        // Update the file
        try {
            StringBuilder fileContent = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(CONSULTANT_FILE_NAME));
            String line;
            boolean isRecordDeleted = false;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Consultant ID: ") && line.substring("Consultant ID: ".length()).equals(conIdToDelete)) {
                    // Skip the record to delete it
                    while (line != null && !line.isEmpty()) {
                        line = reader.readLine();
                    }
                    isRecordDeleted = true;
                } else {
                    fileContent.append(line).append("\n");
                }
            }
            reader.close();

            if (!isRecordDeleted) {
                JOptionPane.showMessageDialog(null, "Consultant ID not found in file.");
                return;
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(CONSULTANT_FILE_NAME));
            writer.write(fileContent.toString());
            writer.close();

            JOptionPane.showMessageDialog(null, "Consultant details deleted successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error deleting Consultant details: " + e.getMessage());
        }
    }
    

    @Override
    public void performRoleSpecificFunctionality() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
