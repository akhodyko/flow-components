package com.example.application.views.demoUI.fixtures;

import com.vaadin.flow.component.spreadsheet.Spreadsheet;

public class StyleMergeReigions implements SpreadsheetFixture {
    @Override
    public void loadFixture(Spreadsheet spreadsheet) {
        spreadsheet.addMergedRegion(2,0,3,0);
    }
}
