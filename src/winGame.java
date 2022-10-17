import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class winGame extends JFrame {

	private JPanel contentPane;
	private JTextField tfNumber2;
	private JTextField tfNumber1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winGame frame = new winGame();
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
	public winGame() {
		setTitle("가위바위보 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		tfNumber1 = new JTextField();
		contentPane.add(tfNumber1);
		tfNumber1.setColumns(10);
		
		tfNumber2 = new JTextField();
		contentPane.add(tfNumber2);
		tfNumber2.setColumns(10);
		
		JButton btnRun = new JButton("실행");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i, sum=0;
				int first = Integer.parseInt(tfNumber1.getText ()); //int로 바꾸기 위해 Integer.parseInt
				int last = Integer.parseInt(tfNumber2.getText ()); //int로 바꾸기 위해 Integer.parseInt
				for(i=first; i<=last;i++)
					sum = sum + i ;
				System.out.println("합은" + sum + "입니다");
				
			
			}
		});
		
		
		contentPane.add(btnRun);
	}

}
