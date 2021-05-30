public class RealizaVacinacao{
		Vacina vacina;
		LocalVacinacao localVacinacao;
		Pessoa pessoa;
		String dataVacinacao;
		
		public RealizaVacinacao() {
			
		}
		
		public RealizaVacinacao(Vacina vacina, LocalVacinacao localVacinacao, Pessoa pessoa, String dataVacinacao) {
			this.vacina = vacina;
			this.localVacinacao = localVacinacao;
			this.pessoa = pessoa;
			this.dataVacinacao = dataVacinacao;
		}
	}