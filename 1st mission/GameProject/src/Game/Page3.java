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
		// 폰트 속성 추가 변수
		 Font myFont1 = new Font("Serif", Font.BOLD, 18);
		 
		 // html처럼 사용해서 줄바꿈, 중앙정렬 가능
		 String test = "<html><body style='text-align:center;'>죽었다......."
				+ "<br> 글자를 길게 적어야 중간에 표시가 되네요 약 한줄에 38글자를 적어야 딱 맞는거 같습니다."
				+ "<br> 글자크기와 텍스트 박스는 수정 가능하니 나중에 맞추면 되겠습니다."
				+ "<bt> 그런데 이게 규격이 정확하게 맞지 않습니다;;"
		 		+ "<br> JAVA Team3 game project </body></html>";
		 		
		 textBoxPage3.setVisible(true);
		 textBoxPage3.setBounds(20,20,610,650);
		 textBoxPage3.setText(test); // 텍스트 박스에 들어갈 내용
		 textBoxPage3.setFont(myFont1); // 텍스트 폰트 변경
		 
		 // 텍스트 위치 조정
		 textBoxPage3.setHorizontalTextPosition(JLabel.CENTER);
		 textBoxPage3.setVerticalTextPosition(JLabel.CENTER);
	 }
	
}
