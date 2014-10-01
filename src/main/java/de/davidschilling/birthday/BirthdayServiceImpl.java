package de.davidschilling.birthday;

import de.davidschilling.user.UserService;
import java.util.Calendar;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * David Schilling - davejs92@gmail.com
 */
@Service
public class BirthdayServiceImpl implements BirthdayService {

    private UserService userService;

    @Autowired
    public BirthdayServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean hasBirthday() {
        Calendar c1 = Calendar.getInstance();

        Calendar c2 = Calendar.getInstance();
        c2.setTime(new Date(1412169028000l)); // 1.10.2014

        if (userService.getCurrentlyLoggedIn().getUsername().equals("papa") && c1.get(Calendar.DAY_OF_MONTH) == c2.get(Calendar.DAY_OF_MONTH) && c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH)) {
            return true;
        }
        return false;
    }
}
