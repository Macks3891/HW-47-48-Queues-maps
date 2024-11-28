import java.util.PriorityQueue;

/**
 * Класс для управления очередью задач с приоритетом.
 */
public class TaskManager {
    private PriorityQueue<Task> taskQueue;

    /**
     * Конструктор для создания объекта TaskManager.
     */
    public TaskManager() {
        this.taskQueue = new PriorityQueue<>();
    }

    /**
     * Добавляет задачу в очередь.
     *
     * @param task Задача для добавления.
     */
    public void addTask(Task task) {
        taskQueue.add(task);
    }

    /**
     * Извлекает и возвращает задачу с наивысшим приоритетом из очереди.
     *
     * @return Задача с наивысшим приоритетом.
     */
    public Task getNextTask() {
        return taskQueue.poll();
    }

    /**
     * Возвращает true, если очередь задач пуста, иначе false.
     *
     * @return true, если очередь задач пуста, иначе false.
     */
    public boolean isEmpty() {
        return taskQueue.isEmpty();
    }

    /**
     * Возвращает строковое представление очереди задач.
     *
     * @return Строковое представление очереди задач.
     */
    @Override
    public String toString() {
        return "TaskManager{" +
                "taskQueue=" + taskQueue +
                '}';
    }
}