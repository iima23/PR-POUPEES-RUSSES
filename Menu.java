import java.util.Scanner;
class Menu {
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Enter the size of the first doll");
        int sizePoupee1 = scanner.nextInt();
        PoupeeRusse poupee1 = new PoupeeRusse(sizePoupee1);
        System.out.println("2. Enter the size of the second one");
        int sizePoupee2 = scanner.nextInt();
        PoupeeRusse poupee2 = new PoupeeRusse(sizePoupee2);
        System.out.println("3. Enter the size of the third doll");
        int sizePoupee3 = scanner.nextInt();
        PoupeeRusse poupee3 = new PoupeeRusse(sizePoupee3);
        PoupeeRusse P = null;
        int optionofpoupee;
        do {
            System.out.println("Choose one ");
            optionofpoupee = scanner.nextInt();
            switch (optionofpoupee) {
                case 1:
                    P = poupee1;
                    break;
                case 2:
                    P = poupee2;
                    break;
                case 3:
                    P = poupee3;
                    break;
                case 4:
                    System.out.println("Exit program");
                    return;
                default:
                    System.out.println("Error");
            }
            if (optionofpoupee != 0 && P != null) {
                int option;
                do {
                    System.out.println("Menu ");
                    System.out.println("1. Open Poupee");
                    System.out.println("2. Close Poupee");
                    System.out.println("3. PlaceIn(Poupee p)");
                    System.out.println("4. Takeout(Poupee p)");
                    System.out.println("5. Exit");
                    System.out.println("Choose an option");
                    option = scanner.nextInt();

                    switch (option) {
                        case 1:
                            P.openPoupee();
                            break;
                        case 2:
                            P.closePoupee();
                            break;
                        case 3:
                            System.out.println("Enter the number of poupee to be placed in");
                            int poupeeplacedinChoice = scanner.nextInt();
                            if (poupeeplacedinChoice == 1) {
                                P.placeIn(poupee1);
                            } else if (poupeeplacedinChoice == 2) {
                                P.placeIn(poupee2);
                            } else if (poupeeplacedinChoice == 3) {
                                P.placeIn(poupee3);
                            } else {
                                System.out.println("Error");
                                break;
                            }
                            break;
                        case 4:
                            System.out.println("Enter the poupee to be token out ");
                            int poupeetokenoutChoice = scanner.nextInt();
                            if (poupeetokenoutChoice == 1) {
                                P.takeOut(poupee1);
                            } else if (poupeetokenoutChoice == 2) {
                                P.takeOut(poupee2);
                            } else if (poupeetokenoutChoice == 3) {
                                P.takeOut(poupee3);
                            } else {
                                System.out.println("Error");
                                break;
                            }
                            break;
                        case 5:
                            System.out.println("Exit");
                            break;
                        default:
                            System.out.println("Invalid option");
                    }
                } while (option != 5);
            }
        } while (optionofpoupee != 0);
    }
}