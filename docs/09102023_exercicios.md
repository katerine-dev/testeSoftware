## Exercícios 


```Java
public class LinkedList {
    // Outros membros da classe, variáveis de instância, construtores, etc.

    public boolean remove (Object o){
        if (o == null ){
            for (Node<E> x = first; x != null ; x = x . nebhxt) {
                if( x.item == null) {
                    unlink (x) ;
                    return true ;
                }
            }
        } else {
            for ( Node<E> x = first ; x != null; x = x . next) {
                if(o.equals ( x . item )) {
                    unlink (x);
                    return true ;
                }
            }
        }
        return false;
    }
}
```

1) Crie uma suite de teste (um conjunto de testes em Junit) que garanta 100% de cobertura de código no método remove 
com a menor quantidade de código possível: Respostas em src/test/LinkedListTest
2) Crie um Grafo de Fluxo de Controle para o método remove. 

