public class Gerente implements Funcionario {
	String nome;
	int hor�riodetrabalho;
	int CPF ;
	String anoInicionaempresa;
	String getNome() {

}
public void setNome(String nome){
  this.nome = nome;
}

int getHorariodetrabalho() {
return hor�riodetrabalho;
}
public void setHor�riodetrabalho(int hor�riodetrabalho){
  this.hor�riodetrabalho=hor�riodetrabalho;
}


int getCPF() {
return CPF;
}
public void setCPf(int CPF){
  this.CPF=CPF;
}

String getanoInicionaempresa(String anoInicionaempresa) {
return anoInicionaempresa;
}
public void anoInicionaempresa(String anoInicionaempresa){
  this.anoInicionaempresa=anoInicionaempresa;
}



public String obterFuncionarios() {
return "Nome"+nome;



}
public boolean temInsalubridade() {
return false;
}

}





}
public boolean temInsalubridade1() {
return false;
}
@Override
public String obterInformacoesFuncionario() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public String obterInformacoes() {
	// TODO Auto-generated method stub
	return null;
}

}

