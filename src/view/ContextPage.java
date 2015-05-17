package view;


public class ContextPage extends AbstractPage {
    String str;
    private static int count = 0;

    public ContextPage(){
        System.out.println("constructor ContextPage" + (count++));
    }
    @Override
    public void showPage() {
        System.out.println("*********************** Begin ContextPage *****************************");
        System.out.println();
        System.out.println("LIST ContextPage");
        System.out.println("LIST ContextPage");
        System.out.println("LIST ContextPage");
        System.out.println("LIST ContextPage");
        System.out.println("LIST ContextPage");
        System.out.println("LIST ContextPage");
        System.out.println();
        System.out.println("***** Enter: ******");
        System.out.println("****** back  -> Back page ******");
        System.out.println("****** exit -> Exit program ******");
        System.out.println();
        try {
            while (true) {
                System.out.println("Enter string: ");
                str = inputString().readLine();
                if (str.equals("exit")) {
                    close(inputString());
                }
                if (str.equals("back")) {
                    System.out.println("*************** End ContextPage  *****************");
                    System.out.println();
                    display(0);
                    return;
                }
                System.out.println("Enter the correct string (back or exit) ");
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(">>>>> ContextPage  " + e);
        }
    }
}
