import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinCalculator extends JFrame {

   private JPanel contentPane;
   private JTextField tfExpression;
   private JTextField tfResult;
   private String op1; // 피연산자 1
   private String op2; // 피연산자 2
   private String operand; // 연산자 + - * /

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               WinCalculator frame = new WinCalculator();
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
   public WinCalculator() {
      setTitle("계산기");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 438, 441);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

      setContentPane(contentPane);
      contentPane.setLayout(new BorderLayout(0, 0));
      
      JPanel panel = new JPanel();
      contentPane.add(panel, BorderLayout.NORTH);
      
      JLabel lblExpression = new JLabel("수식입력");
      lblExpression.setFont(new Font("굴림", Font.BOLD, 15));
      panel.add(lblExpression);
      
      tfExpression = new JTextField();
      tfExpression.setHorizontalAlignment(SwingConstants.RIGHT);
      tfExpression.setFont(new Font("굴림", Font.BOLD, 15));
      panel.add(tfExpression);
      tfExpression.setColumns(20);
      
      JPanel panel_1 = new JPanel();
      contentPane.add(panel_1, BorderLayout.SOUTH);
      
      JLabel lblResult = new JLabel("계산결과");
      lblResult.setFont(new Font("굴림", Font.BOLD, 15));
      panel_1.add(lblResult);
      
      tfResult = new JTextField();
      tfResult.setHorizontalAlignment(SwingConstants.RIGHT);
      tfResult.setFont(new Font("굴림", Font.BOLD, 15));
      tfResult.setColumns(20);
      panel_1.add(tfResult);
      
      JPanel panel_2 = new JPanel();
      contentPane.add(panel_2, BorderLayout.CENTER);
      panel_2.setLayout(new GridLayout(0, 4, 0, 0));
      
      JButton btn0 = new JButton("0");
      btn0.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String value = tfExpression.getText();
            tfExpression.setText(value + "0"); 
         }
      });
      btn0.setFont(new Font("굴림", Font.BOLD, 15));
      panel_2.add(btn0);
      
      JButton btn1 = new JButton("1");
      btn1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String value = tfExpression.getText();
            tfExpression.setText(value + "1"); 
         }
      });
      btn1.setFont(new Font("굴림", Font.BOLD, 15));
      panel_2.add(btn1);
      
      JButton btn2 = new JButton("2");
      btn2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String value = tfExpression.getText();
            tfExpression.setText(value + "2"); 
         }
      });
      btn2.setFont(new Font("굴림", Font.BOLD, 15));
      panel_2.add(btn2);
      
      JButton btn3 = new JButton("3");
      btn3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String value = tfExpression.getText();
            tfExpression.setText(value + "3"); 
         }
      });
      btn3.setFont(new Font("굴림", Font.BOLD, 15));
      panel_2.add(btn3);
      
      JButton btn4 = new JButton("4");
      btn4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String value = tfExpression.getText();
            tfExpression.setText(value + "4"); 
         }
      });
      btn4.setFont(new Font("굴림", Font.BOLD, 15));
      panel_2.add(btn4);
      
      JButton btn5 = new JButton("5");
      btn5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String value = tfExpression.getText();
            tfExpression.setText(value + "5"); 
         }
      });
      btn5.setFont(new Font("굴림", Font.BOLD, 15));
      panel_2.add(btn5);
      
      JButton btn6 = new JButton("6");
      btn6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String value = tfExpression.getText();
            tfExpression.setText(value + "6"); 
         }
      });
      btn6.setFont(new Font("굴림", Font.BOLD, 15));
      panel_2.add(btn6);
      
      JButton btn7 = new JButton("7");
      btn7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String value = tfExpression.getText();
            tfExpression.setText(value + "7"); 
         }
      });
      btn7.setFont(new Font("굴림", Font.BOLD, 15));
      panel_2.add(btn7);
      
      JButton btn8 = new JButton("8");
      btn8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String value = tfExpression.getText();
            tfExpression.setText(value + "8"); 
         }
      });
      btn8.setFont(new Font("굴림", Font.BOLD, 15));
      panel_2.add(btn8);
      
      JButton btn9 = new JButton("9");
      btn9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String value = tfExpression.getText();
            tfExpression.setText(value + "9"); 
         }
      });
      btn9.setFont(new Font("굴림", Font.BOLD, 15));
      panel_2.add(btn9);
      
      JButton btnCE = new JButton("CE");
      btnCE.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            tfExpression.setText(""); 
         }
      });
      btnCE.setFont(new Font("굴림", Font.BOLD, 15));
      panel_2.add(btnCE);
      
      JButton btnCalc = new JButton("계산");
      btnCalc.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            op2 = tfExpression.getText();
            tfExpression.setText(op1 + operand + op2 + "=");
            int result = 0;
            // 계산
            switch(operand) {
            case "+": result = Integer.parseInt(op1)+Integer.parseInt(op2);
                    break;
            case "-": result = Integer.parseInt(op1)-Integer.parseInt(op2);
              break;
            case "*": result = Integer.parseInt(op1)*Integer.parseInt(op2);
              break;
            case "/": result = Integer.parseInt(op1)/Integer.parseInt(op2);
              break;
            case "**":
            		result = 1;
            		for(int i=1 ; i<=Integer.parseInt(op2); i++)
            			result= result * Integer.parseInt(op1);
            break;
            }
            tfResult.setText(result + "");
         }
      });
      btnCalc.setFont(new Font("굴림", Font.BOLD, 15));
      panel_2.add(btnCalc);
      
      JButton btnAdd = new JButton("+");
      btnAdd.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            op1 = tfExpression.getText();
            tfExpression.setText("");   
            operand = "+";
         }
      });
      btnAdd.setFont(new Font("굴림", Font.BOLD, 15));
      panel_2.add(btnAdd);
      
      JButton btnSqr = new JButton("sqr(x)");
      btnSqr.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
       		op1 = tfExpression.getText();
       		tfExpression.setText("sqr(" + op1 + ")=");
       		int result = Integer.parseInt(op1)*Integer.parseInt(op1);
       		tfResult.setText(Integer.toString(result));
         }
      });
      
      JButton btnSubstract_1 = new JButton("-");
      btnSubstract_1.setFont(new Font("굴림", Font.BOLD, 15));
      panel_2.add(btnSubstract_1);
      
      JButton btnMultiply_1 = new JButton("*");
      btnMultiply_1.setFont(new Font("굴림", Font.BOLD, 15));
      panel_2.add(btnMultiply_1);
      
      JButton btnDivide_1 = new JButton("/");
      btnDivide_1.setFont(new Font("굴림", Font.BOLD, 15));
      panel_2.add(btnDivide_1);
      
      JButton btn1byX = new JButton("1/x");
      btn1byX.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		op1 = tfExpression.getText();
      		tfExpression.setText("1/" + op1 + "=");
      		double result = (double)1 /Integer.parseInt(op1);
      		tfResult.setText(Double.toString(result));
      	}
      });
      btn1byX.setFont(new Font("굴림", Font.BOLD, 15));
      panel_2.add(btn1byX);
      btnSqr.setFont(new Font("굴림", Font.BOLD, 15));
      panel_2.add(btnSqr);
      
      JButton btnRoot = new JButton("root(x)");
      btnRoot.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        		op1 = tfExpression.getText();
           		tfExpression.setText("root(" + op1 + ")=");
           		double result = Math.sqrt(Double.parseDouble(op1));
           		tfResult.setText(Double.toString(result));
         }
      });
      btnRoot.setFont(new Font("굴림", Font.BOLD, 15));
      panel_2.add(btnRoot);
      
      JButton btnxy = new JButton("x**y");
      btnxy.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 op1 = tfExpression.getText();
             tfExpression.setText("");   
             operand = "**";
         }
      });
      btnxy.setFont(new Font("굴림", Font.BOLD, 15));
      panel_2.add(btnxy);
   }

}