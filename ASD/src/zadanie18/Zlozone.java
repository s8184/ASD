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
		final int MAX = 10000; // sta³a ograniczaj¹ca d³ugoœæ listy na której przechowywane s¹ liczby
		
		List<Integer> tab = new ArrayList<Integer>(); // tworzymy listê badanych liczb
		Scanner liczba_liczb = new Scanner(System.in); // przy pomocy tego obiektu pobieramy dane ze standardowego wejœcia
		System.out.println("Podaj liczby z przedzia³u (2-30000) i zakoñcz wprowadzanie przez podanie znaku ';': ");
		ii=0;
		
		/* Pêtla wczytuj¹ca ze standardowego wejœcia liczby mieszcz¹ce sie w zadanym przedziale
		 * dopóki po pierwsze nie zostanie wprowadzony znak koñca zbioru czyli ';' oraz do póki
		 * liczba podanych cyfr nie przekroczy liczbê MAX. Jesli zostanie wprowadzona liczba z poza 
		 * zakresu (2-30000) lub znak nie daj¹cy siê sparsowaæ do inta czyli np.litera to program 
		 * zg³osi wyj¹tek i komunikat
		 * 
		 */
		while ( true ) {
			znak = liczba_liczb.next();
			if (!znak.equalsIgnoreCase(";") && tab.size()<MAX) {
				try {
					n = Integer.parseInt(znak);
					if (n<2||n>30000)
						System.out.println("Liczba poza zakresem!");	
					else
						tab.add(new Integer(n)); //dodajemy do listy ka¿d¹ wprowadzona liczbê
				}
				catch (NumberFormatException e) {
					System.out.println("Niepoprawna liczba!");
				}			
				
			}
			else
				break;		// jeœli wpisanym znakiem bêdzie ';' wychodzimy z pêtli
		}
		 
		for (i=0;i<tab.size();i++){	 // teraz na ka¿dej pozycji z listy przeprowadzamy rozk³ad
			liczba = tab.get(i);      // ka¿dy element po kolei wrzucamy do zmiennej liczba
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