import java.util.Scanner;
public class TabuadaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int result;
		int x;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Entre com um numero para receber valores da tabuada");
		num = leitor.nextInt();
		System.out.println("Entre com um numero para limitar a tabuada");
		x = leitor.nextInt();
		for (int i=0;i<=x;i++) {
		result = i*num;
		System.out.println(i+" x "+num+" = "+result);
		}
	}

}
