package tests;

import java.util.ArrayList;
import java.util.Collections;

import pagerank2.WebPage;

public class mainT {
	public static void LinkToOther(WebPage[] V) {
		
		//ArrayList<String> ListaLinksOut = new ArrayList<String>();
		int rand, rand2;
		
		for (int i=0; i < V.length; i++) {
						
			rand = (int) Math.floor(Math.random()*V.length);
			System.out.println("Tocó el Índice: " + rand );
						
			for (int j = 0; j < V[i].getLinkOut(); j++) {
				
				rand2 = (int) Math.floor(Math.random()*V.length);
				
				V[i].AddElementToList(V[rand2].getDomainName());
			}
			
		}
	}

	public static void main(String[] args) {
		String web = "Web";
		WebPage[] V = new WebPage[3];
		
		//Llenando LinkIO con valores aleatorios
		for (int i = 0; i < 3; i++) {
			V[i] = new WebPage(web.concat(String.valueOf(i)) ,(int)Math.floor(Math.random()*V.length + 1), (int) Math.floor(Math.random()*V.length + 1));
		}
		
		System.out.println("Imprimiendo nombres");
		for (WebPage wp : V) {
			System.out.println(wp.getDomainName() + " --- " + wp.getLinkIn() + " --- " + wp.getLinkOut());
		}
		
		System.out.println("Tamaño antes: " + V.length);
		
		LinkToOther(V);
		
		System.out.print("Página: " + V[0].getDomainName()); 
		System.out.print(" LinkIn: " + V[0].getLinkIn());
		System.out.print(" LinkOut: " + V[0].getLinkOut());
		System.out.println(" Lista de Links: " + V[0].getListaLinks());
		
		System.out.print("Página: " + V[1].getDomainName()); 
		System.out.print(" LinkIn: " + V[1].getLinkIn());
		System.out.print(" LinkOut: " + V[1].getLinkOut());
		System.out.println(" Lista de Links: " + V[1].getListaLinks());
		
		System.out.print("Página: " + V[2].getDomainName()); 
		System.out.print(" LinkIn: " + V[2].getLinkIn());
		System.out.print(" LinkOut: " + V[2].getLinkOut());
		System.out.println(" Lista de Links: " + V[2].getListaLinks());
		
	}

}
