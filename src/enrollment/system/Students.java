/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrollment.system;

public class Students {
    private int id, age;
    private String name, gender, course;
    
    //Constructor
    public Students(int id, String name, String gender, int age, String course)
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.course = course;
    }
    //Getter and Setter
    //Get methods
    public int getId()
    {
        return this.id;
    }
    //Set method
    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getGender()
    {
        return this.gender;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    
    public int getAge()
    {
        return this.age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public String getCourse()
    {
        return this.course;
    }
    public void setCourse(String course)
    {
        this.course = course;
    }
}
