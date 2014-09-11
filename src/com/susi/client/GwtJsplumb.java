package com.susi.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.datepicker.client.DatePicker;
import com.susi.client.composite.AbstractMediator;
import com.susi.client.injector.JsClientBundle;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GwtJsplumb implements EntryPoint {

	AbstractMediator mediator = new AbstractMediator("im optional widget");
	FlowPanel window2 = new FlowPanel();
	Label window3 = new Label("I'm a Label");
	DatePicker window4 = new DatePicker();
	

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		/* Create a couple of GWT widgets */
		// window1.add(new Label("I'm a Flowpanel"));
		window2.add(new Label("I'm a Flowpanel 2"));

		mediator.getElement().setId("window1");
		window2.getElement().setId("window2");
		window3.getElement().setId("window3");
		window4.getElement().setId("window4");
		mediator.getElement().setClassName("window");
		window2.getElement().setClassName("window");
		window3.getElement().setClassName("window");
		window4.getElement().setClassName("window");

		RootPanel.get("main").add(mediator);
		RootPanel.get("main").add(window2);
		RootPanel.get("main").add(window3);
		RootPanel.get("main").add(window4);

		injectScript();
		gwtjsPlumbDemo();

	}

	public static native void gwtjsPlumbDemo() /*-{
												$wnd.alert("Success!!!");
												$wnd.gwtjsplumbdemo();
												
												}-*/;

	private void injectScript() {

		// ScriptInjector.fromString(JsClientBundle.INSTANCE.jqueryJsplumbSource().getText())
		// .setWindow(ScriptInjector.TOP_WINDOW).inject();
		// Enabled above in html page

		ScriptInjector
				.fromString(JsClientBundle.INSTANCE.gwtdemoSource().getText())
				.setWindow(ScriptInjector.TOP_WINDOW).inject();

	}
	
	public static native void jsAlert(String message) /*-{
	    $wnd.alert("jsAlert " + message);
    }-*/;

}
