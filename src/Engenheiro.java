
public class Engenheiro implements Funcionario {
	public String nome;
	public int horarioDeTrabalho;
	private int CPF;
	private int anoDeInicioNaEmpresa;
	
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public int getAnoDeInicioNaEmpresa() {
		return anoDeInicioNaEmpresa;
	}
	public void setAnoDeInicioNaEmpresa(int anoDeInicioNaEmpresa) {
		this.anoDeInicioNaEmpresa = anoDeInicioNaEmpresa;
	}
	@Override
	public String obterInformacoesFuncionario() {
		
		return null;
	}
	@Override
	public boolean temInsalubridade() {
		
		return false;
	}
	@Override
	public void obterInformacoes() {
		// TODO Auto-generated method stub
		
	}

}
