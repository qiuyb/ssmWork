$(function(){
	//异步加载上所有的电影类型
	$.post("Type_getTypes.action", function(data){
		for(var i = 0; i < data.length; i++)
		{
			$("#typeId").append("<option value='"+ data[i].typeid +"'>" + data[i].typename+ "</option>");
		}
				
	}, 'json');
});