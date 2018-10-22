import javax.swing.*;
public class Swing_JLabel extends JFrame{

	private JLabel label1;
	private JLabel label2;

	public Swing_JLabel(){
		
		setLayout(null);
		
		label1 = new JLabel("Interfaz grafica");
		label1.setBounds(10,20,300,30);
		add(label1);

		label2 = new JLabel("version 1.0");
		label2.setBounds(10,100,100,30);
		add(label2);

	}
	public static void main(String args[]) {

		Swing_JLabel formulario1 = new Swing_JLabel();
		formulario1.setBounds(0,0,300,200);
		formulario1.setLocationRelativeTo(null);
		formulario1.setVisible(true);	
		formulario1.setResizable(false);
	}
}