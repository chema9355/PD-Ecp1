package state;

public class EstadoEsperando extends EstadoConexion {

	@Override
	public Estado estado() {
		return Estado.ESPERANDO;
	}

	@Override
	public void abrir(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void parar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		if (respuesta > 0){
			conexion.getLink().recibir(respuesta);
			conexion.setEstado(new EstadoCerrado());
		}
		else if ( respuesta == 0){
			conexion.getLink().recibir(respuesta);
			conexion.setEstado(new EstadoPreparado());
		}
		else {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
	}

}
