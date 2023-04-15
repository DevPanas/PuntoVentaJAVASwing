package Principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	private JPanel contentPane;
	private Nav navegacion;
	private Agenda agenda;
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		this.navegacion = new Nav();
		this.contentPane.setLayout(new BorderLayout());
		this.contentPane.add(navegacion,BorderLayout.NORTH);
		
		this.agenda = new Agenda("Marcos");
		this.contentPane.add(agenda,BorderLayout.WEST);
		setContentPane(contentPane);
	}

}


