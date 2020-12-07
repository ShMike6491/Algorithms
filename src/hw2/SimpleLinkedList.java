package hw2;
class Link<T> {
    private T link;
    private Link<T> next;

    public Link(T link) {this.link = link;}
    public Link<T> getNext() {return next;}
    public void setNext(Link<T> next) {this.next = next;}
    public T getValue() {return link;}
}

public class SimpleLinkedList<T> {
    private Link<T> first;

    public SimpleLinkedList() {first = null;}
    public boolean isEmpty() {return (first == null);}
    public void insert(T link) {
        Link<T> l = new Link<>(link);
        l.setNext(first);
        this.first = l;
    }
    public Link<T> delete() {
        Link<T> temp = first;
        first = first.getNext();
        return temp;
    }
    public void print() {
        Link<T> current = first;
        while(current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
    public T find(T item) {
        Link<T> x = new Link<>(item);
        Link<T> current = first;
        while(current != null) {
            if(x.getValue().equals(current.getValue())) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

}
