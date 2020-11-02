package cn.itcast.experiment.four;

public class CalculationIncomeTax {
    public void C(DoctoralCandidate ssr) {
        int i=0;
        if (ssr.getSalary() < 5000) {
            System.out.println("由于您的工资未达到起征点，您不需要交税。");
            System.out.println("******************************************************************************************************");
            //如果月收入小于5000，则不交税直接把一年的结果赋值给他IndividualIncomeTax
            ssr.setIndividualIncomeTax(ssr.calculate());
        } else {
            System.out.println("由于您的工资达到起征点，您需要交税。");
            if (ssr.calculate() < DoctoralCandidate.getStandardYeardValues()) {
                i=1;
            }
            else if (ssr.calculate() > DoctoralCandidate.getStandardYeardValues() && ssr.calculate() < DoctoralCandidate.getStandardYearValues_2()) {
                i=2;

            } else if (ssr.calculate() > DoctoralCandidate.getStandardYearValues_2() && ssr.calculate() < DoctoralCandidate.getStandardYearValues_3()) {
                i=3;
            }
            else if (ssr.calculate() > DoctoralCandidate.getStandardYearValues_3() && ssr.calculate() < DoctoralCandidate.getStandardYearValues_4()) {
                i=4;
            }
            else if (ssr.calculate() > DoctoralCandidate.getStandardYearValues_4() && ssr.calculate() < DoctoralCandidate.getStandardYearValues_5()) {
                i=5;
            }
            else if (ssr.calculate() > DoctoralCandidate.getStandardYearValues_5() && ssr.calculate() < DoctoralCandidate.getStandardYearValues_6()) {
                i=6;
            }
            else if (ssr.calculate() > DoctoralCandidate.getStandardYearValues_6() ) {
                i=7;
            }

        }
        switch (i){
            case 1:ssr.setPayTaxMoney(ssr.calculate() * 0.03);
            ssr.setIndividualIncomeTax(ssr.calculate()-ssr.getPayTaxMoney());
            break;
            case 2:ssr.setPayTaxMoney((ssr.calculate() - DoctoralCandidate.getStandardYeardValues()) * 0.1 + ssr.calculate() * 0.03);
                ssr.setIndividualIncomeTax(ssr.calculate()-ssr.getPayTaxMoney()-2520);
            break;
            case 3:ssr.setPayTaxMoney((ssr.calculate()-DoctoralCandidate.getStandardYearValues_2()*0.2)+(DoctoralCandidate.getStandardYearValues_2()-DoctoralCandidate.getStandardYeardValues())*0.1+DoctoralCandidate.getStandardYeardValues()*0.03);
                ssr.setIndividualIncomeTax(ssr.calculate()-ssr.getPayTaxMoney()-2520-16920);
            break;
            case 4:ssr.setPayTaxMoney((ssr.calculate()-DoctoralCandidate.getStandardYearValues_3())*0.25+(DoctoralCandidate.getStandardYearValues_3()-DoctoralCandidate.getStandardYearValues_2())*0.2+((DoctoralCandidate.getStandardYearValues_2()-DoctoralCandidate.getStandardYeardValues())*0.1+(DoctoralCandidate.getStandardYeardValues()*0.03)));
                ssr.setIndividualIncomeTax(ssr.calculate()-ssr.getPayTaxMoney()-2520-16920-31920);
            break;
            case 5:ssr.setPayTaxMoney((ssr.calculate()-DoctoralCandidate.getStandardYearValues_4())*0.3+(DoctoralCandidate.getStandardYearValues_4()-DoctoralCandidate.getStandardYearValues_3())*0.25+(DoctoralCandidate.getStandardYearValues_3()-DoctoralCandidate.getStandardYearValues_2())*0.2+(DoctoralCandidate.getStandardYearValues_2()-DoctoralCandidate.getStandardYeardValues())*0.1+DoctoralCandidate.getStandardYeardValues()*0.03);
                ssr.setIndividualIncomeTax(ssr.calculate()-ssr.getPayTaxMoney()-2520-16920-31920-52920);
            break;
            case 6:ssr.setPayTaxMoney((ssr.calculate()-DoctoralCandidate.getStandardYearValues_5())*0.35+(DoctoralCandidate.getStandardYearValues_5()-DoctoralCandidate.getStandardYearValues_4())*0.3+(DoctoralCandidate.getStandardYearValues_4()-DoctoralCandidate.getStandardYearValues_3())*0.25+(DoctoralCandidate.getStandardYearValues_3()-DoctoralCandidate.getStandardYearValues_2())*0.2+(DoctoralCandidate.getStandardYearValues_2()-DoctoralCandidate.getStandardMonthValues())*0.1+DoctoralCandidate.getStandardMonthValues()*0.03);
                ssr.setIndividualIncomeTax(ssr.calculate()-ssr.getPayTaxMoney()-2520-16920-31920-52920-85920);
            break;
            case 7:ssr.setPayTaxMoney((ssr.calculate()-DoctoralCandidate.getStandardYearValues_6())*0.45+(DoctoralCandidate.getStandardYearValues_6()-DoctoralCandidate.getStandardYearValues_5())*0.35+(DoctoralCandidate.getStandardYearValues_5()-DoctoralCandidate.getStandardYearValues_4())*0.3+(DoctoralCandidate.getStandardYearValues_4()-DoctoralCandidate.getStandardYearValues_3())*0.25+(DoctoralCandidate.getStandardYearValues_3()-DoctoralCandidate.getStandardYearValues_2())*0.2+(DoctoralCandidate.getStandardYearValues_2()-DoctoralCandidate.getStandardMonthValues())*0.1+DoctoralCandidate.getStandardMonthValues()*0.03);
                ssr.setIndividualIncomeTax(ssr.calculate()-ssr.getPayTaxMoney()-2520-16920-31920-52920-85920-181920);
            break;
//            default:
//                System.out.println("不存在");
        }
    }
}