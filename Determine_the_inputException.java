package cn.itcast.experiment.four;

public class Determine_the_inputException extends  Exception{
    String message;
    public Determine_the_inputException(){
        message="输入的不是性别";

    }
    public String warnMess(){
        return message;
    }
}
