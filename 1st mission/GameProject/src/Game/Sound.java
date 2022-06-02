package Game;

import java.io.File;
import javax.sound.sampled.*;
public class Sound {
	public static Clip clip;
	public Sound(String a) {
		if (a == "START") {	//시작 음악
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/Ragnarok Online 2 OST Intro Theme.wav"));
				clip = AudioSystem.getClip();
				clip.open(ais);
		
				// 소리조정
				FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		
				// 음량조정
				gainControl.setValue(-0.0f);
				clip.loop(Clip.LOOP_CONTINUOUSLY);	// 창을 닫을 때 까지 반복
				clip.start();
		
		
			} catch(Exception e) {
				e.printStackTrace();
			}
		}else if (a == "GAMING") { // 생존 성공 음악
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/Hands Be Still.wav"));
				clip = AudioSystem.getClip();
				clip.open(ais);
				
				// 소리조정
				FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
				
				// 음량조정
				gainControl.setValue(-0.0f);
				clip.loop(Clip.LOOP_CONTINUOUSLY);	// 창을 닫을 때 까지 반복
				clip.start();
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if (a == "VICTORY") { // 생존 성공 음악
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/Fragment.wav"));
				clip = AudioSystem.getClip();
				clip.open(ais);
				
				// 소리조정
				FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
				
				// 음량조정
				gainControl.setValue(-0.0f);
				clip.loop(Clip.LOOP_CONTINUOUSLY);	// 창을 닫을 때 까지 반복
				clip.start();
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}else if (a == "FAIL") { // 생존 실패 음악
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/Daylight.wav"));
				clip = AudioSystem.getClip();
				clip.open(ais);
				
				// 소리조정
				FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
				
				// 음량조정
				gainControl.setValue(-0.0f);
				clip.loop(Clip.LOOP_CONTINUOUSLY);	// 창을 닫을 때 까지 반복
				clip.start();
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}else if (a == "ENDING") { // 엔딩 음악
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/Staycation.wav"));
				clip = AudioSystem.getClip();
				clip.open(ais);
				
				// 소리조정
				FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
				
				// 음량조정
				gainControl.setValue(-0.0f);
				clip.loop(Clip.LOOP_CONTINUOUSLY);	// 창을 닫을 때 까지 반복
				clip.start();
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
	
}
}