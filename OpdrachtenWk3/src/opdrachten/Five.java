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

public class Five extends JFrame implements ActionListener {

	private static final long serialVersionUID = -1199089754913307858L;
	
	private JPanel contentPane;
	private static JTextField inputField;
	private static JTextField celsiusField;
	private static JTextField fahrenField;
	private static JTextField kelvinField;
	
	public String[] dropDownList = { "Celsius", "Fahrenheit", "Kelvin" };
	
	public static String unit = "cel";
	
	public static double input;
	
	static double ans;
	
	static DecimalFormat df = new DecimalFormat("#.####");

	public static void calculate() {
		if (unit.equals("cel")) {
			kelvinField.setText(String.valueOf(df.format(Cel2Kel(input))));
			fahrenField.setText(String.valueOf(df.format(Cel2Fahr(input))));
		} else if (unit.equals("fahr")) {
			celsiusField.setText(String.valueOf(df.format(Fahr2Cel(input))));
			kelvinField.setText(String.valueOf(df.format(Fahr2Kel(input))));
		} else {
			celsiusField.setText(String.valueOf(df.format(Kel2Cel(input))));
			fahrenField.setText(String.valueOf(df.format(Kel2Fahr(input))));
		}
	}
	
	public static double Cel2Kel(double cel) {
		double kel = 273 + cel;
		return kel;
	}
	
	public static double Cel2Fahr(double cel) {
		double fahr = 9/5 * cel + 32;
		return fahr;
	}
	
	public static double Fahr2Cel(double fahr) {
		double cel = (fahr - 32) * 5/9;
		return cel;
	}
	
	public static double Fahr2Kel(double fahr) {
		double kel = (fahr + 459.67) * 5/9;
		return kel;
	}
	
	public static double Kel2Cel(double kel) {
		double cel = kel - 273.15;
		return cel;
	}
	
	public static double Kel2Fahr(double kel) {
		double fahr = kel * 9/5 - 459.67;
		return fahr;
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Five frame = new Five();
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
	public Five() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 224, 208);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox dropDown = new JComboBox(dropDownList);
		dropDown.setToolTipText("");
		dropDown.setBounds(10, 11, 91, 20);
		contentPane.add(dropDown);
		dropDown.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox source = (JComboBox) e.getSource();
				String selection = (String) source.getSelectedItem();
				
				if (selection.equals("Celsius")) {
					unit = "cel";
				} else if (selection.equals("Fahrenheit")) {
					unit = "fahr";
				} else {
					unit = "kel";
				}
			}
		});
		
		inputField = new JTextField();
		inputField.setBounds(111, 11, 86, 20);
		contentPane.add(inputField);
		inputField.setColumns(10);
		inputField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input = Double.parseDouble(inputField.getText());
				celsiusField.setText("");
				fahrenField.setText("");
				kelvinField.setText("");
				calculate();
			}
		});
		
		celsiusField = new JTextField();
		celsiusField.setEditable(false);
		celsiusField.setBounds(112, 76, 86, 20);
		contentPane.add(celsiusField);
		celsiusField.setColumns(10);
		
		fahrenField = new JTextField();
		fahrenField.setEditable(false);
		fahrenField.setBounds(112, 107, 86, 20);
		contentPane.add(fahrenField);
		fahrenField.setColumns(10);
		
		kelvinField = new JTextField();
		kelvinField.setEditable(false);
		kelvinField.setBounds(112, 138, 86, 20);
		contentPane.add(kelvinField);
		kelvinField.setColumns(10);
		
		JLabel lblCelsius = new JLabel("Celsius");
		lblCelsius.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCelsius.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCelsius.setBounds(57, 76, 45, 20);
		contentPane.add(lblCelsius);
		
		JLabel lblFahrenheit = new JLabel("Fahrenheit");
		lblFahrenheit.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFahrenheit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFahrenheit.setBounds(32, 107, 70, 20);
		contentPane.add(lblFahrenheit);
		
		JLabel lblKelvin = new JLabel("Kelvin");
		lblKelvin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKelvin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKelvin.setBounds(56, 141, 46, 17);
		contentPane.add(lblKelvin);
		
		JButton btnCalculate = new JButton("Calculate!");
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCalculate.setBounds(111, 42, 87, 23);
		contentPane.add(btnCalculate);
		btnCalculate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (btnCalculate.isEnabled()) {
					input = Double.parseDouble(inputField.getText());
					celsiusField.setText("");
					fahrenField.setText("");
					kelvinField.setText("");
					calculate();
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Don't know why this needs to be here lol.
		
	}
}
