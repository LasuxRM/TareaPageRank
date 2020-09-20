package pagerank2;

public class main2 {

	public static void main(String[] args) {
		final double d = 0.85;
		
		//Crear arreglo de objetos para evitar colocar nombres
		WebPage[] V = new WebPage[3];
		
		//Llenando LinkIO con valores aleatorios
		for (int i = 0; i < V.length; i++) {
			
			V[i] = new WebPage((int) Math.floor(Math.random()*V.length + 1), (int) Math.floor(Math.random()*V.length + 1));
		}
		
//
//		for (int i = 0; i < 10; i++) {
//			int x =(int) Math.floor(Math.random()*5+1);
//			System.out.println(x);
//			
//		}
//		
		
		
//		 V[0] = new WebPage(1, 2);
//		 V[1] = new WebPage(1, 1);
//		 V[2] = new WebPage(2, 1);
//		
		
		//Inicializando primeros valores de New y Old PageRank (1/N°TotalPáginas)
		for (int i = 0; i < V.length; i++) {
			V[i].setNewPageRank(1/V.length);
			V[i].setOldPageRank(1/V.length);
		}
		
		
//		for (int i = 0; i < V.length; i++) {
//			V[i].setNewPageRank((1-d) + d*(PRCC.getOldPageRank()/PRCC.getLinkOut() + 0));
//		}

//PRAA = V[0] --- PRBB = V[1] --- PRCC = V[2]
		V[0].setNewPageRank((1-d) + d*(V[2].getOldPageRank()/V[2].getLinkOut() + 0));
		V[1].setNewPageRank((1-d) + d*(V[0].getOldPageRank()/V[0].getLinkOut() + 0));
		V[2].setNewPageRank((1-d) + d*((V[0].getOldPageRank()/V[0].getLinkOut()) + (V[1].getOldPageRank()/V[1].getLinkOut()) + 0)); 
		
		
		System.out.println("Fin Iteración 1");
				
		for (int i = 0; i < 100; i++) {
			System.out.print("Valor PRA: " + V[0].getNewPageRank() + "--");
			System.out.print("Valor PRB: " + V[1].getNewPageRank() + "--");
			System.out.print("Valor PRC: " + V[2].getNewPageRank() + "\n");
			
			//Old(New)
			V[0].setOldPageRank(V[0].getNewPageRank());
			V[1].setOldPageRank(V[1].getNewPageRank());
			V[2].setOldPageRank(V[2].getNewPageRank());
			
			V[0].setNewPageRank((1-d) + d*(V[2].getOldPageRank()/V[2].getLinkOut() + 0));
			V[1].setNewPageRank((1-d) + d*(V[0].getOldPageRank()/V[0].getLinkOut() + 0));
			V[2].setNewPageRank((1-d) + d*((V[0].getOldPageRank()/V[0].getLinkOut()) + (V[1].getOldPageRank()/V[1].getLinkOut()) + 0)); 
			//System.out.println("Fin Iteración " + (i+2));
		}
		
		
	}
}
