package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ending {
	
	private ImageIcon diaryLabel = new ImageIcon(Main.class.getResource("../images/diaryImgTest.png"));
	private ImageIcon nextButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/nextButtonEntered.png"));
	private ImageIcon nextButtonImage= new ImageIcon(Main.class.getResource("../images/nextButton.png"));
	private Image realEndingBg = new ImageIcon(Main.class.getResource("../images/page3Bg.png")).getImage();

	JLabel endingdiary = new JLabel(diaryLabel);
	JLabel nextText = new JLabel();
	JLabel endingTextBox = new JLabel();
	JButton nextBtnEnding = new JButton(nextButtonImage);
	
	Font myFont1 = new Font("�����ձ۾� �������ü", Font.BOLD, 25);
	
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
		 endingTextBox.setBounds(365,70,550,450);
		 endingTextBox.setFont(myFont1); // �ؽ�Ʈ ��Ʈ ����
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
	        	 
	        	 Game.mainPanel.add(creator.text);
	        	 Game.mainPanel.add(creator.textbox);

	        	 Game.mainPanel.pageBackground = realEndingBg;
	         }
	      });
		
		
		 nextText.setBounds(950,560,600,100);
		 nextText.setFont(myFont1);
		 nextText.setText("���� ��ư�� �����ּ���");
		 nextText.setHorizontalTextPosition(JLabel.CENTER);
		 nextText.setVerticalTextPosition(JLabel.CENTER);
		
	}
	
	public static String clearText = "<html>������ ������ �� 1��° �Ǵ� ���̴�. �������� �ϱ⸦ �ٽ� �о�� ��ȸ�� ���Ӵ�<br>\r\n"
			+ "�̹� �� �ƴ� ���������� �д� ���� ������� ����� �ڲ� ���ö� �бⰡ �������<br>\r\n"
			+ "���� ���� ��Ȳ���� ��� ������ �����ϰ� ��ƾ ���� �ű��� �����̴�.<br>\r\n"
			+ "<br>\r\n"
			+ "���󺸴� ������ ���� ���� �ʾҰ� ���� ������ �ϻ����� ���� ���ƿԴ�. ������ ��Ȥ ���� �߰ߵȴٴ� �ҹ��� ������ �׳� ��ҹ��� �� ����<br>\r\n"
			+ "�ϻ����� ���ƿ��� ���� ����� �ִ�. �ƽ��Ե� ����� ������ �ð��� ���� ����� ���� �� ���ٰ� �Ѵ�<br>\r\n"
			+ "����鿡�� ������ ȸ������ �����־��� ���� ���ƿ��� ���� �� ����.<br></html>";
	
	public static String gameOverText =  "<html>��ģ ��ó�� ��� �ξ������. �ʹ� ��� ������. �Ӹ����� ������<br>\r\n"
			+ "�� �������� ó���� ���θ����ٴ� ������ �׸��� õõ�� ���ĸ� �����ϴ� ������ ���ߴ�<br>\r\n"
			+ "�ϱ⸦ �� ���� ����. �̰� ���ΰ� ����<br></html>";
			
}
