import java.util.*;
public class Dz {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double m,n;
        m = s.nextDouble(); 
        n = s.nextDouble();
int a=10;
double b=Math.abs(a-n);
double c=Math.abs(a-m);  
if (b==c){
    System.out.println("Числа "+n +" и "+m + " равноудалены от "+a);
}
if(b>c){
    System.out.println("Число "+m+" ближе к "+a);
}
if (b<c) {
    System.out.println("Число "+n+" ближе к "+a);
}
}

}

