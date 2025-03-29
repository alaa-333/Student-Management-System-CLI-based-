package StudentSystem;

public class Student {

    private String name;
    private String email;
    private String age;
    private String department;
    private static int count = 0;
    private int id;

    public Student (String name , String email , String age , String department)
    {
        this.name = name;
        this.email = email;
        this.age = age;
        this.department = department;
        this.id = ++count;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setAge(String age)
    {
        this.age = age;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    // gettrs methods
    public String getAge()
    {
        return age;
    }

    public String getDepartment()
    {
        return department;
    }

    public String getEmail()
    {
        return email;
    }

    public String getName()
    {
        return name;
    }

    public  int getId()
    {
        return id;
    }

    @Override
    public String toString()
    {
        return "Student|" +"ID: "+getId()+ " | name='" + name + '\'' + "| email='" + email + '\'' + "| age=" + age + "| department='" + department + '\'' + '|';
    }


}


