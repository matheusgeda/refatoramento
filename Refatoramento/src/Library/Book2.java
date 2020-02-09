package Library;

import java.util.Scanner;

import static Library.Utils.clear;
import static Menus.Main_Menu.menu_principal;
import static People.Clients.client_list;

public class Book2 extends Book {
    public static void book_rent()
    {
        int opt, opt2, i;
        Scanner sc = new Scanner(System.in);
        if(Main.list.size()>0 && Main.clients.size()>0)
        {
            System.out.println("Qual seu perfil:");
            client_list();
            opt = sc.nextInt();
            if(Main.clients.get(opt-1).status == true)
            {
                System.out.println("Voce ja esta com um livro");
                menu_principal();
            }
            else{
                Main.clients.get(opt-1).status = true;
            }
            System.out.println("Qual desses livros voce deseja pegar:");
            for(i=1;i<=Main.list.size();i++) System.out.println(i + ". " + Main.list.get(i-1).title);
            opt2 = sc.nextInt();
            if(Main.list.get(opt2-1).status == true)
            {
                Main.list.get(opt2-1).status = false;
                System.out.println("Livro emprestado com sucesso");
            }else{
                System.out.println("Livro esta indisponivel no momento");
                Main.clients.get(opt-1).status = false;
                menu_principal();
            }
        }else {
            System.out.println("Clientes ou livros insuficientes.");
            menu_principal();
        }
    }
    public static void return_book()
    {
        int opt, opt2, i;
        Scanner sc = new Scanner(System.in);
        if(Main.clients.size() == 0 || Main.list.size() == 0) {
            System.out.println("Livros ou clientes insuficientes");
            menu_principal();
        }
        System.out.println("Qual seu perfil: ");
        client_list();
        opt = sc.nextInt();
        if(Main.clients.get(opt-1).status == true)
        {
            System.out.println("Qual desses livros voce deseja devolver:");
            for(i=1;i<=Main.list.size();i++) System.out.println(i + ". " + Main.list.get(i-1).title);
            opt2 = sc.nextInt();
            if (Main.list.get(opt2-1).status == false){
                Main.clients.get(opt-1).status = false;
                Main.list.get(opt2-1).status = true;
                clear();
                System.out.println("Livro devolvido");
                menu_principal();
            }
            else{
                System.out.println("Livro nao esta emprestado");
                menu_principal();
            }
        }
        else{
            System.out.println("Este perfil nao esta com um livro");
            menu_principal();
        }
    }
}
