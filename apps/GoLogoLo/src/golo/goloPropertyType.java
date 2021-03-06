package golo;

/**
 * This class provides the properties that are needed to be loaded for
 * setting up To Do List Maker workspace controls including language-dependent
 * text.
 * 
 * @author Richard McKenna
 * @author Richie
 * @version 1.0
 */
public enum goloPropertyType {
   
    /* THESE ARE THE NODES IN OUR APP */
         
    // THIS IS THE GOLO WORKSPACE PANE
    GOLO_PANE,
    GOLO_EMPTY,
    
    // ITEMS EDITING
    GOLO_ITEMS_PANE,
    GOLO_ITEM_BUTTONS_PANE,
    GOLO_MOVEUP_ITEM_BUTTON,
    GOLO_MOVEDOWN_ITEM_BUTTON,
    GOLO_ITEMS_TABLE_VIEW,
    GOLO_EDIT_ITEM_BUTTON,
    
    // RIGHT SIDE BUTTONS
    GOLO_TEXT_BUTTON,
    GOLO_IMAGE_BUTTON,
    GOLO_RECTANGLE_BUTTON,
    GOLO_CIRCLE_BUTTON,
    GOLO_TRIANGLE_BUTTON,
    GOLO_REMOVE_COMPONENT_BUTTON,
    GOLO_BOLD_BUTTON,
    GOLO_ITALICS_BUTTON,
    GOLO_TEXT_SIZE_UP_BUTTON,
    GOLO_TEXT_SIZE_DOWN_BUTTON,
    GOLO_TEXT_COLOR_COLORPICKER,
    GOLO_FONT_FAMILY_COMBOBOX,
    GOLO_FONT_SIZE_COMBOBOX,
    
    //RIGHT SIDE STUFF
    GOLO_BORDER_THICKNESS_LABEL,
    GOLO_BORDER_RADIUS_LABEL,
    GOLO_BORDER_LABEL,
    GOLO_FOCUS_ANGLE_LABEL,
    GOLO_COLOR_GRADIENT_LABEL,
    GOLO_FOCUS_DISTANCE_LABEL,
    GOLO_CENTER_X_LABEL,
    GOLO_CENTER_Y_LABEL,
    GOLO_RADIUS_LABEL,
    GOLO_CYCLE_METHOD_LABEL,
    GOLO_STOP_ZERO_LABEL,
    GOLO_STOP_ONE_LABEL,
    
    //RIGHT SIDE STUFF
    GOLO_BORDER_THICKNESS_SLIDER,
    GOLO_BORDER_RADIUS_SLIDER,
    GOLO_BORDER_COLORPICKER,
    GOLO_FOCUS_ANGLE_SLIDER,
    GOLO_FOCUS_DISTANCE_SLIDER,
    GOLO_CENTER_X_SLIDER,
    GOLO_CENTER_Y_SLIDER,
    GOLO_RADIUS_SLIDER,
    GOLO_CYCLE_METHOD_COMBOBOX,
    GOLO_STOP_ZERO_COLORPICKER,
    GOLO_STOP_ONE_COLORPICKER,
    
    // FOOLPROOF SETTINGS
    GOLO_FOOLPROOF_SETTINGS,
    
    // COLUMNS
    GOLO_ORDER_COLUMN,
    GOLO_NAME_COLUMN,
    GOLO_TYPE_COLUMN,
    
    // DIALOG CONTROLS
    GOLO_ITEM_DIALOG_HEADER,
    GOLO_ITEM_DIALOG_NAME_PROMPT,
    GOLO_ITEM_DIALOG_EDIT_HEADER_TEXT,
    GOLO_ITEM_DIALOG_CONFIRM_PANE,
    GOLO_ITEM_DIALOG_OK_BUTTON,
    GOLO_ITEM_DIALOG_CANCEL_BUTTON,
    
    // THIS IS THE EXPORT TEMPLATE FILE NAME
    GOLO_EXPORT_TEMPLATE_FILE_NAME
}