package Game;

import java.awt.*;
import javax.swing.*;


public class Creator {
	private ImageIcon textBoxImage = new ImageIcon(Main.class.getResource("../images/textBox.png"));

	JLabel creatorTextBox = new JLabel(textBoxImage);
	JLabel creatorText = new JLabel();
	
	Creator() {
		// creatorTextBox �������ִ� �޼ҵ带 ����
		CreatorTextBox();
		
		// creatorText �������ִ� �޼ҵ带 ����
		
	}
	
	public void CreatorTextBox() {
		// creatorTextBox �������ִ� �޼ҵ带 ����
		creatorTextBox.setVisible(true);
		creatorTextBox.setBounds(300,100,700,500);
	}
	
}
