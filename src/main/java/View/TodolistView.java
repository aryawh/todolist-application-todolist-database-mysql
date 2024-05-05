package View;

import repository.TodolistRepository;
import service.TodolistService;
import util.InputUtil;

public class TodolistView {
    private TodolistService todolistService;
    public TodolistView(TodolistService todolistService) {
        this.todolistService = todolistService;
    }
    public void showTodolist(){
        while (true){
            todolistService.showTodolist();
            System.out.println("MENU");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("X. Keluar");
            var inputan = InputUtil.Input("Pilih ");
            if (inputan.equals("1")){
                addTodolist();
            } else if (inputan.equals("2")) {
                removeTodolist();
            } else if (inputan.equals("X")){
                break;
            }else {
                System.out.println("Pilihan tidak dimengerti");
            }}
    }
    public void addTodolist(){
        System.out.println("TAMBAHKAN DATA");
        var todo = InputUtil.Input("(X jika keluar) ");
        if (todo.equals("X")){

        }else {
            todolistService.addTodolist(todo);
        }
    }
    public void removeTodolist(){
        System.out.println("HAPUS DATA");
        var data = InputUtil.Input("(X jika keluar) ");
        if (data.equals("X")){

        }else {
            todolistService.removeTodolist(Integer.valueOf(data));
        }
    }
}
