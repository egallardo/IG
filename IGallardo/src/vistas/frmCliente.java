 package vistas;
 
 import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

import controladores.ControladorCliente;
import entidades.Cliente;
import entidades.Filtro;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmCliente {
	
	private ControladorCliente controlador;

	private JFrame frame;
	private JTextField txtCodigo;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextArea txtrDireccion; 
	private JTextField txtMunicipio;
	private JTextField txtDepartamento;
	private JTextField txtTelefono;
	private JTextField txtCelular;
	private JTextField txtCorreo;
	private JTextField txtEstado;
	private JTable tableCliente;

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
		
        controlador = new ControladorCliente();
        Filtro filtro = new Filtro(false,false,"","");
        controlador.setFiltro(filtro);
        tableCliente.setModel(controlador);
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
		txtCodigo.setBounds(189, 24, 114, 19);
		frame.getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setBounds(52, 57, 70, 15);
		frame.getContentPane().add(lblNombres);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(142, 53, 161, 19);
		frame.getContentPane().add(txtNombres);
		txtNombres.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(52, 84, 70, 15);
		frame.getContentPane().add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(142, 82, 161, 19);
		frame.getContentPane().add(txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Direccion:");
		lblDireccin.setBounds(52, 111, 70, 15);
		frame.getContentPane().add(lblDireccin);
		
		final JTextArea txtrDireccion = new JTextArea();
		txtrDireccion.setWrapStyleWord(true);
		txtrDireccion.setRows(4);
		txtrDireccion.setBounds(142, 113, 272, 38);
		frame.getContentPane().add(txtrDireccion);
		
		JLabel lblMunicipio = new JLabel("Municipio:");
		lblMunicipio.setBounds(52, 165, 84, 15);
		frame.getContentPane().add(lblMunicipio);
		
		txtMunicipio = new JTextField();
		txtMunicipio.setBounds(142, 162, 114, 19);
		frame.getContentPane().add(txtMunicipio);
		txtMunicipio.setColumns(10);
		
		JLabel lblDepartamento = new JLabel("Departamento:");
		lblDepartamento.setBounds(52, 192, 114, 15);
		frame.getContentPane().add(lblDepartamento);
		
		txtDepartamento = new JTextField();
		txtDepartamento.setBounds(167, 190, 114, 19);
		frame.getContentPane().add(txtDepartamento);
		txtDepartamento.setColumns(10);
		
		JLabel lblTelfono = new JLabel("Telefono:");
		lblTelfono.setBounds(52, 219, 70, 15);
		frame.getContentPane().add(lblTelfono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(142, 219, 114, 19);
		frame.getContentPane().add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(52, 246, 70, 15);
		frame.getContentPane().add(lblCelular);
		
		txtCelular = new JTextField();
		txtCelular.setBounds(142, 244, 114, 19);
		frame.getContentPane().add(txtCelular);
		txtCelular.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(52, 273, 70, 15);
		frame.getContentPane().add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(142, 271, 114, 19);
		frame.getContentPane().add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblActivo = new JLabel("Estado:");
		lblActivo.setBounds(52, 300, 70, 15);
		frame.getContentPane().add(lblActivo);
		
		txtEstado = new JTextField();
		txtEstado.setBounds(142, 298, 114, 19);
		frame.getContentPane().add(txtEstado);
		txtEstado.setColumns(10);
		
		JLabel lblNotas = new JLabel("Notas:");
		lblNotas.setBounds(52, 327, 70, 15);
		frame.getContentPane().add(lblNotas);
		
		final JTextArea txtrNotas = new JTextArea();
		txtrNotas.setBounds(142, 329, 272, 62);
		frame.getContentPane().add(txtrNotas);
		
	    tableCliente.setModel(new javax.swing.table.DefaultTableModel(
	               new Object [][] {
	                   {null, null, null, null},
	                   {null, null, null, null},
	                   {null, null, null, null},
	                   {null, null, null, null}
	               },
	               new String [] {
	                   "Title 1", "Title 2", "Title 3", "Title 4"
	               }
	           ));
		
		JButton btnIngresar = new JButton("Grabar");

		btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	btnIngresarMouseClicked(evt);

            }

			private void btnIngresarMouseClicked(MouseEvent evt) {
				// TODO Auto-generated method stub
				Cliente cl = new Cliente();
		        cl.setIdCliente(Integer.parseInt(txtCodigo.getText().trim()));
		        cl.setNombres(txtNombres.getText().trim());
		        cl.setApellidos(txtApellidos.getText().trim());
		        cl.setDireccion(txtrDireccion.getText().trim());
		        cl.setMunicipio(txtMunicipio.getText().trim());
		        cl.setDepartamento(txtDepartamento.getText().trim());
		        cl.setCelular(txtCelular.getText().trim());
		        cl.setTelefono(txtTelefono.getText().trim());
		        cl.setCorreo(txtCorreo.getText().trim());
		        cl.setNotas(txtrNotas.getText().trim());
		        
		        System.out.println("working");
		        
		        controlador.agregarCliente(cl);
		        controlador = new ControladorCliente();
		        tableCliente.setModel(controlador);
				
			}
        });
		
		

		btnIngresar.setBounds(52, 413, 98, 25);
		frame.getContentPane().add(btnIngresar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(183, 413, 95, 25);
		frame.getContentPane().add(btnBorrar);
		
		JButton btnSalir = new JButton("Salir");

		btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //jbtnCerrarMouseClicked(evt);
            	btnCerrarMouseClicked(evt);
            }

			private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
        });

		btnSalir.setBounds(316, 413, 98, 25);
		frame.getContentPane().add(btnSalir);
		
		tableCliente = new JTable();
		tableCliente.setBounds(12, 12, 1, 1);
		frame.getContentPane().add(tableCliente);
	}
}
