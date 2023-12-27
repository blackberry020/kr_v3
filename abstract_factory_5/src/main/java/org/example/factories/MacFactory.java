package org.example.factories;

import org.example.buttons.Button;
import org.example.buttons.MacButton;
import org.example.dropDownLists.DropDownList;
import org.example.dropDownLists.MacDropDownList;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public DropDownList createDropDownList() {
        return new MacDropDownList();
    }
}
