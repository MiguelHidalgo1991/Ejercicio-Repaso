package Vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;

public class CrearLibroUI extends JPanel {
	private JTextField txtIsbn;
	private JTextField txtTitulo;
	private JTextField txtPrecio;
	private JTextField txtResumen;

	/**
	 * Create the panel.
	 */
	public CrearLibroUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{50, 0, 200, 0, 50, 0};
		gridBagLayout.rowHeights = new int[]{50, 0, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 50, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblTitulo = new JLabel("CREAR LIBRO");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 21));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.gridwidth = 3;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 1;
		add(lblTitulo, gbc_lblTitulo);
		
		JLabel lblIsbn = new JLabel("ISBN:");
		GridBagConstraints gbc_lblIsbn = new GridBagConstraints();
		gbc_lblIsbn.anchor = GridBagConstraints.EAST;
		gbc_lblIsbn.insets = new Insets(0, 0, 5, 5);
		gbc_lblIsbn.gridx = 1;
		gbc_lblIsbn.gridy = 3;
		add(lblIsbn, gbc_lblIsbn);
		
		txtIsbn = new JTextField();
		GridBagConstraints gbc_txtIsbn = new GridBagConstraints();
		gbc_txtIsbn.insets = new Insets(0, 0, 5, 5);
		gbc_txtIsbn.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIsbn.gridx = 2;
		gbc_txtIsbn.gridy = 3;
		add(txtIsbn, gbc_txtIsbn);
		txtIsbn.setColumns(10);
		
		JLabel lblTitulo_1 = new JLabel("TITULO:");
		GridBagConstraints gbc_lblTitulo_1 = new GridBagConstraints();
		gbc_lblTitulo_1.anchor = GridBagConstraints.EAST;
		gbc_lblTitulo_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo_1.gridx = 1;
		gbc_lblTitulo_1.gridy = 4;
		add(lblTitulo_1, gbc_lblTitulo_1);
		
		txtTitulo = new JTextField();
		GridBagConstraints gbc_txtTitulo = new GridBagConstraints();
		gbc_txtTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_txtTitulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTitulo.gridx = 2;
		gbc_txtTitulo.gridy = 4;
		add(txtTitulo, gbc_txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblAutor = new JLabel("AUTOR");
		GridBagConstraints gbc_lblAutor = new GridBagConstraints();
		gbc_lblAutor.anchor = GridBagConstraints.EAST;
		gbc_lblAutor.insets = new Insets(0, 0, 5, 5);
		gbc_lblAutor.gridx = 1;
		gbc_lblAutor.gridy = 5;
		add(lblAutor, gbc_lblAutor);
		
		JComboBox comboBoxAutor = new JComboBox();
		GridBagConstraints gbc_comboBoxAutor = new GridBagConstraints();
		gbc_comboBoxAutor.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxAutor.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxAutor.gridx = 2;
		gbc_comboBoxAutor.gridy = 5;
		add(comboBoxAutor, gbc_comboBoxAutor);
		
		JLabel lblPrecio = new JLabel("PRECIO");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 1;
		gbc_lblPrecio.gridy = 6;
		add(lblPrecio, gbc_lblPrecio);
		
		txtPrecio = new JTextField();
		GridBagConstraints gbc_txtPrecio = new GridBagConstraints();
		gbc_txtPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecio.gridx = 2;
		gbc_txtPrecio.gridy = 6;
		add(txtPrecio, gbc_txtPrecio);
		txtPrecio.setColumns(10);
		
		txtResumen = new JTextField();
		GridBagConstraints gbc_txtResumen = new GridBagConstraints();
		gbc_txtResumen.gridheight = 5;
		gbc_txtResumen.insets = new Insets(0, 0, 5, 5);
		gbc_txtResumen.fill = GridBagConstraints.BOTH;
		gbc_txtResumen.gridx = 2;
		gbc_txtResumen.gridy = 7;
		add(txtResumen, gbc_txtResumen);
		txtResumen.setColumns(10);
		
		JLabel lblResumen = new JLabel("RESUMEN");
		GridBagConstraints gbc_lblResumen = new GridBagConstraints();
		gbc_lblResumen.insets = new Insets(0, 0, 5, 5);
		gbc_lblResumen.gridx = 1;
		gbc_lblResumen.gridy = 9;
		add(lblResumen, gbc_lblResumen);
		
		JButton btnCrearLibro = new JButton("CREAR LIBRO");
		GridBagConstraints gbc_btnCrearLibro = new GridBagConstraints();
		gbc_btnCrearLibro.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrearLibro.gridx = 3;
		gbc_btnCrearLibro.gridy = 12;
		add(btnCrearLibro, gbc_btnCrearLibro);

	}

}
