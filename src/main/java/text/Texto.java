package text;

public class Texto extends Escrito{

	public Texto(){
		super();
	}
	
	
	@Override
	public String dibujar(boolean b) {
		String resultado ="";
		if (b) {
			for (Componente elem : this.getDocs()){
				resultado = resultado + elem.dibujar(b).toUpperCase();
			}}
			else
			{
				for (Componente elem : this.getDocs()){
					resultado = resultado + elem.dibujar(b);}
				
				
			}
				
			return resultado + "---o---" + "\n";
	}


	@Override
	public void remove(Componente componente) {
		if (componente instanceof Escrito){
			this.getDocs().remove(componente);
		}
		else{
		}
	}


	@Override
	public void add(Componente componente) {
		if (componente instanceof Escrito){
			this.getDocs().add(componente);
		}
		else{
			throw new  UnsupportedOperationException();
		}
	}


	

}
