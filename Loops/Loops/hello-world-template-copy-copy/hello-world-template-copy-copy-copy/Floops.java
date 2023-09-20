
/**
 * Write a description of class Floops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Floops
{

    public static void run()
    {

        for (int i = 0; i <= 15; i = i + 1){
            System.out.println("i is = "+i);
        }
        for(int j = 10; j != 0; j = j -2){
            System.out.println("j is = "+j);
        }
        for (int k = 10; k != 0; k = k + (-3)){ 
            System.out.println("k is = "+k);
        }//it will never stop bc it skips 0
    }

    public static void main(String[] args)
    {
        Floops hw = new Floops();
        hw.run();
    }
}
