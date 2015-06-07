package Vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class CrearAutorUI extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtFechaNacimiento;
	private JTextField txtFechaFallecimiento;

	/**
	 * Create the panel.
	 */
	public CrearAutorUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{50, 0, 200, 0, 50, 0};
		gridBagLayout.rowHeights = new int[]{50, 0, 50, 0, 0, 0, 0, 0, 50, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblCrearAutor = new JLabel("CREAR AUTOR");
		lblCrearAutor.setFont(new Font("Tahoma", Font.PLAIN, 21));
		GridBagConstraints gbc_lblCrearAutor = new GridBagConstraints();
		gbc_lblCrearAutor.gridwidth = 3;
		gbc_lblCrearAutor.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrearAutor.gridx = 1;
		gbc_lblCrearAutor.gridy = 1;
		add(lblCrearAutor, gbc_lblCrearAutor);
		
		JLabel lblAutor = new JLabel("NOMBRE -->");
		lblAutor.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblAutor = new GridBagConstraints();
		gbc_lblAutor.anchor = GridBagConstraints.EAST;
		gbc_lblAutor.insets = new Insets(0, 0, 5, 5);
		gbc_lblAutor.gridx = 1;
		gbc_lblAutor.gridy = 3;
		add(lblAutor, gbc_lblAutor);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 3;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("APELLIDOS -->");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 1;
		gbc_lblApellidos.gridy = 4;
		add(lblApellidos, gbc_lblApellidos);
		
		txtApellidos = new JTextField();
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.gridx = 2;
		gbc_txtApellidos.gridy = 4;
		add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblFechaNacimiento = new JLabel("FECHA NACIMIENTO -->");
		GridBagConstraints gbc_lblFechaNacimiento = new GridBagConstraints();
		gbc_lblFechaNacimiento.anchor = GridBagConstraints.EAST;
		gbc_lblFechaNacimiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaNacimiento.gridx = 1;
		gbc_lblFechaNacimiento.gridy = 5;
		add(lblFechaNacimiento, gbc_lblFechaNacimiento);
		
		txtFechaNacimiento = new JTextField();
		GridBagConstraints gbc_txtFechaNacimiento = new GridBagConstraints();
		gbc_txtFechaNacimiento.insets = new Insets(0, 0, 5, 5);
		gbc_txtFechaNacimiento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFechaNacimiento.gridx = 2;
		gbc_txtFechaNacimiento.gridy = 5;
		add(txtFechaNacimiento, gbc_txtFechaNacimiento);
		txtFechaNacimiento.setColumns(10);
		
		JLabel lblFechaFallecimiento = new JLabel("FECHA FALLECIMIENTO -->");
		GridBagConstraints gbc_lblFechaFallecimiento = new GridBagConstraints();
		gbc_lblFechaFallecimiento.anchor = GridBagConstraints.EAST;
		gbc_lblFechaFallecimiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaFallecimiento.gridx = 1;
		gbc_lblFechaFallecimiento.gridy = 6;
		add(lblFechaFallecimiento, gbc_lblFechaFallecimiento);
		
		txtFechaFallecimiento = new JTextField();
		GridBagConstraints gbc_txtFechaFallecimiento = new GridBagConstraints();
		gbc_txtFechaFallecimiento.insets = new Insets(0, 0, 5, 5);
		gbc_txtFechaFallecimiento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFechaFallecimiento.gridx = 2;
		gbc_txtFechaFallecimiento.gridy = 6;
		add(txtFechaFallecimiento, gbc_txtFechaFallecimiento);
		txtFechaFallecimiento.setColumns(10);
		
		JButton btnCrearAutor = new JButton("CREAR AUTOR");
		GridBagConstraints gbc_btnCrearAutor = new GridBagConstraints();
		gbc_btnCrearAutor.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrearAutor.gridx = 3;
		gbc_btnCrearAutor.gridy = 7;
		add(btnCrearAutor, gbc_btnCrearAutor);

	}

}
