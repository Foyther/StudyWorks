/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileFilter;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Nurislam
 */
public class AudioX {

    public static void main(String[] args) {
    new AudioX(new SimplePlayer(), new ConsoleUserInteractor());
  }

  private Path musicDir;
  private final SimplePlayer player;
  private final UserInteractor terminal;

  public AudioX(SimplePlayer player, UserInteractor interactor) {
    this.player = player;
    this.terminal = interactor;
    
    this.start();
  }

  public void start() {
    try {
      try{
        this.musicDir = Paths.get(".").toAbsolutePath().normalize();
        // Examine directory for readability
      }
      catch(InvalidPathException ex){
        this.terminal.print("Can't read directory");
        System.exit(1);
      }
        int i = 0;
        String command;
        File[] tracks = this.musicDir.toFile().listFiles(new MusicFileFilter());
        while ((command = this.terminal.readCommand()) != null) {
        if(i == tracks.length-1){
            i = 0;
        }
        switch (command) {
            case "play":
                if(tracks.length > 0){
                    this.terminal.print("Starting to play: " + tracks[i].getName());
                    this.player.play(tracks[i]);
                }
                break;
            case "stop":
                this.player.stop();
                break;
            case "pause":
                this.player.pause();
                break;
            case "next":
                i++;
                this.terminal.print("Starting to play: " + tracks[i].getName());
                this.player.play(tracks[i]);
                break;    
            default:
                this.terminal.print("Unkown command");
        }
      }
    } catch (UserInteractorReadException ex) {
      System.out.println("Can't read user input due error:");
      System.err.println(ex.getMessage());
      System.exit(1);
    } catch (UserInteractorWriteException ex) {
      System.out.println("Can't print data to user due error:");
      System.err.println(ex.getMessage());
      System.exit(1);
    } catch(Throwable ex){
      ex.printStackTrace();
    }
  }
  
  private static class MusicFileFilter implements FileFilter{

    @Override
    public boolean accept(File pathname) {
      String[] parts = pathname.getName().split("\\.");
      if(parts.length > 0){
        return parts[parts.length-1].equals("wav");
      }
      return false;
    }
    
  }
}
