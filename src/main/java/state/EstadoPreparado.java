package state;

public class EstadoPreparado extends EstadoConexion {

	@Override
	public Estado estado() {
		return Estado.PREPARADO;
	}

	@Override
	public void abrir(Conexion conexion) {

	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstado(new EstadoCerrado());
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setEstado(new EstadoParado());
	}

	@Override
	public void iniciar(Conexion conexion) {
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		conexion.getLink().enviar(msg);
		conexion.setEstado(new EstadoEsperando());
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

}
