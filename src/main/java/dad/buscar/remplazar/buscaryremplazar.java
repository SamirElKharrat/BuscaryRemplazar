package dad.buscar.remplazar;



import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class buscaryremplazar extends Application {
	
	private Button buscarBt, reemplazarBt, reemplazartodoBt, cerrarBt, ayudaBt;
	private CheckBox mayuRb, atrasRb ,expresionRb, resaltarRb;
	private TextField buscarTf, reemplazarTf;

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		
	buscarBt = new Button("Buscar");
	buscarBt.setMaxSize(2000.0, 2000.0);
	reemplazarBt = new Button("Reemplazar");
	reemplazarBt.setMaxSize(2000.0, 2000.0);
	reemplazartodoBt = new Button("Reemplazar todo");
	reemplazartodoBt.setMaxSize(2000.0, 2000.0);
	cerrarBt = new Button("Cerrar");
	cerrarBt.setMaxSize(2000.0, 2000.0);
	ayudaBt = new Button("Ayuda");
	ayudaBt.setMaxSize(2000.0, 2000.0);

	
	buscarTf = new TextField();
	reemplazarTf = new TextField();
	
	mayuRb = new CheckBox();
	atrasRb = new CheckBox();
	expresionRb = new CheckBox();
	resaltarRb = new CheckBox();
	

	
	VBox botonesBox = new VBox();
	botonesBox.setAlignment(Pos.TOP_RIGHT);
	botonesBox.setSpacing(5);
	botonesBox.getChildren().addAll(buscarBt, reemplazarBt, reemplazartodoBt, cerrarBt, ayudaBt);

	
	GridPane centro = new GridPane();
	centro.addRow(0, new Label("Nombre: "),buscarTf);
	centro.addRow(1, new Label("Reemplazar con: "),reemplazarTf);

	
	ColumnConstraints [] cols = {
			new ColumnConstraints(),	
			new ColumnConstraints(),	
		};
	
	
	centro.getColumnConstraints().setAll(cols);
	cols[0].setHalignment(HPos.LEFT);

	cols[1].setHgrow(Priority.ALWAYS);
	cols[1].setFillWidth(true);
	
	GridPane Boxito = new GridPane();
	Boxito.setPadding(new Insets(5, 5, 0, 0));
	Boxito.setHgap(10);
	Boxito.setVgap(5);
	
	Boxito.addRow(0, mayuRb, new Label("Mayúsculas y minúsculas"),atrasRb, new Label("Buscar hacia atrás"));
	Boxito.addRow(1, expresionRb, new Label("Expresión regular"),resaltarRb, new Label("Resaltar resultados"));
	
	centro.add(Boxito, 1, 2);
	
	BorderPane cabecera = new BorderPane();
	cabecera.setCenter(centro);
	cabecera.setRight(botonesBox);


	



	Scene scene = new Scene(cabecera, 460, 280);
	
	primaryStage.setTitle("Buscar y Reemplazar");
	primaryStage.setScene(scene);
	primaryStage.show();
	
	
	}
	public static void main(String[] args) {
		launch(args);
	}
}
