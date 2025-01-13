import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyledDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.Element;


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

    public void copy(JTextPane source, JTextPane target) {
        //target.setText(source.getText());
        target.setDocument(source.getDocument());
    }

    public void copy_styledtext (JTextPane source, JTextPane target) {
        try {
            StyledDocument sourceDoc = (StyledDocument) source.getDocument();
            DefaultStyledDocument targetDoc = new DefaultStyledDocument();
    
            
            String text = sourceDoc.getText(0, sourceDoc.getLength());
            targetDoc.insertString(0, text, null);
    
            int offset = 0;
            while (offset < sourceDoc.getLength()) {
                Element element = sourceDoc.getCharacterElement(offset);
                int start = element.getStartOffset();
                int end = element.getEndOffset();
                AttributeSet as = element.getAttributes();
    
                targetDoc.setCharacterAttributes(start, end - start, as, false);
    
                offset = end;
            }
    
            target.setDocument(targetDoc);
    
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
    }
    public void photo(JFrame frame){
        // Add an image to the app
        JLabel imageLabel = new JLabel();
        ImageIcon icon = new ImageIcon("image.png"); // Replace with the path to your image
        imageLabel.setIcon(icon);
        frame.add(imageLabel);
    }

    

}
