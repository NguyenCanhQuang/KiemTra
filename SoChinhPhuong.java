import java.util.Scanner;

public class SoChinhPhuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while (i<i+1)
		{
			int number;
			do
			{
		System.out.print("Nhap so: ");
		number = scan.nextInt();
			}
			while (number <0);
		
		float result = (float) Math.sqrt(number);
		
		if (Math.pow(result, 2) == number)
		{
			System.out.println(number+" La so chinh phuong");
			System.out.println();
		}
		else
		{
			System.out.println(number+" Khong phai la so chinh phuong");
			System.out.println();
		}
		}
	}

}
