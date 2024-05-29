package problems;
import java.util.*;
public class Predefined_Length {
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
int i=0,count=0;
char ch[]=s.toCharArray();
for(char c:ch)
{
count++;
}
System.out.println(count);
}
}
