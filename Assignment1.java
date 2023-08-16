import java.util.Scanner;

public class Assignment1{
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        
        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_GREEN_BOLD = "\033[33;1m";
        final String RESET = "\033[0m";

        final String DASHBOARD = "\u1F4B0 Welcome to Smart Banking APP";
        final String CREATE_ACCOUNT = "Create new account";
        final String WITHDRAW = "Withdraw";
        final String TRANSFER = "Transfer";
        final String CHECK_ACCOUNT_BALANCE = "Check account balance";
        final String DELETE_ACCOUNT = "Delete account";


        final String ERROR_MSG = String.format("\t%s%s%s\n", COLOR_RED_BOLD, "%s", RESET);
        final String SUCCESS_MSG = String.format("\t%s%s%s\n", COLOR_GREEN_BOLD, "%s", RESET);

        

    }
}