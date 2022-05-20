package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Page3 {
	
	private ImageIcon diaryLabel = new ImageIcon(Main.class.getResource("../images/diaryLabel.png"));
	private ImageIcon imgBoxLabel = new ImageIcon(Main.class.getResource("../images/imageBox.png"));
	private ImageIcon nextButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/nextButtonEntered.png"));
	private ImageIcon nextButtonImage= new ImageIcon(Main.class.getResource("../images/nextButton.png"));
	private ImageIcon select1Btnimg = new ImageIcon(Main.class.getResource("../images/select1Btn.png"));
	private ImageIcon select2Btnimg = new ImageIcon(Main.class.getResource("../images/select2Btn.png"));
	 
	JButton select1Btn = new JButton(select1Btnimg);
	JButton select2Btn = new JButton(select2Btnimg);
	JButton nextBtnPage3 = new JButton(nextButtonImage);
	
	JLabel diary = new JLabel(diaryLabel);
	JLabel imgBox = new JLabel(imgBoxLabel);
	JLabel textBoxPage3 = new JLabel();
	
	Page3(){
		page3NextBtn();
		page3ImgBox();
		page3Diary();
		page3TextBox();
		page3Select1Btn();
		page3Select2Btn();
	}
	public void page3NextBtn() {
		
		nextBtnPage3.setVisible(false);
		nextBtnPage3.setBounds(933,560,100,100);
		nextBtnPage3.setBorderPainted(false); 
		nextBtnPage3.setContentAreaFilled(false); 
		nextBtnPage3.setFocusPainted(false); 
	      
		nextBtnPage3.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseEntered(MouseEvent e) {
	        	 nextBtnPage3.setIcon(nextButtonEnteredImage);
	        	 nextBtnPage3.setCursor(new Cursor(Cursor.HAND_CURSOR));
	         }
	         @Override
	         public void mouseExited(MouseEvent e) {
	        	 nextBtnPage3.setIcon(nextButtonImage);
	        	 nextBtnPage3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	         }
	         @Override
	         public void mousePressed(MouseEvent e) {
//	        	Game.mainPanel.add(diary);
	        	 nextBtnPage3.setVisible(false);
	        	 select2Btn.setVisible(true);
	        	 select1Btn.setVisible(true);
	         }
	      });
	}
	public void page3Select1Btn() {
		
		select1Btn.setVisible(true);
		select1Btn.setBounds(652,516,276,120);
		select1Btn.setBorderPainted(false);
		select1Btn.setContentAreaFilled(false);
		select1Btn.setFocusPainted(false); 
		
		select1Btn.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseEntered(MouseEvent e) {
	        	 select1Btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	         }
	         @Override
	         public void mouseExited(MouseEvent e) {
	        	 select1Btn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	         }
	         @Override
	         public void mousePressed(MouseEvent e) {
	        	 nextBtnPage3.setVisible(true);
	        	 select2Btn.setVisible(false);
	        	 select1Btn.setVisible(false);
	         }
	      });
	}
	public void page3Select2Btn() {
		
		select2Btn.setVisible(true);
		select2Btn.setBounds(968,516,276,120);
		select2Btn.setBorderPainted(false);
		select2Btn.setContentAreaFilled(false);
		select2Btn.setFocusPainted(false); 
		
		select2Btn.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseEntered(MouseEvent e) {
	        	 select2Btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	         }
	         @Override
	         public void mouseExited(MouseEvent e) {
	        	 select2Btn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	         }
	         @Override
	         public void mousePressed(MouseEvent e) {
	        	 nextBtnPage3.setVisible(true);
	        	 select2Btn.setVisible(false);
	        	 select1Btn.setVisible(false);
	         }
	      });
	}
	public void page3Diary() {
		diary.setVisible(true);
		diary.setBounds(20,20,610,650);
		
	}
	public void page3ImgBox() {
		imgBox.setVisible(true);
		imgBox.setBounds(651, 20, 592, 444);
	}
	public void page3TextBox() {
		// ��Ʈ �Ӽ� �߰� ����
		 Font myFont1 = new Font("Serif", Font.BOLD, 18);
		 
		 // htmló�� ����ؼ� �ٹٲ�, �߾����� ����
		 String test = "<html><body style='text-align:center;'>�׾���......."
				+ "<br> ���ڸ� ��� ����� �߰��� ǥ�ð� �ǳ׿� �� ���ٿ� 38���ڸ� ����� �� �´°� �����ϴ�."
				+ "<br> ����ũ��� �ؽ�Ʈ �ڽ��� ���� �����ϴ� ���߿� ���߸� �ǰڽ��ϴ�."
				+ "<bt> �׷��� �̰� �԰��� ��Ȯ�ϰ� ���� �ʽ��ϴ�;;"
		 		+ "<br> JAVA Team3 game project </body></html>";
		 		
		 textBoxPage3.setVisible(true);
		 textBoxPage3.setBounds(20,20,610,650);
		 textBoxPage3.setText(test); // �ؽ�Ʈ �ڽ��� �� ����
		 textBoxPage3.setFont(myFont1); // �ؽ�Ʈ ��Ʈ ����
		 
		 // �ؽ�Ʈ ��ġ ����
		 textBoxPage3.setHorizontalTextPosition(JLabel.CENTER);
		 textBoxPage3.setVerticalTextPosition(JLabel.CENTER);
	 }
	
}
