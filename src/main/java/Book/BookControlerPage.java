package Book;

import MyAlert.MyAlert;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class BookControlerPage {

    @FXML
    private Button add_btn;

    @FXML
    private TextField author_name;

    @FXML
    private TableView<?> book_table;

    @FXML
    private TextField book_title;

    @FXML
    private ComboBox<String> category_select;

    @FXML
    private Button clear_btn;

    @FXML
    private TextField isbn_num;

    @FXML
    private DatePicker pub_year;

    @FXML
    private TextField qty;

    @FXML
    public void initialize() {
        category_select.getItems().addAll("Select","Admin", "User", "Manager");
        category_select.setValue("Select");
    }

    @FXML
    void AddNewBookOnAcction(ActionEvent event) {
        if(isbn_num.getText().isEmpty()){
            MyAlert.alertMy("Warning","Please Enter ISBN Number","WARNING");
        } else if (book_title.getText().isEmpty()) {
            MyAlert.alertMy("Warning","Please Enter Book Title","WARNING");
        } else if (author_name.getText().isEmpty()) {
            MyAlert.alertMy("Warning","Please Enter Author Name","WARNING");
        } else if (category_select.getValue().equals("Select")) {
            MyAlert.alertMy("Warning","Please Select Category","WARNING");
        } else if (pub_year.getValue() == null) {
            MyAlert.alertMy("Warning","Please Select Public Year","WARNING");
        } else if (qty.getText().isEmpty()) {
            MyAlert.alertMy("Warning","Please Enter Quantity","WARNING");
        } else {
            MyAlert.alertMy("Success","New to add Book Successful.","INFORMATION");
        }
    }

    @FXML
    void ClearOnAction(ActionEvent event) {
        isbn_num.setText("");
        book_title.setText("");
        author_name.setText("");
        category_select.setValue("Select");
        pub_year.setValue(null);
        qty.setText("");
    }

}
