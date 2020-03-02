package ufm.programacion.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class APITest {
    Manager manager = new Manager();
    @Test
    void testOne() {
        manager.agregar(34, "John");
        assertEquals(null,manager.lista.getAll());
        manager.actualizar();
        assertEquals("John",manager.lista.getAll());

        assertEquals("John",manager.colaAleatoria());
    }

    @Test
    void TestTwo() {
        manager.agregar(34, "John");
        manager.agregar(33, "Mafer");
        assertEquals(null,manager.lista.getAll());
        manager.actualizar();
        assertEquals("Mafer John",manager.lista.getAll());
        manager.colaAleatoria();
        String orden = manager.colaAleatoria();
        assertEquals(true,orden.equals("MaferJohn") || orden.equals("JohnMafer") );
    }

    @Test
    void update() {
        manager.agregar(34, "John");
        manager.agregar(33, "Mafer");
        assertEquals(null,manager.lista.getAll());
        manager.actualizar();
        assertEquals("Mafer John",manager.lista.getAll());
    }

    @Test
    void getList() {
        manager.agregar(34, "John");
        assertEquals(null,manager.lista.getAll());
        manager.actualizar();
        assertEquals("John",manager.lista.getAll());
        manager.agregar(36, "Mafer");
        manager.actualizar();
        assertEquals("John Mafer",manager.lista.getAll());
    }
}