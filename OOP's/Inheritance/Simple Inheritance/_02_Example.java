class A{
    void showA()
    {
        System.out.println("A class called");
    }
}

class B extends A{
    void showB()
        {
            System.out.println("B class called");
        }
        public static void main(String[] args) {
            A ob1 =new A();
            ob1.showA();
            

            B ob2=new B();
            ob2.showA();
            ob2.showB();

        }
}