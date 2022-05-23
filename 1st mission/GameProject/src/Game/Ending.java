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
		// diary.setText("���� Ȥ�� ���� �ϱ� �߰� ����");
		diary1.setHorizontalTextPosition(JLabel.CENTER);
		diary1.setVerticalTextPosition(JLabel.CENTER);
		/* ���� Ȥ�� ���� ���� �߰� ����*/
		diary1.setText("<html>��ģ ��ó�� ��� �ξ������. �ʹ� ��� ������. �Ӹ����� ������<br>\r\n"
					+ "�� �������� ó���� ���θ����ٴ� ������ �׸��� õõ�� ���ĸ� �����ϴ� ������ ���ߴ�<br>\r\n"
					+ "�ϱ⸦ �� ���� ����. �̰� ���ΰ� ����<br></html>");
	}
	
	public void EndingDiary_Clear() {
		diary2.setVisible(true);
		diary2.setBounds(335,70,600,500);
		diary2.setFont(myFont1);
		// diary.setText("���� Ȥ�� ���� �ϱ� �߰� ����");
		diary2.setHorizontalTextPosition(JLabel.CENTER);
		diary2.setVerticalTextPosition(JLabel.CENTER);
		/* ���� Ȥ�� ���� ���� �߰� ����*/
		diary2.setText("<html>������ ������ �� 1��° �Ǵ� ���̴�. �������� �ϱ⸦ �ٽ� �о�� ��ȸ�� ���Ӵ�<br>\r\n"
					+ "�̹� �� �ƴ� ���������� �д� ���� ������� ����� �ڲ� ���ö� �бⰡ �������<br>\r\n"
					+ "���� ���� ��Ȳ���� ��� ������ �����ϰ� ��ƾ ���� �ű��� �����̴�.<br>\r\n"
					+ "<br>\r\n"
					+ "���󺸴� ������ ���� ���� �ʾҰ� ���� ������ �ϻ����� ���� ���ƿԴ�. ������ ��Ȥ ���� �߰ߵȴٴ� �ҹ��� ������ �׳� ��ҹ��� �� ����<br>\r\n"
					+ "�ϻ����� ���ƿ��� ���� ����� �ִ�. �ƽ��Ե� ����� ������ �ð��� ���� ����� ���� �� ���ٰ� �Ѵ�<br>\r\n"
					+ "����鿡�� ������ ȸ������ �����־��� ���� ���ƿ��� ���� �� ����.<br></html>");
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
	        	 //Game.mainPanel.pageBackground = ���� ��� �̹���;
	         }
	      });
		
		
		 nextText.setBounds(950,560,600,100);
		 nextText.setFont(myFont1);
		 nextText.setText("���� ��ư�� �����ּ���");
		 nextText.setHorizontalTextPosition(JLabel.CENTER);
		 nextText.setVerticalTextPosition(JLabel.CENTER);
		
	}
}
