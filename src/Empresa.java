public class Empresa {

	Funcionario[] funcionarios2 = new Funcionario[10];

	public void adiciona(Funcionario funcionarios) {
		Funcionario[] f = new Funcionario[10];
		this.funcionarios2[f.length] = funcionarios;
		int i;
		for (i = 0; i <= f.length; i++)

		{
			System.out.println(f[i]);
		}
	}

	public static void main(String[] args) {

		Funcionario[] vetorFuncionarios = new Funcionario[10];

		// setando direto os valores

		vetorFuncionarios[0] = new Funcionario("Rafael", 130, 40);
		vetorFuncionarios[1] = new Funcionario("Claudio", 150, 40);
		vetorFuncionarios[2] = new Funcionario("Jurandir", 250, 40);
		vetorFuncionarios[3] = new Funcionario("Josiclei", 150, 30);
		vetorFuncionarios[4] = new Funcionario("Carol", 150, 80);
		vetorFuncionarios[5] = new Funcionario("Oswaldo", 130, 40);
		vetorFuncionarios[6] = new Funcionario("Claudia", 190, 40);
		vetorFuncionarios[7] = new Funcionario("Cleber", 220, 40);
		vetorFuncionarios[8] = new Funcionario("José", 250, 45.5);
		vetorFuncionarios[9] = new Funcionario("Lara", 150, 55);

		// imprimindo usando o toString
		for (int i = 0; i < vetorFuncionarios.length; i++) {
			System.out.println(vetorFuncionarios[i]);
		}

		System.out.println("\n\n");

		// imprimindo usando gets
		for (int i = 0; i < vetorFuncionarios.length; i++) {
			System.out.println("O nome do funcionário na posição #" + (i + 1) + " é " + vetorFuncionarios[i].getNome()
					+ " e seu salário é R$ " + String.format("%.2f", vetorFuncionarios[i].Salario()));
		}

		Funcionario[] funcionarios = new Funcionario[10];

		Funcionario f1 = new Funcionario();
		f1.setNome("Pafúncio");
		f1.setValorDaHora(130);
		f1.setHorasTrabalhadas(38);

		Funcionario f2 = new Funcionario();
		f2.setNome("Claudio");
		f2.setValorDaHora(180);
		f2.setHorasTrabalhadas(40);

		Funcionario f3 = new Funcionario();
		f3.setNome("Jurandir");
		f3.setValorDaHora(215);
		f3.setHorasTrabalhadas(40);

		Funcionario f4 = new Funcionario();
		f4.setNome("Josiclei");
		f4.setValorDaHora(150);
		f4.setHorasTrabalhadas(30);

		Funcionario f5 = new Funcionario();
		f5.setNome("Carol");
		f5.setValorDaHora(150);
		f5.setHorasTrabalhadas(80);

		Funcionario f6 = new Funcionario();
		f6.setNome("Oswaldo");
		f6.setValorDaHora(130);
		f6.setHorasTrabalhadas(40);

		Funcionario f7 = new Funcionario();
		f7.setNome("Claudia");
		f7.setValorDaHora(190);
		f7.setHorasTrabalhadas(40);

		Funcionario f8 = new Funcionario();
		f8.setNome("Cleber");
		f8.setValorDaHora(220);
		f8.setHorasTrabalhadas(40);

		Funcionario f9 = new Funcionario();
		f9.setNome("José");
		f9.setValorDaHora(220);
		f9.setHorasTrabalhadas(45.5);

		Funcionario f10 = new Funcionario();
		f10.setNome("Bentinho");
		f10.setValorDaHora(150);
		f10.setHorasTrabalhadas(60);

		funcionarios[0] = f1;
		funcionarios[1] = f2;
		funcionarios[2] = f3;
		funcionarios[3] = f4;
		funcionarios[4] = f5;
		funcionarios[5] = f6;
		funcionarios[6] = f7;
		funcionarios[7] = f8;
		funcionarios[8] = f9;
		funcionarios[9] = f10;

		System.out.println("\n-----------------------------------\nSegunda Lista de vetor\n");
		for (int i = 0; i < funcionarios.length; i++) {
			System.out.println("Nome: " + funcionarios[i].getNome() + " | Horas trabalhadas: "
					+ funcionarios[i].getHorasTrabalhadas() + " | Valor da hora: "
					+ String.format("R$ %.2f", funcionarios[i].getValorDaHora()) + " |  Salário: "
					+ String.format("R$ %.2f", funcionarios[i].Salario()));
		}

		// usando to String
		System.out.println("\n\n");
		for (int i = 0; i < funcionarios.length; i++) {
			System.out.println(funcionarios[i]);
		}

		/*
		 * Empresa empresa = new Empresa(); empresa.funcionarios2 = new Funcionario[10];
		 * 
		 * empresa.adiciona(f1); empresa.adiciona(f2); empresa.adiciona(f3);
		 * empresa.adiciona(f4); empresa.adiciona(f5); empresa.adiciona(f6);
		 * empresa.adiciona(f7); empresa.adiciona(f8); empresa.adiciona(f9);
		 * empresa.adiciona(f10);
		 */
	}
}
