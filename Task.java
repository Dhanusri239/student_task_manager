public class Task {
    private String name;
    private boolean isCompleted;

    public Task(String name) {
        this.name = name;
        this.isCompleted = false;  // Default status is incomplete
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return "Task: " + name + " | Status: " + (isCompleted ? "Completed" : "Pending");
    }
}
