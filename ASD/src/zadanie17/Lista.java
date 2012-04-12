package zadanie17;

import java.math.BigInteger;
import java.util.ArrayList;


public class Lista extends ArrayList<BigInteger> {
	public String Print() {
		String out="";
		
		out = out + this.size();
		for(int i=0;i<this.size();i++)
			out = out + " " + this.get(i).toString();
	
		
		return out;
	}

}
