/**
 * 
 */
package examen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author federicoruiz 15 jun 2023 11:38:54
 */
public class Vista extends JFrame {

	private Modelo modelo;
	private Controlador controlador;
	private JPanel contentPane;
	private JTable tabla;
	private JTextField txtNombre;
	private JTextField txtAño;
	private JButton btnEnviar;
	private Boolean comprobarNombre;
	private JLabel lblNombreErr;
	private JLabel lblEdadMedia;
	private JTextField txtEdadMedia;

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 6, 412, 159);
		contentPane.add(scrollPane);

		tabla = new JTable();
		scrollPane.setViewportView(tabla);

		txtNombre = new JTextField();
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				controlador.habilitarBtn();
			}

			@Override
			public void keyReleased(KeyEvent e) {
				comprobarNombre = controlador.validaNombre();
				if (comprobarNombre) {
					lblNombreErr.setVisible(false);
				} else {
					lblNombreErr.setVisible(true);
				}
			}
		});
		txtNombre.setBounds(177, 199, 130, 26);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtAño = new JTextField();
		txtAño.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				controlador.habilitarBtn();
			}
		});
		txtAño.setBounds(177, 237, 130, 26);
		contentPane.add(txtAño);
		txtAño.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(32, 204, 78, 16);
		contentPane.add(lblNombre);

		JLabel lblAño = new JLabel("Año de nacimiento");
		lblAño.setBounds(35, 242, 130, 16);
		contentPane.add(lblAño);

		btnEnviar = new JButton("Enviar");
		btnEnviar.setEnabled(false);
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cargarDatos();
				float edad = controlador.calcularEdad();
				
				// Me BLOQUIE TE SACO LA MEDIA DE LA EDAD POR UN SYSO
				System.out.println(edad);
			
				//txtEdadMedia.setText(edad);
			}
		});
		btnEnviar.setBounds(333, 237, 117, 29);
		contentPane.add(btnEnviar);

		lblNombreErr = new JLabel("Error solo letras");
		lblNombreErr.setVisible(false);
		lblNombreErr.setBounds(319, 204, 125, 16);
		contentPane.add(lblNombreErr);
		
		lblEdadMedia = new JLabel("Edad Media");
		lblEdadMedia.setBounds(6, 177, 90, 16);
		contentPane.add(lblEdadMedia);
		
		txtEdadMedia = new JTextField();
		txtEdadMedia.setBounds(97, 172, 41, 26);
		contentPane.add(txtEdadMedia);
		txtEdadMedia.setColumns(10);
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
	 * @return the controlador
	 */
	public Controlador getControlador() {
		return controlador;
	}

	/**
	 * @param controlador the controlador to set
	 */
	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public void ActualizarDatos(DefaultTableModel miTabla) {
		tabla.setModel(miTabla);
	}

	/**
	 * @return the txtNombre
	 */
	public JTextField getTxtNombre() {
		return txtNombre;
	}

	/**
	 * @param txtNombre the txtNombre to set
	 */
	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	/**
	 * @return the txtAño
	 */
	public JTextField getTxtAño() {
		return txtAño;
	}

	/**
	 * @param txtAño the txtAño to set
	 */
	public void setTxtAño(JTextField txtAño) {
		this.txtAño = txtAño;
	}

	/**
	 * @return the btnEnviar
	 */
	public JButton getBtnEnviar() {
		return btnEnviar;
	}

}
