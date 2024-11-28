/**
 * Класс, представляющий задачу с полями имя, приоритет и категория.
 */
public class Task implements Comparable<Task> {
    private String name;
    private int priority;
    private Category category;

    /**
     * Конструктор для создания объекта Task.
     *
     * @param name      Имя задачи.
     * @param priority  Приоритет задачи.
     * @param category  Категория задачи.
     */
    public Task(String name, int priority, Category category) {
        this.name = name;
        this.priority = priority;
        this.category = category;
    }

    /**
     * Возвращает имя задачи.
     *
     * @return Имя задачи.
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает приоритет задачи.
     *
     * @return Приоритет задачи.
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Возвращает категорию задачи.
     *
     * @return Категория задачи.
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Переопределение метода equals для сравнения объектов Task.
     *
     * @param o Объект для сравнения.
     * @return true, если объекты равны, иначе false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (priority != task.priority) return false;
        if (name != null ? !name.equals(task.name) : task.name != null) return false;
        return category != null ? category.equals(task.category) : task.category == null;
    }

    /**
     * Переопределение метода hashCode для создания хэш-кода объекта Task.
     *
     * @return Хэш-код объекта.
     */
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + priority;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        return result;
    }

    /**
     * Сравнивает текущий объект Task с другим объектом Task.
     * Сначала сравнивается приоритет задачи, а при одинаковом приоритете – по категориям в алфавитном порядке.
     *
     * @param other Другой объект Task для сравнения.
     * @return Результат сравнения: отрицательное число, если текущий объект меньше,
     *         положительное число, если текущий объект больше,
     *         ноль, если объекты равны.
     */
    @Override
    public int compareTo(Task other) {
        // Сначала сравниваем приоритет задачи
        int priorityComparison = Integer.compare(this.priority, other.priority);
        if (priorityComparison != 0) {
            return priorityComparison;
        }

        // Затем сравниваем категории в алфавитном порядке
        return this.category.getName().compareTo(other.category.getName());
    }

    /**
     * Возвращает строковое представление объекта Task.
     *
     * @return Строковое представление объекта Task.
     */
    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                ", category=" + category +
                '}';
    }
}