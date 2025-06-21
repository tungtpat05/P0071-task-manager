/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tungtpat05 on Jun 21, 2025.
 */
public class TaskView {

    private String body;
    private List<String> list = new ArrayList<>();

    //Setter & Getter
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    //Print body
    public void printBody() {
        System.out.println(body);
    }

    //Print list
    public void printList() {
        for (String string : list) {
            System.out.println(string);
        }
    }

    //Print main menu
    public void printMainMenu() {
        System.out.println("======== Task Management =========\n"
                + "1. Add Task\n"
                + "2. Delete Task\n"
                + "3. Display Task\n"
                + "4. Exit\n");
    }
}
