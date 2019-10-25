package Practice3;

import org.glassfish.json.JsonUtil;

public class PapaHobby extends Hobby {
    private int rating;

    public PapaHobby(){}

    public PapaHobby(String whoseHobby, String whatHobby, int rating){
        super(whoseHobby, whatHobby);                                               //constructor
        this.rating=rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }
    @Override
    public void tellAboutHobby() throws MyException{
        if (rating<0) throw new MyException(rating);

        System.out.println("Hobby of "+ getWhoseHobby() + " is " + getWhatHobby()+"."+ " His favorite team has rating "+ getRating() + " in the world.");

    }
}
