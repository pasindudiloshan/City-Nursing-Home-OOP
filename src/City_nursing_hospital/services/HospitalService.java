package City_nursing_hospital.services;

import City_nursing_hospital.models.Patient;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

// Abstract class defining common functionalities for hospital services
public abstract class HospitalService {

    protected static final String FILE_NAME = "patients.txt";
    // Define file name for patients
    private static final String CONSULTANT_FILE_NAME = "consultants.txt"; // For managing consultants

    public abstract void performRoleSpecificFunctionality();
    
    // Method for adding a patient
    public void addPatient(String newPatientId, String name, String ageStr, String nic, String contactNumber, Date appointmentDate, String category, String specialist) {
    // Validate if any field is empty
    if (newPatientId.isEmpty() || name.isEmpty() || ageStr.isEmpty() || nic.isEmpty() || contactNumber.isEmpty() || category.isEmpty() || specialist.isEmpty()) {
        JOptionPane.showMessageDialog(null, "All fields are required. Please fill in all details.");
        return;
    }

    // Validate age input
    int age;
    try {
        age = Integer.parseInt(ageStr);
        if (age <= 0) {
            JOptionPane.showMessageDialog(null, "Age must be a positive number.");
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid age entered. Please enter a valid number.");
        return;
    }

    // Validate NIC format (example: checking length for a simple NIC)
    if (nic.length() != 10 && nic.length() != 12) {
        JOptionPane.showMessageDialog(null, "Invalid NIC. NIC should be 10 or 12 characters long.");
        return;
    }

    // Validate contact number (assuming it should be 10 digits)
    if (!contactNumber.matches("\\d{10}")) {
        JOptionPane.showMessageDialog(null, "Invalid contact number. It should contain exactly 10 digits.");
        return;
    }

    // Validate appointment date (example: ensuring the date is not in the past)
    Date currentDate = new Date();
    if (appointmentDate.before(currentDate)) {
        JOptionPane.showMessageDialog(null, "Appointment date cannot be in the past.");
        return;
    }

    // Create Patient object
    Patient newPatient = new Patient(newPatientId, name, age, nic, contactNumber, appointmentDate, category, specialist);

    // Prepare new patient record for file
    String newRecord = "Patient ID: " + newPatient.getPatientId() + "\n"
            + "Name: " + newPatient.getName() + "\n"
            + "Age: " + newPatient.getAge() + "\n"
            + "NIC: " + newPatient.getNic() + "\n"
            + "Contact Number: " + newPatient.getContactNumber() + "\n"
            + "Appointment Date: " + new SimpleDateFormat("dd-MM-yyyy").format(newPatient.getAppointmentDate()) + "\n"
            + "Category: " + newPatient.getCategory() + "\n"
            + "Specialist: " + newPatient.getSpecialist() + "\n"
            + "\n"; // Separator for records

    // Write to file
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
        writer.write(newRecord);
        JOptionPane.showMessageDialog(null, "Patient details added successfully!");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error adding patient details: " + e.getMessage());
    }
}
    
    // Method for loading patient data into a table model
    public void loadPatientData(DefaultTableModel model) {
    try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
        String line;
        String id = "", name = "", age = "", nic = "", contact = "", date = "", category = "", specialist = "";

        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Patient ID: ")) {
                id = line.substring("Patient ID: ".length());
            } else if (line.startsWith("Name: ")) {
                name = line.substring("Name: ".length());
            } else if (line.startsWith("Age: ")) {
                age = line.substring("Age: ".length());
            } else if (line.startsWith("NIC: ")) {  // Added NIC handling
                nic = line.substring("NIC: ".length());
            } else if (line.startsWith("Contact Number: ")) {
                contact = line.substring("Contact Number: ".length());
            } else if (line.startsWith("Appointment Date: ")) {
                date = line.substring("Appointment Date: ".length());
            } else if (line.startsWith("Category: ")) {
                category = line.substring("Category: ".length());
            } else if (line.startsWith("Specialist: ")) {
                specialist = line.substring("Specialist: ".length());
                // Add a new row to the table model including NIC
                model.addRow(new Object[]{id, name, age, nic, contact, date, category, specialist}); // NIC added here
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error loading patient data: " + e.getMessage());
    }
}

    // Method for searching a patient
    public void filterPatient(DefaultTableModel model, String searchTerm) {
    try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
        String line;
        String id = "", name = "", age = "", contact = "", date = "", category = "", specialist = "";

        model.setRowCount(0); // Clear the table
        
        boolean found = false; // Flag to check if any patient is found

        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Patient ID: ")) {
                id = line.substring("Patient ID: ".length());
            } else if (line.startsWith("Name: ")) {
                name = line.substring("Name: ".length());
            } else if (line.startsWith("Age: ")) {
                age = line.substring("Age: ".length());
            } else if (line.startsWith("Contact Number: ")) {
                contact = line.substring("Contact Number: ".length());
            } else if (line.startsWith("Appointment Date: ")) {
                date = line.substring("Appointment Date: ".length());
            } else if (line.startsWith("Category: ")) {
                category = line.substring("Category: ".length());
            } else if (line.startsWith("Specialist: ")) {
                specialist = line.substring("Specialist: ".length());

                // If the name matches the search term, add it to the table model
                if (name.toLowerCase().contains(searchTerm.toLowerCase())) {
                    model.addRow(new Object[]{id, name, age, contact, date, category, specialist});
                    found = true; // Set the flag to true if a match is found
                }
            }
        }

        // If no patients were found, show a message
        if (!found) {
            JOptionPane.showMessageDialog(null, "No patient named \"" + searchTerm + "\" here.");
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error searching patient data: " + e.getMessage());
    }
}

    // Method for delete a patient
    public void deletePatient(JTable jTable1) {
        int selectedRow = jTable1.getSelectedRow();  // Get the selected row in JTable

    if (selectedRow >= 0) {
        // Get the Patient ID from the selected row
        String patientIdToDelete = jTable1.getValueAt(selectedRow, 0).toString();

        // Remove the row from the JTable model
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.removeRow(selectedRow);

        try {
            // Read the entire file content
            StringBuilder fileContent = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            boolean isRecordDeleted = false;
            boolean skipRecord = false;

            while ((line = reader.readLine()) != null) {
                // Check if this line starts a patient record
                if (line.startsWith("Patient ID: ") && line.substring("Patient ID: ".length()).equals(patientIdToDelete)) {
                    skipRecord = true; // Mark this record to be skipped
                    isRecordDeleted = true; // Mark as deleted
                }

                // Skip the entire block of patient details
                if (skipRecord) {
                    if (line.isEmpty()) {
                        // End of the patient record
                        skipRecord = false;
                    }
                    continue;
                }

                // If not skipping, add the line to the fileContent
                fileContent.append(line).append("\n");
            }
            reader.close();

            if (!isRecordDeleted) {
                JOptionPane.showMessageDialog(null, "Patient ID not found in file.");
                return;
            }

            // Write the updated content back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));
            writer.write(fileContent.toString());
            writer.flush();
            writer.close();

            // Notify the user
            JOptionPane.showMessageDialog(null, "Patient details deleted successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error deleting patient details: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "No patient selected for deletion.");
    }
}

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

    // Method for filtering consultant data based on name input
    public void filterConsultant(String searchText, DefaultTableModel model) {
        try (BufferedReader reader = new BufferedReader(new FileReader(CONSULTANT_FILE_NAME))) {
        String line;
        String id = "", name = "", email = "", contact = "", specialization = "", department = "";

        // Clear the current table model
        model.setRowCount(0);
        
        // Read first line to validate format
        line = reader.readLine();
        if (line == null || !line.startsWith("Consultant ID: ")) {
            JOptionPane.showMessageDialog(null, "The consultant data format is incorrect.");
            return; // Exit method if the file format is wrong
        }

        boolean found = false; // Flag to check if any consultant is found

        // Continue reading the file and filtering consultants
        do {
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

                // Check if the name contains the search text (case-insensitive)
                if (name.toLowerCase().contains(searchText.toLowerCase())) {
                    // Add the filtered consultant to the table
                    model.addRow(new Object[]{id, name, email, contact, specialization, department});
                    found = true; // Set the flag to true if a match is found
                }

                // Reset values for the next consultant
                id = ""; name = ""; email = ""; contact = ""; specialization = ""; department = "";
            }
        } while ((line = reader.readLine()) != null);

        // If no consultants were found, show a message
        if (!found) {
            JOptionPane.showMessageDialog(null, "No consultant named \"" + searchText + "\" here.");
        }

    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error filtering consultant data: " + e.getMessage());
    }
}


}