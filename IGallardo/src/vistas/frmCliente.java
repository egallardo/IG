 package vistas;
 
 import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class frmCliente {

	private JFrame frame;
	private JTextField txtCodigo;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtMunicipio;
	private JTextField txtDepartamento;
	private JTextField txtTelfono;
	private JTextField txtCelular;
	private JTextField txtCorreo;
	private JTextField txtEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCliente window = new frmCliente();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 452, 487);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCodigo= new JLabel("Codigo de Cliente:");
		lblCodigo.setBounds(52, 21, 132, 24);
		frame.getContentPane().add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setText("Codigo");
		txtCodigo.setBounds(142, 24, 114, 19);
		frame.getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setBounds(52, 57, 70, 15);
		frame.getContentPane().add(lblNombres);
		
		txtNombres = new JTextField();
		txtNombres.setText("Nombres");
		txtNombres.setBounds(142, 53, 161, 19);
		frame.getContentPane().add(txtNombres);
		txtNombres.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(52, 84, 70, 15);
		frame.getContentPane().add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setText("Apellidos");
		txtApellidos.setBounds(142, 82, 161, 19);
		frame.getContentPane().add(txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Direccion:");
		lblDireccin.setBounds(52, 111, 70, 15);
		frame.getContentPane().add(lblDireccin);
		
		JTextArea txtrDireccin = new JTextArea();
		txtrDireccin.setWrapStyleWord(true);
		txtrDireccin.setRows(4);
		txtrDireccin.setText("Direccion");
		txtrDireccin.setBounds(142, 113, 272, 38);
		frame.getContentPane().add(txtrDireccin);
		
		JLabel lblMunicipio = new JLabel("Municipio:");
		lblMunicipio.setBounds(52, 165, 84, 15);
		frame.getContentPane().add(lblMunicipio);
		
		txtMunicipio = new JTextField();
		txtMunicipio.setText("Municipio");
		txtMunicipio.setBounds(142, 162, 114, 19);
		frame.getContentPane().add(txtMunicipio);
		txtMunicipio.setColumns(10);
		
		JLabel lblDepartamento = new JLabel("Departamento:");
		lblDepartamento.setBounds(52, 192, 114, 15);
		frame.getContentPane().add(lblDepartamento);
		
		txtDepartamento = new JTextField();
		txtDepartamento.setText("Departamento");
		txtDepartamento.setBounds(142, 191, 114, 19);
		frame.getContentPane().add(txtDepartamento);
		txtDepartamento.setColumns(10);
		
		JLabel lblTelfono = new JLabel("Telefono:");
		lblTelfono.setBounds(52, 219, 70, 15);
		frame.getContentPane().add(lblTelfono);
		
		txtTelfono = new JTextField();
		txtTelfono.setText("Telefono");
		txtTelfono.setBounds(142, 219, 114, 19);
		frame.getContentPane().add(txtTelfono);
		txtTelfono.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(52, 246, 70, 15);
		frame.getContentPane().add(lblCelular);
		
		txtCelular = new JTextField();
		txtCelular.setText("Celular");
		txtCelular.setBounds(142, 244, 114, 19);
		frame.getContentPane().add(txtCelular);
		txtCelular.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(52, 273, 70, 15);
		frame.getContentPane().add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setText("Correo");
		txtCorreo.setBounds(142, 271, 114, 19);
		frame.getContentPane().add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblActivo = new JLabel("Estado:");
		lblActivo.setBounds(52, 300, 70, 15);
		frame.getContentPane().add(lblActivo);
		
		txtEstado = new JTextField();
		txtEstado.setText("Estado");
		txtEstado.setBounds(142, 298, 114, 19);
		frame.getContentPane().add(txtEstado);
		txtEstado.setColumns(10);
		
		JLabel lblNotas = new JLabel("Notas:");
		lblNotas.setBounds(52, 327, 70, 15);
		frame.getContentPane().add(lblNotas);
		
		JTextArea txtrNotas = new JTextArea();
		txtrNotas.setText("Notas");
		txtrNotas.setBounds(142, 329, 272, 62);
		frame.getContentPane().add(txtrNotas);
		
		JButton btnIngresar = new JButton("Grabar");
		btnIngresar.setBounds(52, 413, 98, 25);
		frame.getContentPane().add(btnIngresar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(183, 413, 95, 25);
		frame.getContentPane().add(btnBorrar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(316, 413, 98, 25);
		frame.getContentPane().add(btnSalir);
	}
}
