package dad;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CambioDivisa extends Application{

    private ComboBox comboBox1,comboBox2;
    private TextField textField1,textField2;
    private Button button;
    
    @Override
    public void start(Stage primaryStage) throws Exception {

        comboBox1 = new ComboBox<>();
        comboBox2 = new ComboBox<>();

        textField1 = new TextField();
        textField2 = new TextField();

        button = new Button("Cambiar");

        GridPane rootPane = new GridPane();
        rootPane.setAlignment(Pos.CENTER);
        rootPane.setHgap(5);
        rootPane.setVgap(5);
        rootPane.addRow(0,textField1,comboBox1);
        rootPane.addRow(1,textField2,comboBox2);
        rootPane.addRow(2, button);

        Scene scene = new Scene(rootPane);

        primaryStage.setTitle("Cambio Divisa");
        primaryStage.setScene(scene);
        primaryStage.show();


        
    }

    public static void main(String[] args) {
        launch(args);
    }


}
