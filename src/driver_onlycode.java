import javax.swing.*;
import java.util.Stack;


public class driver_onlycode {
    gui app = new gui();
    static int count_version = 1;
    static String version_temp = "";
    
    public void run() {
        String note = app.createNote();
        System.out.println(note);
    }

    //gui app = new gui();
    driver_onlycode d = new driver_onlycode();
    
    
    public static void main(String[] args) {


        codetrials ct = new codetrials();
        
        
        JFrame frame = new JFrame("Note Taking");

        frame.setSize(400, 200);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        
        
        JTextArea topTextArea = new JTextArea(2, 20);
        frame.add(topTextArea);       


        Box buttonBox = Box.createHorizontalBox();
        JButton Save_Button = new JButton("Save");
        
        JButton Edit_Button = new JButton("Edit text");

        buttonBox.add(Save_Button);
        buttonBox.add(Box.createHorizontalStrut(10)); // Spacer between the buttons
        buttonBox.add(Edit_Button);
        frame.add(buttonBox);
        
        // Enter key:
        //JToggleButton confirm = new JToggleButton("Confirm", false);

        //frame.add(sourceBox);

        JTextArea buttomTextArea = new JTextArea(4, 20);
        buttomTextArea.setText("try");
        buttomTextArea.setEditable(false);
        buttomTextArea.setEnabled(true);
        frame.add(buttomTextArea); 

        frame.add(Box.createVerticalStrut(20)); // Spacer between the text areas and indicates it is history
        JLabel Text_History_txt = new JLabel("Text History:");
        frame.add(Text_History_txt);
        

        JTextArea TextArea_History = new JTextArea(4, 20);
        TextArea_History.setText("");
        
        frame.add(TextArea_History); 

        
        Stack<String> history = new Stack<>();
        //static int count_version = 1;
        

        Save_Button.addActionListener(e -> {

            if (topTextArea.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame, "Note cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                
            } else {
                ct.transfer(topTextArea, buttomTextArea, Save_Button, frame);
            
            
                history.push("Version " + count_version + ": " + buttomTextArea.getText() + "\n");
                count_version++;
    
                while(!history.isEmpty()){
                    version_temp += history.pop();
                    //version_temp += "\\n";
                }
                TextArea_History.setText(version_temp);
            }
            

        });

        Edit_Button.addActionListener(e -> {
            ct.copy(buttomTextArea, topTextArea, Save_Button, frame);
        });

        
        



        
        

        //frame.add(targetBox);
        //frame.pack();

        //rules
        buttomTextArea.setEditable(false);
        TextArea_History.setEditable(false);
        TextArea_History.setEnabled(false);

        frame.setVisible(true);

    }

}   


/*
 * Scanner sc = new Scanner(System.in);
        String usernote1 = sc.next();

        System.out.println(gui.check_checklist(usernote1));


        
        //String deneme = gui.check_checklist(usernote1);
        //deneme = deneme;
        
        //check control 
        Boolean check = false; 
        //check = gui.check_checklist(usernote1);
        check = check;




        codetrials app2 = new codetrials();

        app2.transfer();

        driver d = new driver();
        d.run();
 */



/*
 * take input from user
 * check if it is a note OR checklist
 * if note, store in a notes table
 *    - if it has a '#' in front of it, it is a title
 *    - if it has a '*' in front of it, it is a bullet point
 *   
 * if checklist, store in a checklist table
 *      - it it has '+' or '-' in front of it, it is a checklist 
 * 
 * return pop up message saying it is saved
 * 
 * direct user to the next screen
 * list every note that person took
 *      - call the notes from the database
 */