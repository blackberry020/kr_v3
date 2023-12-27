package org.example;

import org.example.buttons.Button;
import org.example.dropDownLists.DropDownList;
import org.example.factories.GUIFactory;
import org.example.factories.MacFactory;
import org.example.factories.WindowsFactory;

public class Main {
    public static void main(String[] args) {

        GUIFactory factory;

        factory = new WindowsFactory();
        //factory = new MacFactory();

        Button button = factory.createButton();
        DropDownList list = factory.createDropDownList();

        button.doSomething();
        list.doSomething();
    }
}