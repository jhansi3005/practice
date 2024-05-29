package problems;
import java.util.*;
public class occurence_of_each {

public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String a=scan.nextLine();
char ch[]=a.toCharArray();
boolean b[]=new boolean[ch.length];
for(int i=0;i<ch.length;i++)
{
int count=0;
for(int j=0;j<ch.length;j++)
{
if(ch[i]==ch[j]&&b[j]==false)
{
count++;
b[j]=true;
}
}
if(count>0)

System.out.println("the occurence of the character "+ch[i]+" in a given string is "+count);
}
}
}
