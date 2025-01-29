public class PS003 {
   
    private String name;
    private int wickets;
    private int matches;
    public int getMatches() {
        return matches;
    }

    private int ballsBowled;
    public int getBallsBowled() {
        return ballsBowled;
    }

    private int runsConceded;

    public PS003() {
        this.name = "sowmya";
        this.wickets = 2;
        this.ballsBowled = 4;
        this.runsConceded = 6;
    }

    public PS003(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    
    public void computeBowlingAverage() {
        if (wickets == 0) {
            System.out.println("Bowling average cannot be calculated as wickets are 0.");
        } else {
            double bowlingAverage = (double) runsConceded / wickets;
            System.out.println("Bowling Average of " + name + ": " + bowlingAverage);
        }
    }

  
    public static void main(String[] args) {
   
        PS003 bowler1 = new PS003();
        bowler1.computeBowlingAverage();

      
        PS003 bowler2 = new PS003("nikhitha", 25, 10, 600, 500);
        bowler2.computeBowlingAverage();
    }
}