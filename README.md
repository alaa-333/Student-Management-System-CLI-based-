# Student-Management-System-CLI-based-


## 📌 Overview
The **Student Management System** is a simple **Java-based CLI application** that allows users to perform **CRUD operations** (Create, Read, Update, and Delete) on student records. This system utilizes **Java collections and streams** to manage student data efficiently.

## 🚀 Features
- ✅ Add a new student
- 📋 View all students
- 🔍 Search for a student by ID
- ✏️ Update student details
- ❌ Delete a student
- 🚪 Exit the application

## 🏗️ Technologies Used
- **Java 8+** (Lambdas & Streams)
- **Java Collections Framework**
- **Scanner** for user input

## 🔧 Installation & Setup
1. **Clone the Repository**:
   ```sh
   git clone https://github.com/your-repo/student-management.git
   cd student-management
   ```
2. **Compile the Java files**:
   ```sh
   javac Main.java
   ```
3. **Run the Application**:
   ```sh
   java Main
   ```

## 📌 How to Use
### **1️⃣ Adding a Student**
```
Enter Student Name: Alaa Mohamed
Enter Student Email: alaa@email.com
Enter Student Age: 22
Enter Department: Software Engineering
Student added successfully with ID: 101
```

### **2️⃣ Viewing All Students**
```
===== Student List =====
ID: 101 | Name: Alaa Mohamed | Email: alaa@email.com | Age: 22 | Department: Software Engineering
ID: 102 | Name: John Doe | Email: john@email.com | Age: 23 | Department: Computer Science
```

### **3️⃣ Searching for a Student by ID**
```
Enter Student ID to search: 101
Student Found:
ID: 101 | Name: Alaa Mohamed | Email: alaa@email.com | Age: 22 | Department: Software Engineering
```

### **4️⃣ Updating Student Information**
```
Enter Student ID to update: 101
Enter new name (leave blank to keep current): Alaa M.
Enter new email (leave blank to keep current):
Enter new age (leave blank to keep current): 23
Enter new department (leave blank to keep current):
Student updated successfully.
```

### **5️⃣ Deleting a Student**
```
Enter Student ID to delete: 102
Are you sure you want to delete this student? (yes/no): yes
Student deleted successfully.
```

### **6️⃣ Exiting the Program**
```
Thank you for using the Student Management System!
```

## 🛠️ Future Enhancements
- 📌 Save and load student data using a database
- 🌐 Develop a web-based UI using **Spring Boot & Angular**
- 🔐 Add authentication & role-based access control

## 🤝 Contributing
Feel free to submit **pull requests** or open an **issue** if you find bugs or have feature suggestions.

## 📜 License
This project is licensed under the **MIT License**.

---
✨ Happy Coding! ✨

