import java.util.Scanner;

public class SoNguyenTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("XAC DINH SO NGUYEN TO");
		System.out.println();
		int j = 0;
		while (j <j+1) //không quan trọng
		{
		int number; //biến để nhập số
		
		do
		{
		//yêu cầu nhập số cần xác định
		System.out.print("Nhap vao so can xac dinh: ");
		number = scan.nextInt();
		}
		while (number < 0);//yêu cầu người dùng nhập vào số dương
				
		//khai báo biến kết quả
		boolean result = true;
		
		for (int i = 2; i < number; i++) //biến i dùng để thử kết quả bài toán
		{
			if (number % i == 0)
			{
				result = false;
			break;
			}
			else
				result = true;		
		}
		
		//result
		
		if (result == true)
		{
			System.out.println(number +" La so nguyen to.");
		}
		else
		{
			System.out.println(number + " Khong phai la so nguyen to");
		System.out.println();
		}
		
		}
	}

}
