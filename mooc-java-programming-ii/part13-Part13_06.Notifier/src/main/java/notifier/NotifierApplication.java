package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {


    @Override
    public void start(Stage window) {
        TextField topText = new TextField();
        Label output = new Label();
        Button button = new Button("Update");
        
        button.setOnAction((event) -> {
        output.setText(topText.getText());
        });

        VBox componentGroup = new VBox();
        componentGroup.setSpacing(20);
        componentGroup.getChildren().addAll(topText, button, output);

        Scene viewport = new Scene(componentGroup);

        window.setScene(viewport);
        window.show();
    }
    
        public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
