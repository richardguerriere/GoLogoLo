package golo.transactions;

import jtps.jTPS_Transaction;
import golo.GoLogoLoApp;
import golo.data.Drag;
import golo.data.goloData;
import golo.data.goloItemPrototype;
import javafx.scene.Node;

/**
 *
 * @author McKillaGorilla
 * @author Richie
 */
public class PasteItems_Transaction implements jTPS_Transaction {
    GoLogoLoApp app;
    goloItemPrototype itemToPaste;
    Node ComponentsToPaste;
    int pasteIndex;
    
    public PasteItems_Transaction(  GoLogoLoApp initApp, 
                                    goloItemPrototype initItemsToPaste,
                                    Node initComponentsToPaste,
                                    int initPasteIndex) {
        app = initApp;
        itemToPaste = initItemsToPaste;
        ComponentsToPaste = initComponentsToPaste;
        pasteIndex = initPasteIndex;
    }

    @Override
    public void doTransaction() {
        goloData data = (goloData)app.getDataComponent();
        if(pasteIndex==0){
            data.addItemAt(itemToPaste,0);
            data.addComponent(ComponentsToPaste);
        }
        else{
            int index = pasteIndex+1;
            data.addItemAt(itemToPaste, index);
            data.addComponentAt(ComponentsToPaste, data.getShapes().size() - index);
        }
        data.clearSelected();
        if(data.getSelectedComponent()!=null)
            data.removeHighlight(data.getSelectedComponent());
        data.selectItem(itemToPaste);
        data.setSelectedComponent(ComponentsToPaste);
        data.addHighlight(ComponentsToPaste);
    }

    @Override
    public void undoTransaction() {
        goloData data = (goloData)app.getDataComponent();
        int index = pasteIndex-1;
        data.removeItem(itemToPaste);
        data.removeComponent(ComponentsToPaste);
        if(data.getNumItems()!=0){
            data.setSelectedComponent(data.getShapes().get(data.getShapes().indexOf(index)));
            data.addHighlight(data.getShapes().get(data.getShapes().indexOf(index)));
            data.selectItem(((Drag)data.getShapes().get(data.getShapes().indexOf(index))).getPrototype());
        }
        data.removeHighlight(ComponentsToPaste);
        
    }   
}