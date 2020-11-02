package cn.itcast.experiment.four;

import java.util.*;
import java.util.InputMismatchException;
import java.util.HashSet;
import java.util.Scanner;
public class Text_2 {
    public static void main(String[] args) {
        //创建字符型
        String q;
        Scanner in = new Scanner(System.in);
        String a[]=new String[10000];
        int s[]=new int[10000];
        //创建Determine_the_input的对象
        Determine_the_input di= new Determine_the_input();
        int fee=0;
        int salary=0;
        boolean bool = true;
        boolean bool1 = true;
        //创建DoctoralCandidate的HashSet用于存入数据
        HashSet<DoctoralCandidate> names = new HashSet<DoctoralCandidate>();
        HashSet<String> names_1 = new HashSet<String>();
        //创建管理员对象
        Person mangermenter = new Person("迪丽热巴","女",19);
        //创建博士研究生对象
        //DoctoralCandidate dc_1 = new DoctoralCandidate("贾忱健", "男", 19, 5000, 6000);
        DoctoralCandidate dc_1 = new DoctoralCandidate();
        //DoctoralCandidate dc_2 = new DoctoralCandidate("二狗", "男", 19, 4000, 5000);
        DoctoralCandidate dc_2 = new DoctoralCandidate();


        //定义DdctoralCandidate数组，用于对象的循环调用
        DoctoralCandidate[] s1 = {dc_1, dc_2};
        for (DoctoralCandidate str : s1) {
            System.out.println("你好，" + mangermenter.getName()+"，管理员，欢迎来到管理系统!");
            System.out.println("******************************************************************************************************");

            Scanner x = new Scanner(System.in);
            System.out.println("请输入您要管理的的人员的姓名:");

            System.out.println("******************************************************************************************************");
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
            System.out.println("请输入您要管理的的人员的性别:");
            System.out.println("******************************************************************************************************");
            a:while (true) {
                try {
                    in = new Scanner(System.in);
                    q=in.next();
                    if (q != null && q.matches("^[0.0-9.0]+$")){
                        throw new Determine_the_inputException();
                    }

                    str.setSex(q);
                    break a;
                } catch (Determine_the_inputException n){
                    System.out.println("别整数字");
                }
                catch (InputMismatchException e) {
                    System.out.println("输入格式错误请重新输入");
                }
            }

            //bool=true;
            System.out.println("请输入您要管理的人员的学费：:");
            System.out.println("******************************************************************************************************");
            v:while (true) {
                try {
                    in = new Scanner(System.in);

                    str.setTuitionFee(in.nextInt());
                        break v;
                } catch (InputMismatchException e) {
                    System.out.println("输入格式错误请重新输入");
                }
            }
            System.out.println("请输入您要管理的人员的工资：:");
            System.out.println("******************************************************************************************************");
            k:while (true) {
                try {
                    in = new Scanner(System.in);
                    str.setInquire(in.nextInt());
                    break k;
                } catch (InputMismatchException e) {
                    System.out.println("输入格式错误请重新输入");
                }
            }



            //bool1=true;
            //s=null;
            //计算年收入和学费的差值
            str.calculate();
            //设置旗帜来判断年收入和学费的关系
            boolean flag = str.isMark();
            System.out.println(flag);
            CalculationIncomeTax ca= new CalculationIncomeTax();
            ca.C(str);
            names.add(str);
            System.out.println("您的年个人所得为："+str.getIndividualIncomeTax()+"元");
            System.out.println(str);
            System.out.println("******************************************************************************************************");
        }
        System.out.println("导出列表为：");
        for (Object object : names) {
            System.out.println("******************************************************************************************************");
            System.out.println(object);
        }
        System.out.println("******************************************************************************************************");
    }



}
