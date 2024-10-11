//# Programa em Python para gerenciar uma agenda telefÃ´nica:

//# Valida Dados de Contato: Recebe e valida nomes e nÃºmeros de telefone.
//# Armazena Dados em um DicionÃ¡rio: Usa um dicionÃ¡rio para armazenar contatos, onde a chave Ã© o nome e o valor Ã© o nÃºmero de telefone.
//# Salva e Carrega Dados em Arquivo .json: Grava e lÃª os dados em um arquivo JSON.
//# Estrutura do Programa
//# Coletar e Validar Dados:

//# Receber nome e nÃºmero de telefone do usuÃ¡rio.
//# Validar o formato do nÃºmero de telefone.
//# Manipular Dados:

//# Adicionar, editar e excluir contatos no dicionÃ¡rio.
//# Salvar e Carregar Dados:

//# Gravar e ler dados em um arquivo JSON.

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhonebookManager {

    private static final String FILE_NAME = "contacts.json";
    private static Map<String, String> contacts = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Gson gson = new Gson();

    public static void main(String[] args) {
        loadContacts();
        while (true) {
            System.out.println("1. Adicionar contato");
            System.out.println("2. Editar contato");
            System.out.println("3. Excluir contato");
            System.out.println("4. Listar contatos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opÃ§Ã£o: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    editContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    listContacts();
                    break;
                case 5:
                    saveContacts();
                    System.out.println("Saindo...");


                default:
                    System.out.println("OpÃ§Ã£o invÃ¡lida.");
            }
        }
    }

    private static void addContact() {
        System.out.print("Nome: ");
        String name = scanner.nextLine();
        System.out.print("NÃºmero de telefone (formato: (XX) XXXX-XXXX): ");
        String phone = scanner.nextLine();

        if (validatePhoneNumber(phone)) {
            contacts.put(name, phone);
            System.out.println("Contato adicionado.");
        } else {
            System.out.println("NÃºmero de telefone invÃ¡lido.");
        }
    }

    private static void editContact() {
        System.out.print("Nome do contato a ser editado: ");
        String name = scanner.nextLine();

        if (contacts.containsKey(name)) {
            System.out.print("Novo nÃºmero de telefone (formato: (XX) XXXX-XXXX): ");
            String phone = scanner.nextLine();

            if (validatePhoneNumber(phone)) {
                contacts.put(name, phone);
                System.out.println("Contato atualizado.");
            } else {
                System.out.println("NÃºmero de telefone invÃ¡lido.");
            }
        } else {
            System.out.println("Contato nÃ£o encontrado.");
        }
    }

    private static void deleteContact() {
        System.out.print("Nome do contato a ser excluÃ­do: ");
        String name = scanner.nextLine();

        if (contacts.remove(name) != null) {
            System.out.println("Contato excluÃ­do.");
        } else {
            System.out.println("Contato nÃ£o encontrado.");
        }
    }

    private static void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Nenhum contato encontrado.");
        } else {
            System.out.println("Contatos:");
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                System.out.println("Nome: " + entry.getKey() + ", Telefone: " + entry.getValue());
            }
        }
    }

    private static boolean validatePhoneNumber(String phone) {
        return phone.matches("\\(\\d{2}\\) \\d{4}-\\d{4}");
    }

    private static void saveContacts() {
        try (Writer writer = new FileWriter(FILE_NAME)) {
            gson.toJson(contacts, writer);
            System.out.println("Contatos salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar contatos: " + e.getMessage());
        }
    }

    private static void loadContacts() {
        try (Reader reader = new FileReader(FILE_NAME)) {
            Type type = new TypeToken<Map<String, String>>() {}.getType();
            contacts = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            // Arquivo nÃ£o encontrado, iniciar com contatos vazios
        } catch (IOException e) {
            System.out.println("Erro ao carregar contatos: " + e.getMessage());
        }
    }
}
