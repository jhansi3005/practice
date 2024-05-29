package problems;
import java.util.*;
public class number_of_cons_vows_spe {
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String a1=scan.next();
String a=a1.toLowerCase();
int con=0;
int vow=0;
int c=0;
int spe=0;
System.out.println(a);
for(int i=0;i<a.length();i++)
{
if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
{
vow++;
}
else if(a.charAt(i)>='a'&&a.charAt(i)<='z')
{
con++;
}
else if(a.charAt(i)<='9'&&a.charAt(i)>='0')
{
c++;
}
else
{
spe++;
}
}
System.out.println("the number of vowels in given string is"+vow);
System.out.println("the number of consonanta in given string is"+con);
System.out.println("the number of constants in given string is"+c);
System.out.println("the number of special characters in given string is"+spe);
}
}
