package calculator;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = -6088266052154524553L;
	
	private JPanel contentPane;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton btnMod;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	
	public double num1;
	public double num2;
	public double ans;
	public String modifier = "";
	boolean modSet = false;
	boolean areaCleared = false;
	boolean equals = false;
	boolean root = false;
	
	private JButton btnC;
	private JButton button_16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		setSize(290, 300);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 36));
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setBounds(10, 11, 264, 68);
		contentPane.add(textArea);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modSet && !areaCleared) {
					textArea.setText("");
					areaCleared = true;
				} else if (equals) {
					textArea.setText("");
					equals = false;
				} else if (root) {
					
				}
				textArea.append("1");
			}
		});
		button.setBounds(10, 90, 45, 32);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modSet && !areaCleared) {
					textArea.setText("");
					areaCleared = true;
				} else if (equals) {
					textArea.setText("");
					equals = false;
				}	
				textArea.append("2");
			}
		});
		btnNewButton.setBounds(65, 90, 45, 32);
		contentPane.add(btnNewButton);
		
		button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modSet && !areaCleared) {
					textArea.setText("");
					areaCleared = true;
				} else if (equals) {
					textArea.setText("");
					equals = false;
				}	
				textArea.append("3");
			}
		});
		button_1.setBounds(120, 90, 45, 32);
		contentPane.add(button_1);
		
		button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modSet && !areaCleared) {
					textArea.setText("");
					areaCleared = true;
				} else if (equals) {
					textArea.setText("");
					equals = false;
				}	
				textArea.append("4");
			}
		});
		button_2.setBounds(10, 133, 45, 32);
		contentPane.add(button_2);
		
		button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modSet && !areaCleared) {
					textArea.setText("");
					areaCleared = true;
				} else if (equals) {
					textArea.setText("");
					equals = false;
				}	
				textArea.append("5");
			}
		});
		button_3.setBounds(65, 133, 45, 32);
		contentPane.add(button_3);
		
		button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modSet && !areaCleared) {
					textArea.setText("");
					areaCleared = true;
				} else if (equals) {
					textArea.setText("");
					equals = false;
				}	
				textArea.append("6");
			}
		});
		button_4.setBounds(120, 133, 45, 32);
		contentPane.add(button_4);
		
		button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modSet && !areaCleared) {
					textArea.setText("");
					areaCleared = true;
				} else if (equals) {
					textArea.setText("");
					equals = false;
				}	
				textArea.append("7");
			}
		});
		button_5.setBounds(10, 176, 45, 32);
		contentPane.add(button_5);
		
		button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modSet && !areaCleared) {
					textArea.setText("");
					areaCleared = true;
				} else if (equals) {
					textArea.setText("");
					equals = false;
				}	
				textArea.append("8");
			}
		});
		button_6.setBounds(65, 176, 45, 32);
		contentPane.add(button_6);
		
		button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modSet && !areaCleared) {
					textArea.setText("");
					areaCleared = true;
				} else if (equals) {
					textArea.setText("");
					equals = false;
				}	
				textArea.append("9");
			}
		});
		button_7.setBounds(120, 176, 45, 32);
		contentPane.add(button_7);
		
		button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modSet && !areaCleared) {
					textArea.setText("");
					areaCleared = true;
				} else if (equals) {
					textArea.setText("");
					equals = false;
				}	
				textArea.append("0");
			}
		});
		button_8.setBounds(65, 219, 45, 32);
		contentPane.add(button_8);
		
		button_9 = new JButton("+");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!modSet) {
					num1 = Double.parseDouble(textArea.getText());
					textArea.setText("");
					textArea.append("+");
					System.out.print(num1);
					modifier = "plus";
					modSet = true;
				} else {
					num1 = 0;
					textArea.setText("");
					modifier = "";
					modSet = false;
				}
			}
		});
		button_9.setBounds(120, 219, 45, 32);
		contentPane.add(button_9);
		
		button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!modSet) {
					num1 = Double.parseDouble(textArea.getText());
					textArea.setText("");
					textArea.append("-");
					System.out.print(num1);
					modifier = "sub";
					modSet = true;
				} else {
					num1 = 0;
					textArea.setText("");
					modifier = "";
					modSet = false;
				}
			}
		});
		button_10.setBounds(174, 90, 45, 32);
		contentPane.add(button_10);
		
		button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!modSet) {
					num1 = Double.parseDouble(textArea.getText());
					textArea.setText("");
					textArea.append("*");
					System.out.print(num1);
					modifier = "mul";
					modSet = true;
				} else {
					num1 = 0;
					textArea.setText("");
					modifier = "";
					modSet = false;
				}
			}
		});
		button_11.setBounds(229, 90, 45, 32);
		contentPane.add(button_11);
		
		button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!modSet) {
					num1 = Double.parseDouble(textArea.getText());
					textArea.setText("");
					textArea.append("/");
					System.out.print(num1);
					modifier = "div";
					modSet = true;
				} else {
					num1 = 0;
					textArea.setText("");
					modifier = "";
					modSet = false;
				}
			}
		});
		button_12.setBounds(230, 133, 44, 32);
		contentPane.add(button_12);
		
		btnMod = new JButton("m");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!modSet) {
					num1 = Double.parseDouble(textArea.getText());
					textArea.setText("");
					textArea.append("mod");
					System.out.print(num1);
					modifier = "mod";
					modSet = true;
				} else {
					num1 = 0;
					textArea.setText("");
					modifier = "";
					modSet = false;
				}
			}
		});
		btnMod.setBounds(175, 176, 45, 32);
		contentPane.add(btnMod);
		
		button_13 = new JButton("\u221A");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!modSet) {
					textArea.setText("");
					textArea.append("\u221A");
					System.out.print(num1);
					modifier = "sqrt";
					modSet = true;
					root = true;
				} else {
					num1 = 0;
					textArea.setText("");
					modifier = "";
					modSet = false;
				}
			}
		});
		button_13.setBounds(175, 133, 45, 32);
		contentPane.add(button_13);
		
		button_14 = new JButton("^");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!modSet) {
					num1 = Double.parseDouble(textArea.getText());
					textArea.setText("");
					textArea.append("^");
					System.out.print(num1);
					modifier = "pow";
					modSet = true;
				} else {
					num1 = 0;
					textArea.setText("");
					modifier = "";
					modSet = false;
				}
			}
		});
		button_14.setBounds(230, 176, 44, 32);
		contentPane.add(button_14);
		
		button_15 = new JButton("=");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num2 = Double.parseDouble(textArea.getText());
				System.out.println(num2);
				if (modifier.equals("plus")) {
					addition(num1, num2);
					textArea.setText(String.valueOf(ans));
					modSet = false;
					areaCleared = false;
					equals = true;
				} else if (modifier.equalsIgnoreCase("sub")) {
					subtraction(num1, num2);
					textArea.setText(String.valueOf(ans));
					modSet = false;
					areaCleared = false;
					equals = true;
				} else if (modifier.equalsIgnoreCase("mul")) {
					multiplication(num1, num2);
					textArea.setText(String.valueOf(ans));
					modSet = false;
					areaCleared = false;
					equals = true;
				} else if (modifier.equalsIgnoreCase("div")) {
					division(num1, num2);
					textArea.setText(String.valueOf(ans));
					modSet = false;
					areaCleared = false;
					equals = true;
				} else if (modifier.equalsIgnoreCase("mod")) {
					modular(num1, num2);
					textArea.setText(String.valueOf(ans));
					modSet = false;
					areaCleared = false;
					equals = true;
				} else if (modifier.equalsIgnoreCase("sqrt")) {
					root(num2);
					textArea.setText(String.valueOf(ans));
					modSet = false;
					areaCleared = false;
					equals = true;
					root = true;
				} else if (modifier.equalsIgnoreCase("pow")) {
					power(num1, num2);
					textArea.setText(String.valueOf(ans));
					modSet = false;
					areaCleared = false;
					equals = true;
				}
				num1 = 0;
				num2 = 0;
			}
		});
		button_15.setBounds(230, 219, 44, 32);
		contentPane.add(button_15);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
			}
		});
		btnC.setBounds(175, 219, 45, 31);
		contentPane.add(btnC);
		
		button_16 = new JButton(".");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append(".");
			}
		});
		button_16.setBounds(10, 219, 45, 32);
		contentPane.add(button_16);
	}
	
	private double addition(double n1, double n2) {
		ans = n1 + n2;
		return ans;
	}
	private double subtraction(double n1, double n2) {
		ans = n1 - n2;
		return ans;
	}
	private double multiplication(double n1, double n2) {
		ans = n1 * n2;
		return ans;
	}
	private double division(double n1, double n2) {
		ans = n1 / n2;
		return ans;
	}
	private double modular(double n1, double n2) {
		ans = n1 % n2;
		return ans;
	}
	private double root(double n2) {
		ans = Math.sqrt(n2);
		return ans;
	}
	private double power(double n1, double n2) {
		ans = Math.pow(n1, n2);
		return ans;
	}
}
