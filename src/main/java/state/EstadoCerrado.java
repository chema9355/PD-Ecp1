package state;

public class EstadoCerrado extends ConnectionState{

	@Override
	public Estado estado() {
		return Estado.CERRADO;
	}

}
