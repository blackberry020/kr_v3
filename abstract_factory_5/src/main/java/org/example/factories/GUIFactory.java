package org.example.factories;

import org.example.buttons.Button;
import org.example.dropDownLists.DropDownList;

public interface GUIFactory {
    public Button createButton();
    public DropDownList createDropDownList();
}
