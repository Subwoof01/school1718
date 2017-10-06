package opdrachten;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Six extends JFrame {

	private static final long serialVersionUID = -1346742626358929157L;

	private JPanel contentPane;
	private JTextField lengthField;
	private JTextField bmiField;
	private JTextField normalField;
	private JTextField weightField;

	String[] dropDownList = { "Male", "Female" };

	String gender = "male";
	
	static DecimalFormat df = new DecimalFormat("#.####");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Six frame = new Six();
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
	public Six() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 376, 144);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox(dropDownList);
		comboBox.setBounds(10, 11, 86, 20);
		contentPane.add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox source = (JComboBox) e.getSource();
				String selection = (String) source.getSelectedItem();
				
				if (selection.equals("Male")) {
					normalField.setText("20-25");
					gender = "male";	
				} else if (selection.equals("Female")) {
					normalField.setText("19-24");
					gender = "female";
				}
			}
		});
		
		lengthField = new JTextField();
		lengthField.setBounds(106, 73, 86, 20);
		contentPane.add(lengthField);
		lengthField.setColumns(10);
		
		weightField = new JTextField();
		weightField.setBounds(106, 42, 86, 20);
		contentPane.add(weightField);
		weightField.setColumns(10);
		
		JLabel lblGewicht = new JLabel("Weight (Kg)");
		lblGewicht.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGewicht.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGewicht.setBounds(10, 42, 86, 20);
		contentPane.add(lblGewicht);
		
		JLabel lblLengte = new JLabel("Length (m)");
		lblLengte.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLengte.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLengte.setBounds(10, 73, 86, 20);
		contentPane.add(lblLengte);
		
		JButton btnCalculate = new JButton("Calculate!");
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCalculate.setBounds(106, 10, 86, 23);
		contentPane.add(btnCalculate);
		btnCalculate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bmiField.setText(String.valueOf(df.format(bmi())));
			}
		});
		
		bmiField = new JTextField();
		bmiField.setEditable(false);
		bmiField.setBounds(258, 11, 86, 20);
		contentPane.add(bmiField);
		bmiField.setColumns(10);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBmi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBmi.setBounds(202, 11, 46, 20);
		contentPane.add(lblBmi);
		
		normalField = new JTextField();
		normalField.setEditable(false);
		normalField.setBounds(258, 42, 86, 20);
		contentPane.add(normalField);
		normalField.setColumns(10);
		normalField.setText("20-25");
		
		JLabel lblNormal = new JLabel("Normal");
		lblNormal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNormal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNormal.setBounds(202, 42, 46, 20);
		contentPane.add(lblNormal);
	}
	
	public double bmi() {
		double bmi = Double.parseDouble(weightField.getText()) / Math.pow(Double.parseDouble(lengthField.getText()), 2);
		return bmi;
	}

}
