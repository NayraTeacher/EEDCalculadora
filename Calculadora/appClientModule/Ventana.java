import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField o1;
	private JTextField o2;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Operador 1: ");
		lblNewLabel.setBounds(38, 26, 70, 14);
		contentPane.add(lblNewLabel);
		
		o1 = new JTextField();
		o1.setBounds(108, 23, 86, 20);
		contentPane.add(o1);
		o1.setColumns(10);
		
		JLabel lblOperando = new JLabel("Operando2: ");
		lblOperando.setBounds(38, 62, 70, 14);
		contentPane.add(lblOperando);
		
		o2 = new JTextField();
		o2.setColumns(10);
		o2.setBounds(108, 59, 86, 20);
		contentPane.add(o2);
		
		JButton suma = new JButton("+");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Operaciones oper = new Operaciones();
				result.setText(String.valueOf(oper.sumar(Integer.parseInt(o1.getText()),Integer.parseInt(o2.getText()))));
			}
		});
		suma.setBounds(38, 107, 89, 23);
		contentPane.add(suma);
		
		JLabel lblResultado = new JLabel("Resultado: ");
		lblResultado.setBounds(177, 217, 70, 14);
		contentPane.add(lblResultado);
		
		result = new JTextField();
		result.setColumns(10);
		result.setBounds(241, 214, 86, 20);
		contentPane.add(result);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operaciones oper = new Operaciones();
				result.setText(String.valueOf(oper.restar(Integer.parseInt(o1.getText()),Integer.parseInt(o2.getText()))));
			}
		});
		button.setBounds(137, 107, 89, 23);
		contentPane.add(button);
	}
}
