package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	private int codigo;
	//private String nombre; //Se elimina par�metro 2
	//public Tipo(int codigo, String nombre) {  //<-- Este c�dico recibe dos argumentos y enum tiene 1 solo par�metro
	private Tipo(int codigo) { //se crea con pivate ya que los constructores de los enumeradores debe ser private o de paquete
		this.codigo = codigo;
		//this.nombre = nombre; //se elimina par�metro 2
	}
}
