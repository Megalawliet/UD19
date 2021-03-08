package ejercicio3;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Encuesta extends JFrame {

	private JPanel contentPane;
	private JTextField nivel;

	/*private void btnIntroActionPerformed(java.awt.event.ActionEvent evt) {
		String informe="Tu sistema operativo preferido es ";
		JRadioButton[] variedad1={op1, op2, op3};
		}*/
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Encuesta frame = new Encuesta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//Agrupación de los botones de una unica eleccion 
	ButtonGroup variasOpciones;
	
	/**
	 * Create the frame.
	 */
	
	public Encuesta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		JRadioButton op1 = new JRadioButton("Windows");
		JLabel syso = new JLabel("Sistema Operativo");
		JLabel especial = new JLabel("Especialidad");
		JRadioButton op2 = new JRadioButton("Linux");
		JRadioButton op3 = new JRadioButton("Mac");
		JCheckBox ch1 = new JCheckBox("Programaci\u00F3n");
		JCheckBox ch2 = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		JCheckBox ch3 = new JCheckBox("Administraci\u00F3n");
		JLabel horario = new JLabel("Horas dedicadas al ordenador");
		JSlider hora = new JSlider();
		
		variasOpciones = new ButtonGroup();
		variasOpciones.add(op1);
		variasOpciones.add(op2);
		variasOpciones.add(op3);
		hora.setMaximum(10);
		
		JButton intro = new JButton("Introducir");
		intro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) { //posaba arg0 i ho he cambiat per evt
				btnIntroActionPerformed(evt);
			}
			
			private void btnIntroActionPerformed(java.awt.event.ActionEvent evt) {
				String informe="El sistema operativo preferido escogido por ti es ";
				JRadioButton[] variedad1={op1, op2, op3};
				for(int i=0;i<variedad1.length;i++){
		             
		            //seleccionamos las opciones de una sola opción
		            if(variedad1[i].isSelected()){
		                informe+=variedad1[i].getText();
		            }     
		        }
				//ahora escogemos las checkboxes de múltiple elección
				JCheckBox[] chck={ch1, ch2, ch3};
				informe+=", \n Las especialidades marcadas son ";
				
				for(int i=0;i<chck.length;i++){
		             
		            if(chck[i].isSelected()){
		                informe+=chck[i].getText()+" "; //El espacio es por si acaso hubiese por mas de un elemento remarcado en la cajita de seleccion 
		            }		             
		        }
				
				informe+=" \n y el numero de horas dedicadas al ordenador son: "+hora.getValue();
				JOptionPane.showMessageDialog(intro, informe); //ponemos una ventana de mensaje que muestre todo
				}
			
		});
		
		
		
		nivel = new JTextField();
		nivel.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(99)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(ch3, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(ch2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(ch1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(8)
									.addComponent(especial, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))))
					.addGap(54)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(syso, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addGap(70))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(op2, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addComponent(op1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addComponent(op3, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
							.addGap(92))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(178)
					.addComponent(intro)
					.addContainerGap(186, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(154)
					.addComponent(nivel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(191, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(136)
							.addComponent(horario, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(85)
							.addComponent(hora, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(102, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(horario)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(hora, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(nivel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(syso)
						.addComponent(especial))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(op1)
						.addComponent(ch1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(op2)
						.addComponent(ch2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(op3)
						.addComponent(ch3))
					.addGap(18)
					.addComponent(intro)
					.addGap(27))
		);
		hora.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				nivel.setText("Valor: "+hora.getValue());
			}
		});
		contentPane.setLayout(gl_contentPane);
		
		
		
	}
	
	
}
