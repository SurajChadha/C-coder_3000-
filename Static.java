class Example
{
    int x;
    static int y;
    
    public void fun1() {}
    public static void fun2(){
        y=4;
    }
    static class Test
    {
        public static String country="India";
        
    }
}
public class Hello
{
   public static void main(String[] args)
   {
       Example ex1=new Example();
        Example ex2=new Example();
        Example.y=5;
        Example.fun2();
        System.out.println(Example.Test.country);
   }
}