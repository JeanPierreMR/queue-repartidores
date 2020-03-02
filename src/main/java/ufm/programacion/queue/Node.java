package ufm.programacion.queue;

public class Node {
    private Trabajador data;
    private Node next;
    private Node previous;

    Node(Trabajador data)
    {
        this.data = data;
        this.next = this;
        this.previous = this;
    }
    Node(Trabajador data, Node next)
    {
        this.data = data;
        this.next = next;
        this.previous = this;
    }
    Node(Trabajador data, Node next, Node previous)
    {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public Trabajador getData() {
        return data;
    }

    public void setData(Trabajador cancion) {
        this.data = cancion;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}

