
/**
 * Write a description of class doloops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class doloops
{
    public static void main(String[] args)
    {
        int i = 0;
        int k = 30;
        int a = 5;
        int b = 10; 
        int j = 5;
        do {
            System.out.println("I get printed 3 times");
            i = i + 5;
        } while (i < 15);
        do {
            System.out.println("I get printed 3 times too");
            k = k - 10;
        }while (k > 5);
        do {
            System.out.println("I get printed once");
            a = a + 9;
        }while ( a < 10 && b <= 20);

    }
}
