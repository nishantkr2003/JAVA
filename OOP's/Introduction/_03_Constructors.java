


/*class Test{
    int i;
    String s;

    Test(int a)
    {
        System.out.println("No aggument Constructors");
    }
    public static void main(String[] args) {
        Test t=new Test(5);
        System.out.println(t.i+" "+t.s);
    }
}
*/



public class _03_Constructors {

    public static void main(String[] args) {


        Employee e1=new Employee("Nishant Kumar",20,"0221csml124",90000);
        // Type 1 to print detail of employee
        System.out.println("Employee detail:");
        System.out.println(e1.name+"\n"+e1.age+"\n"+e1.id+"\n"+e1.salary);

        // Tye 2  to print detail of employee to creat another method display_info()
        Employee e2=new Employee("Prince",20,"2201331530132",100000);
        e2.display_info();
    }
}

class Employee{
    String name;
    int age;
    String id;
    float salary;

    Employee(String name,int age,String id,float salary)
    {
        this.name=name;
        this.age=age;
        this.id=id;
        this.salary=salary;

    }

    void display_info(){
        System.out.println("\nEmployee's Information :");
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("ID: "+this.id);
        System.out.println("Salary: "+this.salary);
    }
}