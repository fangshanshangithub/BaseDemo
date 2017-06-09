function deleteUser(webPath,id){
    $.ajax({
        type: 'DELETE',
        url: webPath + '/user/'+id,
        dataType:'text', 
        success:function(data){
            if(data=="suc"){
                alert("删除成功");
                location.reload();
            }
        },
        error:function(data){
        }
    });
}