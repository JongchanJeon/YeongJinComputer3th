package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ending {
	private ImageIcon diaryLabel = new ImageIcon(Main.class.getResource("../images/diaryImgTest.png"));
	private ImageIcon nextButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/nextButtonEntered.png"));
	private ImageIcon nextButtonImage= new ImageIcon(Main.class.getResource("../images/nextButton.png"));

	JLabel diary = new JLabel(diaryLabel);
	JLabel nextText = new JLabel();
	JButton nextBtnEnding = new JButton(nextButtonImage);
	
	Font myFont1 = new Font("Serif", Font.BOLD, 18);

	
	Ending(){
		EndingBtn();
		EndingDiary();
	}
	
	public void EndingDiary() {
		diary.setVisible(true);
		diary.setBounds(335,70,600,500);
		diary.setFont(myFont1);
		diary.setText("성공 혹은 실패 일기 추가 예정");
		diary.setHorizontalTextPosition(JLabel.CENTER);
		diary.setVerticalTextPosition(JLabel.CENTER);
		/* 성공 혹은 실패 내용 추가 예정*/
	}
	
	public void EndingBtn() {
		nextBtnEnding.setVisible(true);
		nextBtnEnding.setBounds(1150,560,100,100);
		nextBtnEnding.setBorderPainted(false); 
		nextBtnEnding.setContentAreaFilled(false); 
		nextBtnEnding.setFocusPainted(false); 
	      
		nextBtnEnding.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseEntered(MouseEvent e) {
	        	 nextBtnEnding.setIcon(nextButtonEnteredImage);
	        	 nextBtnEnding.setCursor(new Cursor(Cursor.HAND_CURSOR));
	         }
	         @Override
	         public void mouseExited(MouseEvent e) {
	        	 nextBtnEnding.setIcon(nextButtonImage);
	        	 nextBtnEnding.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	         }
	         @Override
	         public void mousePressed(MouseEvent e) {
	        	 nextBtnEnding.setVisible(false);
	        	 diary.setVisible(false);
	        	 nextText.setVisible(false);
	        	 //Game.mainPanel.pageBackground = 다음 배경 이미지;
	         }
	      });
		
		
		 nextText.setBounds(950,560,600,100);
		 nextText.setFont(myFont1);
		 nextText.setText("다음 버튼을 눌러주세요");
		 nextText.setHorizontalTextPosition(JLabel.CENTER);
		 nextText.setVerticalTextPosition(JLabel.CENTER);
		
	}
}
