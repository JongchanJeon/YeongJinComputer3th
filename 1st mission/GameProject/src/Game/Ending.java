package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ending {
	
	private ImageIcon diaryLabel = new ImageIcon(Main.class.getResource("../images/diaryImgTest.png"));
	private ImageIcon nextButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/nextButtonEntered.png"));
	private ImageIcon nextButtonImage= new ImageIcon(Main.class.getResource("../images/nextButton.png"));
	private Image realEndingBg = new ImageIcon(Main.class.getResource("../images/page3Bg.png")).getImage();
<<<<<<< HEAD
<<<<<<< HEAD
=======
	private Image creatorLogo = new ImageIcon(Main.class.getResource("../images/page3Bg.png")).getImage();
>>>>>>> parent of 0fd5342 (ë§Œë“ ì´ í‹€ 80%)
=======
	private Image creatorLogo = new ImageIcon(Main.class.getResource("../images/page3Bg.png")).getImage();
>>>>>>> parent of 0fd5342 (ë§Œë“ ì´ í‹€ 80%)

	JLabel endingdiary = new JLabel(diaryLabel);
	JLabel nextText = new JLabel();
	JLabel endingTextBox = new JLabel();
	JButton nextBtnEnding = new JButton(nextButtonImage);
	
	Font myFont1 = new Font("³ª´®¼Õ±Û¾¾ °­ºÎÀå´ÔÃ¼", Font.BOLD, 25);
	
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
		 endingTextBox.setFont(myFont1); // ÅØ½ºÆ® ÆùÆ® º¯°æ
	 }
	
	public void EndingBtn() {
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> parent of 0fd5342 (ë§Œë“ ì´ í‹€ 80%)
		Creator creator = new Creator();
		
>>>>>>> parent of 0fd5342 (ë§Œë“ ì´ í‹€ 80%)
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
<<<<<<< HEAD
	        	 Game.mainPanel.pageBackground = realEndingBg;
=======
	        	 
	        	 Game.mainPanel.add(creator.creatorText);
	        	 Game.mainPanel.add(creator.creatorTextBox);

	        	 Game.mainPanel.pageBackground = creatorLogo;
>>>>>>> parent of 0fd5342 (ë§Œë“ ì´ í‹€ 80%)
	         }
	      });
		
		
		 nextText.setBounds(950,560,600,100);
		 nextText.setFont(myFont1);
		 nextText.setText("´ÙÀ½ ¹öÆ°À» ´­·¯ÁÖ¼¼¿ä");
		 nextText.setHorizontalTextPosition(JLabel.CENTER);
		 nextText.setVerticalTextPosition(JLabel.CENTER);
		
	}
	
	public static String clearText = "<html>¿À´ÃÀº ±¸Á¶µÈ Áö 1³âÂ° µÇ´Â ³¯ÀÌ´Ù.<br>\r\n"
			+ "¿À·£¸¸¿¡ ÀÏ±â¸¦ ´Ù½Ã ÀĞ¾îº¸±â °¨È¸°¡ »õ·Ó´Ù<br>\r\n"
			+ "ÀÌ¹Ì ´Ù ¾Æ´Â ³»¿ëÀÌÁö¸¸ ÀĞ´Ù º¸´Ï Èûµé¾ú´ø Àå¸éÀÌ ÀÚ²Ù ¶°¿Ã¶ó ÀĞ±â°¡ Èûµé¾ú´Ù<br>\r\n"
			+ "³»°¡ Àú·± »óÈ²¿¡¼­ ¾î¶»°Ô Àú·¸°Ô ´ı´ıÇÏ°Ô ¹öÆ¾ °ÇÁö ½Å±âÇÒ µû¸§ÀÌ´Ù.<br>\r\n"
			+ "<br>\r\n"
			+ "¿¹»óº¸´Ù Á»ºñÀÇ ¼ö´Â ¸¹Áö ¾Ê¾Ò°í ³ª¿Í ¼¼»óÀº ÀÏ»óÀ¸·Î °ÅÀÇ µ¹¾Æ¿Ô´Ù.<br>\r\n"
			+ "¿©ÀüÈ÷ °£È¤ Á»ºñ°¡ ¹ß°ßµÈ´Ù´Â ¼Ò¹®Àº ÀÖÁö¸¸ ±×³É Çê¼Ò¹®ÀÎ °Í °°´Ù<br>\r\n"
			+ "ÀÏ»óÀ¸·Î µ¹¾Æ¿ÀÁö ¾ÊÀº »ç¶÷µµ ÀÖ´Ù.<br>\r\n"
			+ "¾Æ½±°Ôµµ Á»ºñ·Î º¯ÇÑÁö ½Ã°£ÀÌ Áö³­ »ç¶÷Àº µ¹¸± ¼ö ¾ø´Ù°í ÇÑ´Ù<br>\r\n"
			+ "»ç¶÷µé¿¡°Õ ¿©ÀüÈ÷ È¸»öºûÀÌ ³²¾ÆÀÖ¾ú°í ¿µ¿µ µ¹¾Æ¿ÀÁö ¾ÊÀ» °Í °°´Ù.<br></html>";
	
	public static String gameOverText =  "<html>´ÙÄ£ »óÃ³°¡ °è¼Ó ºÎ¾î¿À¸¥´Ù.<br>\r\n"
			+ "³Ê¹« Ãä°í ¾ÆÇÁ´Ù. ¸Ó¸®±îÁö ¾ÆÇÁ´Ù.<br>\r\n"
			+ "±×·¡µµ Á»ºñ°¡ µÇ´Â °ÍÀº ¾Æ´Ï¶ó´Â°Ô ´ÙÇàÀÌ´Ù<br>\r\n"
			+ "³» ¸¶Áö¸·Àº Ã³ÀıÇÑ ¸öºÎ¸²º¸´Ù´Â Á¶¿ëÈ÷ ±×¸®°í ÃµÃµÈ÷ ÃÖÈÄ¸¦ ¸ÂÀÌÇÏ´Â °ÍÀ¸·Î Á¤Çß´Ù<br>\r\n"
			+ "<br>\r\n"
			+ "ÀÏ±â¸¦ ¾µ ÈûÀÌ ¾ø´Ù.<br>\r\n"
			+ "ÀÌ°Ô ³¡ÀÎ°¡ º¸´Ù<br><br></html>";
			
}
