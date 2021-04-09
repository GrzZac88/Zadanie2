import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        String dateStr1 = "2021-04-09 20:35";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        Task z1 = new Task("1", "Small", Category.NEW,
                LocalDateTime.parse(dateStr1, formatter));

        Task z2 = new Task("2", "Medium", Category.IN_PROGRESS,
                LocalDateTime.parse(dateStr1, formatter));

        Task z3 = new Task("3", "Large", Category.DONE,
                LocalDateTime.parse(dateStr1, formatter));

        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);

        Task z4 = new Task("FastForward", "+3months", Category.DONE,
                LocalDateTime.parse(dateStr1, formatter));

        System.out.println(z4);


        //+3 months
        LocalDateTime oldDateTime = z4.getTaskDateTimeStop();
        LocalDateTime newDateTime = oldDateTime.plusMonths(3);
        z4.setTaskDateTimeStop(newDateTime);

        System.out.println(z4);

        Task[] Zadania = {z1,z2,z3,z4};

        for(int i=0; i< Zadania.length; i++) {

            System.out.println(Zadania[i]);

        }
    }
}