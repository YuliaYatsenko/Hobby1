/* The class allows to describe hobbies of some people,
    and to display information about their hobbies
 */
package Practice3;
public class Hobby {
    private byte howManyYears;
    private short scoreReal;
    private int scoreMadrid;
    private float koefOfCommand;
    private double koefOfAll;
    private char group;
    boolean winner;
    private String whoseHobby;
    private String whatHobby;
    //public String [] arrayOfHobbies;

    public Hobby() {                                    //first constructor without parameters
    }
    public Hobby(String whoseHobby) {                   //second constructor with 1 parameters
        this.whoseHobby = whoseHobby;
    }
    public Hobby(String whoseHobby, String whatHobby) { //third constructor with 2 parameters
        this.whoseHobby = whoseHobby;
        this.whatHobby = whatHobby;
    }
    public byte getHowManyYears() {                     //getters and setters for all variables
        return howManyYears;
    }
    public void setHowManyYears(byte howManyYears) {
        this.howManyYears = howManyYears;
    }
    public short getScoreReal() {
        return scoreReal;
    }
    public void setScoreReal(short scoreReal) {
        this.scoreReal = scoreReal;
    }
    public int getScoreMadrid() {
        return scoreMadrid;
    }
    public void setScoreMadrid(int scoreMadrid) {
        this.scoreMadrid = scoreMadrid;
    }
    public float getKoefOfCommand() {
        return koefOfCommand;
    }
    public void setKoefOfCommand(float koefOfCommand) {
        this.koefOfCommand = koefOfCommand;
    }
    public double getKoefOfAll() {
        return koefOfAll;
    }
    public void setKoefOfAll(double koefOfAll) {
        this.koefOfAll = koefOfAll;
    }
    public char getX() {
        return group;
    }
    public void setX(char group) {
        this.group = group;
    }
    public boolean isWinner() {
        return winner;
    }
    public void setWinner(boolean winner) {
        this.winner = winner;
    }
    public String getWhoseHobby() {
        return whoseHobby;
    }
    public void setWhoseHobby(String whoseHobby) {
        this.whoseHobby = whoseHobby;
    }
    public String getWhatHobby() {
        return whatHobby;
    }

    public void setWhatHobby(String whatHobby) {
        this.whatHobby = whatHobby;
    }
    public void tellAboutHobby() {                                    //method tellAboutHobby
        // return whoseHobby;
        System.out.println("Favorite hobby of " + whoseHobby + " is " + whatHobby+ ".");
    }
    public String toString() {                                          //method toString
        return "Hobby of " + whoseHobby + " is " + getWhatHobby()+".";
    }
}



