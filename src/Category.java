/**
 * Класс, представляющий категорию задачи.
 */
public class Category {
    private String name;
    private int priority;
    private String type;

    /**
     * Конструктор для создания объекта Category.
     *
     * @param name     Название категории.
     * @param priority Приоритет категории (от 1 до 3, чем меньше значение, тем выше приоритет).
     * @param type     Тип категории (например, "Bug", "Feature", "Documentation").
     */
    public Category(String name, int priority, String type) {
        this.name = name;
        this.priority = priority;
        this.type = type;
    }

    /**
     * Возвращает название категории.
     *
     * @return Название категории.
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает приоритет категории.
     *
     * @return Приоритет категории.
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Возвращает тип категории.
     *
     * @return Тип категории.
     */
    public String getType() {
        return type;
    }

    /**
     * Переопределение метода equals для сравнения объектов Category.
     *
     * @param o Объект для сравнения.
     * @return true, если объекты равны, иначе false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (priority != category.priority) return false;
        if (name != null ? !name.equals(category.name) : category.name != null) return false;
        return type != null ? type.equals(category.type) : category.type == null;
    }

    /**
     * Переопределение метода hashCode для создания хэш-кода объекта Category.
     *
     * @return Хэш-код объекта.
     */
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + priority;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    /**
     * Возвращает строковое представление объекта Category.
     *
     * @return Строковое представление объекта Category.
     */
    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                ", type='" + type + '\'' +
                '}';
    }
}