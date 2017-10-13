package junit.junit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         System.out.println( "Hello World!" );
        System.out.println("This is a Maven Basic Demo");
    
        int res= Calculator.add(34, 64);
         int sub= Calculator  .subtract(24, 7);
        System.out.println("Addition  :"+ res);
        System.out.println("Subtraction : "+ sub);
    }
}
