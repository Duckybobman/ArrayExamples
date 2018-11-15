import java.util.ArrayList;

public class Digits 
{
     private ArrayList<Integer> digitList;   
        
     public Digits()
     {
     }
        
     public Digits(int num)
     {
         digitList = new ArrayList<Integer>();
         int x = num;
         if (num==0)
            digitList.add(new Integer (0));
         else
         {
             while (x>0)
             {
                 int n = (x%10);
                 digitList.add(new Integer(n)); 
                 x=n/10;
             }
         }
         
     }
}
