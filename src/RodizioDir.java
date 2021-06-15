import java.util.Scanner;
public class RodizioDir {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	int num,plnum;
	String conducao;
		
	//Sistema lógico :
		
	System.out.println("Quantidade de funcionarios :");
	num = leitor.nextInt();
	for (int i=0;i<=num;i++) {
		System.out.println("Funcionario "+i);
		System.out.println("Qual a condução ?");
		conducao = leitor.next();
		if (conducao.equalsIgnoreCase("carro")) {
			System.out.println("Qual o ultimo numero da placa ?");
			plnum = leitor.nextInt();
			switch(plnum) {
			case 1 :
				System.out.println("Rodizio não se aplica segunda-feira");
				break;
			case 2 :
				System.out.println("Rodizio não se aplica segunda-feira");
				break;
			case 3 :
				System.out.println("Rodizio não se aplica terça-feira");
				break;
			case 4 :
				System.out.println("Rodizio não se aplica terça-feira");
				break;
			case 5 :
				System.out.println("Rodizio não se aplica quarta-feira");
				break;
			case 6 :
				System.out.println("Rodizio não se aplica quarta-feira");
				break;
			case 7 :
				System.out.println("Rodizio não se aplica quinta-feira");
				break;
			case 8 :
				System.out.println("Rodizio não se aplica quinta-feira");
				break;
			case 9 :
				System.out.println("Rodizio não se aplica sexta-feira");
				break;
			default :
				System.out.println("Rodizio não se aplica sexta-feira");
				break;
			}
		}
		else {
				System.out.println("Rodizio não se aplica no seu método de condução");
			}
	
		}
	}
	}

