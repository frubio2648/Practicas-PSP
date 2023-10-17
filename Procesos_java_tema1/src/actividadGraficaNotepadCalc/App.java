package actividadGraficaNotepadCalc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class App {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCalc = new JButton("Calculadora");
		btnCalc.setIcon(new ImageIcon("C:\\Users\\franr\\OneDrive\\Escritorio\\Workspace\\Programacion_servicios_procesos\\Procesos_java_tema1\\icon-calc.png"));
		btnCalc.setBounds(105, 11, 210, 111);
		frame.getContentPane().add(btnCalc);
		btnCalc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				LanzadorProcesos lp = new LanzadorProcesos();
				String ruta = "C:\\WINDOWS\\System32\\calc";
				lp.ejecutar(ruta);
			}
		});
		
		JButton btnNote = new JButton("Notepad");
		btnNote.setIcon(new ImageIcon("C:\\Users\\franr\\OneDrive\\Escritorio\\Workspace\\Programacion_servicios_procesos\\Procesos_java_tema1\\icon-notepad.png"));
		btnNote.setBounds(105, 143, 210, 107);
		frame.getContentPane().add(btnNote);
		btnNote.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				LanzadorProcesos lp = new LanzadorProcesos();
				String ruta = "C:\\WINDOWS\\System32\\notepad.exe";
				lp.ejecutar(ruta);
			}
		});
	}
}
