package javapractice;

public class CaseExample2 {
    public static void main(String[]args){
        String week = "Monday";
        switch(week)
        {
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Weddnesday");
                break;
            case "Thursday":
                System.out.println("Wednesday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            case "Saturday":
                System.out.println("Saturday");
                break;
            case "Sunday":
                break;
            default:
                System.out.println("default");


        }
    }
}

