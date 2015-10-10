package calculadora;

public abstract class ComandoAbstracto implements Comando{

	 private Calculator calculadora;

	 public ComandoAbstracto(Calculator calculadora){
		 this.calculadora=calculadora;
	 }
	 
	 protected Calculator getCalculadora(){
		 return this.calculadora;
	 }
}
