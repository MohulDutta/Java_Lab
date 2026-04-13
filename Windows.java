import java.awt.*;
import java.awt.event.*;

public class ControlDemo extends Frame implements ActionListener {
    
    Label displayLabel;
    TextField textField;
    Checkbox checkbox;
    Choice choice;
    List list;
    Button submitButton;

    public ControlDemo() {
        
        setLayout(new FlowLayout());
        setTitle("Java GUI Controls Demo");
        setSize(400, 450);

      
        add(new Label("Name:"));
        textField = new TextField(20);
        add(textField);

  
        checkbox = new Checkbox("Subscribe to Newsletter");
        add(checkbox);

        
        add(new Label("Select animal:"));
        choice = new Choice();
        choice.add("cat");
        choice.add("dog");
        choice.add("monkey");
        choice.add("donkey");
        add(choice);

        
        add(new Label("Select subject:"));
        list = new List(3, true);
        list.add("english");
        list.add("Math");
        list.add("Bio");
        list.add("chemistry");
        add(list);

      
        submitButton = new Button("Show Selection");
        submitButton.addActionListener(this);
        add(submitButton);

      
        displayLabel = new Label("Results will appear here...");
        add(displayLabel);

      
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

  
    public void actionPerformed(ActionEvent e) {
      
        String name = textField.getText();

  
        String subscribed = checkbox.getState() ? "Yes" : "No";

      
        String country = choice.getSelectedItem();

      
        String[] selectedItems = list.getSelectedItems();
        String interests = String.join(", ", selectedItems)
        String result = "User: " + name + " | Sub: " + subscribed + 
                        " | animal: " + animal + " | Likes: " + interests;

      
        displayLabel.setText(result);
    }

    public static void main(String[] args) {
        new ControlDemo();
    }
                                      }
