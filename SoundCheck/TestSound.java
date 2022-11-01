package CodeGame.SoundCheck;

    // Imports
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

    // TestSound Klasse (Hauptklasse)
    public class TestSound extends JFrame {

        // Variablen
        private JFrame f;
        private JButton sound;

        static boolean playSound = false;

        // Konstruktor TestSound
        public TestSound() {


            // Hier wird der Button erstellt
            sound = new JButton("Hier kommt ein Sound");
            sound.setBounds((500 - 200) / 2, (500 - 60) / 2, 200, 60);
            sound.addActionListener((ActionEvent e) -> {
                if(e.getSource() == sound) {
                    playSound = true;
                    System.out.println("Button wurde Gedrückt");
                }
            });
            sound.setVisible(true);
            // Hier hinzugefügt
            f.add(sound);
            //////////////////////////////////////////////////////////////
            f.setVisible(true);

        }


    }

