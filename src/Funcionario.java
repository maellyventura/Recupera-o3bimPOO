
public interface Funcionario {
	String obterInformacoesFuncionario();
	boolean temInsalubridade();
	
	public String obterInformacoes ();
	return nome;

}

//2. Crie as classes concretas Gerente, OperadorMaquina e Engenheiro, que implementem a interface Funcionario e
//possuam as propriedades: nome, hor�rio de trabalho, CPF e ano de in�cio na empresa.
//A classe deve atender �s seguintes especifica��es (1,0):
//
//a) As classes concretas devem estar encapsuladas e implementando a interface corretamente. (1,0 ponto)
//b) O m�todo obterInformacoesFuncionario() dever� retornar um String referente � informa��o do nome do usu�rio,
//CPF, e uma informa��o indicativa se ele � um Gerente, Operador de M�quina ou Engenheiro (1,0 ponto)
//c) O m�todo obterInformacoesFuncionario() dever� gerar uma exce��o do tipo obrigat�ria (checked),
//se o nome do usu�rio n�o tiver sido informado (estiver null). Esta exce��o dever� ser tratada pela
//classe que ir� ativar este m�todo; (1,0 ponto)
//d) O m�todo temInsalubridade() dever� retornar true, quando estiver implementado na classe
//OperadorMaquina e �Falso�, quando estiver implementado nas classes Gerente e Engenheiro; (1,0 ponto)