package state;



public class Conexion {
	
	private EstadoConexion connectionState;
	private Link link;
	
	
    public Conexion(Link link) {
        assert link != null;
        this.link = link;

    }
	
    public Estado getEstado() {
        return this.connectionState.estado();
    }
    

    public Link getLink() {
        return link;
    }


    public void abrir() {
        this.connectionState.
    }

    public void cerrar() {
        if (this.estado == Estado.CERRADO) {
        } else if (this.estado == Estado.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PREPARADO) {
            this.estado = Estado.CERRADO;
        } else if (this.estado == Estado.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        }
        assert false : "estado imposible";
    }

    public void parar() {
        if (this.estado == Estado.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PARADO) {
        } else if (this.estado == Estado.PREPARADO) {
            this.estado = Estado.PARADO;
        } else if (this.estado == Estado.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        }
        assert false : "estado imposible";
    }

    public void iniciar() {
        if (this.estado == Estado.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PARADO) {
            this.estado = Estado.PREPARADO;
        } else if (this.estado == Estado.PREPARADO) {
        } else if (this.estado == Estado.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        }
        assert false : "estado imposible";
    }

    public void enviar(String msg) {
        if (this.estado == Estado.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PREPARADO) {
            this.link.enviar(msg);
            this.estado = Estado.ESPERANDO;
        } else if (this.estado == Estado.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        }
        assert false : "estado imposible";
    }

    public void recibir(int respuesta) {
        if (this.estado == Estado.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PREPARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.ESPERANDO) {
            if (respuesta == 0) {
                this.estado = Estado.PREPARADO;
            } else {
                this.estado = Estado.CERRADO;
            }
        }
        assert false : "estado imposible";
    }
	

}
