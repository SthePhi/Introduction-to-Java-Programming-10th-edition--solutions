import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

public class Prog2 extends Application
{
	Image x = new Image("1.gif");
	Image o = new Image("2.gif");

	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage)
	{
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(5, 5, 5, 5));
		pane.setAlignment(Pos.CENTER);
		pane.setVgap(5);
		pane.setHgap(5);

		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				ImageView imageView = new ImageView(randomImage());
				imageView.setFitHeight(200);
				imageView.setFitWidth(200);
				pane.add(imageView, j, i);
			}
		}

		Scene scene = new Scene(pane, 620, 620);
		primaryStage.setTitle("Tic-tac-toe");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private Image randomImage()
	{
		int random = (int)(Math.random() * 3);
		switch (random)
		{
			case 0:
				return x;
			case 1:
				return o;
			default:
				return null;
		}

	}
}
