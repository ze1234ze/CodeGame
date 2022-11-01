package CodeGame.SoundCheck;


import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class SoundLoader {

    public static File sound;
    public static File soundEnd;
    public static File soundStart;
    public static File soundWarning;

    public static float value;
    static Clip clip;

    public  SoundLoader() {

    }

    public static void load(){
        sound = new File("C:/Java/CodeProject/Resources/Sounds/b2.wav");
    }
    public static void loadEnd(){
        sound = new File("C:/Java/CodeProject/Resources/Sounds/end.wav");
    }
    public static void loadStart(){
        sound = new File("C:/Java/CodeProject/Resources/Sounds/startGame.wav");
    }
    public static void loadWarning(){
        sound = new File("C:/Java/CodeProject/Resources/Sounds/warning.wav");
    }

    public static void play(File sound) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        clip = AudioSystem.getClip();
        clip.open(AudioSystem.getAudioInputStream(sound));
        clip.start();
    }




}

