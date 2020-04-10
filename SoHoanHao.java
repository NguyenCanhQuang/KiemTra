import java.util.Scanner;

public class SoHoanHao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("XAC DINH SO HOAN HAO");
		System.out.println();
		
		int j = 0;
		while (j < j+1)
		{
		int number;//biến số nhập vào
		
		do
		{
		//nhập số cần xác định
		System.out.print("Nhap so can xac dinh: ");
		number = scan.nextInt();
		}
		while (number < 0); //bắt người dùng nhập số dương
		
		
		int i; //khai báo biến i dùng để thực hiện bài toán
		int sumDivisor = 0; //tổng các ước
		
		for (i = 1; i < number ;i++ )
		{
			if (number % i == 0)
			{
				sumDivisor += i;
			}
		}
		
		//xác định số đó có phải số hoàn hảo hay không
		if (sumDivisor == number)
		{
			System.out.println(number +" La so hoan hao.");
		}
		else
		{
			System.out.println(number + " Khong phai la so hoan hao.");
		}
		System.out.println();
		
		}
	}

}
