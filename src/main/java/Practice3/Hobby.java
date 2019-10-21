/* The class allows to describe hobbies of some people,
    and to display information about their hobbies
 */
package Practice3;
public abstract class Hobby {
    private byte howManyYears;
    private short scoreReal;
    private int scoreMadrid;
    private float koefOfCommand;
    private double koefOfAll;
    private char group;
    boolean winner;
    private String whoseHobby;
    private String whatHobby;

    public Hobby(String whatHobby){
        this.whatHobby=whatHobby;
    }
    public Hobby(String whoseHobby, String whatHobby) { //third constructor with 2 parameters
        this.whoseHobby = whoseHobby;
        this.whatHobby = whatHobby;
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
    public abstract void tellAboutHobby();                              //method tellAboutHobby
}



