import java.util.Random;

/**
* 
* @author: Amir Armion 
* 
* @version: V.01
* 
*/
public class RollingDice 
{
    public void simpleSimulate1(int rolls)
    {
        Random rand = new Random();
        
        int[] counter = new int[11];
        
        for(int i = 0; i < rolls; i++)
        {
            int dice1 = rand.nextInt(6) + 1;
            int dice2 = rand.nextInt(6) + 1;
            
            int total = dice1 + dice2;
            
            System.out.println("The roll is: " + dice1 + " + " + dice2 + " = " + total);
            
            counter[total - 2]++;            
        }
        
        System.out.println("\n------ Number of occurrence ------ \n");
        
        for(int i = 0; i < counter.length; i++)
        {
            System.out.println("Number of total " + (i + 2) + " is: " + counter[i]);
        }
    }

    public void simpleSimulate2(int rolls)
    {
        Random rand = new Random();
        
        int twos    = 0;
        int twelves = 0;

        for(int i = 0; i < rolls; i++)
        {
            int dice1 = rand.nextInt(6) + 1;
            int dice2 = rand.nextInt(6) + 1;
            
            int total = dice1 + dice2;
            
            if(total == 2)
            {
                twos++;
            }
            else if(total == 12)
            {
                twelves++;
            }
        }
        
        System.out.println("\nNumber of twos: " + twos + "\nNumber of twelves: " + twelves);
    }

    public void testSimpleSimulate1()
    {
        simpleSimulate1(10);
    }
    
        public void testSimpleSimulate2()
    {
        simpleSimulate2(100);
    }
}
