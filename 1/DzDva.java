import java.util.*;
public class DzDva{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b,c;
        a = s.nextInt(); 
        b = s.nextInt();
        c = s.nextInt();
        double d=(b*b)-(4*a*c);
        float e=0;
        float f=0;
        if(d==0){
            e=-1*(b/(2*a));
            System.out.println("Уравнеие имеет 1 квадратный корень, который равен "+e);
        }
        else {
            if(d>0){
                e=((-1*b)+(float)Math.sqrt(d))/(2*a);
                f=((-1*b)-(float)Math.sqrt(d))/(2*a);
                System.out.println("Уравнение имеет 2 квадратных корня: "+e+" и " +f);
            }
            else {
                System.out.println("Уравнение не имеет квадратных корней");
            }
        }
    }
}