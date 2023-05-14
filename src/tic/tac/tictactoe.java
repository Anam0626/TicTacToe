package tic.tac;

import java.awt.Color;

import javax.swing.JOptionPane;

public class tictactoe extends Game {

    public tictactoe() {
        super();
    }

    @Override
    protected void gameScore() {
        playerx.setText(String.valueOf(xCount));
        playero.setText(String.valueOf(oCount));
    }

    @Override
    protected void winningGame() {
        // code to check for a winning combination
        String b1 = txtbtn1.getText();
        String b2 = txtbtn2.getText();
        String b3 = txtbtn3.getText();
       
        String b4 = txtbtn4.getText();
        String b5 = txtbtn5.getText();
        String b6 = txtbtn6.getText();
        
        String b7 = txtbtn7.getText();
        String b8 = txtbtn8.getText();
        String b9 = txtbtn9.getText();
        
        
        // PLAYER X CODING
        
        if(b1 == ("X") && b2 ==("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn4.setEnabled(false);
            txtbtn5.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn8.setEnabled(false);
            txtbtn9.setEnabled(false);           
        }
        
        if(b4 == ("X") && b5 ==("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn4.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn6.setBackground(Color.PINK);
            txtbtn1.setEnabled(false);
            txtbtn2.setEnabled(false);
            txtbtn3.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn8.setEnabled(false);
            txtbtn9.setEnabled(false);          
        }
         
        if(b7 == ("X") && b8 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn7.setBackground(Color.YELLOW);
            txtbtn8.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);
            txtbtn4.setEnabled(false);
            txtbtn5.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn1.setEnabled(false);
            txtbtn2.setEnabled(false);
            txtbtn3.setEnabled(false);           
        }
        
        if(b1 == ("X") && b4 ==("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
            txtbtn2.setEnabled(false);
            txtbtn5.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn3.setEnabled(false);
            txtbtn8.setEnabled(false);
            txtbtn9.setEnabled(false);           
        }
        
        if(b2 == ("X") && b5 ==("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn2.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn8.setBackground(Color.PINK);
            txtbtn4.setEnabled(false);
            txtbtn1.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn3.setEnabled(false);
            txtbtn9.setEnabled(false);         
        }
        if(b3 == ("X") && b6 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.YELLOW);
            txtbtn6.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);
            txtbtn1.setEnabled(false);
            txtbtn2.setEnabled(false);
            txtbtn4.setEnabled(false);
            txtbtn5.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn8.setEnabled(false);          
        }
        
        
        if(b1 == ("X") && b5 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
            txtbtn2.setEnabled(false);
            txtbtn3.setEnabled(false);
            txtbtn4.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn8.setEnabled(false);          
        }
        
        if(b3 == ("X") && b5 ==("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn7.setBackground(Color.PINK);
            txtbtn1.setEnabled(false);
            txtbtn2.setEnabled(false);
            txtbtn4.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn8.setEnabled(false);
            txtbtn9.setEnabled(false);          
        }
        
        
        
        // PLAYER O CODING
        
        
        if(b1 == ("O") && b2 ==("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn4.setEnabled(false);
            txtbtn5.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn8.setEnabled(false);
            txtbtn9.setEnabled(false);
            
        }
        
        if(b4 == ("O") && b5 ==("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn4.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn6.setBackground(Color.PINK);
            txtbtn1.setEnabled(false);
            txtbtn2.setEnabled(false);
            txtbtn3.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn8.setEnabled(false);
            txtbtn9.setEnabled(false);           
        }
         
        if(b7 == ("O") && b8 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn7.setBackground(Color.YELLOW);
            txtbtn8.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);
            txtbtn4.setEnabled(false);
            txtbtn5.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn1.setEnabled(false);
            txtbtn2.setEnabled(false);
            txtbtn3.setEnabled(false);            
        }
        
        if(b1 == ("O") && b4 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
            txtbtn2.setEnabled(false);
            txtbtn5.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn3.setEnabled(false);
            txtbtn8.setEnabled(false);
            txtbtn9.setEnabled(false);         
        }
        
        if(b2 == ("O") && b5 ==("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn2.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn8.setBackground(Color.PINK);
            txtbtn4.setEnabled(false);
            txtbtn1.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn3.setEnabled(false);
            txtbtn9.setEnabled(false);           
        }
        if(b3 == ("O") && b6 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.YELLOW);
            txtbtn6.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);
            txtbtn1.setEnabled(false);
            txtbtn2.setEnabled(false);
            txtbtn4.setEnabled(false);
            txtbtn5.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn8.setEnabled(false);           
        }
        
        
        if(b1 == ("O") && b5 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
            txtbtn2.setEnabled(false);
            txtbtn3.setEnabled(false);
            txtbtn4.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn8.setEnabled(false);           
        }
        
        if(b3 == ("O") && b5 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn7.setBackground(Color.PINK);
            txtbtn1.setEnabled(false);
            txtbtn2.setEnabled(false);
            txtbtn4.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn8.setEnabled(false);
            txtbtn9.setEnabled(false);        
        }
    }

}

