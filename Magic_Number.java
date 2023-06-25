import java.util.*;

public class Magic_Number
{
    public static void main(String [] args)
    {
        System.out.println("Welcome to Math_Magician.");
        System.out.println("Steps to Follow....");
        String [] steps = {"1. Double the number","2. Add the Result to the original number", "3. divide the result with original number",
                            "4. add 17 to the result","5. subtract result with the original number", "6. Divide the result with 8"};


        for(int i=0;i<steps.length;i++)
        {
            System.out.println(steps[i]);
        }


        System.out.println("Type of a Number don't Say it Loud :-");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int step1 = num*num;
        int step2 = step1+num;
        int step3 = step2/num;
        int step4 = step3+17;
        int step5 = step4 - num;
        int step6 = step5/6;

        System.out.println(step6);

    sc.close();
    }
}