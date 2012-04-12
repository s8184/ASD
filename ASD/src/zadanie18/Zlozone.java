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
		final int MAX = 10000; // sta�a ograniczaj�ca d�ugo�� listy na kt�rej przechowywane s� liczby
		
		List<Integer> tab = new ArrayList<Integer>(); // tworzymy list� badanych liczb
		Scanner liczba_liczb = new Scanner(System.in); // przy pomocy tego obiektu pobieramy dane ze standardowego wej�cia
		System.out.println("Podaj liczby z przedzia�u (2-30000) i zako�cz wprowadzanie przez podanie znaku ';': ");
		ii=0;
		
		/* P�tla wczytuj�ca ze standardowego wej�cia liczby mieszcz�ce sie w zadanym przedziale
		 * dop�ki po pierwsze nie zostanie wprowadzony znak ko�ca zbioru czyli ';' oraz do p�ki
		 * liczba podanych cyfr nie przekroczy liczb� MAX. Jesli zostanie wprowadzona liczba z poza 
		 * zakresu (2-30000) lub znak nie daj�cy si� sparsowa� do inta czyli np.litera to program 
		 * zg�osi wyj�tek i komunikat
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
						tab.add(new Integer(n)); //dodajemy do listy ka�d� wprowadzona liczb�
				}
				catch (NumberFormatException e) {
					System.out.println("Niepoprawna liczba!");
				}			
				
			}
			else
				break;		// je�li wpisanym znakiem b�dzie ';' wychodzimy z p�tli
		}
		 
		for (i=0;i<tab.size();i++){	 // teraz na ka�dej pozycji z listy przeprowadzamy rozk�ad
			liczba = tab.get(i);      // ka�dy element po kolei wrzucamy do zmiennej liczba
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