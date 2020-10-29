package textstatistics;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.util.Arrays;

public class TextStatisticsApplication extends Application {


    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        TextArea bodyText = new TextArea();


        HBox texts = new HBox();
        texts.setSpacing(10);
        Label numLetters = new Label("Letters: 0");
        Label numWords = new Label("Words: 0");
        Label longestWord = new Label("The longest word is: ");
        
        texts.getChildren().addAll(numLetters, numWords, longestWord);
        
        layout.setBottom(texts);

        layout.setCenter(new TextArea(""));

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
        
        bodyText.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .findFirst()
                .get();
            numLetters.setText("Letters: " + String.valueOf(characters));
            numWords.setText("Words: " + String.valueOf(words));
            longestWord.setText("The longest word is: " + longest);
        });
        
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
}
