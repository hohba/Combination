package combination;

import java.util.Scanner;

public class Combination_main {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		scan = new Scanner(System.in);
		System.out.print("Input Number s > ");
		int s = Integer.parseInt(scan.next());

		System.out.print("Input Number r > ");
		int r = Integer.parseInt(scan.next());
		
		Combination_lib clib = new Combination_lib();//�C���X�^���X�F�Ӗ��̂���I�u�W�F�N�g�ɂȂ���
		System.out.println("s! = "+clib.getFactorial(s));
		System.out.println(s+"C"+r+"="+clib.getFactorial(s)/(clib.getFactorial(r)*clib.getFactorial(s-r)));
	}

}
