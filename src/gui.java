import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

class gui{
    

    public String createNote() {

        String note = JOptionPane.showInputDialog("Enter your note: ");
        return note;


    }

    public String  notetaking() {
        return null;
    }

    public static Boolean check_title(String note){
        
        //check each line or only one in this function?

        //gets the first letter
        String first_char = null;
        first_char = note.substring(0,1);

        //checks the condition
        if (first_char == "*" && first_char == "#") {
            return true;
        }
        return false;
    }

    public static Boolean check_bulletpoint(String note){
        
        //check each line or only one in this function?

        //gets the first letter
        String first_char = null;
        first_char = note.substring(0,1);

        //checks the condition
        if (first_char == "*" && first_char == "#") {
            return true;
        }
        return false;
    }

    public static Boolean check_checklist(String note){
        
        //check each line or only one in this function?

        //gets the first letter
        String first_char = null;
        first_char = note.substring(0,1);

        //checks the condition
        if (first_char == "+" && first_char == "-") {
            return true;
        }
        return false;
    }


    private JTextPane jTextPane1;

    
    private void applyInitialStyles() {

        jTextPane1 = new JTextPane();
        // Retrieve the StyledDocument from jTextPane1
        StyledDocument doc = jTextPane1.getStyledDocument();

        // 1. Define a "title" style (larger, bold)
        Style titleStyle = jTextPane1.addStyle("titleStyle", null);
        StyleConstants.setFontSize(titleStyle, 20);
        StyleConstants.setBold(titleStyle, true);

        // 2. Define a "body" style (normal text)
        Style bodyStyle = jTextPane1.addStyle("bodyStyle", null);
        StyleConstants.setFontSize(bodyStyle, 14);
        StyleConstants.setBold(bodyStyle, false);

        // 3. Insert sample styled text
        try {
            doc.insertString(doc.getLength(), "This is a Title\n", titleStyle);
            doc.insertString(doc.getLength(), "Here is some body text.\n", bodyStyle);
            doc.insertString(doc.getLength(), "You can write more body text here.\n", bodyStyle);
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
    }
    

    

}