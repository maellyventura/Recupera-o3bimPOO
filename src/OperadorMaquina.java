
public class OperadorMaquina implements Funcionario {
	public String nome;
	public int horarioDeTrabalho;
	private int CPF;
	private int anoDeInicioNaEmpresa;

	public void setAnoDeInicioNaEmpresa(int anoDeInicioNaEmpresa) {
		this.anoDeInicioNaEmpresa = anoDeInicioNaEmpresa;
		
		public OperadorMaquina(String nome, int horarioDetrabalho, int CPF,int anoDeInicioNaEmpresa ) {

			this.nome = nome;
			this.horarioDeTrabalho = horarioDeTrabalho;
			this.CPF= CPF;
			}
			public OperadorMaquina(String nome) {

			this.nome = "paula";
			this.horarioDeTrabalho = 12;
			this.CPF= 19748802;
			this.anoDeInicioNaEmpresa= 1990; 
	}

			@Override
			public String obterInformacoesFuncionario() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean temInsalubridade() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public String obterInformacoes() {
				// TODO Auto-generated method stub
				return null;
			}

	
}
