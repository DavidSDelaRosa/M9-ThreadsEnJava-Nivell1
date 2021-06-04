package test_without_threads;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {	
		
		try {
			int[] potenciasCohete1 = {10,30,80};
			int[] potenciasCohete2 = {30, 40, 50, 50, 30, 10};
			
			Cohete cohete = new Cohete("32WESSDS", 3, potenciasCohete1);
			Cohete cohete2 = new Cohete("LDSFJA32", 6, potenciasCohete2);
			System.out.println(cohete.toString());
			System.out.println(cohete2.toString());
			System.out.println(Arrays.toString(cohete.getPotenciaActualPropulsores()));
			System.out.println(Arrays.toString(cohete2.getPotenciaActualPropulsores()));
			
			cohete.acelerar(cohete.getPotenciaActualPropulsores(), cohete.getPotenciaMaximaPropulsores());
		
			System.out.println(Arrays.toString(cohete.getPotenciaActualPropulsores()));
			cohete2.acelerar(cohete2.getPotenciaActualPropulsores(), cohete.getPotenciaMaximaPropulsores());
			
			cohete.frenar(cohete.getPotenciaActualPropulsores());
			cohete2.frenar(cohete2.getPotenciaActualPropulsores());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
