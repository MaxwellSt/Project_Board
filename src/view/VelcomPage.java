package view;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import entity.User;

public class VelcomPage extends AbstractPage {
    private String name;
    private User user = new User();

    private UserDao userDao = new UserDaoImpl();

    @Override
    public void showPage() {
        System.out.println("*************** Begin VelcomPage  *****************");
        try {
            while (true) {
                System.out.println("Enter User: ");
                name = inputString().readLine();
                //exit
                if (name.equals("exit")) {
                    close(inputString());
                }
                //logic
                if (validateUserName(name)) {
                    // enter name from user || create new User
                    this.user.setName(name);
                    //не реализована валидация
                    if (!userDao.insert(this.user)) {
                        System.out.println("saving impossible");
                        continue;
                    }
                    System.out.println(userDao.select());

                    System.out.println("*************  End VelcomPage  *******************");
                    System.out.println();
                    display(0);
                    return;
                }
                System.out.println("Username entered is incorrect!!!!");
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(">>>>> VelcomPage  " + e);
        }
    }
}

