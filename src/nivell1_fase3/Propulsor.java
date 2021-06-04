package nivell1_fase3;

public class Propulsor implements Runnable{
	
	private int idPropulsor;
	private int potenciaMaxima;
	private int potenciaActual;
	private Cohete cohete;

	public Propulsor(int idPropulsor, int potenciaMaxima, Cohete cohete) {
		this.idPropulsor = idPropulsor; 
		this.potenciaMaxima = potenciaMaxima;
		this.cohete = cohete;
		potenciaActual = 0;
	}
	
	@Override
	public void run() {
		
		if(cohete.isAcelerando()) {
			System.err.println("ACELERANDO!");
		for(int i=potenciaActual; i<=potenciaMaxima;i++) {
			if(!cohete.isAcelerando()) break;
			potenciaActual=i;
			System.out.println("Potencia del propulsor nº: " +idPropulsor + " del Cohete -> " + cohete.getIdCodigo() + ": " + potenciaActual + " kW / " + potenciaMaxima + " kW");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
			}
		}else {
			System.err.println("FRENANDO!");
			for(int i=potenciaActual; i>=0;i--) {
				if(cohete.isAcelerando()) break;
				potenciaActual=i;
				System.err.println("Potencia del propulsor nº : " +idPropulsor + " del Cohete -> " + cohete.getIdCodigo() + ": " + potenciaActual + " kW / " + potenciaMaxima + " kW");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
				}
		}
	}
	
	public int getIdPropulsor() {
		return idPropulsor;
	}

	public void setIdPropulsor(int idPropulsor) {
		this.idPropulsor = idPropulsor;
	}

	public Cohete getCohete() {
		return cohete;
	}

	public void setCohete(Cohete cohete) {
		this.cohete = cohete;
	}

	public int getPotenciaMaxima() {
		return potenciaMaxima;
	}

	public void setPotenciaMaxima(int potenciaMaxima) {
		this.potenciaMaxima = potenciaMaxima;
	}

	public int getPotenciaActual() {
		return potenciaActual;
	}

	public void setPotenciaActual(int potenciaActual) {
		this.potenciaActual = potenciaActual;
	}

	
}
