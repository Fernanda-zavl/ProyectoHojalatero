package Interface;

import Dominio.Llantas;

public interface Metodos {

	public void guardar (Llantas llanta);
	public void mostrar();
	public Llantas buscar (long codigoBarra);
	public void editar (Llantas llanta);
	public void eliminar (long codigoBarra);
	
	
}
