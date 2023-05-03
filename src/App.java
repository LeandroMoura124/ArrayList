import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //ArrayList é uma classe do java (que precisamos importar) que possibilita eu criar listas sem necessitar de declarar o tamanho especifico daquela lista
        //se eu criar um "String[] nome = new String[10]" e depois quisesse que esse array tivesse 11 posicoes, eu teria que criar um novo 
        //entao o arraylist possibilita eu criar uma lista sem declarar seu tamanho e usar quantas posicoes eu quiser que ele irá adicionando posicoes dinamicamente

        // ArrayList exemplo = new ArrayList();


        //Declarando um array list de string
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Leandro");
        nomes.add("Java");
        System.out.println(nomes.contains("Leandro")); //retorna true, existe o nome Leandro na lista
        System.out.println(nomes.contains("c#")); //false

        // o remove remove somente a primeira ocorrência daquele objeto. Se houver mais de um elemento com o mesmo nome, ele nao removera todos, apenas 1
        nomes.remove("Leandro");
        System.out.println(nomes.size()); // o size no arraylist é como se fosse o lenght, imprime o tamanho


        //convertendo o toList pra um Array
        
        ArrayList<String> nomess = new ArrayList<String>();
        nomes.add("certificação");
        nomes.add("java");

        String[] nomes2 = nomes.toArray(new String[0]);
        String[] nomes3 = nomes.toArray(new String[nomess.size()]);
   



        /*Juntando varios arrayslist em um só */
        //Metodo addAll()
        ArrayList<String> paises = new ArrayList<>();
        paises.add("Brasil");
        paises.add("Korea");

        ArrayList tudo = new ArrayList<>();

        //addAll - juntar todos
        tudo.addAll(paises);
        tudo.addAll(nomes);
        System.out.println(tudo); //imprime Brasil, Korea, e Java
        System.out.println(tudo.size()); //3 elementos


        //metodo get() no array list retorna o elemento na respectiva posicao que voce especificar
        System.out.println(tudo.get(2)); // retorna Java

   
        tudo.add(0, "c#"); //adicionando c# na posicao 0 do arrayList
        System.out.println(tudo.get(0));

        //removendo o c# pela posicao com o remove - o metodo remove tem varias sobrecargas, tem como remover pela posicao e pelo nome etc...
        tudo.remove(0);
        
        System.out.println(tudo); 
        //o metodo set () no arrayList, ao contrario do add, ele substitui, altera o valor que estava e manda ele pra fora da lista
        tudo.set(0, "php"); // colocou php no lugar de Brasil
        System.out.println(tudo); 

        //indexOF() monstrando em qual posicao está aquele elemento
        System.out.println(tudo.indexOf("Korea")); //retorna 1
        //lastIndexOF() mostrando qual a ULTIMA posicao aquele elemento se encontra -- ou seja, posso ter aquele elemento varias vezes na lista
        // mas ele ira retornar apenas a ultima posicao que se encontra ele
        tudo.add("Korea");
        System.out.println(tudo.lastIndexOf("Korea")); //retorna 3



        //sempre que o indexOF ou Lastindexof nao encontrar o elemento dito na lista, ele retorna -1
    }
}
