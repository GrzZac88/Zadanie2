import java.time.LocalDateTime;

public class Subtask extends Task
{

    private String SubtaskName;

    public Subtask(String taskName, String taskDescription, Category taskCategory, LocalDateTime taskDateTimeStop, String subtaskName) {
        super(taskName, taskDescription, taskCategory, taskDateTimeStop);
        this.SubtaskName = subtaskName;

    }

    public Subtask()
    {
        super("Zadanie", "Opis", Category.NEW, LocalDateTime.now());
        this.SubtaskName = "Subtask";

    }

    public String getSubtaskName()
    {
        return SubtaskName;
    }

    public void setSubtaskName(String subtaskName)
    {
        this.SubtaskName = subtaskName;
    }

    @Override

    public String toString()
    {
        String output = "";
        output += super.toString();
        output += "SubtaskName = " + SubtaskName + '\n';
        return output;
    }

}
