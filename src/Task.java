import java.time.LocalDateTime;
public class Task {

    private String taskName;
    private String taskDescription;
    private Category taskCategory;
    private LocalDateTime taskDateTimeStart;
    private LocalDateTime taskDateTimeStop;

    public Task(String taskName,
                String taskDescription,
                Category taskCategory,
                LocalDateTime taskDateTimeStop) {

        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskCategory = taskCategory;
        this.taskDateTimeStop = taskDateTimeStop;
        this.taskDateTimeStart = LocalDateTime.now();

    }

    public String getTaskName() {

        return taskName;

    }

    //G

    public String getTaskDescription() {
        return taskDescription;
    }

    public Category getTaskCategory() {
        return taskCategory;
    }

    public LocalDateTime getTaskDateTimeStart() {
        return taskDateTimeStart;
    }

    public LocalDateTime getTaskDateTimeStop() {
        return taskDateTimeStop;
    }

    //S

    public void setTaskName(String newTaskName) {
        this.taskName = newTaskName;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setTaskCategory(Category taskCategory) {
        this.taskCategory = taskCategory;
    }

    public void setTaskDateTimeStart(LocalDateTime taskDateTimeStart) {
        this.taskDateTimeStart = taskDateTimeStart;
    }

    public void setTaskDateTimeStop(LocalDateTime taskDateTimeStop) {
        this.taskDateTimeStop = taskDateTimeStop;
    }

    public String toString() {

        String output = "Hello ^.^" + '\n';
        output += "taskName = " + taskName + '\n';
        output += "taskDescription = " + taskDescription + '\n';
        output += "category = " + taskCategory + '\n';
        output += "taskDateTimeStart = " + taskDateTimeStart + '\n';
        output += "taskDateTimeStop = " + taskDateTimeStop + '\n';
        return output;

    }
}
