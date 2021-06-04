package nivell1_fase3;
import java.util.List;

public class Cohete {
	
	private String idCodigo;
	private List<Propulsor> propulsores;
	private int numeroPropulsores; 
	private boolean acelerando;
	
	public Cohete(String idCodigo) {
		this.idCodigo = idCodigo;
	}
	
	public Cohete(String idCodigo, List<Propulsor> propulsores) throws Exception {
		this.idCodigo = idCodigo;
		this.propulsores = propulsores;
		numeroPropulsores = propulsores.size();
		acelerando = false;
	}
	
	public List<Propulsor> getPropulsores() {
		return propulsores;
	}

	public void setPropulsores(List<Propulsor> propulsores) {
		this.propulsores = propulsores;
	}

	public String getIdCodigo() {
		return idCodigo;
	}
	public void setIdCodigo(String idCodigo) {
		this.idCodigo= idCodigo;
	}
	public int getNumeroPropulsores() {
		return numeroPropulsores;
	}
	public void setNumeroPropulsores(int numeroPropulsores) {
		this.numeroPropulsores = numeroPropulsores;
	}
	
	public boolean isAcelerando() {
		return acelerando;
	}

	public void setAcelerando(boolean acelerando) {
		this.acelerando = acelerando;
	}

	public void acelerar() {
		acelerando = true;
		for(Propulsor p: propulsores) {
			Thread acelerador = new Thread(p);
			acelerador.start();
		}
	}
	
	public void frenar() {
		acelerando = false;
		for(Propulsor p: propulsores) {
			Thread frenada = new Thread(p);
			frenada.start();
		}
	}
}
