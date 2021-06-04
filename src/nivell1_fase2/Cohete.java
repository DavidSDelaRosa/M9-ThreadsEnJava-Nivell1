package nivell1_fase2;

import java.util.Arrays;

public class Cohete {
	
	private String idCodigo;
	private int numeroPropulsores;
	private int[] potenciaPropulsores;
	
	
	public Cohete(String idCodigo, int numeroPropulsores, int[] potenciaPropulsores) throws Exception {
		this.idCodigo = idCodigo;
		this.numeroPropulsores = numeroPropulsores;
		this.potenciaPropulsores = potenciaPropulsores;
		
		if(idCodigo.length()!=8) throw new Exception("El código tiene que tener 8 caracteres");
		if(potenciaPropulsores.length!=numeroPropulsores) throw new Exception("Cada propulsor tiene que tener su máximo de potencia");
		
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

	
	
	public int[] getPotenciaPropulsores() {
		return potenciaPropulsores;
	}



	public void setPotenciaPropulsores(int[] potenciaPropulsores) {
		this.potenciaPropulsores = potenciaPropulsores;
	}


	@Override
	public String toString() {
		return "ID=" + idCodigo + "\nNumero de propulsores: " + numeroPropulsores + "\nPotencia máxima: " + Arrays.toString(potenciaPropulsores);
	}

}
