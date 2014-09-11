function gwtjsplumbdemo() {
        
    var fillColor = "gray"; 
    jsPlumb.Defaults.Connector = [ "Bezier", { curviness:50 } ];
    jsPlumb.Defaults.DragOptions = { cursor: "pointer", zIndex:2000 };
    jsPlumb.Defaults.PaintStyle = { strokeStyle:"gray", lineWidth:2 };
    jsPlumb.Defaults.EndpointStyle = { radius:9, fillStyle:"gray" };
    jsPlumb.Defaults.Anchors =  [ "BottomCenter", "TopCenter" ];

    // declare some common values:
    var arrowCommon = { foldback:0.7, fillStyle:fillColor, width:14 };
	
	 // use three-arg spec to create two different arrows with the common values:
	   var overlays = [
	       [ "Arrow", { location:0.5 }, arrowCommon ]
	   ];
	   
	              
    jsplumbDraw("window1" , "window2", overlays );
    jsplumbDraw("window2" , "window3", overlays );
    jsplumbDraw("window3" , "window4", overlays );
    
 }

function jsplumbDraw(sourceID, targetID, overlays1) {
	
    //alert("source  " + sourceID);
	jsPlumb.connect({source:sourceID, target:targetID, overlays:overlays1});
}