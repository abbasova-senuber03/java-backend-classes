package az.edu.turing.homework;
import java.util.Scanner;
public class Homeworktask3App {
        public static void main(String[] args) {
            String[][] schedule = new String[7][2];
            schedule[0][0] = "Sunday"; schedule[0][1] = "do homework";
            schedule[1][0] = "Monday"; schedule[1][1] = "go to courses; watch a film";
            schedule[2][0] = "Tuesday"; schedule[2][1] = "study Java";
            schedule[3][0] = "Wednesday"; schedule[3][1] = "gym; buy groceries";
            schedule[4][0] = "Thursday"; schedule[4][1] = "read book; clean room";
            schedule[5][0] = "Friday"; schedule[5][1] = "meet friends";
            schedule[6][0] = "Saturday"; schedule[6][1] = "relax; watch TV";

            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.print("Please, input the day of the week: ");
                String input = scanner.nextLine().trim().toLowerCase();
                if (input.equals("exit")) {
                    running = false;
                    System.out.println("Exiting the program.");
                } else if (input.startsWith("change") || input.startsWith("reschedule")) {
                    String[] parts = input.split("\\s+");
                    if (parts.length == 2) {
                        String day = parts[1];
                        day = day.substring(0, 1).toUpperCase() + day.substring(1).toLowerCase();
                        boolean dayFound = false;
                        for (int i = 0; i < 7; i++) {
                            if (schedule[i][0].equals(day)) {
                                dayFound = true;
                                System.out.print("Please, input new tasks for " + day + ": ");
                                String newTasks = scanner.nextLine();
                                schedule[i][1] = newTasks;
                                System.out.println("Tasks for " + day + " have been updated.");
                                break;
                            }
                        }

                        if (!dayFound) {
                            System.out.println("Sorry, I don't understand you, please try again.");
                        }
                    } else {
                        System.out.println("Invalid command. Please try again.");
                    }
                } else {
                    boolean dayFound = false;
                    for (int i = 0; i < 7; i++) {
                        if (schedule[i][0].toLowerCase().equals(input)) {
                            dayFound = true;
                            System.out.println("Your tasks for " + schedule[i][0] + ": " + schedule[i][1]);
                            break;
                        }
                    }

                    if (!dayFound) {
                        System.out.println("Sorry, I don't understand you, please try again.");
                    }
                }
            }
        }
    }


