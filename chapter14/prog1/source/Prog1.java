import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class Prog1 extends Application
{	
	@Override
	public void start(Stage primaryStage)
	{
		GridPane pane = new GridPane();
		ImageView v1 = new ImageView(new Image("images/a.jpg"));
		ImageView v2 = new ImageView(new Image("images/b.jpg"));
		ImageView v3 = new ImageView(new Image("images/c.jpg"));
		ImageView v4 = new ImageView(new Image("images/d.jpg"));
		v1.setFitHeight(200);
		v1.setFitWidth(300);
		v2.setFitHeight(200);
		v2.setFitWidth(300);
		v3.setFitHeight(200);
		v3.setFitWidth(300);
		v4.setFitHeight(200);
		v4.setFitWidth(300);

		pane.add(v1, 0, 0);
		pane.add(v2, 1, 0);
		pane.add(v3, 0, 1);
		pane.add(v4, 1, 1);

		pane.setPadding(new Insets(5, 5, 5, 5));
		pane.setAlignment(Pos.CENTER);
		pane.setVgap(5);
		pane.setHgap(5);

		Scene scene = new Scene(pane, 615, 415);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Four");
		primaryStage.show();
	}
}
