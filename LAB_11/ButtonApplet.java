import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonApplet extends Applet implements ActionListener {
    
    Button redButton, blueButton;
    Label messageLabel;
    
    public void init() {
        // Create two buttons and add them to the applet
        redButton = new Button("RED");
        blueButton = new Button("BLUE");
        add(redButton);
        add(blueButton);
        
        // Add action listeners to the buttons
        redButton.addActionListener(this);
        blueButton.addActionListener(this);
        
        // Create a label to display messages
        messageLabel = new Label();
        add(messageLabel);
    }
    
    public void actionPerformed(ActionEvent e) {
        // Determine which button was clicked and display a message
        if (e.getSource() == redButton) {
            messageLabel.setText("You have pressed RED");
        } else if (e.getSource() == blueButton) {
            messageLabel.setText("You have pressed BLUE");
        }
    }
    
}
