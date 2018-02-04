var prefix = "/meetList";
layui.use(['jquery','layer'], function () {
    $ = layui.jquery;

    /**
     * 新建操作
     */
    $(document).on('click','#add',function(){
        var add = layer.open({
            type : 2,
            title : '添加会议',
            maxmin : true,
            shadeClose : true, // 点击遮罩关闭层
            area : [ '1000px', '450px' ],
            content : prefix +'/add'
        });
        layer.full(add);
    });

});
