package City_nursing_hospital.models;

public class Consultant {
    // Attributes (Encapsulation)
    private final String conId;
    private String name;
    private String email;
    private String contactNumber;
    private String specialization;
    private String department;

    // Constructor
    public Consultant(String consultantId, String name, String email, String contactNumber, 
                      String specialization, String department) {
        this.conId = consultantId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.specialization = specialization;
        this.department = department;
    }

    // Getters
    public String getConsultantId() {
        return conId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getDepartment() {
        return department;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Method to represent consultant data as a formatted string
    @Override
    public String toString() {
        return "Consultant ID: " + conId + "\n" +
               "Name: " + name + "\n" +
               "E-mail: " + email + "\n" +
               "Contact Number: " + contactNumber + "\n" +
               "Specialization: " + specialization + "\n" +
               "Department: " + department + "\n";
    }
}
