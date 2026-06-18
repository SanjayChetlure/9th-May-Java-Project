package Method1;

public class Sample4
{
    //3: non-static regular method call from same class

    public static void main(String[] args)
    {
          //1: create object of same/current class
          //2: method call -> objName.methodName();

//        className objName=new className();   -> syntax of object creation

           Sample4 s4=new Sample4();
           s4.m5();
           s4.m6();
           s4.m6();

           //1: Sample4 -> className -> as a dataType/ObjectType
           //2: s4 -> object name -> use to refer/identify the object
           //3: new  -> keyword -> use to create blank/empty object
           //4: Sample4() -> className() -> constructor -> use to copy all the members of class into object
    }

    //non-static ->regular method
    public void m5()
    {
        System.out.println("non-static regular method m5 from same class");
    }

    //non-static ->regular method
    public void m6()
    {
        System.out.println("non-static regular method m6 from same class");
    }

}
