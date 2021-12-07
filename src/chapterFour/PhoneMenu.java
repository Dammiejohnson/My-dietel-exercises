package chapterFour;

import java.util.Scanner;
public class PhoneMenu {
    public static void main(String[] args) {
        String menuOptions = """
                1. Phonebook
                2. Messages
                3. Chat
                4. Call Register
                5. Tones
                6. Settings
                7. Call Divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM servivces
                     """;
        System.out.println(menuOptions);
            Scanner input = new Scanner (System.in);
            int remote = input.nextInt();
        switch (remote) {
            case 1 : {
                System.out.println("Phonebook");
                int subRemote = input.nextInt();
                switch (subRemote) {
                    case 1 -> System.out.println("1. Search");
                    case 2 -> System.out.println("2. Service Nos");
                    case 3 -> System.out.println("3. Add Name");
                    case 4 -> System.out.println("4. Erase");
                    case 5 -> System.out.println("5. Edit");
                    case 6 -> System.out.println("6. Assign tone");
                    case 7 -> System.out.println("7. Send b'card");
                    case 8 -> {
                        System.out.println("8. Options");
                        int press = input.nextInt();
                        switch (press) {
                            case 1 -> System.out.println("1. Type of View");
                            case 2 -> System.out.println("2. Memory Status");
                            default -> System.out.println("Wrong Dial");
                        }
                    }

                    case 9 -> System.out.println("9. Speed dials");
                    case 10 -> System.out.println("10. Voice tags");
                    default -> System.out.println("Invalid dial");
                }
            }
            break;
            case 2 : {
                System.out.println("2. Messages");
                int press = input.nextInt();
                switch (press) {
                    case 1 -> System.out.println("1. Write messages");
                    case 2 -> System.out.println("2. Inbox");
                    case 3 -> System.out.println("3. Outbox");
                    case 4 -> System.out.println("4. Picture messages");
                    case 5 -> System.out.println("5. Templates");
                    case 6 -> System.out.println("6. Smileys");
                    case 7 -> {
                        System.out.println("7. Message Settings");
                        int insert = input.nextInt();
                        switch (insert) {
                            case 1 -> {
                                System.out.println("1. Set");
                                int insert1 = input.nextInt();
                                switch (insert1) {
                                    case 1 -> System.out.println("1. Message centre number");
                                    case 2 -> System.out.println("2. Message sent as");
                                    case 3 -> System.out.println("3. Message validity");
                                    default -> System.out.println("invalid");
                                }
                            }
                            case 2 -> {
                                System.out.println("Common");
                                int insert2 = input.nextInt();
                                switch (insert2) {
                                    case 1 -> System.out.println("1. Deliver reports");
                                    case 2 -> System.out.println("2. Reply via same centre");
                                    case 3 -> System.out.println("3. Character support");
                                    default -> System.out.println("error");
                                }
                            }
                            default -> System.out.println("Error dial");
                        }

                    }
                    case 8 -> System.out.println("Info service");
                    case 9 -> System.out.println("Voice mailbox number");
                    case 10 -> System.out.println("Service command editor");
                    default -> System.out.println("Error dial");
                }
            }
            break;
            case 3 :
                System.out.println("Chat");
                break;
            case 4 : {
                System.out.println("Call Register");
                int buttons = input.nextInt();
                switch (buttons) {
                    case 1 -> System.out.println("1. Missed calls");
                    case 2 -> System.out.println("2. Received calls");
                    case 3 -> System.out.println("3. Dialled calls");
                    case 4 -> System.out.println("4. Erase recent call lists");

                    case 5 -> {
                        System.out.println("5. Show call duration");
                        int button = input.nextInt();
                        switch (button) {
                            case 1 -> System.out.println("1. Last call duration");
                            case 2 -> System.out.println("2. All calls duration");
                            case 3 -> System.out.println("3. Received calls' duration");
                            case 4 -> System.out.println("4. Dialled calls' duration");
                            case 5 -> System.out.println("Clear timers");
                            default -> System.out.println("invalid dial");
                        }
                    }
                    case 6 -> {
                        System.out.println("6. Show call costs");
                        int button4 = input.nextInt();
                        switch (button4) {
                            case 1:
                                System.out.println("1. Last call cost");
                                break;
                            case 2:
                                System.out.println("2. All calls' cost");
                                break;
                            case 3:
                                System.out.println("3. Clear counters");
                            default:
                                System.out.println("invalid key");
                        }
                    }
                    case 7 -> {
                        System.out.println("7. Call cost settings");
                        int button2 = input.nextInt();
                        switch (button2) {
                            case 1 -> System.out.println("1. Call cost limit");
                            case 2 -> System.out.println("2. Show costs in");
                            default -> System.out.println("invalid key");
                        }
                    }

                    case 8 -> System.out.println("8. Prepaid credit");
                    default -> System.out.println("invalid");
                }
            }
            break;
            case 5: {
                System.out.println("Tones");
                int button3 = input.nextInt();
                switch (button3) {
                    case 1 -> System.out.println("1.Ringing tone");
                    case 2 -> System.out.println("2. Ringing Volume");
                    case 3 -> System.out.println("3. Incoming call alert");
                    case 4 -> System.out.println("4. Compposer");
                    case 5 -> System.out.println("5. Message  alert tone");
                    case 6 -> System.out.println("6. Keypad tones");
                    case 7 -> System.out.println("7. Warning and game tones");
                    case 8 -> System.out.println("8. Vibrating alert");
                    case 9 -> System.out.println("9. Screen saver");
                    default -> System.out.println("invalid dial");
                }

            }
                break;

            case 6: {
                System.out.println("Settings");
                int button1 = input.nextInt();
                switch (button1) {
                    case 1 : {
                        System.out.println("1. Call Settings");
                        int button5 = input.nextInt();
                        switch (button5) {
                            case 1 -> System.out.println("1. Automatic redial");
                            case 2 -> System.out.println("2. Speed dialling");
                            case 3 -> System.out.println("3. Call waiting options");
                            case 4 -> System.out.println("4. Own number sending");
                            case 5 -> System.out.println("5. Phone line in use");
                            case 6 -> System.out.println("6. Automatic answer");
                            default -> System.out.println("invalid dial");
                        }
                    }
                    case 2 : {
                        System.out.println("2. Phone Setting");
                        int button6 = input.nextInt();
                        switch (button6) {
                            case 1 -> System.out.println("1. Language");
                            case 2 -> System.out.println("2. Cell info display");
                            case 3 -> System.out.println("3. Welcome note");
                            case 4 -> System.out.println("4.Network Selection");
                            case 5 -> System.out.println("5. Lights");
                            case 6 -> System.out.println("6. Confirm SiM service actions");
                            default -> System.out.println("invalid dial");
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("3. Security Settings");
                        int button7 = input.nextInt();
                        switch (button7) {
                            case 1 -> System.out.println("1. PIN code request");
                            case 2 -> System.out.println("2. Call barring service");
                            case 3 -> System.out.println("3. Fixed dialling");
                            case 4 -> System.out.println("4.Closed user group");
                            case 5 -> System.out.println("5. Phone security");
                            case 6 -> System.out.println("6. Change access codes");
                            default -> System.out.println("invalid dial");
                        }
                    }
                            break;
                        case 4:
                            System.out.println("3. Restore factory settings");
                        default:
                            System.out.println("invalid key");
                    }
                }
                break;
            case 7:
                System.out.println("Call Divert");
                break;
            case 8:
                System.out.println("Games");
                break;
            case 9:
                System.out.println("Calculator");
                break;
            case 10:
                System.out.println("Reminders");
                break;
            case 11: {
                System.out.println("Clock");
                int button8 = input.nextInt();
                switch (button8) {
                    case 1 -> System.out.println("1. Alarm clock");
                    case 2 -> System.out.println("2. Clock settings");
                    case 3 -> System.out.println("3. Date settings");
                    case 4 -> System.out.println("4.Stopwatch");
                    case 5 -> System.out.println("5. Countdown timer");
                    case 6 -> System.out.println("6. Auto update of date and time");
                    default -> System.out.println("invalid dial");
                }
            }
                break;
            case 12:
                System.out.println("Profiles");
                break;
            case 13:
                System.out.println("SIM services");
            default:
                System.out.println("Invalid dial");


                }
            }
        }