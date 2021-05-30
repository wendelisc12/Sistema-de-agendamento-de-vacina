public class Vacina{
		String fabricante;
		String dataVencimento;
		String localArmazenagem;
		int quantidadeDiasSegundaDose;
		
		public Vacina(){
			
		}
		
		public Vacina(String fabricante, String dataVencimento, String localArmazenagem, int quantidadeDiasSegundaDose) {
			this.fabricante = fabricante;
			this.dataVencimento = dataVencimento;
			this.localArmazenagem = localArmazenagem;
			this.quantidadeDiasSegundaDose = quantidadeDiasSegundaDose; 
		}
	}