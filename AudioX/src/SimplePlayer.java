
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Alexander Ferenets (Istamendil) <ist.kazan@gmail.com>
 */
public class SimplePlayer implements Player, LineListener {

    private Clip clip;
    private boolean status;
    private boolean musicEnded = true;
    private int pause;

    public boolean isMusicEnded() {
        return musicEnded;
    }
  

  @Override
  public void play(File file) {
    if(status){
        this.stop();
    }
    try {
        System.out.println(file);
        Line.Info linfo = new Line.Info(Clip.class);
        Line line = AudioSystem.getLine(linfo);
        clip = (Clip) line;
        clip.addLineListener(this);
        AudioInputStream ais = AudioSystem.getAudioInputStream(file);
        clip.open(ais);
        if(this.pause != 0){
          clip.setFramePosition(pause);
        }
        clip.start();
        this.pause = 0;
        status = true;
    } catch (LineUnavailableException ex) {
      throw new PlayerException(ex);
    } catch (UnsupportedAudioFileException ex) {
      throw new PlayerException(ex);
    } catch (IOException ex) {
      throw new PlayerException(ex);
    }
  }
  
  @Override
  public void play(){
      if(status){
          clip.stop();
      } 
      if(this.pause != 0){
          clip.setFramePosition(pause);
      }
      clip.setFramePosition(0); //begin music
      clip.start();
      status = true;
  }
  
  @Override
  public void pause(){
      if(status){
          this.pause = clip.getFramePosition();
          this.stop();
      }
      else System.out.println("Music already stoped");
  }
  

  @Override
  public void stop() {
    this.clip.stop();
    status = false;
  }

  @Override
  public void update(LineEvent le) {
    LineEvent.Type type = le.getType();
    if (type == LineEvent.Type.OPEN) {}
    else if (type == LineEvent.Type.CLOSE) {}
    else if (type == LineEvent.Type.START) {}
    else if (type == LineEvent.Type.STOP) {
        musicEnded = false;
        clip.close();
    }
  }

}
