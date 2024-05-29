package problems;
 class animal
{
int add(int a,int b)
{
return a+b;
}
}
public class Dynamic_binding extends animal {

@Override
int add(int a,int b)
{
return a*b;
}
public static void main(String args[])
{
animal a=new animal();
System.out.println(a.add(3,9));
}
}


