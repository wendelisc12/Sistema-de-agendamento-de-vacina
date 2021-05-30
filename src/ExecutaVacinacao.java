import java.util.Scanner;

public class ExecutaVacinacao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Informa��es pessoais do usuario
		System.out.println("insira seu nome: ");
		String nome = input.nextLine();
		
		System.out.println("insira sua profissao: ");
		String profissao = input.nextLine();
		Profissao profissaoUsuario = new Profissao(01, profissao);
		
		System.out.println("insira seu CPF: ");
		int cpf = input.nextInt();
		
		System.out.println("insira seu endere�o: ");
		String endereco = input.nextLine();
		
		System.out.println("insira sua data de nascimento: ");
		String dataNascimento = input.nextLine();
		
		Pessoa usuario = new Pessoa(nome, cpf, endereco, dataNascimento, profissaoUsuario);
		
		//Dados da vacina e local de vacina��o
		Vacina pfizer = new Vacina("Pfizer Brazil", "12-01-2023", "EUA", 21);
		Vacina coronaVac = new Vacina("Instituto Butatan", "15-01-2024", "Brasil", 28);
		Vacina oxfordVac = new Vacina("University Oxford", "22-02-2022", "EUA", 14);
		
		LocalVacinacao shoppingGuararapes = new LocalVacinacao("Prazeres", 10, "08:00");
		LocalVacinacao donaLindu = new LocalVacinacao("Boa Viagem", 20, "10:00");
		LocalVacinacao patioCarmo = new LocalVacinacao("Bairro de Santo Ant�nio", 35, "13:00");
		
		//Realizar Vacina��o
		RealizaVacinacao realizarVacinacao = new RealizaVacinacao();
		realizarVacinacao.pessoa = usuario;
		
		System.out.println("Ol� " + usuario.nome + ", Qual vacina voc� deseja escolher(Pfizer, CoronaVac, Oxford): ");
		String vacina = input.nextLine();
		if(vacina.equals("Pfizer")) {
			realizarVacinacao.vacina = pfizer;
		}else if(vacina.equals("CoronaVac")) {
			realizarVacinacao.vacina = coronaVac;
		}else if(vacina.equals("Oxford")) {
			realizarVacinacao.vacina = oxfordVac;
		}
		
		System.out.println("Qual local de vacinac�o(Shopping dos Guararapes, Dona Lindu, P�tio do Carmo): ");
		String localVacinacao = input.nextLine();
		if(localVacinacao.equals("Shopping dos Guararapes")) {
			realizarVacinacao.localVacinacao = shoppingGuararapes;
		}else if(localVacinacao.equals("Dona Lindu")) {
			realizarVacinacao.localVacinacao = donaLindu;
		}else if(localVacinacao.equals("P�tio do Carmo")) {
			realizarVacinacao.localVacinacao = patioCarmo;
		}
		
		System.out.println("Qual dia voc� deseja receber sua vacina(escreva no formato dd-mm-aaaa): ");
		String diaVacinacao = input.nextLine();
		realizarVacinacao.dataVacinacao = diaVacinacao;
		
		System.out.println("-------------------------------------------");
		System.out.println("�la " + realizarVacinacao.pessoa.nome + ", voc� ir� tomar a vacina da " + realizarVacinacao.vacina.fabricante + ", no local: " + realizarVacinacao.localVacinacao.endereco + ". No dia " + realizarVacinacao.dataVacinacao);
		System.out.println("O hor�rio da vacina��o ser� as: " + realizarVacinacao.localVacinacao.horarioAtendimento + ". Fique atento a segunda dose que ser� aplicada " + realizarVacinacao.vacina.quantidadeDiasSegundaDose + " dias logo ap�s a primeira");
		
		
	}

}
