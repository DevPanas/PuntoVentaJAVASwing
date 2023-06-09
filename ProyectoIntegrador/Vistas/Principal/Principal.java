package Principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import General.Nav;

public class Principal extends JFrame {

	public JPanel contentPane;
	public Nav navegacion;
	public Centro centro;
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 900, 600);
		this.centro = new Centro("Marcos");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		this.navegacion = new Nav();
		this.contentPane.setLayout(new BorderLayout());
		this.contentPane.add(navegacion,BorderLayout.NORTH);
		
		this.contentPane.add(centro,BorderLayout.CENTER);
		setContentPane(contentPane);
	}

}


