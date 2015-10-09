package state;

public class EstadoCerrado extends EstadoConexion{

	@Override
	public Estado estado() {
		return Estado.CERRADO;
	}

}
