// 百度地图API功能

//设置当前定位的城市名称
function myFun(result){
    var cityName = result.name;
    //map.centerAndZoom(cityName,12);
    map.centerAndZoom(cityName,12);
    //alert("当前定位城市:"+cityName);
    //return cityName;
}
function G(id) {
    return document.getElementById(id);
}
//获取当前城市
var map = new BMap.Map("l-map");
var myCity = new BMap.LocalCity();
myCity.get(myFun);//调用myFun方法
//alert(myCity.name);
//map.centerAndZoom("自贡市",12);// 初始化地图,设置城市和地图级别。
//console.log(myCity.name);
map.enableInertialDragging();     //地图可以拖拽

var begin = new BMap.Autocomplete(    //建立一个自动完成的对象
    {"input" : "from"
        ,"location" : map
    });
var end = new BMap.Autocomplete(    //建立一个自动完成的对象
    {"input" : "to"
        ,"location" : map
    });

begin.addEventListener("onhighlight", mouseon(e));
end.addEventListener("onhighlight", mouseon(e));
function mouseon(e){  //鼠标放在下拉列表上的事件
    var str = "";
    var _value = e.fromitem.value;
    var value = "";
    if (e.fromitem.index > -1) {
        value = _value.province +  _value.city +  _value.district +  _value.street +  _value.business;
    }
    str = "FromItem<br />index = " + e.fromitem.index + "<br />value = " + value;

    value = "";
    if (e.toitem.index > -1) {
        _value = e.toitem.value;
        value = _value.province +  _value.city +  _value.district +  _value.street +  _value.business;
    }
    str += "<br />ToItem<br />index = " + e.toitem.index + "<br />value = " + value;
    G("searchResultPanel").innerHTML = str;
}
function distence(){
    var beginplace=G("from").value;
    var endplace=G("to").value;
    var output="";
    var searchComplete = function (results){
        if (transit.getStatus() != BMAP_STATUS_SUCCESS){
            return ;
        }
        var plan = results.getPlan(0);
        output += plan.getDuration(true) + "\n";                //获取时间
        output += "总路程为：" ;
        output += plan.getDistance(true) + "\n";//获取距离
        $("#dis").val(plan.getDistance(true));
    }
    var transit = new BMap.DrivingRoute(map, {renderOptions: {map: map},
        onSearchComplete: searchComplete,
        onPolylinesSet: function(){
            setTimeout(function(){
                //alert(output);
                G("addin").innerHTML=output;
            },"1000");
        }});
    transit.search(beginplace,endplace);
}

//三种驾车策略：最少时间，最短距离，避开高速
//var routePolicy = [BMAP_DRIVING_POLICY_LEAST_TIME,BMAP_DRIVING_POLICY_LEAST_DISTANCE,BMAP_DRIVING_POLICY_AVOID_HIGHWAYS];
/*var routePolicy = new Array();
routePolicy[0]="BMAP_DRIVING_POLICY_LEAST_TIME";
routePolicy[1]="BMAP_DRIVING_POLICY_LEAST_DISTANCE";
routePolicy[2]="BMAP_DRIVING_POLICY_AVOID_HIGHWAYS";*/
function route(){
    G("l-map").style.display="block";
    var routePolicy = [BMAP_DRIVING_POLICY_LEAST_TIME,BMAP_DRIVING_POLICY_LEAST_DISTANCE,BMAP_DRIVING_POLICY_AVOID_HIGHWAYS];
    //map.centerAndZoom(new BMap.Point(116.404, 39.915), 11);
    var start=G("from").value;
    var end=G("to").value;
    map.clearOverlays();
    var i=$("#driving_way select").val();
    search(start,end,routePolicy[i]);
    function search(start,end,route){
        var driving = new BMap.DrivingRoute(map, {renderOptions:{map: map, autoViewport: true},policy: route});
        var result=driving.search(start,end);
        console.log(result);      }
}