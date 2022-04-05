package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	private int codigo;
	//private String nombre; //Se elimina parámetro 2
	//public Tipo(int codigo, String nombre) {  //<-- Este códico recibe dos argumentos y enum tiene 1 solo parámetro
	private Tipo(int codigo) { //se crea con pivate ya que los constructores de los enumeradores debe ser private o de paquete
		this.codigo = codigo;
		//this.nombre = nombre; //se elimina parámetro 2
	}
}
