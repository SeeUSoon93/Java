package view;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.dnd.DropTargetContext;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class panel extends JFrame {
	panel() {
		setTitle("Princess Maker");
		setSize(950, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton j = new JButton("로그인");
		JButton j2 = new JButton("회원가입");
		
		c.add(j);
		c.add(j2);
		setVisible(true);
	}

	public static void main(String[] args) {
		new panel();
	}

}
