package pagerank;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebPage prueba;
		
		final double d = 0.85;
		
		
		double PRA=0.3333;
		double PRB=0.3333;
		double PRC=0.3333;
		
		double PRA2=0.3333;
		double PRB2=0.3333;
		double PRC2=0.3333;
		
		
		PRA = (1-d) + d*(PRC2/1 + 0);
		PRB = (1-d) + d*(PRA2/1 + 0);
		PRC = (1-d) + d*((PRA2/2) + (PRB2/1) + 0);
		System.out.println("Fin Iteración 1");
				
		for (int i = 0; i < 1000; i++) {
						
			System.out.print("Valor PRA: " + PRA + "--");
			System.out.print("Valor PRB: " + PRB + "--");
			System.out.print("Valor PRC: " + PRC + "\n");
			
			PRA2 = PRA;
			PRB2 = PRB;
			PRC2 = PRC;
			
			PRA = (1-d) + d*(PRC2/1 + 0);
			PRB = (1-d) + d*(PRA2/1 + 0);
			PRC = (1-d) + d*((PRA2/2) + (PRB2/1) + 0);
			//System.out.println("Fin Iteración " + (i+2));
			
			
			
		}
		
				
				
//		algoritmo();

	}

}
