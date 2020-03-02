package ufm.programacion.queue;


public class Manager {
    List lista = new List();
    Queue colaIngreso = new Queue();
    public void agregar(int numeroSS, String nombre){
        Trabajador nuevoTrabajador = new Trabajador(numeroSS, nombre);
        colaIngreso.append(nuevoTrabajador);
    }
    public void actualizar(){
        Node head = colaIngreso.gethead();
        Trabajador persona = colaIngreso.pop();
        while(persona != null){
            lista.append(persona);
            persona = colaIngreso.pop();
        }
    }
    public void actualizar2(){
        Node head = colaIngreso.gethead();
        Trabajador persona = colaIngreso.pop();
        while(persona != null){
            lista.insert(persona);
            persona = colaIngreso.pop();
        }
    }
    public String colaAleatoria(){
        Queue colaEgreso = new Queue();
        copiarACola(colaEgreso);
        String str = "";
        Trabajador tem = colaEgreso.popRandom();
        while(tem != null){
            str = str + tem.getNombre();
            tem = colaEgreso.popRandom();
        }
        return str;
    }
    public void copiarACola(Queue colaEgreso){
        Node temporalNode = lista.head;
        colaEgreso.append(temporalNode.getData());
        temporalNode = temporalNode.getNext();
        while(temporalNode != lista.head){
            colaEgreso.append(temporalNode.getData());
            temporalNode = temporalNode.getNext();
        }
    }
    public void getRandom(){

    }
}