package Practice3;

public class MyHobby extends Hobby {
    private int numOfYears;

    public MyHobby(String whoseHobby, String whatHobby, int numOfYears) {
        super(whoseHobby, whatHobby);
        this.numOfYears = numOfYears;
    }

    @Override
    public void tellAboutHobby() {
        System.out.println(getWhoseHobby()+" favorite hobby is "+getWhatHobby()+". Experience in "+ getWhatHobby()+ " is " + numOfYears + " years.");

    }
}
