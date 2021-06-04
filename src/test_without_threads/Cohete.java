package test_without_threads;

import java.util.Arrays;

public class Cohete {
	
	private String idCodigo;
	private int numeroPropulsores;
	private int[] potenciaMaximaPropulsores;
	private int[] potenciaActualPropulsores;
	
	
	public Cohete(String idCodigo, int numeroPropulsores, int[] potenciaMaximaPropulsores) throws Exception {
		this.idCodigo = idCodigo;
		this.numeroPropulsores = numeroPropulsores;
		this.potenciaMaximaPropulsores = potenciaMaximaPropulsores;
		potenciaActualPropulsores = new int[potenciaMaximaPropulsores.length];
		
		for(int i=0;i<potenciaMaximaPropulsores.length;i++) {
			potenciaActualPropulsores[i]=0;
		}
		
		if(idCodigo.length()!=8) throw new Exception("El código tiene que tener 8 caracteres");
		if(potenciaMaximaPropulsores.length!=numeroPropulsores) throw new Exception("Cada propulsor tiene que tener su máximo de potencia");
		
	}
	
	public int[] getPotenciaActualPropulsores() {
		return potenciaActualPropulsores;
	}
	public void setPotenciaActualPropulsores(int[] potenciaActualPropulsores) {
		this.potenciaActualPropulsores = potenciaActualPropulsores;
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
	public int[] getPotenciaMaximaPropulsores() {
		return potenciaMaximaPropulsores;
	}
	public void setPotenciaMaximaPropulsores(int[] potenciaPropulsores) {
		this.potenciaMaximaPropulsores = potenciaPropulsores;
	}
	
	public void acelerar(int[]potenciaActualPropulsores, int[]potenciaMaximaPropuslores) {
		
		for(int i=0;i<potenciaActualPropulsores.length;i++) {
			for(int j=0;j<=potenciaMaximaPropulsores[i];j++) {
				potenciaActualPropulsores[i]=j;
				System.out.println("Propulsor: " +(i+1) + "\nPotencia:" + potenciaActualPropulsores[i]);
			}
			System.out.println("\n------------------------------");
		}
		
	}
	
	public void frenar(int[]potenciaActualPropulsores) {
		for(int i=0;i<potenciaActualPropulsores.length;i++) {
			//System.err.println("Hola");
			for(int j=potenciaActualPropulsores[i];j>=0;j--) {
				potenciaActualPropulsores[i]=j;
				//System.err.println(j);
				//System.err.println(potenciaActualPropulsores[i]);
				System.out.println("Propulsor: " +(i+1) + "\nPotencia:" + potenciaActualPropulsores[i]);

				//System.err.println("Adios");
				
			}
			System.out.println("\n------------------------------");
		}
	}
	
	@Override
	public String toString() {
		return "ID=" + idCodigo + "\nNumero de propulsores: " + numeroPropulsores + "\nPotencia máxima: " + Arrays.toString(potenciaMaximaPropulsores);
	}

}
