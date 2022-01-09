public class leapYear {
    public static boolean isLeapYear(int year){

        if ((year >= 1) && (year <= 9999)){
            if (year % 4 == 0){
                if(year % 100 == 0){
                    return (year % 400 == 0);//returns the value of a leap year sum as a true
                    }else return true;
                }else return false;
            }else return false;

    }
}
