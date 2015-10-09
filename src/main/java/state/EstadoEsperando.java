package state;

public class EstadoEsperando extends EstadoConexion {

	@Override
	public Estado estado() {
		return Estado.ESPERANDO;
	}

}
