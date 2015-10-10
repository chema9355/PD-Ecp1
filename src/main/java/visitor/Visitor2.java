package visitor;

public class Visitor2 extends Visitor{
	
	private int contElemA;
	private int contElemB;
	
	public Visitor2(){
		this.contElemA=0;
		this.contElemB=0;
	}

	@Override
	public void visitElementA(ElementA e) {
		this.contElemA++;
		System.out.println(this.contElemA);
		
	}

	@Override
	public void visitElementB(ElementB e) {
		this.contElemB++;
		System.out.println(this.contElemB);
		
	}
	
	public int getAs(){
		return this.contElemA;
	}
	
	public int getBs(){
		return this.contElemB;
	}


}
