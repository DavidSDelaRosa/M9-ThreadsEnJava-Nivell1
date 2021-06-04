package nivell1_fase1;

public class Cohete {
	
	private String idCodigo;
	private int numeroPropulsores;
	
	
	public Cohete(String idCodigo, int numeroPropulsores) throws Exception {
		this.idCodigo = idCodigo;
		this.numeroPropulsores = numeroPropulsores;
		
		if(idCodigo.length()!=8) throw new Exception("El código tiene que tener 8 caracteres");
	}


	public String getIdCodigo() {
		return idCodigo;
	}


	public void setIdCodigo(String idCodigo) {
		this.idCodigo = idCodigo;
	}


	public int getNumeroPropulsores() {
		return numeroPropulsores;
	}


	public void setNumeroPropulsores(int numeroPropulsores) {
		this.numeroPropulsores = numeroPropulsores;
	}


	@Override
	public String toString() {
		return "ID=" + idCodigo + "\nNumero de propulsores: " + numeroPropulsores;
	}

}
