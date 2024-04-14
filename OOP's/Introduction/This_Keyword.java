// This  keyword is used to invoke current class instance variable.
// This keywor can be used to invoke current class method(Implicitly).
// This() keyword can be used to invoke class constructor.
//this keyword can be used to pass an argument in method call.
// this kewword can be used to pass an argument in the constructor in the constructor call.
// thi an be used to return current class instance from the methid.


public class This_Keyword {

    public static void main(String[] args) {
        Test t= new Test();
        t.setValue(10);
        t.show();
    }
}

class Test{
    int i;
    void setValue(int i)
    {
        this.i=i;
    }
    void show()
    {
        System.out.println(i);
        
    }
}

