package com.mycompany.doctormanager.frontEnd;

//import com.mycompany.doctormanager.backEnd.printerAgent.Print;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
//import net.sf.jasperreports.engine.JRException;

public class MainController implements Initializable {

//    Print p = new Print();

    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        label.setText("Hello World!");
//        try {
//            p.PrintDebtte(0);
////        new Thread(new Runnable() {
////            @Override
////            public void run() {
////                try {
////                    p.PrintDebtte(5);
////                } catch (JRException ex) {
////                    Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
////                }
////            }
////        }).start();
//        } catch (JRException ex) {
//            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
