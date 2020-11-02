package cn.itcast.experiment.four;

public class Determine_the_input {
    public void income(int m) throws Determine_the_inputException{
        if (m<=0||m>=0){
            throw new Determine_the_inputException();

        }
//        throw new numeric_error
    }
}
