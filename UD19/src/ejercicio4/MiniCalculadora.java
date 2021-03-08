package ejercicio4;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MiniCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField n2;
	private JTextField resultado;
	private JButton divide;
	private JButton salida;
	private JButton sobre;
	private JTextField n1;
	private JLabel operacion;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniCalculadora frame = new MiniCalculadora(); 
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
	//parametrización estandard de la creacion tipica de ventana jframe
	public MiniCalculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 580, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//assignamos un nombre al textfield que recoge los numeros pero en formato entero int
		n1 = new JTextField();
		n1.setColumns(10);
		
		n2 = new JTextField();
		n2.setColumns(10);
		
		resultado = new JTextField();
		resultado.setColumns(10);
		
		//aplicamos la misma metodologia que en división pero en formato entero int
		JButton suma = new JButton("+");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2;
				int totalsuma;
				num1=Integer.parseInt(n1.getText());
				num2=Integer.parseInt(n2.getText());
				totalsuma=num1+num2;
				resultado.setText(String.valueOf(totalsuma));
				operacion.setText("+");
				
				
			}
		});
		
		//aplicamos la misma metodologia que en división pero en formato entero int
		JButton resta = new JButton("-");
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2;
				int totalresta;
				num1=Integer.parseInt(n1.getText());
				num2=Integer.parseInt(n2.getText());
				totalresta=num1-num2;
				resultado.setText(String.valueOf(totalresta));
				operacion.setText("-");
			}
		});
		
		//aplicamos la misma metodologia que en división pero en formato entero int
		JButton multiplica = new JButton("X");
		multiplica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2;
				int totalmulti;
				num1=Integer.parseInt(n1.getText());
				num2=Integer.parseInt(n2.getText());
				totalmulti=num1*num2;
				resultado.setText(String.valueOf(totalmulti));
				operacion.setText("X");
			}
		});
		multiplica.setToolTipText("");
		
		divide = new JButton("/"); //le ponemos como queremos que se vea para el usuario el botón
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//añadimos la funcionalidad de división
				double num1,num2; //le ponemos formato double, aunque podriamos ponerle float, mejor quizas
				double totaldivide; //numeros tipo double porque hay numeros decimales presentes al dividir un numero a mas pequeño que numero b
				num1=Double.parseDouble(n1.getText()); //
				num2=Double.parseDouble(n2.getText());
				totaldivide=num1/num2;
				resultado.setText(String.valueOf(totaldivide));//imprimimos sobre la label resultado
				operacion.setText("/"); //le decimpos que en el label de operacion (comun para todos los operandos) ponga una barra divisoria porque se esta realizando esa operacion
			}
		});
		
		salida = new JButton("Salir");
		salida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0); //Comando de sistema para que termine la ejecución y se cierre el programa
			
			}
		});
		
		sobre = new JButton("About");
		sobre.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String textual = "Hecho por Noelia Barrera.\n Aplicación Calculadora 1.0";
				JOptionPane.showInputDialog(textual); //le he hecho pasarlo por un input text porque me daba conflictos con un message... Supervivencia...
						
				
				
			}
						
		});
		
		//ponemos el nombre de los jlabels leibles para el usuario
		JLabel lblNewLabel = new JLabel("Numero 1");
		
		JLabel lblNewLabel_1 = new JLabel("Numero 2");
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		
		operacion = new JLabel("");
		
		lblNewLabel_3 = new JLabel("=");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(52)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addGap(100)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(53))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(42)
					.addComponent(salida)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(sobre, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(370, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(resta, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(suma, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
							.addGap(49)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(divide, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(multiplica, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(33)
							.addComponent(n1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(operacion, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(n2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(resultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(117, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(n1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(operacion)
						.addComponent(n2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3)
						.addComponent(resultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(suma, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(multiplica))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(resta)
						.addComponent(divide))
					.addGap(57)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(salida)
						.addComponent(sobre))
					.addGap(62))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
