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
	 JLabel textBox = new JLabel(); // 이미지가 들어갈 껍데기
	 JLabel text = new JLabel(); // 실제 내용이 들어갈 곳
	 
	 Page2(){
		 page2Btn();
		 page2Text();
	 }
	 
	//다음 버튼
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
	 
	 // 텍스트박스
	 public void page2Text() {
		 Font myFont1 = new Font("나눔손글씨 강부장님체", Font.BOLD, 23);

		 textBox.setVisible(true);
		 textBox.setBounds(300,100,700,500);
		 textBox.setIcon(textBoxImage); // 텍스트 박스의 이미지
		 
		 text.setVisible(true);
		 text.setBounds(320, 100, 660, 520);
		 text.setFont(myFont1);
		// html처럼 사용해서 줄바꿈, 중앙정렬 가능
		 String prolog = "<html><body style='text-align:center;'>오늘 아침의 맑은 하늘."
		 	+ "<br>그리고 균형을 유지하듯 폭풍이 몰아치는 듯한 나의 배.<br>\r\n"
	 		+ "나는 학교에 도착하자마자 빠르게 뛰어 화장실로 달려갔다.<br>\r\n"
	 		+ "지금 생각해 보면 주변이 뭔가 많이 소란스러웠지만<br>"
	 		+ "그땐 눈에 보이는 게 없어서 몰랐지...<br>\r\n"
	 		+ "<br>"
	 		+ "화장실에서 나와서 본 광경은 마치 몰래카메라 같았다.<br>\r\n"
	 		+ "비명소리가 들려 쳐다보니 한 사람이 이상한 사람들에 둘러싸여 공격받고 있었다.<br>\r\n"
	 		+ "공격한 사람?들은 분명히 이성이 없었고 살아있는 것 같지 않았다.<br>\r\n"
	 		+ "생각할 틈도 없이 그들은 나를 향해 뛰어왔고<br>"
	 		+ "나는 필사적으로 뛰어 가장 가까운 강의실로 들어가 문을 닫았다.<br>\r\n"
	 		+ "다행인 것은 문이 철문이라 <s>그들이</s> 좀비들이 들어오지 못한다는 것이고<br>\r\n"
	 		+ "안 좋은 것은 통신이 먹통이라는 것이다.<br><br></body></html>";
		 text.setText(prolog);
		 text.setHorizontalTextPosition(JLabel.CENTER);
		 text.setVerticalTextPosition(JLabel.CENTER);
	 }
	 
}
