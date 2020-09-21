package pagerank2;

import java.util.ArrayList;

public class main2 {

	public static void LinkToOther(WebPage[] V) {
		int rand, rand2;
		
		for (int i=0; i < V.length; i++) {
			rand = (int) Math.floor(Math.random()*V.length);
			//System.out.println("Tocó el Índice: " + rand );
						
			for (int j = 0; j < V[i].getLinkOut(); j++) {
				rand2 = (int) Math.floor(Math.random()*V.length);
				V[i].AddElementToList(V[rand2].getDomainName());
			}
		}
	}
	
	public static void CreateWebData(String web, WebPage[] V) {
		//Llenando LinkIO con valores aleatorios
		for (int i = 0; i < 3; i++) {
			V[i] = new WebPage(web.concat(String.valueOf(i)) ,(int)Math.floor(Math.random()*V.length + 1), (int) Math.floor(Math.random()*V.length + 1));
		}
		//Mostrando
		System.out.println("Imprimiendo nombres");
		for (WebPage wp : V) {
			System.out.println(wp.getDomainName() + " --- " + wp.getLinkIn() + " --- " + wp.getLinkOut());
		}
	}
	
	
	public static void main(String[] args) {
		final double d = 0.85;
		String web = "Web";
		
		//Crear vector de objetos para evitar colocar nombres
		WebPage[] V = new WebPage[3];
		
		CreateWebData(web, V);
		LinkToOther(V);
		
		for (int i = 0; i < V.length; i++) {
			System.out.println("Lista de páginas del elemento " + i +": " + V[i].getListaLinks());
		}

		//Inicializando primeros valores de New y Old PageRank (1/N°TotalPáginas)
		for (int i = 0; i < V.length; i++) {
			V[i].setNewPageRank(1/V.length);
			V[i].setOldPageRank(1/V.length);
		}

//		Primera parte del algoritmo
//PRAA = V[0] --- PRBB = V[1] --- PRCC = V[2]		
		
		V[0].setNewPageRank((1-d) + d*(V[2].getOldPageRank()/V[2].getLinkOut() + 0));
		V[1].setNewPageRank((1-d) + d*(V[0].getOldPageRank()/V[0].getLinkOut() + 0));
		V[2].setNewPageRank((1-d) + d*((V[0].getOldPageRank()/V[0].getLinkOut()) + (V[1].getOldPageRank()/V[1].getLinkOut()) + 0)); 
		
		System.out.println("Fin Iteración 1");
				
		for (int i = 0; i < 10; i++) {
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
