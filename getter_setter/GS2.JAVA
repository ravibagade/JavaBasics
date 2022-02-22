class Employee implements java.io.Serializable
{
    int id;
    String name;
    public Employee()
{
	
}
public void setId(int id) 
    { 
        this.id = id; 
    } 
public int getId() 
    { 
        return id; 
    } 
public void setName(String name) 
    { 
        this.name = name; 
    } 
public String getName() 
    { 
        return name; 
    } 
}

class GS2 
{
public static void main(String args[])
{
    Employee s = new Employee(); 
    s.setName("Chandler"); 
     s.setId(1);
    System.out.println(s.getName());
    System.out.println(s.getId()); 

     Employee s1 = new Employee(); 
    s1.setName("Chandle"); 
     s1.setId(2);
    System.out.println(s1.getName());
    System.out.println(s1.getId());
}
}	
