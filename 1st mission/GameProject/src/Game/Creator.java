package Game;

import java.awt.*;
import javax.swing.*;


public class Creator {
	private ImageIcon textBoxImage = new ImageIcon(Main.class.getResource("../images/textBox.png"));

	JLabel creatorTextBox = new JLabel(textBoxImage);
	JLabel creatorText = new JLabel();
	
	Creator() {
		// creatorTextBox 설정해주는 메소드를 실행
		CreatorTextBox();
		
		// creatorText 설정해주는 메소드를 실행
		
	}
	
	public void CreatorTextBox() {
		// creatorTextBox 설정해주는 메소드를 실행
		creatorTextBox.setVisible(true);
		creatorTextBox.setBounds(300,100,700,500);
	}
	
}
