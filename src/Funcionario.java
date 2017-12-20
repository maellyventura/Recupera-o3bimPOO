
public interface Funcionario {
	String obterInformacoesFuncionario();
	boolean temInsalubridade();
	
	public String obterInformacoes ();
	return nome;

}

//2. Crie as classes concretas Gerente, OperadorMaquina e Engenheiro, que implementem a interface Funcionario e
//possuam as propriedades: nome, horário de trabalho, CPF e ano de início na empresa.
//A classe deve atender às seguintes especificações (1,0):
//
//a) As classes concretas devem estar encapsuladas e implementando a interface corretamente. (1,0 ponto)
//b) O método obterInformacoesFuncionario() deverá retornar um String referente à informação do nome do usuário,
//CPF, e uma informação indicativa se ele é um Gerente, Operador de Máquina ou Engenheiro (1,0 ponto)
//c) O método obterInformacoesFuncionario() deverá gerar uma exceção do tipo obrigatória (checked),
//se o nome do usuário não tiver sido informado (estiver null). Esta exceção deverá ser tratada pela
//classe que irá ativar este método; (1,0 ponto)
//d) O método temInsalubridade() deverá retornar true, quando estiver implementado na classe
//OperadorMaquina e “Falso”, quando estiver implementado nas classes Gerente e Engenheiro; (1,0 ponto)