package state;



public class Connection {
	
	private ConnectionState connectionState;
	private Link link;
	
	
    public Estado getEstado() {
        return this.connectionState.estado();
    }
	

}
