import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Retos extends Application {

    private static final Font FONT = Font.font(18);

    private QuestionPane qPane = new QuestionPane();
    private SidePane sPane = new SidePane();

    private Parent createContent(){
        HBox root = new HBox(50);
        root.setPadding(new Insets(50,50,50,50));


        qPane.setQuestion(new Question("Cuanto es 2 * 2?","4","5","6","-1"));

        root.getChildren().addAll(qPane,sPane);

        return root;
    }

    private void nextQuestion(){
        qPane.setQuestion(new Question("Cuanto es 3 * 3","9","8","3","9"));
        qPane.setQuestion(new Question("Cuanto es 4 * 2","8","6","9","87"));
        qPane.setQuestion(new Question("Cuanto es 5 * 6","30","23","8","78"));
        qPane.setQuestion(new Question("Cuanto es 6 * 4","20","34","7","95"));
        qPane.setQuestion(new Question("Cuanto es 7 * 7","49","54","43","96"));
        qPane.setQuestion(new Question("Cuanto es 8 * 9","72","23","23","95"));
        qPane.setQuestion(new Question("Cuanto es 9 * 2","18","87","43","94"));
        qPane.setQuestion(new Question("Cuanto es 10 * 7","70","32","23","93"));
        qPane.setQuestion(new Question("Cuanto es 7 * 6","42","24","34","23"));
        qPane.setQuestion(new Question("Cuanto es 8 * 5","45","76","35","42"));

        sPane.selectNext();
    }

    private class SidePane extends VBox {
        private int current = 1;
        public SidePane(){

            super(10);
            for (int i = 15; i > 0 ; i -- ){
                Text text = new Text("Pregunta " + i);
                text.setFill(i == current ? Color.BLACK: Color.GRAY);//un if statement para especificar el color de la pregunta en donde estamos

                getChildren().add(text);
            }

        }

        public void selectNext(){
            if (current == 15){
                return;
            }
            Text  text =  (Text) getChildren().get(15 - current);
            text.setFill(Color.GRAY);
            current ++;
            text =  (Text) getChildren().get(15 - current);
            text.setFill(Color.BLACK);
        }
    }

    private class QuestionPane extends VBox{
        private Text text = new Text();
        private List<Button> buttons = new ArrayList<>();
        private Question current;
        public QuestionPane(){
            super(20);
            text.setFont(FONT);

            HBox hbox = new HBox();

            for (int i = 0; i < 4; i++){
                Button btn = new Button();
                btn.setFont(FONT);
                btn.setPrefHeight(80);
                buttons.add(btn);
                hbox.getChildren().add(btn);
                btn.setOnAction(event -> {
                    if (btn.getText().equals(current.getCorrectAnswer())){
                        nextQuestion();
                    }
                    else {
                        System.out.println("Incorrecto!");
                    }
                });
            }

            setAlignment(Pos.TOP_CENTER);

            getChildren().addAll(text, hbox);
        }

        public void setQuestion(Question question){
            current = question;
            text.setText(question.name);

            Collections.shuffle(buttons);
            for (int i=0; i<4; i++){ //aca estamos reordenando los botones
                buttons.get(i).setText(question.answers.get(i));
            }


        }
    }

    private class Question {

        private String name;
        private List<String> answers;

        public Question(String name, String... answers){
            this.name = name;
            this.answers = Arrays.asList(answers);
        }

        public String getCorrectAnswer(){
            return answers.get(0);
        }

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();


        /*
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);
        stage.setTitle("Retos Math");
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Para salir presiona q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.setScene(scene);
        stage.show();*/

    }
    public static void main(String[] args) { launch(args);}
}