public class Dz41 {

	public static void main(String[] args) {
		int[][] mas = new int[5][5];
		for (int i = 0; i<5; i++)
		{
			for (int j = 0; j<5; j++)
			{
				mas[i][j] = (int) (Math.random()*100);
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
			
			
		}
		int num = (int) mas[(int)(Math.random()*5)][(int)(Math.random()*5)];
		System.out.println("Искомое число:" + num);
		for (int i = 0; i<5; i++)
		{
			for (int j = 0; j<5; j++)
			{
				if (mas[i][j] == num)
					{
					System.out.println("Строка:"+(i+1)+" Столбец:"+(j+1));
					}
			}
		}
	}
}