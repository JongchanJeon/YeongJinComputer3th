package Game;

import java.io.File;
import javax.sound.sampled.*;
public class Sound {
	public static Clip clip;
	public Sound(String a) {
		if (a == "START") {	//시작 음악
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/START.wav"));
				clip = AudioSystem.getClip();
				clip.open(ais);
		
				// 소리조정
				FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		
				// 음량조정
				gainControl.setValue(-30.0f);
		
				clip.start();
		
		
			} catch(Exception e) {
				e.printStackTrace();
			}
		}else if (a == "VICTORY") { // 생존 성공 음악
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/Victory.wav"));
				clip = AudioSystem.getClip();
				clip.open(ais);
				
				// 소리조정
				FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
				
				// 음량조정
				gainControl.setValue(-30.0f);
				
				clip.start();
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}else if (a == "FAIL") { // 생존 실패 음악
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/FAIL.wav"));
				clip = AudioSystem.getClip();
				clip.open(ais);
				
				// 소리조정
				FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
				
				// 음량조정
				gainControl.setValue(-30.0f);
				
				clip.start();
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}else if (a == "ENDING") { // 엔딩 음악
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/ENDING.wav"));
				clip = AudioSystem.getClip();
				clip.open(ais);
				
				// 소리조정
				FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
				
				// 음량조정
				gainControl.setValue(-30.0f);
				
				clip.start();
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
	
}
}