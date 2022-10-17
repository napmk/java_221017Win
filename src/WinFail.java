import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinFail extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinFail frame = new WinFail();
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
	public WinFail() {
		setTitle("WinFail");
		setBounds(100, 100, 517, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		int j=50, k=50;
		for(int i=1; i<=31; i++) {
			
			JButton b = new JButton(Integer.toString(i)); //버튼생성
			b.setLocation(k,j);
			k = k + 60;
			b.setSize(50,20);
			contentPane.add(b); //버튼을 컨텐츠팬에부탁
			if(i%7==0) {
				j = j+30;
			    k=50;
		}
		}
	}

}
