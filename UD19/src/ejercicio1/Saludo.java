package ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Saludo extends JFrame {

	private JPanel contentPane;
	private JTextField texto1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Saludo frame = new Saludo(); //Ponemos un nombre a la ventana, la parte del marco
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
	public Saludo() {
		setTitle("SALUDO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //se indica aquí que el jframe se cierra con sus propias funcionalidades
		setBounds(100, 100, 450, 300); //se ponen las medidas deseadas de la ventana
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		
		texto1 = new JTextField();
		texto1.setColumns(10);
		
		JButton saludar = new JButton("Saludar");
		saludar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(saludar, "Hola! "+texto1.getText()); //le indicamos la funcionalidad a la hora de ponerle pulsar el botón deseado (el que queremos que tenga toda la funcionalidad) 
			}
		});
		
		JLabel informe = new JLabel("Escribe un nombre para saludar");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(184)
							.addComponent(saludar))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(96)
							.addComponent(texto1, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(117)
							.addComponent(informe, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(113, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(66)
					.addComponent(informe)
					.addGap(28)
					.addComponent(texto1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(saludar)
					.addContainerGap(98, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
		
	}
}
