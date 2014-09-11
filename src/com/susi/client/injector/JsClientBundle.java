package com.susi.client.injector;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.TextResource;



public interface JsClientBundle extends ClientBundle {
	JsClientBundle INSTANCE = GWT.create(JsClientBundle.class);
	@Source("gwtdemo.js")
	TextResource gwtdemoSource();
	
	@Source("jquery.jsPlumb-1.3.3-all-min.js")
	TextResource jqueryJsplumbSource();

	@Source("Store.gif")
	ImageResource StoreImage();
}