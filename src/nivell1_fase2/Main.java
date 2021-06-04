package nivell1_fase2;
public class Main {

	public static void main(String[] args) {
	
		
		
		try {
			int[] potenciasCohete1 = {10,30,80};
			int[] potenciasCohete2 = {30, 40, 50, 50, 30, 10};
			
			Cohete cohete = new Cohete("32WESSDS", 3, potenciasCohete1);
			Cohete cohete2 = new Cohete("LDSFJA32", 6, potenciasCohete2);
			System.out.println(cohete.toString());
			System.out.println(cohete2.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
