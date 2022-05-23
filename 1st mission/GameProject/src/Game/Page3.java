package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Page3 {
	
	private ImageIcon diaryLabel = new ImageIcon(Main.class.getResource("../images/diaryImgTest.png"));
	private ImageIcon imgBoxLabel = new ImageIcon(Main.class.getResource("../images/imgBoxTest.png"));
	private ImageIcon nextButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/nextButtonEntered.png"));
	private ImageIcon nextButtonImage= new ImageIcon(Main.class.getResource("../images/nextButton.png"));
	private ImageIcon select1Btnimg = new ImageIcon(Main.class.getResource("../images/selectBtnTest.png"));
	private ImageIcon select2Btnimg = new ImageIcon(Main.class.getResource("../images/selectBtnTest.png"));
	private Image endingBg = new ImageIcon(Main.class.getResource("../images/aisleBackground.png")).getImage();
	 
	JButton select1Btn = new JButton(select1Btnimg);
	JButton select2Btn = new JButton(select2Btnimg);
	JButton nextBtnPage3 = new JButton(nextButtonImage);

	JLabel diary = new JLabel(diaryLabel);
	JLabel imgBox = new JLabel(imgBoxLabel);
	JLabel textBoxPage3 = new JLabel();
	Engine engine = new Engine();
	Ending ending = new Ending();
	
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
		select1Btn.setForeground(Color.black);
		select1Btn.setHorizontalTextPosition(JButton.CENTER); // 이거랑
		select1Btn.setVerticalTextPosition(JButton.CENTER); // 이거 없으면 텍스트 안떠요
		select1Btn.setText(engine.select1Text());
		
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
		select2Btn.setHorizontalTextPosition(JButton.CENTER); // 이거랑
		select2Btn.setVerticalTextPosition(JButton.CENTER); // 이거 없으면 텍스트 안떠요
		select2Btn.setText(engine.select2Text());
		
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
		 textBoxPage3.setText(engine.eventScript()); // 텍스트 박스에 들어갈 내용
		 textBoxPage3.setFont(myFont1); // 텍스트 폰트 변경
		 
		 // 텍스트 위치 조정
		 textBoxPage3.setHorizontalTextPosition(JLabel.CENTER);
		 textBoxPage3.setVerticalTextPosition(JLabel.CENTER);
	 }
	
}
