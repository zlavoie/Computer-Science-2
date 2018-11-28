 else if (turn == 1) 
        {
          for(int j=0; j<3; j++)
          {
            if(board[j].getText().equals("G") && board[j] != e.getSource()) 
            {
              board[j].setFont(new Font("Arial", Font.BOLD,72));
              turn++;
            }
            }
          } //End of first Choice