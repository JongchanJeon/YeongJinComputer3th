package Game;

import java.io.File;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

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