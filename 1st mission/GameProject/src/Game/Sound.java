package Game;

import java.io.File;
import javax.sound.sampled.*;
public class Sound {
	public static Clip clip;
	public Sound(String a) {
		if (a == "START") {	//���� ����
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/START.wav"));
				clip = AudioSystem.getClip();
				clip.open(ais);
		
				// �Ҹ�����
				FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		
				// ��������
				gainControl.setValue(-30.0f);
		
				clip.start();
		
		
			} catch(Exception e) {
				e.printStackTrace();
			}
		}else if (a == "VICTORY") { // ���� ���� ����
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/Victory.wav"));
				clip = AudioSystem.getClip();
				clip.open(ais);
				
				// �Ҹ�����
				FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
				
				// ��������
				gainControl.setValue(-30.0f);
				
				clip.start();
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}else if (a == "FAIL") { // ���� ���� ����
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/FAIL.wav"));
				clip = AudioSystem.getClip();
				clip.open(ais);
				
				// �Ҹ�����
				FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
				
				// ��������
				gainControl.setValue(-30.0f);
				
				clip.start();
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}else if (a == "ENDING") { // ���� ����
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/ENDING.wav"));
				clip = AudioSystem.getClip();
				clip.open(ais);
				
				// �Ҹ�����
				FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
				
				// ��������
				gainControl.setValue(-30.0f);
				
				clip.start();
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
	
}
}