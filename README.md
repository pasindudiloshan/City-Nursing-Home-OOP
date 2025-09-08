# 🏥 City Nursing Home - Hospital Management System

As technology rapidly advances, the demand for **automated systems** in healthcare is growing.  
The **City Nursing Home Hospital Management System** was developed to streamline operations for both managers and cashiers by replacing manual processes with a computerized solution.  

---
## 📌 Features

This system was designed and implemented using **Object-Oriented Programming (OOP) principles**, supported by UML diagrams for system modeling. It focuses on:  

- Managing **patients, consultants, and cashiers** through CRUD operations  
- Providing a secure **login and authentication** process  
- Ensuring **data integrity** with validation and error handling  
- Offering a simple and **user-friendly interface** for staff  

By applying encapsulation, inheritance, abstraction, and polymorphism, the system demonstrates efficient design and maintainability, making it a practical solution for hospital management needs. 

---


---
## 🛠️ Technologies Used

- **Programming Language**: Java  
- **GUI Framework**: Java Swing  
- **File Handling**: Text files (`.txt`) 
- **Testing**: Manual test cases with defined test plan
- **IDE**: NetBeans

---
## 💻 Setup Instructions

Follow these steps to run the project locally using **NetBeans**:

1. **Clone the repository**  
   ```bash
   git clone https://github.com/your-username/hospital-management-system.git
   
2. **Open in NetBeans**
   
   Launch NetBeans IDE, 
   Go to File > Open Project, 
   Browse to the cloned project folder and select it

4. **Build the Project**
   
   Right-click on the project in the Projects panel, 
   Select Clean and Build

6. **Run the Application**
   
   Right-click the project again, 
   Select Run, 
   The Java Swing GUI will launch

8. **Login**
   
   Use sample credentials defined in the project (e.g., Manager / Cashier)

---
## 📁 Folder Structure

```text
citynursinghome/
├── src/
│   └── City_nursing_hospital/
│       ├── Interfaces/
│       │   ├── addcashier.java
│       │   ├── addconsultant.java
│       │   ├── addpatient.java
│       │   ├── cashierGUI.java
│       │   ├── cashier_loginGUI.java
│       │   ├── homeGUI.java
│       │   ├── loadingGUI.java
│       │   ├── managerGUI.java
│       │   ├── manager_loginGUI.java
│       │   ├── viewconsultant.java
│       │   └── viewpaient.java
│       ├── models/
│       │   ├── Cashier.java
│       │   ├── Consultant.java
│       │   └── Patient.java
│       └── services/
│           ├── HospitalService.java
│           └── Manager.java
├── City_nursing_images/
├── test/
├── lib/
└── README.md


