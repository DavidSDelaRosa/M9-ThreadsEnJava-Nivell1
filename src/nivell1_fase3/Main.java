package nivell1_fase3;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int eleccion = 0; //1 -> ACELARAR PROPULSORES, 2 -> FRENAR PROPULSORES 3 -> SALIR
		Cohete cohete1 = new Cohete("32WESSDS");
		Cohete cohete2 = new Cohete("LDSFJA32");

		//PROPULSORES DEL COHETE 1:
		Propulsor p1 = new Propulsor(1,10, cohete1);
		Propulsor p2 = new Propulsor(2, 30, cohete1);
		Propulsor p3 = new Propulsor(3, 80, cohete1);
		
		//PROPULSORES DEL COHETE 2:
		Propulsor p4 = new Propulsor(4, 30, cohete2);
		Propulsor p5 = new Propulsor(5, 40, cohete2);
		Propulsor p6 = new Propulsor(6, 50, cohete2);
		Propulsor p7 = new Propulsor(7, 50, cohete2);
		Propulsor p8 = new Propulsor(8, 30, cohete2);
		Propulsor p9 = new Propulsor(9, 10, cohete2);

		//Lista de propulsores que llevará el cohete 1:
		List<Propulsor> propulsoresCohete1 = new ArrayList<>();
		propulsoresCohete1.add(p1);
		propulsoresCohete1.add(p2);
		propulsoresCohete1.add(p3);
		
		//Lista de propulsores que llevará el cohete 2:
		List<Propulsor> propulsoresCohete2 = new ArrayList<>();
		propulsoresCohete2.add(p4);
		propulsoresCohete2.add(p5);
		propulsoresCohete2.add(p6);
		propulsoresCohete2.add(p7);
		propulsoresCohete2.add(p8);
		propulsoresCohete2.add(p9);

		//Equipamos los propulsores a cada cohete:
		cohete1.setPropulsores(propulsoresCohete1);
		cohete2.setPropulsores(propulsoresCohete2);

		while(eleccion!=3) {
			System.out.println("Qué quieres hacer con el cohete: \n1. Acelerar\n2. Frenar\n3. Salir");
			eleccion = sc.nextInt();
			sc.nextLine();
			if(eleccion==1) {
				cohete1.acelerar();
				cohete2.acelerar();
			}else if(eleccion==2){
				cohete1.frenar();
				cohete2.frenar();
			}else {
				try {
					cohete1.wait();
					cohete2.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Saliendo");
				System.exit(0);
			}
		}

		sc.close();
	}
}