# Java_experiment_four
计191 贾忱健 2019310177 实验四 接口及异常处理实验
# 一、实验目的
掌握Java中抽象类和抽象方法的定义；   
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法  
了解异常的使用方法，并在程序中根据输入情况做异常处理  
# 二、实验内容
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。 
1.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。  
2.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）  
3.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。  
应纳税所得额=收入总额乘以对应的税率计算  
税后收入=收入总额-应纳税所得额-速算扣除数  
# 三、实验要求
1.在 博士研究生类中实现各个接口定义的抽象方法。  
2.对年学费和年收入进行统计，用收入减去学费，求得纳税额。    
3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。   
4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。    
5.根据输入情况，要在程序中做异常处理。    
# 四、解题思路
第一步，创建两个接口分别为学生管理接口和教师管理接口，包括查薪水和发薪水的抽象方法。  
第二步，创建人员父类，作为博士研究生的父类继承姓名、性别和编号。  
第三步，创建博士研究生类，实现两个接口，四个基本方法。设置变量对应的set和get方法，重新toString方法。    
第四步，设置自定义异常处理类，继承Expection类，当抛出自定义异常时，执行异常处理。  
第五步，根据公式创建税率计算类。    
第六步，创建测试类用HashSet储存信息，用数组进行循环，用Scanner来实现交互。  
# 五、操作过程
(1) 在 Teacher_management_interface接口中创建两个抽象方法分别为：setInquire(double salary)和getSalary()用于发放工资和查询工资。    
(2) 在Student_management_interface接口中创建两个抽象方法为：setTuitionFee(double fee)和getTuitionFee()用于缴纳学费和查询学费。    
(3) 在Person类中创建字符串型变量name和sex作为人员的名字和性别，创建整型变量age和ID作为人员的年龄和编号    
(4) 在构造方法Person()中接收三个参数，并在构造方法中调用setAge(age)、setName(name)和setSex(sex)方法，方便在初始化时进行赋值。      
(5) 创建DoctoralCandidate博士研究生类，继承Person父类，指定接口为Student_management_interface和Teacher_management_interface。      
(6) 设置静态变量idCounter=0，double类型的私有的个人税后收入IndividualIncomeTax，所缴的税款额度PayTaxMoney、学费TuitionFee、月收入MonthSalary和计算结果result。    
(7) 用final、private和static关键字，定义七个不同税率的等级。    
(8) 在构造方法中接收五个参数分别为name、sex、age、TuitionFee和MonthSalary，在构造方法中用super
调用父类的构造方法。    
(9) 在构造方法中将ID=++idCounter这就实现了每创建一个对象，其编号自动加一。调用两个方法为setInquire(MonthSalary)和setTuitionFee(TuitionFee)方法 。    
(10) 创建默认的无参的构造方法，同样用super调用父类的构造对象。两个构造方法一个可以在初始化时实例化对象，一个可以后续实例化。定义calculate方法用于计算年收入减去学费。    
(11) 定义isMark方法用于判断年收入是否大于零。重写toString方法，使其打印时返回该对象的基本信息。    
(12) 创建交税额度计算类CalculationIncomeTax类，在其中定义一个方法为C，此方法接受一个参数是DoctoralCandidate类的参数ssr。用if来判断ssr对象的月收入是否小于5000，小于5000则不交税直接将ssr对象的计算总金额赋值给ssr对象的IndividualIncomeTax变量。  
(13) 用if来判断他的年收入符合那个阶段，然后在将参数i赋值为对应的数，再用switch和公式来按符合的阶段进行计算，赋值给setPayTaxMoney，然后再将ssr对象的calculate减去ssr对象的PayTaxMoney，赋值给IndividualIncome，这就实现了发放工资。  
(14) 创建自定义异常处理Determine_the_inputException类继承Exception类，在类中定义一个字符串message，创建一个方法，当出现Determine_the_inputException异常时，则可以调用这个方法。  
(15) 创建测试类Test_2类，首先导入三个包import java.util.InputMismatchException、java.util.HashSet和java.util.Scanner。  
(16) 创建字符串型q用于接收name和sex参数，创建Scanner对象in，创建字符串型数组a，创建int型数组s。  
(17) 创建DoctoralCandidate类的HashSet，命名为names。再创建一个字符串型HashSet，命名为name_1。  
(18) 用DoctoralCandidate()构造方法创造两个对象为dc_1和dc_2对象。定义DoctoralCandidate数字存放对象dc_1和dc_2。  
(19) 在for循环中创建while死循环，将可能出现的q=in.next()放到try中当出现异常时，抛出自定义异常throw new Determine_the_inputException()，则不在执行break z；了这就导致知道不抛出异常时就执行break z。跳出死循环，这就实现了知道输入正确之后才继续程序。  
(20) 将获取的q作为对象setName的方法来设置姓名，其他的信息同样如此。  
(21) 在输入姓名的时候，用正则表达式去判断输入的是不是数字f (q != null && q.matches("^[0.0-9.0]+$"))，因为可能是浮点型数字所以用0.0到9.0实现了判断输入的是不是数字，如果是数字就抛出自定义异常。再catch和死循环来处理。  
(22) 当输入工资的时候需要判断是不是不是数字，用Scaaner对象的nextInt来获取整型，放入try中如果出现异常则抛出异常InputMismatchException，利用循环来实现知道输入正确位置。    
(23) 调用DoctoralCandidate的calculate方法，来计算税前的年收入，调用对象的isMark方法来判断是否需要交税。  
(24) 创建CalculationIncomeTax类的对象ca，调用ca的C方法来接收需要计算税的参数。将此博士研究生对象放入HashSet中储存。  
(25) 用循环打印HashSet中的所有元素来实现打印列表。  

# 六、核心代码
一、Student_management_interface接口      
```
public interface Student_management_interface {
    public abstract void setTuitionFee(double fee);
    public abstract Double getTuitionFee();
}
```
二、DoctoralCandidate类中的静态税率等级的变量和两个构造方法    
```
private final static int StandardYearValues_3=300000;
private final static int StandardYearValues_4=420000;
private final static int StandardYearValues_5=660000;
private final static int StandardYearValues_6=960000;
    
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
```
三、Test_2类中的for循环方法  
```
DoctoralCandidate[] s1 = {dc_1, dc_2};
for (DoctoralCandidate str : s1) {}
```
四、实现知道输入正确为止的while循环和异常处理  
```
z:while (true) {
                try {
                    in = new Scanner(System.in);
                    //获取作为需要管理的人员的名字
                    q=in.next();
                    //利用正则表达式对输入的字符判断是不是数字，如果是数字则抛出自定义异常
                    if (q != null && q.matches("^[0.0-9.0]+$")){
                        throw new Determine_the_inputException();
                    }
                    //选择所需的管理人员的名字
                    str.setName(q);
                    break z;
                } catch (Determine_the_inputException n){
                    System.out.println("别整数字");
                }
                catch (InputMismatchException e) {
                    System.out.println("输入格式错误请重新输入");
                }
            }
```
五、计算税前收入的函数和CalculationIncomeTax对象的C方法来计算税前。    
```
str.calculate();
ca.C(str);
```
六、自定义异常类的定义  
```
public class Determine_the_inputException extends  Exception{
    String message;
    public Determine_the_inputException(){
        message="输入的不是性别";

    }
    public String warnMess(){
        return message;
    }
}

```
七、税率计算类的判断方式和一部分计算公式
```
if (ssr.getSalary() < 5000) {
            System.out.println("由于您的工资未达到起征点，您不需要交税。");
            System.out.println("******************************************************************************************************");
            //如果月收入小于5000，则不交税直接把一年的结果赋值给他IndividualIncomeTax
            ssr.setIndividualIncomeTax(ssr.calculate());
        } else {
            System.out.println("由于您的工资达到起征点，您需要交税。");
case 2:ssr.setPayTaxMoney((ssr.calculate() - DoctoralCandidate.getStandardYeardValues()) * 0.1 + ssr.calculate() * 0.03);
                ssr.setIndividualIncomeTax(ssr.calculate()-ssr.getPayTaxMoney()-2520);

```
# 七、实验结果
![img](https://github.com/ChenJian-Jia/Java_experiment_four/blob/main/experiment_result.png)
# 八、实验感想
本次实验学习了异常处理和Scanner交互方法，此次实验对于我来说是很有难度的，本次实验基本掌握了掌握Java中抽象类和抽象方法的定义；   
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的定义形式以及接口的实现方法。了解异常的使用方法，并在程序中根据输入情况做异常处理。难度就在于如何实现直到输入正确的时候才继续进行代码，换了好几种思路一直解决不了，最后用死循环和异常处理来处理，出现错误时就抛出异常跳过break这就实现了不符合一直输的情况，当输入的符合时就不抛出异常，则执行break跳出死循环。因为此次实验中的测试类写到一半发现测试类太麻烦了，如果我在写一个类的话直接调用博士研究生对象，我就可以减少测试类的代码，在测试类中我只需要调用税率计算的对象的C方法将需要计算的对象放入进去就可以了，增加可读性。并且下次这个税率计算的类也可以继续使用。在计算类在我接受的博士研究生类的对象，用其对象的get方法加上if来判断是否需要交税。因为要更好地输入姓名和性别，所以要进行异常的判断，此时我选择了自定义异常，我创建了一个自定义异常并继承了Exception类，用if加上正则表达式来判断需要输入名字和性别的时候是不是输入的数字，如果是则抛出自定义异常。最后的列表使用HashSet实现的。本次实验学到的挺多的，异常处理和交互不仅仅对于现在的学习来说很重要在将来的工作中更加重要，此次实验也锻炼了自己的思维比如如何实现的一直输入，直到正确为止。收获多多！！！
