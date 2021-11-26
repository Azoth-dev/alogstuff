import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@Getter
@Slf4j
public class MyLinkedList<E> {
    private MyLinkedList<E> nextElement;
    private E element;

    public MyLinkedList(E element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "element=" + element +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyLinkedList<?> that = (MyLinkedList<?>) o;
        return Objects.equals(element, that.element);
    }

    @Override
    public int hashCode() {
        return Objects.hash(element);
    }
}
