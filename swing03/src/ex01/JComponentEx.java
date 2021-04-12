package ex01;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JComponentEx extends JFrame implements ActionListener{
	
	Container c = getContentPane();
	JButton btn1 = new JButton("Magenta/Yellow Button");
	JButton btn2 = new JButton("Disabled Button");
	JButton btn3 = new JButton("getX(), getY()");
	
	
	public JComponentEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("컴포넌트 공토 메서드");
		
		c.setLayout(new FlowLayout());
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JComponentEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		JButton btn = (JButton)obj;
		if(btn == btn1) {
			btn1.setBackground(Color.YELLOW);
			btn1.setForeground(Color.MAGENTA);
			btn1.setFont(new Font("맑은고딕", Font.ITALIC,10));
		} else if (btn == btn2) {
			btn2.setEnabled(false);
		} else if (btn == btn3) {
			JFrame f = (JFrame)btn3.getTopLevelAncestor();
			int x = btn3.getX();
			int y = btn3.getY();
			f.setTitle(")" + x + " , " + y + ")");
		}
	}
}
