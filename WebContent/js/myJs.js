/**
 * 
 */
function optionSelect(type_code,selectId,optionId){
		$.ajax({
			url:"${pageContext.request.contextPath }/BasedictAction_list",
			data:{
				"dict_type_code": type_code
			},
			success:function(data){
				var $select = $("#"+selectId);
				$select.append("<option>请选择</option>");
				for(var i=0;i<data.length;i++){
					var $option= $("<option value='"+data[i].dict_id+"'>"+data[i].dict_item_name+"</option>");
					$select.append($option);
					// 信息回显
					if (data[i].dict_id == optionId) {
						$option.attr("selected", "selected");
					}
				}
			},
			dataType:"json",
			async:true
		});
	}