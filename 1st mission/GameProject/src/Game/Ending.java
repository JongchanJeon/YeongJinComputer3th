package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ending {
	
	private ImageIcon diaryLabel = new ImageIcon(Main.class.getResource("../images/diaryImgTest.png"));
	private ImageIcon nextButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/nextButtonEntered.png"));
	private ImageIcon nextButtonImage= new ImageIcon(Main.class.getResource("../images/nextButton.png"));
	private Image realEndingBg = new ImageIcon(Main.class.getResource("../images/page3Bg.png")).getImage();
	private Image creatorLogo = new ImageIcon(Main.class.getResource("../images/page3Bg.png")).getImage();
	JLabel endingdiary = new JLabel(diaryLabel);
	JLabel nextText = new JLabel();
	JLabel endingTextBox = new JLabel();
	JButton nextBtnEnding = new JButton(nextButtonImage);
	
	Font myFont1 = new Font("나눔손글씨 강부장님체", Font.BOLD, 25);
	
	Ending(){
		EndingBtn();
		EndingDiary();
		EndingTextBox();
	}
	
	public void EndingDiary() {
		endingdiary.setVisible(true);
		endingdiary.setBounds(335,70,600,500);
	}
	
	public void EndingTextBox() {
		 endingTextBox.setVisible(true);
		 endingTextBox.setBounds(365,70,550,500);
		 endingTextBox.setFont(myFont1); // 텍스트 폰트 변경
	 }
	
	public void EndingBtn() {
		Creator creator = new Creator();
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
	        	 endingdiary.setVisible(false);
	        	 endingTextBox.setVisible(false);
	        	 nextText.setVisible(false);
	        	 Game.mainPanel.pageBackground = realEndingBg;  	 
	        	 Game.mainPanel.add(creator.creatorText);
	        	 Game.mainPanel.add(creator.creatorTextBox);
	        	 Game.mainPanel.pageBackground = creatorLogo;
	         }
	      });
		
		
		 nextText.setBounds(950,560,600,100);
		 nextText.setFont(myFont1);
		 nextText.setText("다음 버튼을 눌러주세요");
		 nextText.setHorizontalTextPosition(JLabel.CENTER);
		 nextText.setVerticalTextPosition(JLabel.CENTER);
		
	}
	
	public static String clearText = "<html>오늘은 구조된 지 1년째 되는 날이다.<br>\r\n"
			+ "오랜만에 일기를 다시 읽어보기 감회가 새롭다<br>\r\n"
			+ "이미 다 아는 내용이지만 읽다 보니 힘들었던 장면이 자꾸 떠올라 읽기가 힘들었다<br>\r\n"
			+ "내가 저런 상황에서 어떻게 저렇게 덤덤하게 버틴 건지 신기할 따름이다.<br>\r\n"
			+ "<br>\r\n"
			+ "예상보다 좀비의 수는 많지 않았고 나와 세상은 일상으로 거의 돌아왔다.<br>\r\n"
			+ "여전히 간혹 좀비가 발견된다는 소문은 있지만 그냥 헛소문인 것 같다<br>\r\n"
			+ "일상으로 돌아오지 않은 사람도 있다.<br>\r\n"
			+ "아쉽게도 좀비로 변한지 시간이 지난 사람은 돌릴 수 없다고 한다<br>\r\n"
			+ "사람들에겐 여전히 회색빛이 남아있었고 영영 돌아오지 않을 것 같다.<br></html>";
	
	public static String gameOverText =  "<html>다친 상처가 계속 부어오른다.<br>\r\n"
			+ "너무 춥고 아프다. 머리까지 아프다.<br>\r\n"
			+ "그래도 좀비가 되는 것은 아니라는게 다행이다<br>\r\n"
			+ "내 마지막은 처절한 몸부림보다는 조용히 그리고 천천히 최후를 맞이하는 것으로 정했다<br>\r\n"
			+ "<br>\r\n"
			+ "일기를 쓸 힘이 없다.<br>\r\n"
			+ "이게 끝인가 보다<br><br></html>";
			
}
