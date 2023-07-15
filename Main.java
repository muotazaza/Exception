package exceptions;


public class Main {
    public static void main(String[] args) throws SalaryIsNotenoughToRentException {

        access(2000);


}

    private static void access(double salary) throws SalaryIsNotenoughToRentException {
        if (salary < 2000 ) {
            throw new SalaryIsNotenoughToRentException("Salary Is Not Enough To Rent");

        }else{
            System.out.println(" salary is enough to rent :)  " );
        }
    }
    }
