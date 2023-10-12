## Exercícios 

Código fonte 1: 

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
2) Crie um Grafo de Fluxo de Controle para o método remove. Resposta em docs grafo.jpeg
3) Letra C
4) Forneça um conjunto de testes (ou seja, um conjunto de testes) que atinja 100% de cobertura de ramificação no método remove. 
Use o mínimo de testes possível. A documentação sobre os métodos LinkedList do Java 8, que podem ser necessários nos testes, 
pode ser encontrada em seu Javadoc.
5) ?
6) Código fonte 2:
7) 
```Java
public class RetornaSubString {
    
    public String sameEnds( String string ) { int length = string . length ();
        int half = length / 2;
        String left = ""; 
        String right = "";
        int size = 0;
        for (int i = 0; i < half; i++) {
            left = left + string.charAt(i);
            right = string.charAt(length - 1 - i) + right;
            if (left.equals(right)) { size = left.length();
            } }
        return string . substring (0 , size ); }
}
```

