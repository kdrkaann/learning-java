package generic;

public interface IDatabaseManager<T extends Student> {
    void add(T item);
    void remove(T item);
    void update(T item);
    T get(int id);
}
