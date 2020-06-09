package application;

import com.sun.prism.paint.Color;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
	
	private int i = 0;
	
    @FXML
    private Button zeroZero;

    @FXML
    private Button twoTwo;

    @FXML
    private Button twoZero;

    @FXML
    private Button oneZero;

    @FXML
    private Button oneTwo;

    @FXML
    private Button zeroOne;

    @FXML
    private Button zeroTwo;

    @FXML
    private Button twoOne;

    @FXML
    private Button oneOne;
    
    @FXML
    private Label label;
    
    Boolean[][] game = new Boolean[3][3];
    char[][] proof = new char[3][3];

    @FXML
    void zeroZero(ActionEvent event) {
    	game[0][0] = true;
    	if(i % 2 == 0) {
    		zeroZero.setStyle("-fx-text-fill: #FF6666");	//green
    		zeroZero.setText("X");
    		proof[0][0] = 'x';
    	}
    	else if(i % 2 != 0){
    		zeroZero.setStyle("-fx-text-fill: #85C977");	//red
    		zeroZero.setText("O");
    		proof[0][0] = 'o';
    	}
    	i++;
    	proof();
        
    }

    @FXML
    void twoZero(ActionEvent event) {
    	game[2][0] = true;
    	if(i % 2 == 0) {
    		twoZero.setStyle("-fx-text-fill: #FF6666");
    		twoZero.setText("X");
    		proof[2][0] = 'x';
    	}
    	else if(i % 2 != 0){
    		twoZero.setStyle("-fx-text-fill: #85C977");
    		twoZero.setText("O");
    		proof[2][0] = 'o';
    	}
    	i++;
    	proof();
    }

    @FXML
    void oneOne(ActionEvent event) {
    	game[1][1] = true;
    	if(i % 2 == 0) {
    		oneOne.setStyle("-fx-text-fill: #FF6666");
    		oneOne.setText("X");
    		proof[1][1] = 'x';
    	}
    	else if(i % 2 != 0) {
    		oneOne.setStyle("-fx-text-fill: #85C977");
    		oneOne.setText("O");
    		proof[1][1] = 'o';
    	}
    	i++;
    	proof();
    }

    @FXML
    void oneZero(ActionEvent event) {
    	game[1][0] = true;
    	if(i % 2 == 0) {
    		oneZero.setStyle("-fx-text-fill: #FF6666");
    		oneZero.setText("X");
    		proof[1][0] = 'x';
    	}
    	else if(i % 2 != 0) {
    		oneZero.setStyle("-fx-text-fill: #85C977");
    		oneZero.setText("O");
    		proof[1][0] = 'o';
    	}
    	i++;
    	proof();
    }

    @FXML
    void zeroOne(ActionEvent event) {
    	game[0][1] = true;
    	if(i % 2 == 0) {
    		zeroOne.setStyle("-fx-text-fill: #FF6666");
    		zeroOne.setText("X");
    		proof[0][1] = 'x';
    	}
    	else if(i % 2 != 0) {
    		zeroOne.setStyle("-fx-text-fill: #85C977");
    		zeroOne.setText("O");
    		proof[0][1] = 'o';
    	}
    	i++;
    	proof();
    }

    @FXML
    void twoOne(ActionEvent event) {
    	game[1][1] = true;
    	if(i % 2 == 0) {
    		twoOne.setStyle("-fx-text-fill: #FF6666");
    		twoOne.setText("X");
    		proof[2][1] = 'x';
    	}
    	else if(i % 2 != 0) {
    		twoOne.setStyle("-fx-text-fill: #85C977");
    		twoOne.setText("O");
    		proof[2][1] = 'o';
    	}
    	i++;
    	proof();
    }

    @FXML
    void zeroTwo(ActionEvent event) {
    	game[0][2] = true;
    	if(i % 2 == 0) {
    		zeroTwo.setStyle("-fx-text-fill: #FF6666");
    		zeroTwo.setText("X");
    		proof[0][2] = 'x';
    	}
    	else if(i % 2 != 0){
    		zeroTwo.setStyle("-fx-text-fill: #85C977");
    		zeroTwo.setText("O");
    		proof[0][2] = 'o';
    	}
    	i++;
    	proof();
    }

    @FXML
    void twoTwo(ActionEvent event) {
    	game[2][2] = true;
    	if(i % 2 == 0) {
    		twoTwo.setStyle("-fx-text-fill: #FF6666");
    		twoTwo.setText("X");
    		proof[2][2] = 'x';
    	}
    	else if(i % 2 != 0){
    		twoTwo.setStyle("-fx-text-fill: #85C977");
    		twoTwo.setText("O");
    		proof[2][2] = 'o';
    	}
    	i++;
    	proof();
    }

    @FXML
    void oneTwo(ActionEvent event) {
    	game[1][2] = true;
    	if(i % 2 == 0) {
    		oneTwo.setStyle("-fx-text-fill: #FF6666");
    		oneTwo.setText("X");
    		proof[1][2] = 'x';
    	}
    	else if(i % 2 != 0){
    		oneTwo.setStyle("-fx-text-fill: #85C977");
    		oneTwo.setText("O");
    		proof[1][2] = 'o';
    	}
    	i++;
    	proof();
    }
    
    public void proof() {
    	//Case x wins
    	if(proof[0][0] == 'x' && proof[1][0] == 'x' && proof[2][0] == 'x') {
    		zeroZero.setStyle("-fx-background-color: #FF6666");
    		oneZero.setStyle("-fx-background-color: #FF6666");
    		twoZero.setStyle("-fx-background-color: #FF6666");
    		label.setStyle("-fx-text-fill: #FF6666");
    		label.setText("X wins");
    	}
    	if(proof[0][0] == 'x' && proof[0][1] == 'x' && proof[0][2] == 'x') {
    		zeroZero.setStyle("-fx-background-color: #FF6666");
    		zeroOne.setStyle("-fx-background-color: #FF6666");
    		zeroTwo.setStyle("-fx-background-color: #FF6666");
    		label.setAlignment(Pos.CENTER);
    		label.setStyle("-fx-text-fill: #FF6666");
    		label.setText("X wins");
    	}
    	if(proof[2][0] == 'x' && proof[2][1] == 'x' && proof[2][2] == 'x') {
    		twoZero.setStyle("-fx-background-color: #FF6666");
    		twoOne.setStyle("-fx-background-color: #FF6666");
    		twoTwo.setStyle("-fx-background-color: #FF6666");
    		label.setAlignment(Pos.CENTER);
    		label.setStyle("-fx-text-fill: #FF6666");
    		label.setText("X wins");
    	}
    	if(proof[1][0] == 'x' && proof[1][1] == 'x' && proof[1][2] == 'x') {
    		oneZero.setStyle("-fx-background-color: #FF6666");
    		oneOne.setStyle("-fx-background-color: #FF6666");
    		oneTwo.setStyle("-fx-background-color: #FF6666");
    		label.setAlignment(Pos.CENTER);
    		label.setStyle("-fx-text-fill: #FF6666");
    		label.setText("X wins");
    	}
    	if(proof[1][0] == 'x' && proof[1][1] == 'x' && proof[1][2] == 'x') {
    		oneZero.setStyle("-fx-background-color: #FF6666");
    		oneOne.setStyle("-fx-background-color: #FF6666");
    		oneTwo.setStyle("-fx-background-color: #FF6666");
    		label.setAlignment(Pos.CENTER);
    		label.setStyle("-fx-text-fill: #FF6666");
    		label.setText("X wins");
    	}
    	if(proof[0][1] == 'x' && proof[1][1] == 'x' && proof[2][1] == 'x') {
    		zeroOne.setStyle("-fx-background-color: #FF6666");
    		oneOne.setStyle("-fx-background-color: #FF6666");
    		twoOne.setStyle("-fx-background-color: #FF6666");
    		label.setAlignment(Pos.CENTER);
    		label.setStyle("-fx-text-fill: #FF6666");
    		label.setText("X wins");
    	}
    	if(proof[0][0] == 'x' && proof[1][1] == 'x' && proof[2][2] == 'x') {
    		zeroZero.setStyle("-fx-background-color: #FF6666");
    		oneOne.setStyle("-fx-background-color: #FF6666");
    		twoTwo.setStyle("-fx-background-color: #FF6666");
    		label.setAlignment(Pos.CENTER);
    		label.setStyle("-fx-text-fill: #FF6666");
    		label.setText("X wins");
    	}
    	if(proof[2][0] == 'x' && proof[1][1] == 'x' && proof[0][2] == 'x') {
    		twoZero.setStyle("-fx-background-color: #FF6666");
    		oneOne.setStyle("-fx-background-color: #FF6666");
    		zeroTwo.setStyle("-fx-background-color: #FF6666");
    		label.setAlignment(Pos.CENTER);
    		label.setStyle("-fx-text-fill: #FF6666");
    		label.setText("X wins");
    	}
    	if(proof[0][2] == 'x' && proof[1][2] == 'x' && proof[2][2] == 'x') {
        	zeroTwo.setStyle("-fx-background-color: #FF6666");
        	oneTwo.setStyle("-fx-background-color: #FF6666");
        	twoTwo.setStyle("-fx-background-color: #FF6666");
        	label.setAlignment(Pos.CENTER);
        	label.setStyle("-fx-text-fill: #FF6666");
        	label.setText("X wins");
    	}
    	//Case O wins
    	if((proof[0][0] == 'o' && proof[1][0] == 'o' && proof[2][0] == 'o')) {
    		zeroZero.setStyle("-fx-background-color: #85C977");
    		oneZero.setStyle("-fx-background-color: #85C977");
    		twoZero.setStyle("-fx-background-color: #85C977");
    		label.setAlignment(Pos.CENTER);
    		label.setStyle("-fx-text-fill: #85C977");
    		label.setText("O wins");
    	}
    	if(proof[0][0] == 'o' && proof[0][1] == 'o' && proof[0][2] == 'o') {
    		zeroZero.setStyle("-fx-background-color: #85C977");
    		zeroOne.setStyle("-fx-background-color: #85C977");
    		zeroTwo.setStyle("-fx-background-color: #85C977");
    		label.setAlignment(Pos.CENTER);
    		label.setStyle("-fx-text-fill: #85C977");
    		label.setText("O wins");
    	}
    	if(proof[2][0] == 'o' && proof[2][1] == 'o' && proof[2][2] == 'o') {
    		twoZero.setStyle("-fx-background-color: #85C977");
    		twoOne.setStyle("-fx-background-color: #85C977");
    		twoTwo.setStyle("-fx-background-color: #85C977");
    		label.setAlignment(Pos.CENTER);
    		label.setStyle("-fx-text-fill: #85C977");
    		label.setText("O wins");
    	}
    	if(proof[0][2] == 'o' && proof[1][2] == 'o' && proof[2][2] == 'o') {
    		zeroTwo.setStyle("-fx-background-color: #85C977");
    		oneTwo.setStyle("-fx-background-color: #85C977");
    		twoTwo.setStyle("-fx-background-color: #85C977");
    		label.setAlignment(Pos.CENTER);
    		label.setStyle("-fx-text-fill: #85C977");
    		label.setText("O wins");
    	}
    	if(proof[1][0] == 'o' && proof[1][1] == 'o' && proof[1][2] == 'o') {
    		oneZero.setStyle("-fx-background-color: #85C977");
    		oneOne.setStyle("-fx-background-color: #85C977");
    		oneTwo.setStyle("-fx-background-color: #85C977");
    		label.setAlignment(Pos.CENTER);
    		label.setStyle("-fx-text-fill: #85C977");
    		label.setText("O wins");
    	}
    	if(proof[0][1] == 'o' && proof[1][1] == 'o' && proof[2][1] == 'o') {
    		zeroOne.setStyle("-fx-background-color: #85C977");
    		oneOne.setStyle("-fx-background-color: #85C977");
    		twoOne.setStyle("-fx-background-color: #85C977");
    		label.setAlignment(Pos.CENTER);
    		label.setStyle("-fx-text-fill: #85C977");
    		label.setText("O wins");
    	}
    	if (proof[0][0] == 'o' && proof[1][1] == 'o' && proof[2][2] == 'o') {
    		zeroZero.setStyle("-fx-background-color: #85C977");
    		oneOne.setStyle("-fx-background-color: #85C977");
    		twoTwo.setStyle("-fx-background-color: #85C977");
    		label.setAlignment(Pos.CENTER);
    		label.setStyle("-fx-text-fill: #85C977");
    		label.setText("O wins");
    	}  
    	if(proof[2][0] == 'o' && proof[1][1] == 'o' && proof[0][2] == 'o') {
    		twoZero.setStyle("-fx-background-color: #85C977");
    		oneOne.setStyle("-fx-background-color: #85C977");
    		zeroTwo.setStyle("-fx-background-color: #85C977");
    		label.setAlignment(Pos.CENTER);
    		label.setStyle("-fx-text-fill: #85C977");
    		label.setText("O wins");
    	}
    	if(proof[0][2] == 'x' && proof[1][2] == 'x' && proof[2][2] == 'x') {
        	zeroTwo.setStyle("-fx-background-color: #85C977");
        	oneTwo.setStyle("-fx-background-color: #85C977");
        	twoTwo.setStyle("-fx-background-color: #85C977");
        	label.setAlignment(Pos.CENTER);
        	label.setStyle("-fx-text-fill: #85C977");
        	label.setText("X wins");
    	}
    }
}
