package zadanie17;

//import Lista;

import java.math.BigInteger;

import javax.swing.JOptionPane;


public class Waga {


	public static void main(String[] args) {

		BigInteger masaBadana;
		BigInteger podstawa = new BigInteger("3");
		BigInteger zero = new BigInteger("0");
		BigInteger reszta = new BigInteger("0");
		BigInteger[] dzielenie = new BigInteger[2];
		int i=0,k=0;	
		String masa; 
		Lista Odwazniki = new Lista();
		Lista szl = new Lista();
		Lista szp = new Lista();		
		
		BigInteger masaOdwaznika = new BigInteger("0");
		
		masa = JOptionPane.showInputDialog(null, "Podaj wagê..");
		masaBadana = new BigInteger(masa);
		
		while (masaOdwaznika.compareTo(masaBadana)==-1 ){ // czyli masaOdwaznika < masaBadana				
				masaOdwaznika = podstawa.pow(k);				
				k++;
				Odwazniki.add(masaOdwaznika);  
			} 
		
		for(i=0; i<Odwazniki.size(); i++)
            masaBadana = masaBadana.add( Odwazniki.get(i) );
          
		i=0;
        while(masaBadana.compareTo(zero)==1) {// czyli masaBadana > 0        	
        	dzielenie = masaBadana.divideAndRemainder(podstawa);
        	
        	masaBadana = dzielenie[0];
        	reszta = dzielenie[1];            
            
        	if (reszta.compareTo(new BigInteger("2"))==0 ) { // czyli nowaMasa == 2
        		szp.add(new BigInteger( Odwazniki.get(i).toString()) );
            }
            else
            		if (reszta.compareTo(zero)==0) {// czyli nowaMasa == 0
            			szl.add(new BigInteger( Odwazniki.get(i).toString()) );           			
            		}
                       i++;
          }
        JOptionPane.showMessageDialog ( null,( "Masa badana to :" + masa+"\n")+
		  		 ("Mamy do dyspozycji " + Odwazniki.size() + " odwa¿ników o masach:" + Odwazniki));

		
        JOptionPane.showMessageDialog (
        		null,
        		"\n"+szl.Print()+"\n"+szp.Print()
        );
		
        
        
	}
	
	

}
