package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        char a= 'Z';
        int b = 0xface;
        int c = 012;
        long h =80L;
        float d = 44e-1f;
        float e = 5.5f;
        double f = 8.88e1;
        double g = 99.9;

        int tmph = (int)h;
        int tmpd = (int)d;
        int tmpe = (int)e;
        int tmpf = (int)f;
        int tmpg = (int)g;

        int sum = ((int)a+b+c+tmph+tmpd+tmpe+tmpf+tmpg);
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);

        int nr1 = scanner.nextInt();
        int nr2 = scanner.nextInt();

        System.out.println(nr1 + nr2);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        System.out.println("Before Swap:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");  //9
        int nr1 = scanner.nextInt();
        System.out.print("y: ");   //4
        int nr2 = scanner.nextInt();
        nr1 = nr1 + nr2;
        nr2 = nr1 - nr2;
        nr1 = nr1 - nr2;
        System.out.println("After Swap:");
        System.out.println("x: " + nr1);
        System.out.println("y: " + nr2);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1: ");
        int nr1 = scanner.nextInt();
        System.out.print("n2: ");
        int nr2 = scanner.nextInt();
        if(nr1 > nr2)
        {
            System.out.println("n1 > n2");
        }
        else if(nr2 > nr1)
        {
            System.out.println("n2 > n1");
        }
        else if (nr1 == nr2)
        {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        System.out.print("Enter annual Revenue: ");
        Scanner scanner = new Scanner(System.in);
        int nr1 = scanner.nextInt();
        if (nr1 < 0 || nr1 >= 100000)
        {
            System.out.println("Invalid Revenue");
        }
        else if(0 <= nr1 && nr1 < 20000)
        {
            System.out.println("Poor Sales Revenue");
        }
        else if(20000 <= nr1 && nr1 < 50000)
        {
            System.out.println("Average Sales Revenue");
        }
        else if(50000 <= nr1 && nr1 < 80000)
        {
            System.out.println("Good Sales Revenue");
        }
        else if(80000 <= nr1 && nr1 < 100000)
        {
            System.out.println("Excellent Sales Revenue");
        }

    }

    //todo Task 8
    public void getCommissionRate(){
        System.out.print("Enter CommissionClass: ");
        Scanner scanner = new Scanner(System.in);
        String commissionrate = "";
        int nr1 = scanner.nextInt();
        switch (nr1)
        {
            case 1:
                commissionrate = "Your Commission Rate was set to " + 0.01;
                break;

            case 2:
                commissionrate = "Your Commission Rate was set to " + 0.02;
                break;

            case 3:
                commissionrate = "Your Commission Rate was set to " + 0.03;
                break;

            case 4:
                commissionrate = "Your Commission Rate was set to " + 0.04;
                break;

            default:
                commissionrate = "Your Commission Rate was set to 0.0";
                break;
        }
        System.out.println(commissionrate);
    }

    //todo Task 9
    public void leapyear(){
        System.out.print("Year: ");
        Scanner scanner = new Scanner(System.in);
        int nr1 = scanner.nextInt();
        if (nr1 % 4 == 0 && nr1 % 400 == 0)
        {
            System.out.println("Leapyear");
        }
        else if (nr1 % 100 == 0 && nr1 % 400 != 0 || nr1 % 4 != 0)
        {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        System.out.print("Number: ");
        Scanner scanner = new Scanner(System.in);
        int nr1 = scanner.nextInt();
        //1 2 3
        //3 2 1
        //1 3 5
        //5 3 1
        int tmp = nr1%10;       //5 --> 135%10 --> 5 Rest --> 5
        int tmp1 = (nr1%100)/10; //3 --> (135%100) --> 35/10 --> 3.5 Rest --> 3
        int tmp2 = (nr1%1000)/100; //1 --> (135/1000) --> 0.135%100 --> 1 Rest --> 1
        System.out.println(tmp+""+tmp1+""+tmp2);    //5 3 1
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}