import java.io.*;
import java.util.*;
public class LeapYear
{
public satic void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int year=sc.nextInt();
if(year%4==0)
{
System.out.println("Leap Year");
}else
System.out.println(" Not a Leap Year");
}
}
