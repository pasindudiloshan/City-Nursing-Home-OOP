package City_nursing_hospital.models;


import City_nursing_hospital.services.HospitalService;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;




public class Cashier extends HospitalService {
      
    private final String employeeId;
    private final String username;
    private final String email;
    private final String contactNumber;
    private final String password; 

    // Constructor with parameters
    public Cashier(String employeeId, String username, String email, String contactNumber, String password) {
        this.employeeId = employeeId;
        this.username = username;
        this.email = email;
        this.contactNumber = contactNumber;
        this.password = password; 
    }

    // Getter methods
    public String getEmployeeId() {
        return employeeId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getPassword() {
        return password; // Allow access to the plain text password
    }

    // Method to check passwords
    public boolean checkPassword(String inputPassword) {
        return password.equals(inputPassword);
    }

    // Method to load patient data
    @Override
    public void loadPatientData(DefaultTableModel model) {
        super.loadPatientData(model); // Call the method from HospitalService
    }
    
    @Override
    public void deletePatient(JTable jTable1) {
        // Use the HospitalService deletePatient method to delete a patient
        super.deletePatient(jTable1);
    }
     
    // toString method (avoid displaying password directly)
    @Override
    public String toString() {
        return "Employee ID: " + employeeId + "\n" +
               "Username: " + username + "\n" +
               "E-mail: " + email + "\n" +
               "Contact Number: " + contactNumber + "\n" +
               "Password: " + password + "\n"; // Caution: Exposing passwords
    }

    @Override
    public void performRoleSpecificFunctionality() {
        throw new UnsupportedOperationException("Not supported yet.");
    }



}
