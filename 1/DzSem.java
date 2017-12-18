import java.util.*;

public class DzSem{

	public static void main(String[] args) {
		String[] s = {"Near, far, wherever you are",
					"I believe that the heart does go on",
					"Once more you opened the door",
					"And you're here in my heart",
					"And my heart will go on and on"};
		Arrays.sort(s);
		for (int i=0; i<s.length;i++)
			System.out.println(s[i]);
	}

}