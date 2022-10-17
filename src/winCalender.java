import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class winCalender extends JFrame {

   private JPanel contentPane;
   private JTextField tfYear;
   private JTextField tfMonth;
   private JPanel calendar_panel;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               winCalender frame = new winCalender();
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
   public winCalender() {
      setTitle("Calendar");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 569, 507);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

      setContentPane(contentPane);
      contentPane.setLayout(new BorderLayout(0, 0));
      
      JPanel panel = new JPanel();
      contentPane.add(panel, BorderLayout.NORTH);
      
      JLabel lblYear = new JLabel("연도:");
      panel.add(lblYear);
      
      tfYear = new JTextField();
      tfYear.setHorizontalAlignment(SwingConstants.RIGHT);
      tfYear.setText("2022");
      panel.add(tfYear);
      tfYear.setColumns(10);
      
      JLabel lblMonth = new JLabel("월:");
      panel.add(lblMonth);
      
      tfMonth = new JTextField();
      tfMonth.setHorizontalAlignment(SwingConstants.RIGHT);
      tfMonth.setText("10");
      panel.add(tfMonth);
      tfMonth.setColumns(10);
      
      JButton btnView = new JButton("달력 보기");
      btnView.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		for(int i=1; i<=31; i++) {
    			JButton btn = new JButton(Integer.toString(i)); //버튼생성
    			calendar_panel.add(btn); 
    			
      		}
      		calendar_panel.revalidate();// 다시그려줘.
      	}
      });
      panel.add(btnView);
      
      calendar_panel = new JPanel();
      contentPane.add(calendar_panel, BorderLayout.CENTER);
      calendar_panel.setLayout(new GridLayout(0, 7, 0, 0));
   }

}