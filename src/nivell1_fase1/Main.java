package nivell1_fase1;
public class Main {

	public static void main(String[] args) {
	
		try {
			Cohete cohete = new Cohete("ASDFGHJL", 3);
			System.out.println(cohete.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
