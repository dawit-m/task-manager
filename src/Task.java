public class Task {
    private int id; // unique identifier
    private String title; // short task name
    private String description; // longer text
    private String deadline; // for now, a string, later LocalDate
    private boolean completed; // true = done, false = not done

    public Task(int id, String title, String description, String deadline) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.completed = false; // default
    }

    public void markCompleted() {
        this.completed = true;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    // Optional for debugging
    @Override
    public String toString() {
        return "Task ID: " + id + ", Title: " + title + ", Completed: " + completed;
    }
}