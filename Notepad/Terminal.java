public class Terminal {
    public static double score;
    public int level;
  // public static void calculateTotalScore()
    // {
        // level = 7;
    // }
    public void display()
    {
        System.out.println(score);
    }
    public static void main(String[] args) {
        Terminal t1 = new Terminal();
		
        //t1.calculateTotalScore();
		t1.display();
		

    }
}
