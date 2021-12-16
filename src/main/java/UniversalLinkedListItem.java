import java.util.Objects;

public class UniversalLinkedListItem<T> {
    private T value;
    private UniversalLinkedListItem<T> next;

    public UniversalLinkedListItem(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public UniversalLinkedListItem<T> getNext() {
        return next;
    }

    public void setNext(UniversalLinkedListItem<T> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniversalLinkedListItem<?> that = (UniversalLinkedListItem<?>) o;
        return Objects.equals(value, that.value) && Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}