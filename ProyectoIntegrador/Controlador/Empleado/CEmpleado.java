package Empleado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Principal.CPrincipal;
import Proveedores.VProveedor;

public class CEmpleado implements ActionListener {

	public VEmpleado ventana;
	
	public CEmpleado() {
		this.ventana = new VEmpleado();
		this.ventana.setVisible(true);
		
		this.ventana.navegacion.SMsalida.addActionListener(this);
		this.ventana.navegacion.logo.grid.addActionListener(this);
		this.ventana.centro.btnSalida.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.ventana.navegacion.SMsalida) {
			this.ventana.dispose();
		}else if(e.getSource() == this.ventana.centro.btnSalida || e.getSource() == this.ventana.navegacion.logo.grid) {
			CPrincipal principal = new CPrincipal();
			this.ventana.dispose();
		}
	}


}
