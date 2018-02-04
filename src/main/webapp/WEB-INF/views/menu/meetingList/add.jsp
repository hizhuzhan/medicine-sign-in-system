<%@ include file="/WEB-INF/views/common/include_head.jsp" %>
<%@page pageEncoding="UTF-8"%>
<body class="childrenBody">
<form class="layui-form layui-form-pane" action="">
    <div class="layui-form-item">
        <label class="layui-form-label">会议名称</label>
        <div class="layui-input-block">
            <input id="meetingName" type="text" name="mettingName" required  lay-verify="required" placeholder="请输入会议名称" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">会议开始时间</label>
        <div class="layui-input-block">
            <input id="mettingStartTime" type="text" name="mettingStartTime" required  lay-verify="required" placeholder="请输入开始时间" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">会议地点</label>
        <div class="layui-input-block">
            <input id="mettingSit" type="text" name="mettingSit" required  lay-verify="required" placeholder="请输入地点" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formSubmit">提交</button>
            <button class="layui-btn layui-btn-primary" lay-submit lay-filter="formSubmitCancle">取消</button>
        </div>
    </div>
</form>
<%@ include file="/WEB-INF/views/common/include_foot.jsp" %>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/meetingList/add.js"></script>
</body>
</html>
