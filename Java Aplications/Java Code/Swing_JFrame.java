import javax.swing.*;
public class Swing_JFrame extends JFrame{
	public Swing_JFrame(){
		setLayout(null);
	}
	public static void main(String args[]) {
	
		Swing_JFrame formulario1 = new Swing_JFrame();
		formulario1.setBounds(0,0,400,550);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null);
		formulario1.setResizable(false);
	}
}