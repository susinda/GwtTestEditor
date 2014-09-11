package com.susi.client.composite;

import com.google.gwt.event.dom.client.ContextMenuEvent;
import com.google.gwt.event.dom.client.ContextMenuHandler;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.susi.client.GwtJsplumb;
import com.susi.client.injector.JsClientBundle;

public class AbstractMediator extends Composite implements ContextMenuHandler {


	VerticalPanel mainPannel = null;
	HorizontalPanel innerPanel = null;
	TextBox descriptionText = null;
	Image iconImage = null;
	TextBox innerText = null;
	PopupPanel contextMenu = null;


	public AbstractMediator(String caption) {
		 
		mainPannel = new VerticalPanel();
		innerPanel = new HorizontalPanel();
		descriptionText = new TextBox();
		innerText = new TextBox();
	    iconImage = new Image();
	    ImageResource StoreImageResource = JsClientBundle.INSTANCE.StoreImage();
	    iconImage.setResource(StoreImageResource);
	    
		mainPannel.add(innerPanel);
		mainPannel.add(descriptionText);
		innerPanel.add(iconImage);
		innerPanel.add(innerText);
		mainPannel.sinkEvents(Event.ONCONTEXTMENU);
		

		this.contextMenu = new PopupPanel(true);
		this.contextMenu.add(new HTML("My Context menu!"));
		this.contextMenu.hide();
		
		// All composites must call initWidget() in their constructors.
		initWidget(mainPannel);

		// Give the overall composite a style name.
		setStyleName("example-OptionalCheckBox");

		addDomHandler(this, ContextMenuEvent.getType());

	}

	@Override
	public void onContextMenu(ContextMenuEvent event) {
		// stop the browser from opening the context menu
		event.preventDefault();
		event.stopPropagation();

		this.contextMenu.setPopupPosition(event.getNativeEvent().getClientX(),
				event.getNativeEvent().getClientY());
		this.contextMenu.show();
		AddMediator(); //testMethod just to check weather we can add things dynamically
	}
	
	public void AddMediator() {
		innerPanel.add(new AbstractMediator("ssssusinda"));
		GwtJsplumb.jsAlert("add AbstractMediator");
	}
	
}