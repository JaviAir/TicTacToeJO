package com.example.jeanieorejarena.tictactoejo; //name space

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.TextView;
import android.widget.Toast;
//libraries

public class TwoPlayerMode extends AppCompatActivity implements View.OnClickListener {

    int chance = 0;
    String winningPlayer = "";
    int player_O_score = 0;
    int player_X_score = 0;
    int spaces_taken = 0;
    boolean isVictor = false;

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    TextView ScoreBoardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);

        ScoreBoardView=(TextView)findViewById(R.id.ScoreBoardView);

        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);

        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);

        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn1:
                if (btn1.getText().toString().equals("")){
                    spaces_taken++;
                    if (chance == 0){
                        chance = 1;
                        btn1.setText("O");
                        result();
                    }else{
                        chance = 0;
                        btn1.setText("X");
                        result();
                    }
                }
                break;

            case R.id.btn2:
                if (btn2.getText().toString().equals("")){
                    spaces_taken++;
                    if (chance == 0){
                        chance = 1;
                        btn2.setText("O");
                        result();
                    }else{
                        chance = 0;
                        btn2.setText("X");
                        result();
                    }
                }
                break;

            case R.id.btn3:
                if (btn3.getText().toString().equals("")){
                    spaces_taken++;
                    if (chance == 0){
                        chance = 1;
                        btn3.setText("O");
                        result();
                    }else{
                        chance = 0;
                        btn3.setText("X");
                        result();
                    }
                }
                break;

            case R.id.btn4:
                if (btn4.getText().toString().equals("")){
                    spaces_taken++;
                    if (chance == 0){
                        chance = 1;
                        btn4.setText("O");
                        result();
                    }else{
                        chance = 0;
                        btn4.setText("X");
                        result();
                    }
                }
                break;

            case R.id.btn5:
                if (btn5.getText().toString().equals("")){
                    spaces_taken++;
                    if (chance == 0){
                        chance = 1;
                        btn5.setText("O");
                        result();
                    }else{
                        chance = 0;
                        btn5.setText("X");
                        result();
                    }
                }
                break;

            case R.id.btn6:
                if (btn6.getText().toString().equals("")){
                    spaces_taken++;
                    if (chance == 0){
                        chance = 1;
                        btn6.setText("O");
                        result();
                    }else{
                        chance = 0;
                        btn6.setText("X");
                        result();
                    }
                }
                break;

            case R.id.btn7:
                if (btn7.getText().toString().equals("")){
                    spaces_taken++;
                    if (chance == 0){
                        chance = 1;
                        btn7.setText("O");
                        result();
                    }else{
                        chance = 0;
                        btn7.setText("X");
                        result();
                    }
                }
                break;

            case R.id.btn8:
                if (btn8.getText().toString().equals("")){
                    spaces_taken++;
                    if (chance == 0){
                        chance = 1;
                        btn8.setText("O");
                        result();
                    }else{
                        chance = 0;
                        btn8.setText("X");
                        result();
                    }
                }
                break;

            case R.id.btn9:
                if (btn9.getText().toString().equals("")){
                    spaces_taken++;
                    if (chance == 0){
                        chance = 1;
                        btn9.setText("O");
                        result();
                    }else{
                        chance = 0;
                        btn9.setText("X");
                        result();
                    }
                }
                break;
        }

    }

    public void showXvictoryBox() {

        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Player " + winningPlayer + " won!");
        builder.setMessage("\nPlayer " + winningPlayer + " score: " + player_X_score
                + "\nPlayer O score: " + player_O_score);

        // add the buttons
        builder.setNegativeButton("Exit", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });


        builder.setNeutralButton("Reset Scores", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                resetScore();
            }
        });

        builder.setPositiveButton("Rematch", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                resetMatch();
            }
        });

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        //dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();
    }

    public void showOvictoryBox() {

        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Player " + winningPlayer + " won!");
        builder.setMessage("\nPlayer " + winningPlayer + " score: " + player_O_score
                            + "\nPlayer X score: " + player_X_score);
        // add the buttons
        builder.setNegativeButton("Exit", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });


        builder.setNeutralButton("Reset Scores", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                resetScore();
            }
        });

        builder.setPositiveButton("Rematch", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                resetMatch();
            }
        });

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();
    }

    public void resetScore(){
        //resets buttons, winner, and score

        player_X_score = 0;
        player_O_score = 0;
        ScoreBoardView.setText(player_X_score + "  |  " + player_O_score);

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

        spaces_taken = 0;
        isVictor = false;
        winningPlayer = "";
    }

    public void resetMatch(){
        //resets buttons, spaces, victor, and winner only
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

        spaces_taken = 0;
        isVictor = false;
        winningPlayer = "";
    }

    public void result() {
        playerOwin();
        playerXwin();
        if (spaces_taken == 9 && isVictor == false){
            resetMatch();
            Toast.makeText(this, "Tied!", Toast.LENGTH_SHORT).show();

        }
    }
    //buttons in a row for player O
    public void playerOwin() {
        //diagonal buttons in a row
        if (btn1.getText().toString().equals("O") &&
                btn5.getText().toString().equals("O") &&
                btn9.getText().toString().equals("O")) {
            winningPlayer = "O";
        } else if (btn3.getText().toString().equals("O") &&
                btn5.getText().toString().equals("O") &&
                btn7.getText().toString().equals("O")) {
            winningPlayer = "O";
        }

        //vertical buttons in a row
        else if (btn1.getText().toString().equals("O") &&
                btn4.getText().toString().equals("O") &&
                btn7.getText().toString().equals("O")) {
            winningPlayer = "O";
        } else if (btn2.getText().toString().equals("O") &&
                btn5.getText().toString().equals("O") &&
                btn8.getText().toString().equals("O")) {
            winningPlayer = "O";
        } else if (btn3.getText().toString().equals("O") &&
                btn6.getText().toString().equals("O") &&
                btn9.getText().toString().equals("O")) {
            winningPlayer = "O";
        }

        //horizontal buttons in a row
        else if (btn1.getText().toString().equals("O") && btn2.getText().toString().equals("O") &&
                btn3.getText().toString().equals("O")) {
            winningPlayer = "O";
        } else if (btn4.getText().toString().equals("O") && btn5.getText().toString().equals("O") &&
                btn6.getText().toString().equals("O")) {
            winningPlayer = "O";
        } else if (btn7.getText().toString().equals("O") && btn8.getText().toString().equals("O") &&
                btn9.getText().toString().equals("O")) {
            winningPlayer = "O";
        }

        if (winningPlayer.equalsIgnoreCase("O")){//if player O wins, increment his scores & show their victory screen
            player_O_score++;
            showOvictoryBox();
            ScoreBoardView.setText(player_X_score + "  |  " + player_O_score);
            isVictor = true;
        }
    }

    public void playerXwin() {
        //buttons in a row for player X

        //diagonal buttons in a row
        if (btn1.getText().toString().equals("X") &&
                btn5.getText().toString().equals("X") &&
                btn9.getText().toString().equals("X")) {
            winningPlayer = "X";
        } else if (btn3.getText().toString().equals("X") &&
                btn5.getText().toString().equals("X") &&
                btn7.getText().toString().equals("X")) {
            winningPlayer = "X";
        }

        //vertical buttons in a row
        else if (btn1.getText().toString().equals("X") &&
                btn4.getText().toString().equals("X") &&
                btn7.getText().toString().equals("X")) {
            winningPlayer = "X";
        } else if (btn2.getText().toString().equals("X") &&
                btn5.getText().toString().equals("X") &&
                btn8.getText().toString().equals("X")) {
            winningPlayer = "X";
        } else if (btn3.getText().toString().equals("X") &&
                btn6.getText().toString().equals("X") &&
                btn9.getText().toString().equals("X")) {
            winningPlayer = "X";
        }

        //horizontal buttons in a row
        else if (btn1.getText().toString().equals("X") && btn2.getText().toString().equals("X") &&
                btn3.getText().toString().equals("X")) {
            winningPlayer = "X";
        } else if (btn4.getText().toString().equals("X") && btn5.getText().toString().equals("X") &&
                btn6.getText().toString().equals("X")) {
            winningPlayer = "X";
        } else if (btn7.getText().toString().equals("X") && btn8.getText().toString().equals("X") &&
                btn9.getText().toString().equals("X")) {
            winningPlayer = "X";
        }

        if (winningPlayer.equalsIgnoreCase("X")){ //if player X wins, increment his scores & show their victory screen
            player_X_score++;
            showXvictoryBox();
            ScoreBoardView.setText(player_X_score + "  |  " + player_O_score);
            isVictor = true;
        }
    }

}
