package org.example.factories;

import org.example.buttons.Button;
import org.example.buttons.WindowsButton;
import org.example.dropDownLists.DropDownList;
import org.example.dropDownLists.WindowsDropDownList;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public DropDownList createDropDownList() {
        return new WindowsDropDownList();
    }
}
