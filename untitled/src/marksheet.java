import java.util.Scanner;

public class marksheet {
    public static void main(String[] args) { Scanner sc=new Scanner (System.in);
        System.out.println("Enter your Roll No");
        int rollno =sc.nextInt();
        System.out.println("Enter YOur Name ");
        String name =sc.next();
        System.out.println("Enter Your urdu no :");
        double urdu=sc.nextDouble();
        System.out.println("Enter Your English no :");
        double english=sc.nextDouble();
        System.out.println("Enter Your math no :");
        double math=sc.nextDouble();
        System.out.println("Enter Your islamiat no :");
        double islamiat =sc.nextDouble();
        System.out.println("Roll No; "+ rollno+ " name : " +name);

        System.out.println("mark Of Urdu" +urdu);
        System.out.println("mark Of English" +english);
    System.out.println("mark Of math" +math);
        System.out.println("mark Of Islamiat" +islamiat);


        double total = urdu+math+english+islamiat;
        double percent = (total/400)*100;

        System.out.println( "Your Totel No out of 400 is  "+ total);
        System.out.println("YOur Percentage is " + percent);
        if (percent < 50) {
            System.out.println("Fail :(");
        }
        else if(percent >= 50 && percent < 60){
            System.out.println("D");
        }
        else if (percent >= 60 && percent < 70){
            System.out.println("B");
        }
        else if(percent >= 70 && percent < 80 ){
            System.out.println("A");

        }
        else if(percent >= 80 && percent < 90)
        {
            System.out.println("your Grade is A plus ");
        }

        else{
            System.out.println("youre Topper ");

        }




        sc.close();
    }}
