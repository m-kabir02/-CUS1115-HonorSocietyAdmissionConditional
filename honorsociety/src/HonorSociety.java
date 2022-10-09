/*
Mosammad Kabir
CUS 1115
Professor Debello
April 11, 2021
 */
import java.util.Scanner;
public class HonorSociety {
    public static void main(String[] args)
    {
        int credits;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your total credits: ");
        credits=kb.nextInt();
        int gpa;
        System.out.println("Enter your GPA: ");
        gpa=kb.nextInt();

        if((credits>=60)&&(gpa>=3.5))
        {
            System.out.println("Congratulations! You will be admitted to the honor society.");
        }
else if((credits<60)&&(gpa<3.5))
        {
            System.out.println("Sorry, you will not be admitted to the honor society because you don't meet our credit and gpa requirements.");
        }
else
        {
            System.out.println("Your inputs are invalid.");
        }

    }

}
/*
Enter your total credits:
60
Enter your GPA:
3.5
Exception in thread "main" java.util.InputMismatchException
	at java.util.Scanner.throwFor(Scanner.java:864)
	at java.util.Scanner.next(Scanner.java:1485)
	at java.util.Scanner.nextInt(Scanner.java:2117)
	at java.util.Scanner.nextInt(Scanner.java:2076)
	at HonorSociety.main(HonorSociety.java:11)
 */