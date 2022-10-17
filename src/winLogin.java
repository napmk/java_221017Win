import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class winLogin extends JFrame {

	private JPanel contentPane;
	private JTextField tfID;
	private JTextField tfPW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winLogin frame = new winLogin();
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
	public winLogin() {
		setTitle("\uB85C\uADF8\uC778");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 327, 213);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblID = new JLabel("ID");
		lblID.setBounds(60, 33, 45, 26);
		contentPane.add(lblID);
		
		tfID = new JTextField();
		tfID.setBounds(117, 36, 116, 21);
		contentPane.add(tfID);
		tfID.setColumns(10);
		
		JLabel lblPW = new JLabel("PW");
		lblPW.setBounds(62, 73, 57, 15);
		contentPane.add(lblPW);
		
		tfPW = new JTextField();
		tfPW.setBounds(117, 67, 116, 21);
		contentPane.add(tfPW);
		tfPW.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfID.getText().equals("test") && tfPW.getText().equals("1234")) {
					System.out.println("로그인성공");
					WinPop dlg= new WinPop(); // pop불러오기
					dlg.setVisible(true); // 안보여서 보이게 하는소스
					
				}else {
					System.out.println("로그인실패");
					WinFail dlg2= new WinFail(); // pop불러오기
					dlg2.setVisible(true); // 안보여서 보이게 하는소스
				}
			}
		});
		btnLogin.setBounds(60, 98, 173, 34);
		contentPane.add(btnLogin);
	}
}
