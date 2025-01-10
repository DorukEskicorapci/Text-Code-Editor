import javax.swing.*;

public class codetrials {
    public static boolean createNote2;

    //it transfers the text to another box
    //could be used to take backups of notes
    public void transfer(JTextArea sourceBox, JTextArea targetBox,JButton Button, JFrame frame) {
        // String note = JOptionPane.showInputDialog("Enter your note: ");
        // JFrame frame = new JFrame("Note Transfer");
        // frame.setSize(400, 200);
        // frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        
        // JTextField sourceBox = new JTextField(20);
        // JTextField targetBox = new JTextField(20);
        JToggleButton confirm = new JToggleButton("Confirm", false);

        //targetBox.setEditable(true);

        targetBox.setText(sourceBox.getText());
        targetBox.setText(sourceBox.getText());
        sourceBox.setText("");

        
        // confirm.addActionListener(e -> {
        //     targetBox.setText(sourceBox.getText());
        //     sourceBox.setText("");
        //     confirm.setSelected(false);

        //     targetBox.setText(sourceBox.getText());
        //     sourceBox.setText("");
        // });

        // Button.addActionListener(e -> {
        //     targetBox.setText(sourceBox.getText());
        //     sourceBox.setText("");
        // });

        
        //return frame;
    }

    public void copy(JTextArea sourceBox, JTextArea targetBox,JButton Button, JFrame frame){
        targetBox.setText(sourceBox.getText());
    }

    public void photo(JFrame frame){
        // Add an image to the app
        JLabel imageLabel = new JLabel();
        ImageIcon icon = new ImageIcon("image.png"); // Replace with the path to your image
        imageLabel.setIcon(icon);
        frame.add(imageLabel);
    }


}
