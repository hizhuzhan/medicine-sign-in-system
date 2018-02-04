layui.use(['form','laydate'], function(){
    var form = layui.form;
    var laydate = layui.laydate;

    form.on('submit(formSubmit)', function(data){
        layer.msg(JSON.stringify(data.field))
        return false;
    });

    /**
     * 选择时间
     */
    laydate.render({
        elem: '#mettingStartTime'
    });
});