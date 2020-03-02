package ufm.programacion.queue;

import java.util.Random;

public class Queue {
    Node head;
    int size;
    public Queue(){
        head = null;
        size = 0;
    }
    public void append(Trabajador datos){
        size++;
        //creating the new node
        Node newNode = new Node(datos);
        //checks if there is a head
        if(head == null){
            //set the node as head
            head = newNode;
        }else{
            //sets the conections behind the head
            Node last = head.getPrevious();
            last.setNext(newNode);
            head.setPrevious(newNode);
            newNode.setNext(head);
            newNode.setPrevious(last);
            head = newNode;
        }

    }
    public Trabajador pop(){
        Node temporal = head;
        if(head == null){
            return null;
        }
        removeNode(head);
        return temporal.getData();
    }
    public Trabajador popRandom(){
        Node iteracion = getRandom();
        if(iteracion == null){
            return null;
        }
        Node temporal = iteracion;
        removeNode(iteracion);
        return temporal.getData();
    }
    public Node gethead(){
        return head;
    }
    public void remove(String name){
        removeNode(searchNode(name));
    }
    public String getAll(){
        if(head == null){
            return null;
        }
        //starting the list with the name of the song head
        String list = head.getData().getNombre();
        //Iteration over the linked list appending the name of each song
        Node actualNode = head.getNext();
        while(actualNode != head){
            list = list.concat(" " + actualNode.getData().getNombre());
            actualNode = actualNode.getNext();
        }
        return list;
    }
    public Trabajador getNext(String name){
        return searchNode(name).getNext().getData();
    }
    public Trabajador getPrevious(String name){
        return searchNode(name).getPrevious().getData();
    }
    private Node searchNode(String name){
        if(head.getData().getNombre().equals(name)){
            return head;
        }
        Node actualNode = head.getNext();
        while(actualNode != head){
            if(actualNode.getData().getNombre().equals(name)){
                return actualNode;
            }else{
                actualNode = actualNode.getNext();
            }
        }
        return null;
    }
    private Node searchNodeName(String name){
        if(head.getData().getNombre().equals(name)){
            return head;
        }
        Node actualNode = head.getNext();
        while(actualNode != head){
            if(actualNode.getData().getNombre().equals(name)){
                return actualNode;
            }else{
                actualNode = actualNode.getNext();
            }
        }
        return null;
    }
    private Node searchNodeNumero(String name){
        if(head.getData().getNombre().equals(name)){
            return head;
        }
        Node actualNode = head.getNext();
        while(actualNode != head){
            if(actualNode.getData().getNombre().equals(name)){
                return actualNode;
            }else{
                actualNode = actualNode.getNext();
            }
        }
        return null;
    }

    private void removeNode(Node datos){
        if(datos == head) {
            head = datos.getNext();
        }
        size --;
        if(datos == head){
            head = null;
        }

        datos.getPrevious().setNext( datos.getNext());
        datos.getNext().setPrevious(datos.getPrevious());

    }
    public Node getRandom(){
        if(head == null){
            return null;
        }
        Random rand = new Random();
        int a = rand.nextInt(size + 1);
        int i = 0;
        //Iteration over the linked list
        Node actualNode = head.getNext();
        while(i != a){
            i++;
            actualNode = actualNode.getNext();
        }
        return actualNode;
    }
}
