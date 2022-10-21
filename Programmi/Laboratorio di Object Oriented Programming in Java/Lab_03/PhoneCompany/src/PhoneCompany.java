import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneCompany {
    List<User> users;

    private final double minutePrice;
    private final double smsPrice;
    private final double gbPrice;

    public PhoneCompany(double minutePrice, double smsPrice, double gbPrice){
        this.users = new ArrayList<>();
        this.minutePrice = minutePrice;
        this.smsPrice = smsPrice;
        this.gbPrice = gbPrice;
    }

    public void readUserDataFromFile(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
           int userCode = Integer.parseInt(input.nextLine());
           String userName = input.nextLine();
           String secondNameUser = input.nextLine();
           int usedMinutes = Integer.parseInt(input.nextLine());
           int usedSms = Integer.parseInt(input.nextLine());
           double usedMB = Double.parseDouble(input.nextLine());
           User user = new User(userCode, userName, secondNameUser);
           user.setUsedMinutes(usedMinutes);
           user.setUsedSMS(usedSms);
           user.setUsedMB(usedMB);
           this.users.add(user);
        }
    }

    public User findUserByCode(int code) {
        for (User tmpUser : users)
        {
            if (tmpUser.getCode() == code)
                return  tmpUser;
        }
        return null;
    }
    public void computeUserCost(User user) {
        double minuteCost = minutePrice * user.getUsedMinutes();
        double smsCost = smsPrice * user.getUsedSMS();
        double mbCost = (gbPrice / 1000) * user.getUsedMB();

        user.setTotalCost(minuteCost + smsCost + mbCost);
    }

}
