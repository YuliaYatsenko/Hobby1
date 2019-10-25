package Practice3;

public class MyHobby extends Hobby {
    private int numOfYears;

    public MyHobby(String whoseHobby, String whatHobby, int numOfYears) {
        super(whoseHobby, whatHobby);
        this.numOfYears = numOfYears;
    }

    @Override
    public void tellAboutHobby() throws MyException{
        if (numOfYears<0) throw new MyException();
        System.out.println(getWhoseHobby()+" favorite hobby is "+getWhatHobby()+". Experience in "+ getWhatHobby()+ " is " + numOfYears + " years.");


    }
}
