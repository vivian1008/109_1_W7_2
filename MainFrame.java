import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;

public class MainFrame extends Frame{
    private Label lab = new Label("mi:");
    private Button trf = new Button("=");
    private Label lab2 = new Label("km");
    private TextField tfd = new TextField(" ");
    private TextField tfd2 = new TextField(" ");
    private float n;

    public MainFrame(){
        init();
    }
    private void init(){
        this.setLayout(null);
        this.setLocation(100,50);
        this.setSize(400,300);

        trf.setBounds(110,120,50,25);
        lab.setBounds(10,120,50,25);
        tfd.setBounds(60,120,50,25);
        tfd2.setBounds(160,120,50,25);
        lab2.setBounds(200,120,50,25);

        this.add(trf);
        this.add(lab);
        this.add(lab2); 
        this.add(tfd); 
        this.add(tfd2); 

        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        trf.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                float n =Float.parseFloat(tfd.getText());
                tfd2.setText(Float.toString(n*1.6f));
            }
        });
}
}