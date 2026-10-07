package Issuese;

import MyAlert.MyAlert;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class IssueseControlerPage {

    @FXML
    private DatePicker due_date;

    @FXML
    private TableView<?> issuse_book_table;

    @FXML
    private Button issuse_btn;

    @FXML
    private DatePicker issuse_date;

    @FXML
    private TextField search_text;

    @FXML
    private ComboBox<String> select_book;

    @FXML
    private ComboBox<String> select_member;

    @FXML
    public void initialize() {
        select_book.getItems().addAll("Select","Admin", "User", "Manager");
        select_book.setValue("Select");

        select_member.getItems().addAll("Select","Admin", "User", "Manager");
        select_member.setValue("Select");
    }

    public void clear(){
        select_member.setValue("Select");
        select_book.setValue("Select");
        issuse_date.setValue(null);
        due_date.setValue(null);
        search_text.setText("");
    }

    @FXML
    void IssuseOnActionBtn(ActionEvent event) {
        if(select_member.getValue().equals("Select")){
            MyAlert.alertMy("Warning","Please Select Member","WARNING");
        } else if (select_book.getValue().equals("Select")) {
            MyAlert.alertMy("Warning","Please Select Book","WARNING");
        } else if (issuse_date.getValue() == null) {
            MyAlert.alertMy("Warning","Please Select Issue Date","WARNING");
        } else if (due_date.getValue() == null) {
            MyAlert.alertMy("Warning","Please Select Due Date","WARNING");
        }else {
            MyAlert.alertMy("Success","New to add Book Issuse Successful.","INFORMATION");
            clear();
        }
    }

}

