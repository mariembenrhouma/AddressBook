/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mariem
 */
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
public class AdressBookPane extends BorderPane{
        public TextField tfName = new TextField();
	public TextField tfStreet = new TextField(); 
	public TextField tfCity = new TextField(); 
	public TextField tfState = new TextField(); 
	public TextField tfZip = new TextField(); 
	public Button btAdd = new Button("Add");
	public Button btFirst = new Button("First");
	public Button btNext = new Button("Next");
	public Button btPrevious = new Button("Previous");
	public Button btLast = new Button("Last");
	public Button btUpdate = new Button("Update");
	public FlowPane paneForInfo = new FlowPane(5, 5);
	private HBox paneForButtons = new HBox(5);

	public AdressBookPane() {
		drawAddressBook();
	}

	private void drawAddressBook() {
		// Set the column size for each text field
		tfName.setPrefColumnCount(23);
		tfStreet.setPrefColumnCount(23);
		tfCity.setPrefColumnCount(8);
		tfState.setPrefColumnCount(2);
		tfZip.setPrefColumnCount(4);

		// Place nodes in the flow pane
		paneForInfo.setPadding(new Insets(10, 10, 3, 10));
		paneForInfo.getChildren().addAll(new Label("Name"), tfName, 
			new Label("Street"), tfStreet, new Label("City   "), tfCity,
			new Label("State"), tfState, new Label("Zip"), tfZip);

		// Place nodes in the hbox
		paneForButtons.getChildren().addAll(btAdd, btFirst, 
			btNext, btPrevious, btLast, btUpdate);
		paneForButtons.setAlignment(Pos.CENTER);

		// Place nodes in pane
		setCenter(paneForInfo);
		setBottom(paneForButtons);
	}
}
   
         
 
