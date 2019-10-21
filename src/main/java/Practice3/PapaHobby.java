package Practice3;

public class PapaHobby extends Hobby {
    private int rating;

    public PapaHobby(String whoseHobby, String whatHobby, int rating){
        super(whoseHobby, whatHobby);                                               //constructor
        this.rating=rating;
    }

    public int getRating() {
        return rating;
    }

    //public void setRating(int rating) {
      //  this.rating = rating;
    //}

    @Override
    public void tellAboutHobby() {
        System.out.println("Hobby of "+ getWhoseHobby() + " is " + getWhatHobby()+"."+ " His favorite team has rating "+ getRating()+ " in the world.");

    }
}
