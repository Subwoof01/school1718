package encryptor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Testing extends JFrame implements ActionListener {

	private static final long serialVersionUID = -4664613670118555055L;
	
	static Scanner scanner = new Scanner(System.in);
	
	JTextArea inputArea;
	static JTextPane outputArea;
	JSpinner shiftSpinner;
	
	public static void encrypt(String text, int shift) {
		char[] output = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			int charCode = text.charAt(i) + shift;
			char c = (char) charCode;
			output[i] = c;
		}
		
		String out = new String(output);
		
		outputArea.setText(out);
	}
	
	public static void decrypt(String text, int shift) {
		char[] output = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			int charCode = text.charAt(i) - shift;
			char c = (char) charCode;
			output[i] = c;
		}
		
		String out = new String(output);
		
		outputArea.setText(out);
	}
	
	public static void main(String[] args) {
		new Testing().setVisible(true);;
	}
	
	private Testing() {
		super("Caesar Encryptor");
		setResizable(false);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		setSize(313, 299);
		getContentPane().setLayout(null);
		
		shiftSpinner = new JSpinner();
		shiftSpinner.setBounds(239, 122, 46, 20);
		getContentPane().add(shiftSpinner);
		
		JButton btnEncrypt = new JButton("Encrypt");
		btnEncrypt.setBounds(10, 122, 89, 23);
		getContentPane().add(btnEncrypt);
		btnEncrypt.addActionListener(this);
		
		JButton btnDecrypt = new JButton("Decrypt");
		btnDecrypt.setBounds(109, 122, 89, 23);
		getContentPane().add(btnDecrypt);
		btnDecrypt.addActionListener(this);
		
		inputArea = new JTextArea();
		inputArea.setLineWrap(true);
		inputArea.setBounds(10, 11, 275, 100);
		getContentPane().add(inputArea);
		
		outputArea = new JTextPane();
		outputArea.setEditable(false);
		outputArea.setBounds(10, 153, 275, 100);
		getContentPane().add(outputArea);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		if (command.equals("Encrypt")) {
			encrypt(inputArea.getText(), (int) shiftSpinner.getValue());
		}
		if (command.equals("Decrypt")) {
			decrypt(inputArea.getText(), (int) shiftSpinner.getValue());
		}
		
	}
}
