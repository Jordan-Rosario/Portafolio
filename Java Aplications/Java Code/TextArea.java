import javax.swing.*;

public class TextArea extends JFrame{

	private JTextField textfienld1;
	private JTextArea textarea1;

	public TextArea() {

		setLayout(null);

		textfienld1 = new JTextField();
		textfienld1.setBounds(10, 10, 200, 30);
		add(textfienld1);

		textarea1 = new JTextArea();
		textarea1.setBounds(10, 50, 400, 300);
		add(textarea1);
	}

	public static void main(String[] args) {
		
		TextArea formulario1 = new TextArea();

		formulario1.setBounds(0, 0, 540, 400);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	}
}