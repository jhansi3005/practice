package problems;
import java.util.*;
public class Max_min {
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String a=scan.next();
int max=0;
int min=a.length();
boolean b[]=new boolean[a.length()];
char c=' ';
char d=' ';
for(int i=0;i<b.length;i++)
{
int count=0;
for(int j=0;j<b.length;j++)
{
if(a.charAt(i)==a.charAt(j)&&b[j]==false)
{
count++;
b[j]=true;
}
}
if(count>max)
{
max=count;
c=a.charAt(i);
}
if(count<min&&count!=0)
{
min=count;
d=a.charAt(i);
}
}
System.out.println("The min occurance of the character "+d+" in the given string is "+min+" and the max character is  "+c+" in given string is "+max);
}
}
