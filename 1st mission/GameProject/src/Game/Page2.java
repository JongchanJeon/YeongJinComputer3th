package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Page2 extends JPanel{
	
	 private ImageIcon nextButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/nextButtonEntered.png"));
	 private ImageIcon nextButtonImage= new ImageIcon(Main.class.getResource("../images/nextButton.png"));
	 private ImageIcon textBoxImage = new ImageIcon(Main.class.getResource("../images/textBox.png"));
	 private Image page3bg = new ImageIcon(Main.class.getResource("../images/page3Bg.png")).getImage();

	 JButton nextBtn = new JButton(nextButtonImage);
	 JLabel textBox = new JLabel(); // �̹����� �� ������
	 JLabel text = new JLabel(); // ���� ������ �� ��
	 
	 Page2(){
		 page2Btn();
		 page2Text();
	 }
	 
	//���� ��ư
	 public void page2Btn() {
		 
		 Page3 page3 = new Page3();
		 
		 nextBtn.setVisible(true);
		 nextBtn.setBounds(1000,500,200,100);
	     nextBtn.setBorderPainted(false); 
	     nextBtn.setContentAreaFilled(false); 
	     nextBtn.setFocusPainted(false); 
	      
	     nextBtn.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseEntered(MouseEvent e) {
	        	 nextBtn.setIcon(nextButtonEnteredImage);
	        	 nextBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	         }
	         @Override
	         public void mouseExited(MouseEvent e) {
	        	nextBtn.setIcon(nextButtonImage);
	            nextBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	         }
	         @Override
	         public void mousePressed(MouseEvent e) {
	        	nextBtn.setVisible(false);
	        	textBox.setVisible(false);
	        	text.setVisible(false);
	        	Game.mainPanel.add(page3.nextBtnPage3);
	        	Game.mainPanel.add(page3.textBoxPage3);
	        	Game.mainPanel.add(page3.dayBox);
	        	Game.mainPanel.add(page3.diary);
	        	Game.mainPanel.add(page3.imgBox);
	        	Game.mainPanel.add(page3.select1Btn);
	        	Game.mainPanel.add(page3.select2Btn);
	            Game.mainPanel.pageBackground = page3bg;
	            Sound.clip.stop();
	            new Sound("GAMING");
	         }
	      });
	 }
	 
	 // �ؽ�Ʈ�ڽ�
	 public void page2Text() {
		 Font myFont1 = new Font("�����ձ۾� �������ü", Font.BOLD, 23);

		 textBox.setVisible(true);
		 textBox.setBounds(300,100,700,500);
		 textBox.setIcon(textBoxImage); // �ؽ�Ʈ �ڽ��� �̹���
		 
		 text.setVisible(true);
		 text.setBounds(320, 100, 660, 520);
		 text.setFont(myFont1);
		// htmló�� ����ؼ� �ٹٲ�, �߾����� ����
		 String prolog = "<html><body style='text-align:center;'>���� ��ħ�� ���� �ϴ�."
		 	+ "<br>�׸��� ������ �����ϵ� ��ǳ�� ����ġ�� ���� ���� ��.<br>\r\n"
	 		+ "���� �б��� �������ڸ��� ������ �پ� ȭ��Ƿ� �޷�����.<br>\r\n"
	 		+ "���� ������ ���� �ֺ��� ���� ���� �Ҷ�����������<br>"
	 		+ "�׶� ���� ���̴� �� ��� ������...<br>\r\n"
	 		+ "<br>"
	 		+ "ȭ��ǿ��� ���ͼ� �� ������ ��ġ ����ī�޶� ���Ҵ�.<br>\r\n"
	 		+ "���Ҹ��� ��� �Ĵٺ��� �� ����� �̻��� ����鿡 �ѷ��ο� ���ݹް� �־���.<br>\r\n"
	 		+ "������ ���?���� �и��� �̼��� ������ ����ִ� �� ���� �ʾҴ�.<br>\r\n"
	 		+ "������ ƴ�� ���� �׵��� ���� ���� �پ�԰�<br>"
	 		+ "���� �ʻ������� �پ� ���� ����� ���ǽǷ� �� ���� �ݾҴ�.<br>\r\n"
	 		+ "������ ���� ���� ö���̶� <s>�׵���</s> ������� ������ ���Ѵٴ� ���̰�<br>\r\n"
	 		+ "�� ���� ���� ����� �����̶�� ���̴�.<br><br></body></html>";
		 text.setText(prolog);
		 text.setHorizontalTextPosition(JLabel.CENTER);
		 text.setVerticalTextPosition(JLabel.CENTER);
	 }
	 
}
