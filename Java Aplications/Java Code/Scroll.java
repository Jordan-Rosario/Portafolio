import javax.swing.*;

public class Scroll extends JFrame{

	private JTextField textfield;
	private JTextArea textarea1;
	private JScrollPane scrollpane1;

	public Scroll() {

		setLayout(null);

		textfield = new JTextField();
		textfield.setBounds(10, 10, 200, 30);
		add(textfield);

		textarea1 = new JTextArea();
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10, 50, 400, 300);
		add(scrollpane1);
	}

	public static void main(String[] args) {
		
		Scroll formulario1 = new Scroll();

		formulario1.setBounds(0, 0, 540, 400);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	}
}