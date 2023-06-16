/**
 * 
 */
package examen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author federicoruiz
 * 15 jun 2023 11:46:54
 */
public class Controlador implements Gestionar{
	
	
	private Vista vista;
	private Modelo modelo;
	/**
	 * @return the vista
	 */
	public Vista getVista() {
		return vista;
	}
	/**
	 * @param vista the vista to set
	 */
	public void setVista(Vista vista) {
		this.vista = vista;
	}
	/**
	 * @return the modelo
	 */
	public Modelo getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	/**
	 * Habilito el boton solo cuando los campos estan completos
	 */
	public void habilitarBtn() {
		String user = vista.getTxtNombre().getText();
		String año = vista.getTxtAño().getText();
		
		if(!user.equals("") && !año.equals("")) {
			vista.getBtnEnviar().setEnabled(true);	
		}else {
			vista.getBtnEnviar().setEnabled(false);
		}
	}
	/**
	 * Cargo los datos
	 * 
	 */
	public void cargarDatos() {
		String user = vista.getTxtNombre().getText();
		String año = vista.getTxtAño().getText();
		
		modelo.añadir(user,año);
		
		
		
	}
	@Override
	public float getEdadMedia(Object[] miTabla) {
		
		return 0;
	}
	@Override
	public char getMasUsada(Object[] miLista) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	/**
	 * 
	 * Valido el nombre con el metodo matches que solo hayan caracters alfabeticos y espacios en blanco
	 */
	
	public boolean validaNombre() {
	String user = vista.getTxtNombre().getText();
		
		if(user.matches("[a-zA-Zá-úÁ-Ú\s]+")) {
			return true;
		}else {
			return false;
		}
	
	}
	
	public float calcularEdad() {
		float res= 0f;
		int suma = 0;
		List<Integer> listaAño = modelo.getListaAños();
		
		for (int i = 0; i < listaAño.size(); i++) {
			suma +=  listaAño.get(i);
		
		}
		
		suma = suma / listaAño.size();
		
		res = 2023 - suma;
		
		return res;
	}
	

}
