
import java.util.Scanner;
class ScannerTest{
    public static void main(String[] args) { Scanner sc=new Scanner (System.in);
        System.out.println("Enter your Roll No");int rollno =sc.nextInt();
        System.out.println("Enter YOur Name ");
String name =sc.next();
        System.out.println("Enter Your Fee:");
double fee=sc.nextDouble();
        System.out.println("Roll No; "+ rollno+ " name : " +name+" fee: "+fee);
sc.close();
}}