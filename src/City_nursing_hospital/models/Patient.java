package City_nursing_hospital.models;


import java.util.Date;

public class Patient {
    // Attributes (Encapsulation)
    private String patientId;
    private String name;
    private int age;
    private String nic;
    private String contactNumber;
    private Date appointmentDate;
    private String category;
    private String specialist;

    // Constructor
    public Patient(String patientId, String name, int age, String nic, String contactNumber, Date appointmentDate, String category, String specialist) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.nic = nic;
        this.contactNumber = contactNumber;
        this.appointmentDate = appointmentDate;
        this.category = category;
        this.specialist = specialist;
    }

    // Getters and Setters (Encapsulation)
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    // Method to display patient details (Behavior)
    public void displayPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("NIC: " + nic);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Appointment Date: " + appointmentDate);
        System.out.println("Category: " + category);
        System.out.println("Specialist: " + specialist);
    }

    // Override toString method for better representation
    @Override
    public String toString() {
        return "Patient{" +
                "patientId='" + patientId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nic='" + nic + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", category='" + category + '\'' +
                ", specialist='" + specialist + '\'' +
                '}';
    }
}
