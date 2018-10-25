package com.example.gabri.tictactoe;

import android.content.DialogInterface;
import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private String symbol = "X";

    @BindViews({ R.id.cel_1, R.id.cel_2, R.id.cel_3, R.id.cel_4, R.id.cel_5, R.id.cel_6, R.id.cel_7, R.id.cel_8, R.id.cel_9})
    List<Button> buttons;

    @BindView(R.id.resetButton)
    Button reset_Button;

    @BindView(R.id.XO)
    TextView xOrO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.cel_1)
    public void cel_1Click(View view) {

        buttons.get(0).setEnabled(false);
        buttons.get(0).setText(symbol);

        checkWin();
        checkSymbol();
    }

    @OnClick(R.id.cel_2)
    public void cel_2Click(View v) {

        buttons.get(1).setEnabled(false);
        buttons.get(1).setText(symbol);

        checkWin();
        checkSymbol();
    }

    @OnClick(R.id.cel_3)
    public void cel_3Click(View v) {

        buttons.get(2).setEnabled(false);
        buttons.get(2).setText(symbol);

        checkWin();
        checkSymbol();

    }

    @OnClick(R.id.cel_4)
    public void cel_4Click(View v) {
        buttons.get(3).setText(symbol);
        buttons.get(3).setEnabled(false);
        checkWin();
        checkSymbol();

    }

    @OnClick(R.id.cel_5)
    public void cel_5Click(View v) {
        buttons.get(4).setText(symbol);
        buttons.get(4).setEnabled(false);
        checkWin();
        checkSymbol();

    }

    @OnClick(R.id.cel_6)
    public void cel_6Click(View v) {
        buttons.get(5).setText(symbol);
        buttons.get(5).setEnabled(false);
        checkWin();
        checkSymbol();

    }

    @OnClick(R.id.cel_7)
    public void cel_7Click(View v) {
        buttons.get(6).setText(symbol);
        buttons.get(6).setEnabled(false);
        checkWin();
        checkSymbol();

    }

    @OnClick(R.id.cel_8)
    public void cel_8Click(View v) {
        buttons.get(7).setText(symbol);
        buttons.get(7).setEnabled(false);
        checkWin();
        checkSymbol();

    }

    @OnClick(R.id.cel_9)
    public void cel_9Click(View v) {
        buttons.get(8).setText(symbol);
        buttons.get(8).setEnabled(false);
        checkWin();
        checkSymbol();
    }

    @OnClick(R.id.resetButton)
    public void resetButton(View view) {
        resetAction();
    }

    public void checkSymbol() {
        if (symbol.equals("X")) {
            symbol = "O";
            xOrO.setText("O");
        } else {
            symbol = "X";
            xOrO.setText("X");
        }
    }

    public void checkWin() {
        boolean gameOver = false;

        // X Wins

        if (buttons.get(0).getText().equals("X")
                && buttons.get(1).getText().equals("X")
                && buttons.get(2).getText().equals("X")) {

            for (int i = 0; i < buttons.size(); i++) {
                buttons.get(i).setEnabled(false);
            }
            gameOver = true;
        }


        if (buttons.get(0).getText().equals("X")
                && buttons.get(4).getText().equals("X")
                && buttons.get(8).getText().equals("X")) {

            for (int i = 0; i < buttons.size(); i++) {
                buttons.get(i).setEnabled(false);
            }
            gameOver = true;
        }

        if (buttons.get(0).getText().equals("X")
                && buttons.get(3).getText().equals("X")
                && buttons.get(6).getText().equals("X")) {

            for (int i = 0; i < buttons.size(); i++) {
                buttons.get(i).setEnabled(false);
            }
            gameOver = true;
        }

        if (buttons.get(3).getText().equals("X")
                && buttons.get(4).getText().equals("X")
                && buttons.get(5).getText().equals("X")) {

            for (int i = 0; i < buttons.size(); i++) {
                buttons.get(i).setEnabled(false);
            }
            gameOver = true;
        }

        if (buttons.get(6).getText().equals("X")
                && buttons.get(7).getText().equals("X")
                && buttons.get(8).getText().equals("X")) {

            for (int i = 0; i < buttons.size(); i++) {
                buttons.get(i).setEnabled(false);
            }
            gameOver = true;
        }

        if (buttons.get(2).getText().equals("X")
                && buttons.get(5).getText().equals("X")
                && buttons.get(8).getText().equals("X")) {

            for (int i = 0; i < buttons.size(); i++) {
                buttons.get(i).setEnabled(false);
            }
            gameOver = true;
        }

        if (buttons.get(2).getText().equals("X")
                && buttons.get(4).getText().equals("X")
                && buttons.get(6).getText().equals("X")) {

            for (int i = 0; i < buttons.size(); i++) {
                buttons.get(i).setEnabled(false);
            }
            gameOver = true;
        }

        // O Wins

        if (buttons.get(0).getText().equals("O")
                && buttons.get(1).getText().equals("O")
                && buttons.get(2).getText().equals("O")) {

            for (int i = 0; i < buttons.size(); i++) {
                buttons.get(i).setEnabled(false);
            }
            gameOver = true;
        }


        if (buttons.get(0).getText().equals("O")
                && buttons.get(4).getText().equals("O")
                && buttons.get(8).getText().equals("O")) {

            for (int i = 0; i < buttons.size(); i++) {
                buttons.get(i).setEnabled(false);
            }
            gameOver = true;
        }

        if (buttons.get(0).getText().equals("O")
                && buttons.get(3).getText().equals("O")
                && buttons.get(6).getText().equals("O")) {

            for (int i = 0; i < buttons.size(); i++) {
                buttons.get(i).setEnabled(false);
            }
            gameOver = true;
        }

        if (buttons.get(3).getText().equals("O")
                && buttons.get(4).getText().equals("O")
                && buttons.get(5).getText().equals("O")) {

            for (int i = 0; i < buttons.size(); i++) {
                buttons.get(i).setEnabled(false);
            }
            gameOver = true;
        }

        if (buttons.get(6).getText().equals("O")
                && buttons.get(7).getText().equals("O")
                && buttons.get(8).getText().equals("O")) {

            for (int i = 0; i < buttons.size(); i++) {
                buttons.get(i).setEnabled(false);
            }
            gameOver = true;
        }

        if (buttons.get(2).getText().equals("O")
                && buttons.get(5).getText().equals("O")
                && buttons.get(8).getText().equals("O")) {

            for (int i = 0; i < buttons.size(); i++) {
                buttons.get(i).setEnabled(false);
            }
            gameOver = true;
        }

        if (buttons.get(2).getText().equals("O")
                && buttons.get(4).getText().equals("O")
                && buttons.get(6).getText().equals("O"))
        {

            for (int i = 0; i < buttons.size(); i++)
            {
                buttons.get(i).setEnabled(false);
            }
            gameOver = true;
            buttons.get(2).setTextColor(Color.GREEN);
            buttons.get(4).setTextColor(Color.GREEN);
            buttons.get(6).setTextColor(Color.GREEN);
        }

        if (gameOver) {
            if (symbol.equals("X")) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
                alertDialog.setTitle("Game Over")
                        .setMessage("Jogador 1 venceu")
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                resetAction();
                            }
                        });
                alertDialog.setCancelable(false);
                alertDialog.show();

            } else if (symbol.equals("O")) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
                alertDialog.setTitle("Game Over")
                        .setMessage("Jogador 2 venceu")
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                resetAction();
                            }
                        });
                alertDialog.setCancelable(false);
                alertDialog.show();
            }
        }

            if(!buttons.get(0).isEnabled() && !buttons.get(1).isEnabled()
                    && !buttons.get(2).isEnabled()
                    && !buttons.get(3).isEnabled()
                    && !buttons.get(4).isEnabled()
                    && !buttons.get(5).isEnabled()
                    && !buttons.get(6).isEnabled()
                    && !buttons.get(7).isEnabled()
                    && !buttons.get(8).isEnabled() && !gameOver){

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Game Over!")
                        .setMessage("Deu Velha!")
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                resetAction();
                            }
                        })
                        .setCancelable(false)
                        .show();
            }
    }


    public void resetAction() {

        for (int i = 0; i < buttons.size(); i++) {
            buttons.get(i).setText("");
            buttons.get(i).setEnabled(true);
        }
        xOrO.setText("X");
        symbol = "X";
    }

}
