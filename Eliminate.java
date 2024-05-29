package problems;
import java.util.*;
public class Eliminate {
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String s=scan.next();
String a=" ";
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)<='Z'&&s.charAt(i)>='A'||s.charAt(i)<='z'&&s.charAt(i)>='a')
{
a=a+String.valueOf(s.charAt(i));
}

}
System.out.println(a);
}
}
