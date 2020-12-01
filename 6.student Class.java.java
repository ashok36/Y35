import java.util.Scanner;
class lab6
{
int Sno;
String Sname;
lab6()
{
Sno=1;
Sname="Ashok";
}
lab6(int sno,String sname)
{
this.Sno=sno;
this.Sname=sname;
}
void display()
{
System.out.println(Sno+Sname);
}
public static void main(String args[])
{
lab6 s=new lab6();
s.display();
lab6 S1=new lab6(3,"Kiran");
S1.display();
Scanner ob=new Scanner(System.in);
int sno2=ob.nextInt();
String Sname2=ob.next();
lab6 S3=new lab6(sno2,Sname2);
S3.display();
}
}