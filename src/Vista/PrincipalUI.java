package Vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class PrincipalUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalUI frame = new PrincipalUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrincipalUI() {
		setMinimumSize(new Dimension(770, 635));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnLibro = new JMenu("LIBRO");
		menuBar.add(mnLibro);
		
		JMenuItem mntmCrearLibro = new JMenuItem("Crear Libro");
		mnLibro.add(mntmCrearLibro);
		
		JMenuItem mntmModificarLibro = new JMenuItem("Modificar Libro");
		mnLibro.add(mntmModificarLibro);
		
		JMenuItem mntmBorrarLibro = new JMenuItem("Borrar Libro");
		mnLibro.add(mntmBorrarLibro);
		
		JMenu mnAutor = new JMenu("AUTOR");
		menuBar.add(mnAutor);
		
		JMenuItem mntmCrearAutor = new JMenuItem("Crear Autor");
		mnAutor.add(mntmCrearAutor);
		
		JMenuItem mntmModificarAutor = new JMenuItem("Modificar Autor");
		mnAutor.add(mntmModificarAutor);
		
		JMenuItem mntmBorrarAutor = new JMenuItem("Borrar Autor");
		mnAutor.add(mntmBorrarAutor);
		
		JMenu mnListar = new JMenu("LISTAR");
		menuBar.add(mnListar);
		
		JMenuItem mntmListarTodosAutores = new JMenuItem("Listar Todos Autores");
		mnListar.add(mntmListarTodosAutores);
		
		JMenuItem mntmListarLibrosDe = new JMenuItem("Listar Libros De Autor");
		mnListar.add(mntmListarLibrosDe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
