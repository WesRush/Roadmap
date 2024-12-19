package Cem.Dias.RoadmapJava.introducao;

//exercício: quantos € de imposto um cidadão holandês pagará de acordo com seu salário anual
/* € 0 ---------- €34,712 ------------ 9,70%
    € 34,713 -------- €68,507 -------- 37,35%
    €68,508  ------------------------- 49.50%
 */
public class Aula05EstruturasCondicionais04 {
    //solução abaixo :
    public static void main(String[] args) {
        double annualSalary = 70000;
        double taxes1 = 9.70 / 100;
        double taxes2 = 37.35 / 100;
        double taxes3 = 49.50 / 100;
        double taxesValue;

        if (annualSalary <= 34712){

            taxesValue = annualSalary * taxes1 ;
            

        } else if (annualSalary >= 34713 && annualSalary <= 68507) {
            taxesValue = annualSalary * taxes2 ;
            
        } else{
            taxesValue = annualSalary * taxes3 ;

        }
        System.out.println(taxesValue);



    }

}
