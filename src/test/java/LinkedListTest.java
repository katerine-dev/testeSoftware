import java.util.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest {
    @Test
    public void removeNullListTest(){
        LinkedList<Integer> list = new LinkedList<>(); // armazena elementos inteiros

        list.add(null); // Um elemento nulo é adicionado à lista criada no passo anterior. (Um único elemento nulo)

        assertTrue(list.remove(null)); // Verifica se a chamada do método `remove(null)` na `list` retorna `true`.
        /*
        O método `remove(null)` é usado para remover a primeira ocorrência do elemento nulo na lista.
        Portanto, se o elemento nulo estiver na list e for removido com sucesso, esta asserção passará.
        Caso o contrário, ele falhará, indicando um problema na implementação da lista encadeada.
        Verifica o comportamento de remoção de elementos nulos dessa lista encadeada.
         */
    }

    @Test
    public void removeElementInListTest(){
        LinkedList<String> list = new LinkedList<>();

        list.add("a");

        assertTrue(list.remove("a"));
    }
}
