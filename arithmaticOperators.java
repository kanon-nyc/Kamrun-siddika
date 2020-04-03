package javapractice;

public class arithmaticOperators {
    public static void main(String[]arg){
        int result = 2+9;
        //result is 11.
        System.out.println("2+9 =" +result);
        int original_result =result;
        result=result-5;
        //now result is 6.
        System.out.println(original_result+ "-5 ="+ result);
        original_result =result;
        result=result*5;
        //now result is 30.
        System.out.println(original_result+ "*5 ="+ result);
        original_result =result;
        result=result/5;
        //now result is 6.
        System.out.println(original_result+ "/5 ="+ result);
        original_result =result; result=result+8;
        //now result is 14.
        System.out.println(original_result+ "+8 ="+ result);
        original_result =result; result=result%7;
        //now result is 0.
        System.out.println(original_result+ "%7 ="+ result);
        original_result =result;
    }
}
