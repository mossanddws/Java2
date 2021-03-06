package ex3b_button_event_bis;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class ButtonEventBisView extends JFrame {
	
	private JPanel contentPane;
	public ButtonEventBisView(String title) {
		this();
		setTitle(title);
	}

	public ButtonEventBisView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnTest = new JButton("Test");
		btnTest.setAction(new AbstractAction() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Test clic");				
			}
		});
		contentPane.add(btnTest);
		
		JButton btn1 = new JButton("Un");
		btn1.setAction(new AbstractAction() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setTitle("Un");
				
			}
		});
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Deux");
		btn2.setAction(new AbstractAction() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setTitle("Deux");
				
			}
		});
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("Trois");
		btn3.setAction(new AbstractAction() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setTitle("Trois");
				
			}
		});
		contentPane.add(btn3);
	}
	
}
