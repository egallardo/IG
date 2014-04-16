package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

import controladores.ControladorCliente;
import entidades.Cliente;
import entidades.Filtro;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

import javax.swing.JTable;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JSeparator;
import javax.swing.JComboBox;

public class frmCliente implements ActionListener{

	private ControladorCliente controlador;

	private JFrame frame;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtTelefono;
	private JTextField txtCelular;
	private JTextField txtCorreo;
	private JTextField txtEmpresa;
	private JTextField txtNit;
	private JTextField txtDUI;
	private JTextArea txtDireccion;
	private JTextArea txtNotas;
	private JLabel lblEmpresa;
	private JLabel lblNombres;
	private JLabel lblApellidos;
	private JLabel lblDUI;
	private JLabel lblNit;
	private JLabel lblDireccion;
	private JLabel lblMunicipio;
	private JLabel lblDepartamento;
	private JLabel lblCorreo;
	private JLabel lblTelefono;
	private JLabel lblCelular;
	private JLabel lblNotas;
	private JButton btnGuardar;
	private JButton btnBorrar;
	private JButton btnSalir;
	private JButton btnToolBarModificar;
	private JButton btnToolBarEliminar;
	private JButton btnToolBarCrear;
	private JButton btnToolBarBuscar;
	private JButton btnBuscar;
	private JButton btnCatalogo;
	private JLabel lblCodigo;
	private JTextField txtCodigo;
	private JSeparator separator;
	private JComboBox cmbMunicipio;
	private JComboBox cmbDepartamento;
	private ComboBoxModel[] models;
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

	public static void infoBox(String infoMessage, String location)
	{
		JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + location, JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Create the application.
	 */
	public frmCliente() {

		controlador = new ControladorCliente();
		Filtro filtro = new Filtro(false,false,"","");
		controlador.setFiltro(filtro);

		initialize();

		// toolbar buttons
		btnToolBarModificar.setEnabled(false);
		btnToolBarEliminar.setEnabled(false);		
		// txtFields
		txtCodigo.setVisible(false);
		txtEmpresa.setVisible(false);
		txtNombres.setVisible(false);
		txtApellidos.setVisible(false);
		txtDUI.setVisible(false);
		txtNit.setVisible(false);
		txtDireccion.setVisible(false);
		cmbDepartamento.setVisible(false);
		cmbMunicipio.setVisible(false);
		txtTelefono.setVisible(false);
		txtCelular.setVisible(false);
		txtCorreo.setVisible(false);
		txtNotas.setVisible(false);
		// lblFields
		lblCodigo.setVisible(false);
		lblEmpresa.setVisible(false);
		lblNombres.setVisible(false);
		lblApellidos.setVisible(false);
		lblDUI.setVisible(false);
		lblNit.setVisible(false);
		lblDireccion.setVisible(false);
		lblMunicipio.setVisible(false);
		lblDepartamento.setVisible(false);
		lblTelefono.setVisible(false);
		lblCelular.setVisible(false);
		lblCorreo.setVisible(false);
		lblNotas.setVisible(false);
		// btn
		btnGuardar.setVisible(false);
		btnBorrar.setVisible(false);
		btnSalir.setVisible(false);
		btnBuscar.setVisible(false);
		btnCatalogo.setVisible(false);
		separator.setVisible(false);



	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 577, 688);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(9, 78, 539, 569);
		frame.getContentPane().add(panel);

		lblDUI = new JLabel("D.U.I:");

		lblEmpresa = new JLabel("Empresa:");

		txtEmpresa = new JTextField();
		txtEmpresa.setEditable(false);
		txtEmpresa.setColumns(10);

		txtNit = new JTextField();
		txtNit.setEditable(false);
		txtNit.setColumns(10);

		txtDUI = new JTextField();
		txtDUI.setEditable(false);
		txtDUI.setColumns(10);

		lblCorreo = new JLabel("Correo:");

		txtTelefono = new JTextField();
		txtTelefono.setEditable(false);
		txtTelefono.setColumns(10);

		lblCelular = new JLabel("Celular:");

		txtCelular = new JTextField();
		txtCelular.setEditable(false);
		txtCelular.setColumns(10);

		txtCorreo = new JTextField();
		txtCorreo.setEditable(false);
		txtCorreo.setColumns(10);

		lblNotas = new JLabel("Notas:");

		lblApellidos = new JLabel("Apellidos:");

		txtApellidos = new JTextField();
		txtApellidos.setEditable(false);
		txtApellidos.setColumns(10);

		lblDireccion = new JLabel("Direccion:");

		lblMunicipio = new JLabel("Municipio:");

		lblDepartamento = new JLabel("Departamento:");

		lblTelefono = new JLabel("Telefono:");

		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtEmpresa.setText("");
				txtNombres.setText("");
				txtApellidos.setText("");
				txtDUI.setText("");
				txtNit.setText("");
				txtDireccion.setText("");
				//txtMunicipio.setText("");
				//txtDepartamento.setText("");
				txtTelefono.setText("");
				txtCelular.setText("");
				txtCorreo.setText("");
				txtNotas.setText("");
			}
		});

		btnSalir = new JButton("Salir");

		txtNotas = new JTextArea();
		txtNotas.setLineWrap(true);
		txtNotas.setEditable(false);

		lblNombres = new JLabel("Nombres:");

		btnGuardar = new JButton("Guardar");




		btnGuardar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Cliente cl = new Cliente();
				//cl.setIdCliente(Integer.parseInt(txtCodigo.getText().trim()));


				if (btnToolBarModificar.isEnabled()){
					try{
						cl.setIdCliente(Integer.parseInt(txtCodigo.getText()));
						cl.setNombres(txtNombres.getText().trim());
						cl.setApellidos(txtApellidos.getText().trim());
						cl.setDireccion(txtDireccion.getText().trim());
						cl.setEmpresa(txtEmpresa.getText().trim());
						cl.setDui(txtDUI.getText().trim());
						cl.setNit(txtNit.getText().trim());
						//cl.setMunicipio(txtMunicipio.getText().trim());
						cl.setMunicipio((String) cmbMunicipio.getSelectedItem());
						//cl.setDepartamento(txtDepartamento.getText().trim());
						cl.setDepartamento((String) cmbDepartamento.getSelectedItem());
						cl.setCelular(txtCelular.getText().trim());
						cl.setTelefono(txtTelefono.getText().trim());
						cl.setCorreo(txtCorreo.getText().trim());
						cl.setNotas(txtNotas.getText().trim());
						
						controlador.modificarCliente(cl);
						infoBox("Cliente modificado con exito", "Exito");
						
					}catch(Exception ex){
						System.out.println(ex.getMessage());
						
					}
				}else{
					try{
						
						cl.setNombres(txtNombres.getText().trim());
						cl.setApellidos(txtApellidos.getText().trim());
						cl.setDireccion(txtDireccion.getText().trim());
						cl.setEmpresa(txtEmpresa.getText().trim());
						cl.setDui(txtDUI.getText().trim());
						cl.setNit(txtNit.getText().trim());
						//cl.setMunicipio(txtMunicipio.getText().trim());
						cl.setMunicipio((String) cmbMunicipio.getSelectedItem());
						//cl.setDepartamento(txtDepartamento.getText().trim());
						cl.setDepartamento((String) cmbDepartamento.getSelectedItem());
						cl.setCelular(txtCelular.getText().trim());
						cl.setTelefono(txtTelefono.getText().trim());
						cl.setCorreo(txtCorreo.getText().trim());
						cl.setNotas(txtNotas.getText().trim());
						
						controlador.agregarCliente(cl);
						//controlador = new ControladorCliente();
						//tableCliente.setModel(controlador);
						infoBox("Cliente ingresado con exito!", "Exito");

						txtEmpresa.setText("");
						txtNombres.setText("");
						txtApellidos.setText("");
						txtDUI.setText("");
						txtNit.setText("");
						txtDireccion.setText("");
						//txtMunicipio.setText("");
						//txtDepartamento.setText("");
						txtTelefono.setText("");
						txtCelular.setText("");
						txtCorreo.setText("");
						txtNotas.setText("");

					}catch(Exception ex){
						System.out.println(ex.getMessage());
						infoBox("Cliente no fue ingresado!", "Error");
					}
				}

			}

		});

		txtNombres = new JTextField();
		txtNombres.setEditable(false);
		txtNombres.setColumns(10);

		lblNit = new JLabel("NIT:");

		txtDireccion = new JTextArea();
		txtDireccion.setLineWrap(true);
		txtDireccion.setEditable(false);

		lblCodigo = new JLabel("Codigo de Cliente:");

		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);

		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador = new ControladorCliente();
				Filtro filtro = new Filtro(true,false,txtCodigo.getText(),"");
				controlador.setFiltro(filtro);
				Cliente cl = controlador.buscarCliente(filtro);

				//Activating Modificar and Eliminar buttons
				btnToolBarModificar.setEnabled(true);
				btnToolBarEliminar.setEnabled(true);
				// txtFields
				txtEmpresa.setVisible(true);
				txtNombres.setVisible(true);
				txtApellidos.setVisible(true);
				txtDUI.setVisible(true);
				txtNit.setVisible(true);
				txtDireccion.setVisible(true);
				//txtMunicipio.setVisible(true);
				cmbMunicipio.setVisible(true);
				//txtDepartamento.setVisible(true);
				cmbDepartamento.setVisible(true);
				txtTelefono.setVisible(true);
				txtCelular.setVisible(true);
				txtCorreo.setVisible(true);
				txtNotas.setVisible(true);
				// txtFields disabled for Edit 
				txtEmpresa.setEditable(false);
				txtNombres.setEditable(false);
				txtApellidos.setEditable(false);
				txtDUI.setEditable(false);
				txtNit.setEditable(false);
				txtDireccion.setEditable(false);
				//txtMunicipio.setEditable(false);
				cmbMunicipio.setEditable(false);
				//txtDepartamento.setEditable(false);
				cmbDepartamento.setEditable(false);
				txtTelefono.setEditable(false);
				txtCelular.setEditable(false);
				txtCorreo.setEditable(false);
				txtNotas.setEditable(false);

				// lblFields
				lblEmpresa.setVisible(true);
				lblNombres.setVisible(true);
				lblApellidos.setVisible(true);
				lblDUI.setVisible(true);
				lblNit.setVisible(true);
				lblDireccion.setVisible(true);
				lblMunicipio.setVisible(true);
				lblDepartamento.setVisible(true);
				lblTelefono.setVisible(true);
				lblCelular.setVisible(true);
				lblCorreo.setVisible(true);
				lblNotas.setVisible(true);

				separator.setVisible(true);

				btnGuardar.setVisible(true);
				//btnBorrar.setVisible(true);
				btnSalir.setVisible(true);

				// Setting Values
				txtEmpresa.setText(cl.getEmpresa());
				txtNombres.setText(cl.getNombres());
				txtApellidos.setText(cl.getApellidos());
				txtDUI.setText(cl.getDui());
				txtNit.setText(cl.getNit());
				txtDireccion.setText(cl.getDireccion());
				//txtMunicipio.setText(cl.getMunicipio());
				cmbMunicipio.setSelectedItem(cl.getMunicipio());
				//txtDepartamento.setText(cl.getDepartamento());
				cmbDepartamento.setSelectedItem(cl.getDepartamento());

				txtTelefono.setText(cl.getTelefono());
				txtCelular.setText(cl.getCelular());
				txtCorreo.setText(cl.getCorreo());
				txtNotas.setText(cl.getNotas());





			}
		});

		btnCatalogo = new JButton("Catalogo");

		separator = new JSeparator();


		cmbDepartamento = new JComboBox();

		cmbMunicipio = new JComboBox();

		models = new DefaultComboBoxModel[14];
		try{
			for (int i=0; i < 14; i++){
				Filtro filtro = new Filtro(true,false,Integer.toString(i+1),"");
				//controlador.setFiltro(filtro);
				models[i] = controlador.listarMunicipio(filtro);
			}

			cmbMunicipio.setModel(models[0]);

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		cmbDepartamento = new JComboBox(controlador.listarDepartamentos());

		cmbDepartamento.addActionListener(this);



		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
										.addGap(12)
										.addComponent(lblApellidos)
										.addGap(50)
										.addComponent(txtApellidos, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
												.addGap(12)
												.addComponent(lblDireccion)
												.addGap(50)
												.addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_panel.createSequentialGroup()
														.addGap(12)
														.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
																.addGroup(gl_panel.createSequentialGroup()
																		.addComponent(lblEmpresa)
																		.addGap(54)
																		.addComponent(txtEmpresa))
																		.addGroup(gl_panel.createSequentialGroup()
																				.addComponent(lblNombres)
																				.addGap(52)
																				.addComponent(txtNombres, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))))
																				.addGroup(gl_panel.createSequentialGroup()
																						.addGap(12)
																						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
																								.addGroup(gl_panel.createSequentialGroup()
																										.addComponent(lblNit)
																										.addGap(93)
																										.addComponent(txtNit))
																										.addGroup(gl_panel.createSequentialGroup()
																												.addComponent(lblDUI)
																												.addGap(81)
																												.addComponent(txtDUI, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))))
																												.addGroup(gl_panel.createSequentialGroup()
																														.addContainerGap()
																														.addComponent(separator, GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
																														.addGroup(gl_panel.createSequentialGroup()
																																.addContainerGap()
																																.addComponent(lblCodigo, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(ComponentPlacement.RELATED)
																																.addComponent(txtCodigo, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
																																.addGap(18)
																																.addComponent(btnBuscar)
																																.addGap(18)
																																.addComponent(btnCatalogo))
																																.addGroup(gl_panel.createSequentialGroup()
																																		.addGap(12)
																																		.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																																				.addGroup(gl_panel.createSequentialGroup()
																																						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																																								.addComponent(btnGuardar)
																																								.addGroup(gl_panel.createSequentialGroup()
																																										.addPreferredGap(ComponentPlacement.RELATED)
																																										.addComponent(lblMunicipio))
																																										.addGroup(gl_panel.createSequentialGroup()
																																												.addPreferredGap(ComponentPlacement.RELATED)
																																												.addComponent(lblDepartamento))
																																												.addGroup(gl_panel.createSequentialGroup()
																																														.addPreferredGap(ComponentPlacement.RELATED)
																																														.addComponent(lblTelefono))
																																														.addGroup(gl_panel.createSequentialGroup()
																																																.addPreferredGap(ComponentPlacement.RELATED)
																																																.addComponent(lblCelular))
																																																.addGroup(gl_panel.createSequentialGroup()
																																																		.addPreferredGap(ComponentPlacement.RELATED)
																																																		.addComponent(lblNotas)))
																																																		.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																																																				.addGroup(gl_panel.createSequentialGroup()
																																																						.addGap(12)
																																																						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																																																								.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																																								.addComponent(txtCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																																								.addGroup(gl_panel.createSequentialGroup()
																																																										.addGap(35)
																																																										.addComponent(btnBorrar)
																																																										.addGap(59)
																																																										.addComponent(btnSalir))
																																																										.addComponent(txtNotas, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)))
																																																										.addGroup(gl_panel.createSequentialGroup()
																																																												.addPreferredGap(ComponentPlacement.UNRELATED)
																																																												.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
																																																														.addComponent(cmbDepartamento, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																																																														.addComponent(cmbMunicipio, Alignment.LEADING, 0, 154, Short.MAX_VALUE)))))
																																																														.addGroup(gl_panel.createSequentialGroup()
																																																																.addComponent(lblCorreo)
																																																																.addGap(67)
																																																																.addComponent(txtCorreo, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)))
																																																																.addGap(75)))
																																																																.addGap(55))
				);
		gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGap(29)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCodigo)
								.addComponent(txtCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBuscar)
								.addComponent(btnCatalogo))
								.addGap(31)
								.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblEmpresa)
										.addComponent(txtEmpresa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup()
														.addGap(2)
														.addComponent(lblNombres))
														.addComponent(txtNombres, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
														.addGap(12)
														.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_panel.createSequentialGroup()
																		.addGap(2)
																		.addComponent(lblApellidos))
																		.addComponent(txtApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																		.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																				.addGroup(gl_panel.createSequentialGroup()
																						.addGap(8)
																						.addComponent(lblDUI))
																						.addGroup(gl_panel.createSequentialGroup()
																								.addGap(6)
																								.addComponent(txtDUI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
																								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																										.addGroup(gl_panel.createSequentialGroup()
																												.addGap(13)
																												.addComponent(lblNit))
																												.addGroup(gl_panel.createSequentialGroup()
																														.addGap(12)
																														.addComponent(txtNit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
																														.addPreferredGap(ComponentPlacement.RELATED)
																														.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																																.addComponent(lblDireccion)
																																.addGroup(gl_panel.createSequentialGroup()
																																		.addGap(8)
																																		.addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)))
																																		.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																																				.addGroup(gl_panel.createSequentialGroup()
																																						.addGap(13)
																																						.addComponent(lblMunicipio))
																																						.addGroup(gl_panel.createSequentialGroup()
																																								.addPreferredGap(ComponentPlacement.UNRELATED)
																																								.addComponent(cmbMunicipio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
																																								.addGap(14)
																																								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
																																										.addComponent(lblDepartamento)
																																										.addComponent(cmbDepartamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																																										.addGap(18)
																																										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																																												.addGroup(gl_panel.createSequentialGroup()
																																														.addGap(10)
																																														.addComponent(lblCorreo))
																																														.addGroup(gl_panel.createSequentialGroup()
																																																.addGap(8)
																																																.addComponent(txtCorreo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
																																																.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																																																		.addGroup(gl_panel.createSequentialGroup()
																																																				.addGap(6)
																																																				.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																																																				.addGroup(gl_panel.createSequentialGroup()
																																																						.addPreferredGap(ComponentPlacement.UNRELATED)
																																																						.addComponent(lblTelefono)))
																																																						.addPreferredGap(ComponentPlacement.RELATED)
																																																						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
																																																								.addComponent(txtCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																																								.addComponent(lblCelular))
																																																								.addPreferredGap(ComponentPlacement.UNRELATED)
																																																								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
																																																										.addComponent(txtNotas, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
																																																										.addComponent(lblNotas))
																																																										.addPreferredGap(ComponentPlacement.RELATED)
																																																										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																																																												.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
																																																														.addComponent(btnSalir)
																																																														.addComponent(btnBorrar))
																																																														.addComponent(btnGuardar))
																																																														.addGap(66))
				);
		panel.setLayout(gl_panel);

		btnSalir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(-1, 0, 549, 80);
		frame.getContentPane().add(toolBar);

		btnToolBarBuscar = new JButton("");
		btnToolBarBuscar.setToolTipText("Buscar");
		btnToolBarBuscar.setIcon(new ImageIcon("/home/elmer/Proyectos/Industrias Gallardo/iconos/Buscar.ico"));
		btnToolBarBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Hiding toolbar buttons
				btnToolBarModificar.setEnabled(false);
				btnToolBarEliminar.setEnabled(false);
				btnToolBarBuscar.setEnabled(false);
				// Un-hiding search fields
				lblCodigo.setVisible(true);
				txtCodigo.setVisible(true);
				btnBuscar.setVisible(true);
				btnCatalogo.setVisible(true);
				// Cleaning txtCodigo
				txtCodigo.setText("");
				// txtFields
				txtEmpresa.setVisible(false);
				txtNombres.setVisible(false);
				txtApellidos.setVisible(false);
				txtDUI.setVisible(false);
				txtNit.setVisible(false);
				txtDireccion.setVisible(false);
				//txtMunicipio.setVisible(false);
				cmbMunicipio.setVisible(false);
				//txtDepartamento.setVisible(false);
				cmbDepartamento.setVisible(false);
				txtTelefono.setVisible(false);
				txtCelular.setVisible(false);
				txtCorreo.setVisible(false);
				txtNotas.setVisible(false);
				// lblFields
				lblEmpresa.setVisible(false);
				lblNombres.setVisible(false);
				lblApellidos.setVisible(false);
				lblDUI.setVisible(false);
				lblNit.setVisible(false);
				lblDireccion.setVisible(false);
				lblMunicipio.setVisible(false);
				lblDepartamento.setVisible(false);
				lblTelefono.setVisible(false);
				lblCelular.setVisible(false);
				lblCorreo.setVisible(false);
				lblNotas.setVisible(false);
				// btn
				btnGuardar.setVisible(false);
				btnBorrar.setVisible(false);
				btnSalir.setVisible(false);

				separator.setVisible(false);


			}
		});
		toolBar.add(btnToolBarBuscar);

		btnToolBarCrear = new JButton("");
		btnToolBarCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Disabling Modificar and Eliminar buttons
				btnToolBarModificar.setEnabled(false);
				btnToolBarEliminar.setEnabled(false);
				// Enabling Buscar
				btnToolBarBuscar.setEnabled(true);
				// Hiding search fields
				lblCodigo.setVisible(false);
				txtCodigo.setVisible(false);
				btnBuscar.setVisible(false);
				btnCatalogo.setVisible(false);
				// txtFields
				txtEmpresa.setVisible(true);
				txtNombres.setVisible(true);
				txtApellidos.setVisible(true);
				txtDUI.setVisible(true);
				txtNit.setVisible(true);
				txtDireccion.setVisible(true);
				//txtMunicipio.setVisible(true);
				cmbMunicipio.setVisible(true);
				//txtDepartamento.setVisible(true);
				cmbDepartamento.setVisible(true);
				txtTelefono.setVisible(true);
				txtCelular.setVisible(true);
				txtCorreo.setVisible(true);
				txtNotas.setVisible(true);
				// lblFields
				lblEmpresa.setVisible(true);
				lblNombres.setVisible(true);
				lblApellidos.setVisible(true);
				lblDUI.setVisible(true);
				lblNit.setVisible(true);
				lblDireccion.setVisible(true);
				lblMunicipio.setVisible(true);
				lblDepartamento.setVisible(true);
				lblTelefono.setVisible(true);
				lblCelular.setVisible(true);
				lblCorreo.setVisible(true);
				lblNotas.setVisible(true);
				// btn
				btnGuardar.setVisible(true);
				btnBorrar.setVisible(true);
				btnSalir.setVisible(true);

				// Enabling txtFields
				txtEmpresa.setEditable(true);
				txtNombres.setEditable(true);
				txtApellidos.setEditable(true);
				txtDUI.setEditable(true);
				txtNit.setEditable(true);
				txtDireccion.setEditable(true);
				//txtMunicipio.setEditable(true);
				cmbMunicipio.setEditable(true);
				//txtDepartamento.setEditable(true);
				cmbDepartamento.setEditable(true);
				txtTelefono.setEditable(true);
				txtCelular.setEditable(true);
				txtCorreo.setEditable(true);
				txtNotas.setEditable(true);			

				// Cleaning fields
				txtEmpresa.setText("");
				txtNombres.setText("");
				txtApellidos.setText("");
				txtDUI.setText("");
				txtNit.setText("");
				txtDireccion.setText("");
				//txtMunicipio.setText("");

				//txtDepartamento.setText("");

				txtTelefono.setText("");
				txtCelular.setText("");
				txtCorreo.setText("");
				txtNotas.setText("");



			}
		});
		btnToolBarCrear.setIcon(new ImageIcon("/home/elmer/Proyectos/Industrias Gallardo/iconos/Button-Add-icon.ico"));
		btnToolBarCrear.setToolTipText("Ingresar");
		toolBar.add(btnToolBarCrear);

		btnToolBarModificar = new JButton("");
		btnToolBarModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// txtFields Enabled for Edit 
				txtEmpresa.setEditable(true);
				txtNombres.setEditable(true);
				txtApellidos.setEditable(true);
				txtDUI.setEditable(true);
				txtNit.setEditable(true);
				txtDireccion.setEditable(true);
				//txtMunicipio.setEditable(true);
				cmbMunicipio.setEditable(true);
				//txtDepartamento.setEditable(true);
				cmbDepartamento.setEditable(true);
				txtTelefono.setEditable(true);
				txtCelular.setEditable(true);
				txtCorreo.setEditable(true);
				txtNotas.setEditable(true);
				
				btnBorrar.setVisible(true);
			}
		});
		btnToolBarModificar.setIcon(new ImageIcon("/home/elmer/Proyectos/Industrias Gallardo/iconos/Text-Edit-icon.ico"));
		btnToolBarModificar.setToolTipText("Modificar");
		toolBar.add(btnToolBarModificar);

		btnToolBarEliminar = new JButton("");
		btnToolBarEliminar.setIcon(new ImageIcon("/home/elmer/Proyectos/Industrias Gallardo/iconos/Close-2-icon.ico"));
		btnToolBarEliminar.setToolTipText("Eliminar");
		toolBar.add(btnToolBarEliminar);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int i = cmbDepartamento.getSelectedIndex();
		//System.out.println(i);
		cmbMunicipio.setModel(models[i]);

	}
}
