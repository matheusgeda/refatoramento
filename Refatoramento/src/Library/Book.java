package Library;

import java.util.*;

import static People.Clients.client_list;
import static Library.Utils.clear;
import static Library.Validate.*;
import static Menus.Main_Menu.menu_principal;

public class Book
{
    public String title;
    public String genre;
    public String author;
    public Boolean status; //se for verdadeiro o livro esta disponivel
    public static void add_book()
    {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        System.out.print("Digite o titulo:\n");
        b.title = sc.nextLine();
        System.out.print("Digite o genero:\n");
        b.genre = sc.nextLine();
        while (!is_valid_name(b.genre)){
            clear();
            System.out.println("Genero invalido!\nDigite um genero valido: ");
            b.genre = sc.nextLine();
        }
        System.out.print("Digite o autor:\n");
        b.author = sc.nextLine();
        while (!is_valid_name(b.author)){
            clear();
            System.out.println("Nome invalido!\nDigite um nome valido: ");
            b.author = sc.nextLine();
        }
        b.status = true;
        clear();
        System.out.print("Livro adicionado!\n\n");
        System.out.println("Titulo: " + b.title);
        System.out.println("Genero: " + b.genre);
        System.out.println("Autor: " + b.author);
        Main.list.add(b);
    }
    public static void book_sugestion()
    {
        String sugestion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o titulo do livro desejado:");
        sugestion = sc.nextLine();
        Main.sugestion.add(sugestion);
        clear();
        System.out.println("Livro adicionado a nossa lista de sugestoes");
    }
    public static void read_sugestions()
    {
        if(Main.sugestion.size() == 0){
            System.out.println("Nenhuma sugestao a ser lida");
            menu_principal();
        }
        for(int i=1;i<=Main.sugestion.size();i++) System.out.println(i + ". " + Main.sugestion.get(i-1));
        System.out.println();
    }
}