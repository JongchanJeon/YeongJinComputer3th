package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ending {
	
	private ImageIcon diaryLabel = new ImageIcon(Main.class.getResource("../images/diaryImgTest.png"));
	private ImageIcon nextButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/nextButtonEntered.png"));
	private ImageIcon nextButtonImage= new ImageIcon(Main.class.getResource("../images/nextButton.png"));

	JLabel diary1 = new JLabel(diaryLabel);
	JLabel diary2 = new JLabel(diaryLabel);
	JLabel nextText = new JLabel();
	JButton nextBtnEnding = new JButton(nextButtonImage);
	
	Font myFont1 = new Font("Serif", Font.BOLD, 18);

	
	Ending(){
		EndingBtn();
		EndingDiary_GameOver();
		EndingDiary_Clear();
	}
	
	public void EndingDiary_GameOver() {
		diary1.setVisible(true);
		diary1.setBounds(335,70,600,500);
		diary1.setFont(myFont1);
		// diary.setText("성공 혹은 실패 일기 추가 예정");
		diary1.setHorizontalTextPosition(JLabel.CENTER);
		diary1.setVerticalTextPosition(JLabel.CENTER);
		/* 성공 혹은 실패 내용 추가 예정*/
		diary1.setText("<html>다친 상처가 계속 부어오른다. 너무 춥고 아프다. 머리까지 아프다<br>\r\n"
					+ "내 마지막은 처절한 몸부림보다는 조용히 그리고 천천히 최후를 맞이하는 것으로 정했다<br>\r\n"
					+ "일기를 쓸 힘이 없다. 이게 끝인가 보다<br></html>");
	}
	
	public void EndingDiary_Clear() {
		diary2.setVisible(true);
		diary2.setBounds(335,70,600,500);
		diary2.setFont(myFont1);
		// diary.setText("성공 혹은 실패 일기 추가 예정");
		diary2.setHorizontalTextPosition(JLabel.CENTER);
		diary2.setVerticalTextPosition(JLabel.CENTER);
		/* 성공 혹은 실패 내용 추가 예정*/
		diary2.setText("<html>오늘은 구조된 지 1년째 되는 날이다. 오랜만에 일기를 다시 읽어보기 감회가 새롭다<br>\r\n"
					+ "이미 다 아는 내용이지만 읽다 보니 힘들었던 장면이 자꾸 떠올라 읽기가 힘들었다<br>\r\n"
					+ "내가 저런 상황에서 어떻게 저렇게 덤덤하게 버틴 건지 신기할 따름이다.<br>\r\n"
					+ "<br>\r\n"
					+ "예상보다 좀비의 수는 많지 않았고 나와 세상은 일상으로 거의 돌아왔다. 여전히 간혹 좀비가 발견된다는 소문은 있지만 그냥 헛소문인 것 같다<br>\r\n"
					+ "일상으로 돌아오지 않은 사람도 있다. 아쉽게도 좀비로 변한지 시간이 지난 사람은 돌릴 수 없다고 한다<br>\r\n"
					+ "사람들에겐 여전히 회색빛이 남아있었고 영영 돌아오지 않을 것 같다.<br></html>");
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
	        	 diary1.setVisible(false);
	        	 diary2.setVisible(false);
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
