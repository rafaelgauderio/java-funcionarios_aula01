
public class Funcionario {

	String nome;
	double valorDaHora;
	double horasTrabalhadas;
	
	
	//construtor vazio
	public Funcionario() {
		
	}
	
	//construtor com argumentos
	public Funcionario(String nome, double valorDaHora, double horasTrabalhadas) {
		this.nome = nome;
		this.valorDaHora = valorDaHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorDaHora() {
		return valorDaHora;
	}

	public void setValorDaHora(double valorDaHora) {
		this.valorDaHora = valorDaHora;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double Salario() {
		return horasTrabalhadas * valorDaHora;
	}
	
	

	@Override
	public String toString() {
		return "O nome do funcionário é " + nome + " e seu salário é R$ " + String.format("%.2f", Salario());
	}

}
