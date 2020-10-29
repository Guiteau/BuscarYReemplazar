package dad.javafx.buscarReemplazar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
	
	private Label label_buscar, label_reemplazarCon, label_mayusculasMinusculas, label_buscarAtras, label_expresionRegular, label_resaltarResultados;
	private TextField textField_upper, textField_bottom;
	private Button button_buscar, button_reemplazar, button_reemplazarTodo, button_cerrar, button_ayuda;
	private CheckBox checkBox_1, checkBox_2, checkBox_3, checkBox_4;

	@Override
	public void start(Stage primaryStage) throws Exception {

		label_buscar = new Label("Buscar:");
		label_reemplazarCon = new Label("Reemplazar con:");
		label_mayusculasMinusculas = new Label("Mayúsculas y minúsculas");
		label_mayusculasMinusculas.setPadding(new Insets(0, 0, 0, 20));
		label_expresionRegular = new Label("Expresión regular");
		label_expresionRegular.setPadding(new Insets(0, 0, 0, 20));
		label_buscarAtras = new Label("Buscar hacia atrás");
		label_buscarAtras.setPadding(new Insets(0, 0, 0, 20));
		label_resaltarResultados = new Label("Resaltar resultados");
		label_resaltarResultados.setPadding(new Insets(0, 0, 0, 20));
		
		textField_bottom = new TextField();
		textField_bottom.setPrefWidth(50);
		textField_upper = new TextField();
		textField_upper.setPrefWidth(50);
		
		checkBox_1 = new CheckBox();
		checkBox_2 = new CheckBox();
		checkBox_3 = new CheckBox();
		checkBox_4 = new CheckBox();
		
		button_buscar = new Button("Buscar");
		button_buscar.setMaxWidth(120);
		button_ayuda = new Button("Ayuda");
		button_ayuda.setMaxWidth(120);
		button_cerrar = new Button("Cerrar");
		button_cerrar.setMaxWidth(120);
		button_reemplazar = new Button("Reemplazar");
		button_reemplazar.setMaxWidth(120);
		button_reemplazarTodo = new Button("Reemplazar todo");
		button_reemplazarTodo.setMaxWidth(120);
		
		VBox vbox = new VBox(button_buscar, button_reemplazar, button_reemplazarTodo, button_cerrar, button_ayuda);
		vbox.setSpacing(5);
		
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(10, 0, 0, 0));
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		
		gridPane.add(checkBox_1, 0, 0);
		gridPane.add(label_mayusculasMinusculas, 0, 0);
		gridPane.add(checkBox_2, 1, 0);
		gridPane.add(label_expresionRegular, 1, 0);
		gridPane.add(checkBox_3, 0, 1);
		gridPane.add(label_buscarAtras, 0, 1);
		gridPane.add(checkBox_4, 1, 1);
		gridPane.add(label_resaltarResultados, 1, 1);
		gridPane.setAlignment(Pos.CENTER);
		
		gridPane.setGridLinesVisible(false);
		
		ColumnConstraints [] colsGrid = {
				new ColumnConstraints(),
				new ColumnConstraints(),
			};
		
		gridPane.getColumnConstraints().setAll(colsGrid);
		colsGrid[0].setHgrow(Priority.ALWAYS);
		colsGrid[1].setHgrow(Priority.ALWAYS);

				
		GridPane root = new GridPane();
		
		root.setPadding(new Insets(10));
		root.setHgap(5);
		root.setVgap(5);
		
		root.setGridLinesVisible(false);

		root.add(label_buscar, 0, 0);
		root.add(textField_upper, 1, 0);
		root.add(label_reemplazarCon, 0, 1);
		root.add(textField_bottom, 1, 1);
		root.add(gridPane, 1, 2);
		root.add(vbox, 2, 0);
		GridPane.setRowSpan(vbox, 5); //aquí se está estableciendo el tamaño de filas que cogerá el VBox
	
		ColumnConstraints [] cols = {
				new ColumnConstraints(),
				new ColumnConstraints()
			};
		
		root.getColumnConstraints().setAll(cols);
		
		cols [1].setHgrow(Priority.ALWAYS);
		cols [1].setFillWidth(true);
//		cols [1].setPercentWidth(50);
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {

		launch(args);
		
	}

}
