package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Page3 {
	
	private ImageIcon diaryLabel = new ImageIcon(Main.class.getResource("../images/diaryImgTest.png"));
	private ImageIcon imgBoxLabel = new ImageIcon(Main.class.getResource("../images/imgBoxTest.png"));
	private ImageIcon nextButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/nextButtonEntered.png"));
	private ImageIcon nextButtonImage= new ImageIcon(Main.class.getResource("../images/nextButton.png"));
	private ImageIcon selectBtnImage = new ImageIcon(Main.class.getResource("../images/selectBtnBasic.png"));
	private ImageIcon selectBtnEnteredImage = new ImageIcon(Main.class.getResource("../images/selectBtnEntered.png"));
	private Image endingBg = new ImageIcon(Main.class.getResource("../images/aisleBackground.png")).getImage();
	 
	JButton select1Btn = new JButton(selectBtnImage);
	JButton select2Btn = new JButton(selectBtnImage);
	JButton nextBtnPage3 = new JButton(nextButtonImage);

	JLabel diary = new JLabel(diaryLabel);
	JLabel imgBox = new JLabel(imgBoxLabel);
	JLabel textBoxPage3 = new JLabel();
	Engine engine = new Engine();
	Ending ending = new Ending();
	Font myFont1 = new Font("Serif", Font.BOLD, 18);
	 
	
	Page3(){
		page3NextBtn();
		page3ImgBox();
		page3Diary();
		page3TextBox();
		page3Select1Btn();
		page3Select2Btn();
	}
	
	public void goToEnding() {
		 nextBtnPage3.setVisible(false);
		 textBoxPage3.setVisible(false);
		 diary.setVisible(false);
		 imgBox.setVisible(false);
		 select1Btn.setVisible(false);
		 select2Btn.setVisible(false);
		 Game.mainPanel.add(ending.nextBtnEnding);
		 Game.mainPanel.pageBackground = endingBg;
	}
	
	public void page3NextBtn() {
		nextBtnPage3.setVisible(false);
		nextBtnPage3.setBounds(900,500,100,100);
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
//	        	 Game.mainPanel.add(diary);
	        	 //14일차엔 선택지 없이 넥스트 버튼만 나오게
	        	 if (engine.EventNum < 13) {
	        		 nextBtnPage3.setVisible(false);
	        		 select2Btn.setVisible(true);
	        		 select1Btn.setVisible(true);
	        	 }
	        	 //14일차에 넥스트 버튼 누르면 엔딩화면으로 
	        	 if (engine.EventNum == 14) {
	        		 goToEnding();
	        		 Game.mainPanel.add(ending.diary2);
	        	 }
	        	 //라이프 0이여도 엔딩화면으로
	        	 if (Engine.Life == 0) {
	        		 goToEnding();
	        		 Game.mainPanel.add(ending.diary1);
	        	 }
	        	 engine.EventNum++;
	        	 textBoxPage3.setText(engine.eventScript());
	        	 select1Btn.setText(engine.select1Text());
	        	 select2Btn.setText(engine.select2Text());
	         }
	      });
	}
	public void page3Select1Btn() {
		select1Btn.setVisible(true);
		select1Btn.setBounds(660,450,280,200);
		select1Btn.setBorderPainted(false);
		select1Btn.setContentAreaFilled(false);
		select1Btn.setFocusPainted(false);
		select1Btn.setHorizontalTextPosition(JButton.CENTER); 
		select1Btn.setVerticalTextPosition(JButton.CENTER); 
		select1Btn.setFont(myFont1);
		select1Btn.setText(engine.select1Text());
		
		select1Btn.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseEntered(MouseEvent e) {
	        	 select1Btn.setIcon(selectBtnEnteredImage);
	        	 select1Btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	        	 select1Btn.setForeground(Color.white);
	         }
	         @Override
	         public void mouseExited(MouseEvent e) {
	        	 select1Btn.setIcon(selectBtnImage);
	        	 select1Btn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	        	 select1Btn.setForeground(Color.black);
	         }
	         @Override
	         public void mousePressed(MouseEvent e) {
	        	 nextBtnPage3.setVisible(true);
	        	 select2Btn.setVisible(false);
	        	 select1Btn.setVisible(false);
	        	 textBoxPage3.setText(engine.select1Script());
	         }
	      });
	}
	public void page3Select2Btn() {
		
		select2Btn.setVisible(true);
		select2Btn.setBounds(960,450,280,200);
		select2Btn.setBorderPainted(false);
		select2Btn.setContentAreaFilled(false);
		select2Btn.setFocusPainted(false);
		select2Btn.setHorizontalTextPosition(JButton.CENTER); 
		select2Btn.setVerticalTextPosition(JButton.CENTER); 
		select2Btn.setFont(myFont1);
		select2Btn.setText(engine.select2Text());
		
		select2Btn.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseEntered(MouseEvent e) {
	        	 select2Btn.setIcon(selectBtnEnteredImage);
	        	 select2Btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	        	 select2Btn.setForeground(Color.white);
	         }
	         @Override
	         public void mouseExited(MouseEvent e) {
	        	 select2Btn.setIcon(selectBtnImage);
	        	 select2Btn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	        	 select2Btn.setForeground(Color.black);
	         }
	         @Override
	         public void mousePressed(MouseEvent e) {
	        	 nextBtnPage3.setVisible(true);
	        	 select2Btn.setVisible(false);
	        	 select1Btn.setVisible(false);
	        	 textBoxPage3.setText(engine.select2Script());
	         }
	      });
	}
	public void page3Diary() {
		diary.setVisible(true);
		diary.setBounds(30,30,600,620);
	}
	
	public void page3ImgBox() {
		imgBox.setVisible(true);
		imgBox.setBounds(660, 30, 580, 400);
	}
	public void page3TextBox() {
		 textBoxPage3.setVisible(true);
		 textBoxPage3.setBounds(70,50,530,580);
		 textBoxPage3.setText(engine.eventScript()); // 텍스트 박스에 들어갈 내용
		 textBoxPage3.setFont(myFont1); // 텍스트 폰트 변경
		 
		 // 텍스트 위치 조정
		 textBoxPage3.setHorizontalTextPosition(JLabel.CENTER);
		 textBoxPage3.setVerticalTextPosition(JLabel.CENTER);
	 }
	
}
