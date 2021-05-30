public class Pessoa{
		String nome;
		int cpf;
		String endereco;
		String dataNascimento;
		Profissao profissao;
		
		public Pessoa() {
			
		}
		
		public Pessoa(String nome, int cpf, String endereco, String dataNascimento, Profissao profissao) {
			this.nome = nome;
			this.cpf = cpf;
			this.endereco = endereco;
			this.dataNascimento = dataNascimento;
			this.profissao = profissao;
		}
	}