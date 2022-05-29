package Game;

import java.io.File;
import javax.sound.sampled.*;
public class Sound {

	public Sound() {
		try {
		AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/Shapeofyou.wav"));
		Clip clip = AudioSystem.getClip();
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