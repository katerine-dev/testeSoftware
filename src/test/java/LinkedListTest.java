import java.util.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
// Exercício 1:
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

        assertTrue(list.remove("a")); // Verifica se o método `remove("a") na lista `list` retorna true.
        /*
        Verifica o comportamento de remoção de elementos específicos da lista
        Ele cria uma lista vazia e adiciona o elemento "a"a ele e, em seguida verifica se é capaz de remove-la
        */
    }
/*
    Essa versão está dando erro:
    @Test
    public void removeElementInListTest(){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(7);

        assertTrue(list.remove(7));
    }
    Erro: Cannot resolve method 'assertTrue(Integer)'
 */

    @Test
    public void removeElementNotPresentTest(){
        LinkedList<String> list = new LinkedList<>();

        assertFalse(list.remove("a")); // O método remove("a") é usado para tentar remover a
        // primeira ocorrência do elemento "a" na lista. O valor de retorno desse método é verificado com o método assertFalse,
        // que verifica se a expressão passada como argumento é false

    }
        /*
        Verifica o comportamento de remoção de elementos da classe quando o elemento
        a ser removido não está presente na lista
        */
}
