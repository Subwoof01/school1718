
package referenceproject; 

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;


public class ReferenceProject extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
    // Define variables outside of the methods to call them in multiple methods
	private JTextArea text;
	boolean opened = false;
	private File openedFile;
	public static JMenuItem save;
        
	public static void main(String[] args) {
		// Creating new instance of class 'Frame'
		new ReferenceProject().setVisible(true); // Makes window visible on screen
	}
	
	// Defining properties of newly created class instance
	private ReferenceProject() {
		super("JFrame Reference Project"); // Sets window title
		setSize(800, 600); // Window size in pixels
		setResizable(true); // Speaks for itself
		setDefaultCloseOperation(EXIT_ON_CLOSE); // What happens when the window is closed
		setLayout(new BorderLayout()); // Sets layout of window components
		
		initialize();
	}
	
	private void initialize() {
		// Creating new button in window
		JButton button = new JButton("Click me!");
		button.setActionCommand("click"); // Setting action command of 'button' to "click"
		button.addActionListener(this); // Adding ActionListeners to buttons - because we implement ActionListener the 'Frame' class is an ActionListener
		
		JMenuBar bar = new JMenuBar(); // Creates a bar with menus (like the file menu in notepad)
		JMenu file = new JMenu("File"); // Creates a bar menu
		JMenuItem exit = new JMenuItem("Exit"); // Creates a menu button with the text "Exit"
		JMenuItem newButton = new JMenuItem("New"); // Creates a menu button with the text "New"
		JMenuItem open = new JMenuItem("Open"); // Creates a menu button with the text "Open"
		save = new JMenuItem("Save"); // Creates a menu button with the text "Save"
		JMenuItem saveAs = new JMenuItem("Save as"); // Creates a menu button with the text "Save as"
		
		bar.add(file); // Adds the 'file' menu to the menu bar 'bar'
		file.add(newButton); // Adds the 'newButton' button to the 'file' menu
		file.add(open); // Adds the 'open' button to the 'file' menu
		file.add(save); // Adds the 'save' button to the 'file' menu
		file.add(saveAs); // Adds the 'saveAs' button to the 'file' menu
		file.addSeparator(); // Adds a separator line to the 'file' menu
		file.add(exit); // Adds the 'Exit' button to the 'file' menu
		
		// Go through each menu button and add an ActionListener to check if button gets pressed
		JMenuItem[] items = { newButton, open, save, saveAs, exit };
		for (JMenuItem item : items) {
			item.addActionListener(this); // Pointing to "this" because our 'ReferenceProject' class EXTENDS JFrame making
		}
		
		text = new JTextArea(); // Creates text area
		JScrollPane scroll = new JScrollPane(text); // Adds scroll bars to 'text' component (JTextArea)
		
		/* Adding button to window
		 * add(button);
		 */
		add(scroll, BorderLayout.CENTER); // Adding 'scroll' instead of 'text' because we've attached 'text' to 'scroll'
		setJMenuBar(bar); // Setting the top bar to our created 'bar'
		
		save.setEnabled(false);
		
        text.getDocument().addDocumentListener(new TextAreaChanged()); // Adding a DocumentListener to JTextArea 'text' to check for any inputs (characters/copy-paste etc.)
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Get ActionCommand (text on button if not defined) on clicked button and store in 'name' as String
		String name = e.getActionCommand();
		
		// Check ActionCommand on clicked button and respond accordingly
		if (name.equals("click")) {
			System.out.println("Button has been clicked!");
		} else if (name.equals("Exit")) {
			System.exit(0);
		} else if (name.equals("New")) {
			newFile();
		} else if (name.equals("Open")) {
			open();
		} else if (name.equals("Save")) {
			save();
		} else if (name.equals("Save as")) {
			saveAs();
		}
	}
	
	public void open() { // Open method
		
		JFileChooser chooser = new JFileChooser("Documents"); // Creating chooser object (the file chooser like open in any other program)
		FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Text files", "txt"); // Create new extension filter with the name 'Text files' to only show .txt files
		chooser.setFileFilter(extensionFilter); // Add the just created extension filter to the file chooser and make it the default option
		
		int returned = chooser.showOpenDialog(this); // Set return value as integer to 'returned' (this can be either of the following: APPROVE_OPTION, CANCEL_OPTION and ERROR_OPTION)
		
		if (returned == JFileChooser.APPROVE_OPTION) { // Check for APPROVE_OPTION return value
			File chosenFile = chooser.getSelectedFile(); // Get opened file and set save it in the 'file' variable
			
			try {
				/*
				 * What this does to my understanding:
				 * The FileReader reads all characters in the text file.
				 * The BufferedReader buffers those characters to make reading more efficient and less costly.
				 */
				BufferedReader fileReader = new BufferedReader(new FileReader(chosenFile));
				
				String line; // Create String variable called 'line'
				
				text.setText(null);
				/*
				 * What this does in words:
				 * While the amount of lines read is not equal to 0, add the current read line to the JTextArea called 'text'
				 */
				while ((line = fileReader.readLine()) != null) {
					text.append(line + "\n");
				}
				
				fileReader.close(); // Close the FileReader so it doesn't endlessly read
			} catch (FileNotFoundException e) { // Try to catch the FileNotFoundException and call the default error message
				e.printStackTrace();
			} catch (IOException e) { // Try to catch an IOException (Input/Output) and call the default error message
				e.printStackTrace();
			}
		opened = true;
		openedFile = chosenFile;
		}
	}
	
	public void save() { // Save method
		if (opened == true) {
			try {
				// Same here as with the BufferedReader and FileReader
				BufferedWriter fileWriter = new BufferedWriter(new FileWriter(openedFile));
				
				fileWriter.write(text.getText()); // Get all text in the JTextArea and write it to file
				
				fileWriter.close(); // Close the FileWriter so it doesn't endlessly write
				
				TextAreaChanged.saveAble = false;
				save.setEnabled(false);
				save.repaint();
			} catch (IOException e) { // Try to catch an IOException (Input/Output) and call the default error message
				e.printStackTrace();
			}
		} else {
			opened = true;
			TextAreaChanged.saveAble = false;
			save.setEnabled(false);
			save.repaint();
			saveAs();
		}
	}
	
	public void saveAs() { // Save as method
		JFileChooser chooser = new JFileChooser("Documents"); // Creating chooser object (the file chooser like save in any other program)
		
		int returned = chooser.showSaveDialog(this); // Set return value as integer to 'returned' (this can be either of the following: APPROVE_OPTION, CANCEL_OPTION and ERROR_OPTION)
		
		File file = chooser.getSelectedFile(); // Get the input file name and store it in the File variable called 'file'
		
		if (returned == JFileChooser.APPROVE_OPTION) { 
			try {
				// Same here as with the BufferedReader and FileReader
				BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file));
				
				fileWriter.write(text.getText()); // Get all text in the JTextArea and write it to file
				
				fileWriter.close(); // Close the FileWriter so it doesn't endlessly write

				opened = true;
				openedFile = file;
				TextAreaChanged.saveAble = false;
				save.setEnabled(false);
				save.repaint();
			} catch (IOException e) { // Try to catch an IOException (Input/Output) and call the default error message
				e.printStackTrace();
			}
		} 
	}
	
	public void newFile() { // New file method
		text.setText(null);
		opened = false;
	}
	
	static void reload(JMenuItem item) {
		item.validate();
		item.repaint();
	}
}
