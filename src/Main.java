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

        Task[] Zadania = {z1, z2, z3, z4};

        for (int i = 0; i < Zadania.length; i++) {

            System.out.println(Zadania[i]);

        }

        //Zadanie3 - 1

        Subtask subtask = new Subtask("Przykład 3.1",
                "Opis 3.1", Category.NEW,
                LocalDateTime.parse(dateStr1, formatter),
                "Subtask 3.1");
        System.out.println(subtask);

        //Zadanie3 - 2

        Task subtaskA1 = new Subtask("Przykład A1",
                "Opis A1", Category.NEW,
                LocalDateTime.parse(dateStr1, formatter), "Subtask A1");

        Task subtaskB2 = new Subtask("Przykład B2",
                "Opis B2", Category.NEW,
                LocalDateTime.parse(dateStr1, formatter), "Subtask B2");

        Task subtaskC3 = new Subtask("Przykład C3",
                "Opis C3", Category.NEW,
                LocalDateTime.parse(dateStr1, formatter), "Subtask C3");

        Task taskD4 = new Task("Przykład D4",
                "Opis D4", Category.NEW,
                LocalDateTime.parse(dateStr1, formatter));

        Task taskE5 = new Task("Przykład E5",
                "Opis E5", Category.NEW,
                LocalDateTime.parse(dateStr1, formatter));

        Task taskF6 = new Task("Przykład F6",
                "Opis F6", Category.NEW,
                LocalDateTime.parse(dateStr1, formatter));


        System.out.println(subtaskA1 +"\n" +subtaskB2 +"\n" +subtaskC3 +"\n" +taskD4 +"\n" +taskE5 +"\n" +taskF6);

        // Zadanie 3 - 3

        Object subtaskGra1 = new Subtask("Makao1",
                "OpisMakao1", Category.NEW,
                LocalDateTime.parse(dateStr1, formatter), "subtaskMakao1");

        Object subtaskGra2 = new Subtask("Poker2",
                "OpisPoker2", Category.NEW,
                LocalDateTime.parse(dateStr1, formatter), "subtaskPoker2");

        Object subtaskGra3 = new Subtask("Wojna3",
                "OpisWojna3", Category.NEW,
                LocalDateTime.parse(dateStr1, formatter), "subtaskWojna3");

        Object taskGra4 = new Task("TaskGwint4",
                "OpisGwint4", Category.NEW,
                LocalDateTime.parse(dateStr1, formatter));

        Object taskGra5 = new Task("TaskHearthstone5",
                "OpisHearthstone5", Category.NEW,
                LocalDateTime.parse(dateStr1, formatter));

        Object taskGra6 = new Task("TaskPiotruś6",
                "OpisPiotruś6", Category.NEW,
                LocalDateTime.parse(dateStr1, formatter));


        System.out.println(subtaskGra1 +"\n" +subtaskGra2 +"\n" +subtaskGra3 +"\n" +taskGra4 +"\n" +taskGra5 +"\n" +taskGra6);



        // Zadanie 3 - 4

        getDetailInfo(subtaskGra1);
        getDetailInfo(taskD4);

    }

    public static void getDetailInfo(Object o)
    {
        String Zad4 = "";
        if(o.getClass() == Task.class || o.getClass() == Subtask.class)

        {
            Task task = (Task) o;
            String subtaskName = null;
            if (task.getClass() == Subtask.class)
                subtaskName = ((Subtask) task).getSubtaskName();
            Zad4 += getLine("taskName", task.getTaskName())
                    + getLine("taskDescription", task.getTaskDescription())
                    + getLine("taskCategory", task.getTaskCategory())
                    + getLine("taskDateTimeStart", task.getTaskDateTimeStart())
                    + getLine("taskDateTimeStop", task.getTaskDateTimeStop())
                    + getLine("subtaskTitle", subtaskName);
        }
        System.out.println(Zad4);

    }

    private static String getLine(String X, Object Y)

    {

        int Pole = 40;
        String Odstęp = "                                        ";
        String BD = "B/D";
        if(null != Y) {

            BD = Y.toString();

        }
        return '|' + X + Odstęp.substring(0,Pole-X.length()) + '|' + BD + Odstęp.substring(0,Pole-BD.length()) + '|'+ '\n';


    }
}