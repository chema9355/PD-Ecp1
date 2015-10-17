package text;

import java.util.HashMap;
import java.util.Map;


public class FactoriaCaracter {
	
	   private final Map<String, Caracter> map = new HashMap<String, Caracter>();
	   private static final FactoriaCaracter factoria = new FactoriaCaracter();
	   
	    public Caracter get(char c) {
	        if (map.containsKey(String.valueOf(c))) {
	            return map.get(String.valueOf(c));
	        } else {
	            // Construcción perezosa
	        	Caracter pl = new Caracter(c);
	            map.put(String.valueOf(c), pl);
	            return pl;
	        }
	    }
	    
	    public static FactoriaCaracter getFactoria(){
	    	return factoria;
	    }

}
