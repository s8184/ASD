package zadanie18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Zlozone {

	public static void main(String[] args) {
		
		int liczba=0;
		String o="",znak="";	
		int n=0;	
		int ii,i;
		final int MAX = 10000;
		
		List<Integer> tab = new ArrayList<Integer>();
		Scanner liczba_liczb = new Scanner(System.in);
		System.out.println("Podaj liczby: ");
		ii=0;
		while ( true ) {
			znak = liczba_liczb.next();
			if (!znak.equalsIgnoreCase(";") && tab.size()<MAX) {
				try {
					n = Integer.parseInt(znak);
					if (n<2||n>30000)
						System.out.println("Liczba poza zakresem!");	
					else
						tab.add(new Integer(n));
				}
				catch (NumberFormatException e) {
					System.out.println("Niepoprawna liczba!");
				}			
				
			}
			else
				break;		
		}
		 
		for (i=0;i<tab.size();i++){	
			liczba = tab.get(i);
			o = "";
			ii=2;
			while ( ii <= liczba) {		
				while (liczba % ii == 0){
					liczba= liczba/ii;
					if (o.isEmpty())
						o = o + ii;
					else
						o = o + " * " + ii;
				}
				
				if (liczba == 1) break;
				ii++;
			}
			System.out.println(o);
		}	
	}
	
}