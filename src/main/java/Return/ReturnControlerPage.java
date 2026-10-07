package Return;

import MyAlert.MyAlert;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ReturnControlerPage {

    @FXML
    private DatePicker borrowed_date;

    @FXML
    private DatePicker due_date;

    @FXML
    private TableView<?> memberInfo_table;

    @FXML
    private TableView<?> returnBookDetails_table;

    @FXML
    private Button returnBook_btn;

    @FXML
    private DatePicker return_date;

    @FXML
    private Button searchBtn;

    @FXML
    private TextField searchText;

    @FXML
    private ComboBox<String> selectBorrowed_book;

    @FXML
    public void initialize(){
        selectBorrowed_book.getItems().addAll("Select Borrowed Book","Book One","Book Two","Book Three");
        selectBorrowed_book.setValue("Select");
    }

    public void clear(){
        selectBorrowed_book.setValue("Select Borrowed Book");
        searchText.setText("");
        borrowed_date.setValue(null);
        due_date.setValue(null);
        return_date.setValue(null);
    }

    @FXML
    void ReturnOnActionBtn(ActionEvent event) {
        if(borrowed_date.getValue() == null){
            MyAlert.alertMy("Warning","Please Select Borrowed Date","WARNING");
        } else if (due_date.getValue() == null) {
            MyAlert.alertMy("Warning","Please Select Due Date","WARNING");
        } else if (return_date.getValue() == null) {
            MyAlert.alertMy("Warning","Please Select Return Date","WARNING");
        }else {
            MyAlert.alertMy("Success","New Add Return Book","INFORMATION");
            clear();
        }
    }

    @FXML
    void SearchOnActionBtn(ActionEvent event) {
        if(searchText.getText().isEmpty()){
            MyAlert.alertMy("Warning","Please Enter Search Text","WARNING");
        }else if(selectBorrowed_book.getValue().equals("Select Borrowed Book")){
            MyAlert.alertMy("Warning","Please Select Borrowed Book","WARNING");
        }else {
            clear();
        }
    }

}
