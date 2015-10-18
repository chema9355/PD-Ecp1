package state;

public class Conexion {

	private EstadoConexion connectionState;
	private Link link;

	public Conexion(Link link) {
		assert link != null;
		this.link = link;
		this.connectionState = new EstadoCerrado();
	}

	public Estado getEstado() {
		return this.connectionState.estado();
	}

	public void setEstado(EstadoConexion estado) {
		this.connectionState = estado;
	}

	public Link getLink() {
		return link;
	}

	public void abrir() {
		this.connectionState.abrir(this);
	}

	public void cerrar() {
		this.connectionState.cerrar(this);
	}

	public void parar() {
		this.connectionState.parar(this);
	}

	public void iniciar() {
		this.connectionState.iniciar(this);
	}

	public void enviar(String msg) {
		this.connectionState.enviar(this, msg);

	}

	public void recibir(int respuesta) {
		this.connectionState.recibir(this, respuesta);
	}

}
