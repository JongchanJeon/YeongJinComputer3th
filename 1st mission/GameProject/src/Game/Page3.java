package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Page3 {
	
	//private ImageIcon diaryLabel = new ImageIcon(Main.class.getResource("../images/threeLifeDiary.png"));
	private ImageIcon imgBoxLabel = new ImageIcon(Main.class.getResource("../images/imgBoxTest.png"));
	private ImageIcon nextButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/nextButtonEntered.png"));
	private ImageIcon nextButtonImage= new ImageIcon(Main.class.getResource("../images/nextButton.png"));
	private ImageIcon selectBtnImage = new ImageIcon(Main.class.getResource("../images/selectBtnBasic.png"));
	private ImageIcon selectBtnEnteredImage = new ImageIcon(Main.class.getResource("../images/selectBtnEntered.png"));
	private Image endingBg = new ImageIcon(Main.class.getResource("../images/aisleBackground.png")).getImage();
	private ImageIcon Life3Bg = new ImageIcon(Main.class.getResource("../images/threeLifeDiary.png"));
	private ImageIcon Life2Bg = new ImageIcon(Main.class.getResource("../images/twoLifeDiary.png"));
	private ImageIcon Life1Bg = new ImageIcon(Main.class.getResource("../images/oneLifeDiary.png"));
	private ImageIcon Life0Bg = new ImageIcon(Main.class.getResource("../images/zeroLifeDiary.png"));
	
	private ImageIcon dayOneImg = new ImageIcon(Main.class.getResource("../images/dayOneImg.png"));
	private ImageIcon dayTwoImg = new ImageIcon(Main.class.getResource("../images/dayTwoImg.png"));
	private ImageIcon dayThreeImg = new ImageIcon(Main.class.getResource("../images/dayThreeImg.png"));
	private ImageIcon dayFourImg = new ImageIcon(Main.class.getResource("../images/dayFourImg.png"));
	private ImageIcon dayFiveImg = new ImageIcon(Main.class.getResource("../images/dayFiveImg.png"));
	private ImageIcon daySixImg = new ImageIcon(Main.class.getResource("../images/daySixImg.png"));
	private ImageIcon daySevenImg = new ImageIcon(Main.class.getResource("../images/daySevenImg.png"));
	private ImageIcon dayEightImg = new ImageIcon(Main.class.getResource("../images/dayEightImg.png"));
	
	JButton select1Btn = new JButton(selectBtnImage);
	JButton select2Btn = new JButton(selectBtnImage);
	JButton nextBtnPage3 = new JButton(nextButtonImage);

	JLabel diary = new JLabel(Life3Bg);
	JLabel imgBox = new JLabel(dayOneImg);
	JLabel dayBox = new JLabel();
	JLabel textBoxPage3 = new JLabel();
	Engine engine = new Engine();
	Ending ending = new Ending();
	public static Font myFont1 = new Font("나눔손글씨 강부장님체", Font.BOLD, 26);
	 
	
	Page3(){
		page3DayBox();
		page3NextBtn();
		page3ImgBox();
		page3Diary();
		page3TextBox();
		page3Select1Btn();
		page3Select2Btn();
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
	        	 //14일차엔 선택지 없이 넥스트 버튼만 나오게
	        	 if (Engine.EventNum < 13) {
	        		 nextBtnPage3.setVisible(false);
	        		 select2Btn.setVisible(true);
	        		 select1Btn.setVisible(true);
	        	 }
	        	 //14일차에 넥스트 버튼 누르면 엔딩화면으로 
	        	 if (Engine.EventNum == 14) {
	        		 goToEnding();
	        		 Game.mainPanel.add(ending.endingTextBox);
	        		 Game.mainPanel.add(ending.endingdiary);
	        		 ending.endingTextBox.setText(ending.clearText);
	        	 }
	        	 //라이프 0이여도 엔딩화면으로
	        	 if (Engine.Life == 0) {
	        		 goToEnding();
	        		 Game.mainPanel.add(ending.endingTextBox);
	        		 Game.mainPanel.add(ending.endingdiary);
	        		 ending.endingTextBox.setText(ending.gameOverText);
	        	 }
	        	 Engine.EventNum++;
	        	 dayBox.setText("DAY "+Engine.EventNum); // 텍스트 박스에 들어갈 내용
	        	 textBoxPage3.setText(engine.eventScript());
	        	 select1Btn.setText(engine.select1Text());
	        	 select2Btn.setText(engine.select2Text());
	        	 imageChanger();
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
	        	 lifeChecker();
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
	        	 lifeChecker();
	         }
	      });
	}
	public void page3Diary() {
		diary.setVisible(true);
		diary.setBounds(30,30,600,620);
	}
	
	public void page3ImgBox() {
		imgBox.setVisible(true);
		imgBox.setBounds(660, 30, 580, 390);
	}
	public void page3TextBox() {
		 textBoxPage3.setVisible(true);
		 textBoxPage3.setBounds(70,0,530,720);
		 textBoxPage3.setText(engine.eventScript()); // 텍스트 박스에 들어갈 내용
		 textBoxPage3.setFont(myFont1); // 텍스트 폰트 변경
		 // textBoxPage3.setVerticalTextPosition(JLabel.TOP); 이거 왜 작동 안해요?
	 }
	
	public void page3DayBox() {
		dayBox.setVisible(true);
		dayBox.setBounds(350,-25,200,200);
		dayBox.setText("DAY "+Engine.EventNum); // 텍스트 박스에 들어갈 내용
		dayBox.setFont(new Font("고딕", Font.BOLD, 45)); // 텍스트 폰트 변경
	 }
	
	
	public void goToEnding() {
		 Sound.clip.stop();	// 이전의 음악 멈춤
		 new Sound("ENDING");	// ENDING 음악 시작
		 nextBtnPage3.setVisible(false);
		 textBoxPage3.setVisible(false);
		 diary.setVisible(false);
		 imgBox.setVisible(false);
		 select1Btn.setVisible(false);
		 select2Btn.setVisible(false);
		 dayBox.setVisible(false);
		 Game.mainPanel.add(ending.nextBtnEnding);
		 Game.mainPanel.pageBackground = endingBg;
	}
	public void lifeChecker() {
		if (Engine.Life == 3)  diary.setIcon(Life3Bg); 
		else if (Engine.Life == 2) diary.setIcon(Life2Bg); 
		else if (Engine.Life == 1) diary.setIcon(Life1Bg);
		else if (Engine.Life == 0) diary.setIcon(Life0Bg); 
	}	
	
	public void imageChanger() {
		if (Engine.EventNum == 1) imgBox.setIcon(dayOneImg); 
		else if (Engine.EventNum == 2) imgBox.setIcon(dayTwoImg);
		else if (Engine.EventNum == 3) imgBox.setIcon(dayThreeImg);
		else if (Engine.EventNum == 4) imgBox.setIcon(dayFourImg);
		else if (Engine.EventNum == 5) imgBox.setIcon(dayFiveImg);
		else if (Engine.EventNum == 6) imgBox.setIcon(daySixImg); 
		else if (Engine.EventNum == 7) imgBox.setIcon(daySevenImg); 
		else if (Engine.EventNum == 8) imgBox.setIcon(dayEightImg);
		
	}
}
