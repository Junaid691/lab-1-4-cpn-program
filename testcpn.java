import java.util.Scanner;
class testcpn{
public static void main(String[] arg)
{
double matriculation;
double intermediate;
int    test_marks;
double cpn;
Scanner obj=new Scanner(System.in);
System.out.println("Enter Matriculation Marks in percentage:");
matriculation=obj.nextDouble();

System.out.println("Enter Intermediate Marks in percentage:");
intermediate=obj.nextDouble();


System.out.println("Enter Test Marks:");
test_marks =obj.nextInt();

cpn=(matriculation*0.10) + (intermediate*0.30) + (test_marks*0.60);


System.out.println("Cpn is:"+(cpn));


}
}
