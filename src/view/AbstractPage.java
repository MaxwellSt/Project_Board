package view;

import entity.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class AbstractPage {
    //добавить new BufferedReader(new InputStreamReader(System.in));
    private static BufferedReader reader = null;
    private static HomePage homePage = new HomePage();
    private static ContextPage contextPage = new ContextPage();

    protected abstract void showPage();

    protected BufferedReader inputString() {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            return reader;
        } catch (Exception e) {
            System.out.println(">>>>> protected BufferedReader inputString()  " + e);
        }
        throw new IllegalArgumentException("protected BufferedReader inputString()");
    }


    protected boolean validateUserName(String name) {
        boolean flag = false;
        if (name.isEmpty() & name == null) {
            return flag;
        }
        if (name.length() >= 4 & name.length() <= 20) {
            flag = true;
        }
        return flag;
    }

    protected boolean validateNumberInt(String str) {
        try {
            int result = Integer.parseInt(str);
            if (result >= 0 && result < 11) {
                return true;
            }
            return false;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    protected void close(BufferedReader reader) {
        if (reader != null) {
            try {
                reader.close();
                System.out.println(">>>>>>>>>>>>>>>> reader.close(); System.exit(0); <<<<<<<<< ");
                System.exit(0);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected void display(int num) {
        switch (num) {
            case 0:
                homePage.showPage();
                break;

            case 7:
                contextPage.showPage();
                break;
        }
    }
}
