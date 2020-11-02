package cn.itcast.experiment.four;
//学生接口要实现setTuitionFee
//            getTuitionFee
//助教接口要实现setInquire
//           getSalary
public class DoctoralCandidate extends Person implements Student_management_interface,Teacher_management_interface{
    //每创建一个博士研究生对象就编号自动加一
    private static int idCounter=0;
    private double IndividualIncomeTax;
    private double PayTaxMoney;
    private final static int StandardMonthValues=5000;
    private final static int StandardYearValues=36000;
    private final static int StandardYearValues_2=144000;
    private final static int StandardYearValues_3=300000;
    private final static int StandardYearValues_4=420000;
    private final static int StandardYearValues_5=660000;
    private final static int StandardYearValues_6=960000;

    private double TuitionFee;
    private double MonthSalary;
    private double result;
    public DoctoralCandidate(String name,String sex,int age,int TuitionFee,int MonthSalary){
        super(name,sex,age);
        this.ID = ++idCounter;
        setInquire(MonthSalary);
        setTuitionFee(TuitionFee);
    }
    public DoctoralCandidate(){

        super("贾忱健", "男", 19);
        this.ID = ++idCounter;

    }
    //学生设置学费
    public  void setTuitionFee(double fee){
        this.TuitionFee=fee;
    }
    //学生查询学费
    public Double getTuitionFee(){
        return TuitionFee;
    }
    //教师设置薪水
    public  void setInquire(double salary){
        this.MonthSalary=salary;
    }
    //教师查询薪水
    public  Double getSalary(){
        return MonthSalary;
    }

    public double getResult() {
        return result;
    }



    public double getPayTaxMoney() {
        return PayTaxMoney;
    }

    public void setPayTaxMoney(double payTaxMoney) {
        PayTaxMoney = payTaxMoney;
    }

    public static int getStandardYeardValues() {
        return StandardYearValues;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static int getStandardYearValues_2() {
        return StandardYearValues_2;
    }

    public static int getStandardYearValues_3() {
        return StandardYearValues_3;
    }

    public static int getStandardYearValues_4() {
        return StandardYearValues_4;
    }

    public static int getStandardYearValues_5() {
        return StandardYearValues_5;
    }

    public static int getStandardYearValues_6() {
        return StandardYearValues_6;
    }

    public double calculate(){
        result = MonthSalary*12-TuitionFee;
        return result;
    }

    public static int getStandardMonthValues() {
        return StandardMonthValues;
    }

    public double getIndividualIncomeTax() {
        return IndividualIncomeTax;
    }

    public void setIndividualIncomeTax(double individualIncomeTax) {
        IndividualIncomeTax = individualIncomeTax;
    }


    public boolean isMark(){
        if (result>0){
            System.out.println("您的年收入为："+result+"元");
            return true;
        }
        else{
            System.out.println("您的年收入减去学费为："+result+"元");
            return false;

        }
    }
    public String toString(){
        return "姓名为："+name+"，性别为："+sex+"，年龄为："+age+"，编号为："+ID+",个人所交税款为："+PayTaxMoney+"元,个人所得为："+IndividualIncomeTax+"元";
    }


}
