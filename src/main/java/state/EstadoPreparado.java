package state;

public class EstadoPreparado extends EstadoConexion{

	@Override
	public Estado estado() {
		return Estado.PREPARADO;
	}

}
