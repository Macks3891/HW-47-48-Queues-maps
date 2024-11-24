/**
 * Главный класс для создания и управления задачами.
 */
public class Main {
    public static void main(String[] args) {
        // Создаем категории
        Category bugCategory = new Category("Bug", 1, "Bug");
        Category featureCategory = new Category("Feature", 2, "Feature");
        Category documentationCategory = new Category("Documentation", 3, "Documentation");

        // Создаем задачи
        Task task1 = new Task("Fix critical bug", 1, bugCategory);
        Task task2 = new Task("Implement new feature", 2, featureCategory);
        Task task3 = new Task("Update documentation", 3, documentationCategory);
        Task task4 = new Task("Fix minor bug", 2, bugCategory);
        Task task5 = new Task("Refactor code", 1, featureCategory);
        Task task6 = new Task("Add new section to docs", 1, documentationCategory);


        TaskManager taskManager = new TaskManager();


        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        taskManager.addTask(task4);
        taskManager.addTask(task5);
        taskManager.addTask(task6);


        while (!taskManager.isEmpty()) {
            Task task = taskManager.getNextTask();
            System.out.println(task);
        }
    }
}