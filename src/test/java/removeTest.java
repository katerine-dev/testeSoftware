import java.util.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Exercício 4:

public class removeTest {
    // 1) Teste de remoção de um elemento que está na lista:
    @Test
    public void removeElementInListTest(){
        LinkedList<String> list = new LinkedList<>(); // criando uma lista

        list.add("a"); // adicionando um elemento a lista

        assertTrue(list.remove("a")); // verifica se o elemento foi removido com sucesso
    }
    // 2) Teste de remoção de um elemento que não está na lista
    @Test
    public void removeElementNotPresentTest(){
        LinkedList<String> list = new LinkedList<>();

        assertFalse(list.remove("a")); // tentando remover elemento que não está na lista

    }
    // 3) Teste de remoção de um elemento que está na lista com vários elementos ==
    @Test
    public void removeMultipleElementIguais(){
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("a");
        assertTrue(list.remove("a"));
        assertEquals("b", list.getFirst());

    }
    // 4) Teste de remoção em uma lista vazia:
    @Test
    public void removeNullListTest(){
        LinkedList<Integer> list = new LinkedList<>();

        assertFalse(list.remove("a"));

    }
    // 5) Teste de remoção em uma lista com diferentes tipos de elementos
    @Test
    public void testRemoveDifferentElementTypes() {
        LinkedList<Object> list = new LinkedList<>(); // Lista de vários tipos de elementos
        list.add("string");
        list.add(123);
        assertFalse(list.remove("String"));
    }

}
