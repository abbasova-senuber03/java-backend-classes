package az.edu.turing.homework;
import java.util.*;
public class Homeworktask4App {
    public static void main(String[] args) {
            List<String> students = Arrays.asList(
                    "Rəvan Agayev", "Gülər Əbilova", "Yetər Nəbiyeva", "Mirzəyeva Dilbər",
                    "Ruslan Çərkəzov", "Sənubər Abbasova", "Fəxri Babayev", "Lalə Həmidova",
                    "Günay İskəndərova", "Ramina Səlimova", "Tural Nəzərov", "Rəvan Əliyev",
                    "İbrahim Ələkbərov", "Ella Piriyeva", "Aynur Məmmədova", "Ömər Ələkbərov",
                    "Famil Məmmədov", "Rena Mehdiyeva", "ƏliMurad", "Seyran Xəlilzadə",
                    "Hüseynov Məhəmməd", "Pərvin Bədəlova", "Nicat Məcidov"
            );

            List<Integer> positions = new ArrayList<>();
            for (int i = 1; i <= 23; i++) {
                positions.add(i);
            }

            Collections.shuffle(students);
            Collections.shuffle(positions);
            System.out.println("Random Order of Students and Positions:");
            for (int i = 0; i < students.size(); i++) {
                System.out.println("Position " + positions.get(i) + ": " + students.get(i));
            }
        }
    }
