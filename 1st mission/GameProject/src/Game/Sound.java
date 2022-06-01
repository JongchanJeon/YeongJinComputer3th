package Game;

import java.io.File;
import javax.sound.sampled.*;
public class Sound {
	public static Clip clip;
	public Sound(String a) {
		if (a == "START") {	//���� ����
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/Ragnarok Online 2 OST Intro Theme.wav"));
				clip = AudioSystem.getClip();
				clip.open(ais);
		
				// �Ҹ�����
				FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		
				// ��������
				gainControl.setValue(-0.0f);
				clip.loop(Clip.LOOP_CONTINUOUSLY);	// â�� ���� �� ���� �ݺ�
				clip.start();
		
		
			} catch(Exception e) {
				e.printStackTrace();
			}
		}else if (a == "GAMING") { // ���� ���� ����
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/Hands Be Still.wav"));
				clip = AudioSystem.getClip();
				clip.open(ais);
				
				// �Ҹ�����
				FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
				
				// ��������
				gainControl.setValue(-0.0f);
				clip.loop(Clip.LOOP_CONTINUOUSLY);	// â�� ���� �� ���� �ݺ�
				clip.start();
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if (a == "VICTORY") { // ���� ���� ����
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/Fragment.wav"));
				clip = AudioSystem.getClip();
				clip.open(ais);
				
				// �Ҹ�����
				FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
				
				// ��������
				gainControl.setValue(-0.0f);
				clip.loop(Clip.LOOP_CONTINUOUSLY);	// â�� ���� �� ���� �ݺ�
				clip.start();
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}else if (a == "FAIL") { // ���� ���� ����
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/Daylight.wav"));
				clip = AudioSystem.getClip();
				clip.open(ais);
				
				// �Ҹ�����
				FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
				
				// ��������
				gainControl.setValue(-0.0f);
				clip.loop(Clip.LOOP_CONTINUOUSLY);	// â�� ���� �� ���� �ݺ�
				clip.start();
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}else if (a == "ENDING") { // ���� ����
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/Staycation.wav"));
				clip = AudioSystem.getClip();
				clip.open(ais);
				
				// �Ҹ�����
				FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
				
				// ��������
				gainControl.setValue(-0.0f);
				clip.loop(Clip.LOOP_CONTINUOUSLY);	// â�� ���� �� ���� �ݺ�
				clip.start();
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
	
}
}