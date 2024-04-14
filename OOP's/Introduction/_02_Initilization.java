

//By refrence variable


/* 
class Animal{
    String color;
    int age;
    public static void main(String[] args) {
        Animal buzo=new Animal();
        buzo.color="Black";
        buzo.age=4;
        System.out.println(buzo.color+" "+buzo.age);
    }
}



*/


// By using method

class Animal{
    String color;
    int age;
    void initobj(String c,int a)
    {
        color=c;
        age=a;
    }
    
    public static void main(String[] args) {
        Animal buzo=new Animal();
        buzo.initobj("black",10);
        buzo.display();
    }

    void display()
    {
        System.out.println(color+" "+age);
    }

}