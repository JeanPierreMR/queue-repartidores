package ufm.programacion.queue;

import java.util.Random;

public class List {
    Node head;
    int size;
    public List(){
        size = 0;
        head = null;
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
        }

    }
    public String getAll(){
        if(head == null){
            return null;
        }
        //starting the list with the name of the head
        String list = head.getData().getNombre();
        //Iteration over the linked list appending the name of each one
        Node actualNode = head.getNext();
        while(actualNode != head){
            list = list.concat(" " + actualNode.getData().getNombre());
            actualNode = actualNode.getNext();
        }
        return list;
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
    private Node searchNode(int numSS){
        if(head.getData().getNumeroSS() == numSS){
            return head;
        }
        Node actualNode = head.getNext();
        while(actualNode != head){
            if(actualNode.getData().getNumeroSS() == numSS){
                return actualNode;
            }else{
                actualNode = actualNode.getNext();
            }
        }
        return null;
    }
    private Node searchNextNode(int numSS){
        if(head.getData().getNumeroSS() > numSS){
            return head;
        }
        Node actualNode = head.getNext();
        while(actualNode != head){
            if(actualNode.getData().getNumeroSS() > numSS){
                return actualNode;
            }else{
                actualNode = actualNode.getNext();
            }
        }
        return null;
    }
    public void insert(Trabajador datos){
        size++;
        //creating the new node
        Node newNode = new Node(datos);
        Node nextNode = searchNextNode(datos.getNumeroSS());
        //checks if there is a head
        if(head == null){
            //set the node as head
            head = newNode;
        }else{
            //sets the conections behind the head
            Node last = nextNode.getPrevious();
            last.setNext(newNode);
            nextNode.setPrevious(newNode);
            newNode.setNext(nextNode);
            newNode.setPrevious(last);
        }
    }

    private void removeNode(Node nodo){
        if(nodo == head) {
            head = nodo.getNext();
        }
        size -=1;
        nodo.getPrevious().setNext(nodo.getNext());
        nodo.getNext().setPrevious(nodo.getPrevious());
    }
}
