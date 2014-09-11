package com.susi.client.composite;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ContextMenuEvent;
import com.google.gwt.event.dom.client.ContextMenuHandler;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.susi.client.GwtJsplumb;

public class AbstractMediator extends Composite implements ClickHandler {

  private TextBox textBox = new TextBox();
  private TextBox textBox2 = new TextBox();
  private Image myImage = new Image();
  HorizontalPanel panel = null;
  //private PopupPanel contextMenu = null;

  /**
   * Constructs an OptionalTextBox with the given caption on the check.
   * 
   * @param caption the caption to be displayed with the check box
   */
  public AbstractMediator(String caption) {
    // Place the check above the text box using a vertical panel.
    panel = new HorizontalPanel();
    panel.add(myImage);
    //panel.add(textBox);
   // panel.add(textBox2);
    

    // Set the check box's caption, and check it by default.
//    checkBox.setText(caption);
//    checkBox.setChecked(true);
//    checkBox.addClickHandler(this);

//    this.contextMenu = new PopupPanel(true);
//    this.contextMenu.add(new HTML("My Context menu!"));
//    this.contextMenu.hide();
    // All composites must call initWidget() in their constructors.
    initWidget(panel);

    // Give the overall composite a style name.
    setStyleName("example-OptionalCheckBox");
    
 
  }


  
  public void setImage(ImageResource resource) {
	    myImage.setResource(resource);
	  }
  
  
  public void AddTextBox() {
	  panel.add(new TextBox());
	  System.out.println("add Textbox");
	  jsAlert("add Textbox");
  }
  
  public static native void jsAlert(String message) /*-{
      $wnd.alert("jsAlert " + message);
  }-*/;
  

@Override
public void onClick(ClickEvent event) {
	Object sender = event.getSource();
    if (sender == myImage) {
      // When the check box is clicked, update the text box's enabled state.
      //textBox.setEnabled(checkBox.isChecked());
    }
 
}


}