/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrollment.system;
import java.util.*;

public class EnrollmentSystem {
    public static Scanner in = new Scanner(System.in);
    public static int id, age, option, removeById;
    public static String name, gender, course, searchbyName;
    //ArrayList
    private List<Students> studentList = new ArrayList<>();
    
    //Add new students method
    private void addNewStudents(Students students)
    {
        studentList.add(students);
    }
    
    //Search by name method
    private void searchByName(String name)
    {
        //For loop to read all the data from our arraylist
        for(Students students: studentList)
        {
            //Compare value to make sure the search value is exact to what we will find
            if(students.getName().equals(name))
            {
                System.out.println("\n--------------------------------------"
                        + "\nSearch student Details"
                        + "\n--------------------------------------"
                        + "\nID: " + students.getId()
                        + "\nName: " + students.getName()
                        + "\nGender: " + students.getGender()
                        + "\nAge: " + students.getGender()
                        + "\nCourse: " + students.getCourse()
                        + "\n");
            }
        }
    }
    //remove by Id method
    private void removeByID(int id)
    {
        //For loop to read all the data from our arraylist
        for(Students students: studentList)
        {
            //Compare value to make sure the search value is exact to what we will find
            try
            {
                if(students.getId() == id)
                {
                    studentList.remove(students);
                }
            }
            catch(Exception ex)
            {
                System.out.println("Removing students error " + ex.getMessage());
            }
        }
    }
    
    //Show all student list method
    private void showAllStudentEnrolled()
    {
        //For loop to read all the data from our arraylist
        for(Students students: studentList)
        {
            System.out.println("\n--------------------------------------"
                        + "\nstudent Details"
                        + "\n--------------------------------------"
                        + "\nID: " + students.getId()
                        + "\nName: " + students.getName()
                        + "\nGender: " + students.getGender()
                        + "\nAge: " + students.getGender()
                        + "\nCourse: " + students.getCourse()
                        + "\n");
        }
    }
    //Option method
    private void option()
    {
        System.out.print("\n--------------------------------------"
                        + "\nChoose the following"
                        + "\n--------------------------------------"
                        + "\n1. New Student: " 
                        + "\n2. Print all Student List: "
                        + "\n3. Search student by Name: "
                        + "\n4. remove student by Id: "
                        + "\n5. Exit: "
                        + "\n   Enter here: ");
    }
    //Input method
    private Students inputNewStudents()
    {
        System.out.print("\n--------------------------------------\nInput student details: \n--------------------------------------\nID: ");
        id = in.nextInt();
        System.out.print("Name: ");
        name = in.next();
        System.out.print("Gender: ");
        gender = in.next();
        System.out.print("Age: ");
        age = in.nextInt();
        System.out.print("Course: ");
        course = in.next();
        System.out.println();
        
        Students students = new Students(id, name, gender, age, course);
        return students;
    }
    
    public static void mainFuntion()
    {
        //All the function is private except this last two methods
        //The rule we need to call the main function inside the class to call the private functions
        EnrollmentSystem er = new EnrollmentSystem();
        
        //looping to automate the option
        //Lets try to used do-while
        do
        {
            er.option();
            option = in.nextInt();
            switch(option)
            {
                case 1: 
                    //To call the input method
                    Students students = er.inputNewStudents();
                    //Then after the input pass all the value to arraylist
                    er.addNewStudents(students);
                    break;
                case 2: 
                    er.showAllStudentEnrolled();
                    break;
                case 3: 
                    System.out.println("\nSearch student name");
                    searchbyName = in.next();
                    er.searchByName(searchbyName);
                    break;
                case 4: 
                    System.out.println("\nRemove to students by Id");
                    removeById = in.nextInt();
                    er.removeByID(removeById);
                    break;
                case 5: 
                    System.exit(0);
                    break;
            }
        }while(option != 5);
        
    }
    public static void main(String[] args) {
       mainFuntion();
    }
    
}
