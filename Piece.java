// Represents chess piece 

// Since the functions are often utilized, the class itself was considered abstract 
public abstract class Piece {
    private boolean attacked = false; // attack or kill opponent's piece
    private boolean position = false; // indicates black or white tile 

    public Piece(boolean position) { this.setCorrectPosition(position); }
  
    public boolean isCorrectPosition() { return this.position; } // correct positioning of piece
  
    public void setCorrectPosition(boolean position) { this.position = position; }
  
    public boolean isAttacked() { return this.attacked; }
  
    public void setKilled(boolean attacked) { this.attacked = attacked; }
}