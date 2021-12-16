public class UniversalLinkedList<T> {
    private UniversalLinkedListItem<T> head;

    public void add(T v) {
        if (head == null) {
            head = new UniversalLinkedListItem<T>(v);
        } else {
            UniversalLinkedListItem<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(new UniversalLinkedListItem<T>(v));
        }
    }

    public void remove(T v) {
        while (head != null && head.getValue().equals(v)) {
            head = head.getNext();
        }

        if (head == null) {
            return;
        }
        UniversalLinkedListItem<T> current = head;

        while (current.getNext() != null) {
            if (current.getNext().getValue().equals(v)) {
                current.setNext(current.getNext().getNext());
            } else {
                current = current.getNext();
            }
        }
    }


    @Override
    public String toString() {
        if (head == null) {
            return "List is empty!";
        }
        StringBuilder builder = new StringBuilder(head.toString());

        UniversalLinkedListItem<T> current = head.getNext();

        while (current != null) {
            builder.append(" -> ").append(current);
            current = current.getNext();
        }

        return builder.toString();
    }
}


