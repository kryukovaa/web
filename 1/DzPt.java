import java.util.*;

public class DzPt {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		short a,b;
        a = s.nextShort(); 
        b = s.nextShort();
		char sym;
		if (b > a)
			for (int i = a; i < b; i++)
			{
				sym = (char) i;
				System.out.println(sym);
			}
		else
			for (int i = b; i < a; i++)
			{
				sym = (char) i;
				System.out.println(sym);
			}
	}
}