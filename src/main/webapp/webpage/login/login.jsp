<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2017/05/24
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登陆</title>
    <script src="/scripts/jquery/jquery-1.9.1.js"></script>

    <script>
        function check_enter(event) {
//            event,keyCode
//            对于 keypress 事件，该属性声明了被敲击的键生成的 Unicode 字符码。对于 keydown 和 keyup 事件，它指定了被敲击的键的虚拟键盘码。虚拟键盘码可能和使用的键盘的布局相关
//            13代表enter，9代表tab
            if (event.keyCode == 13 || event.keyCode == 9) {
//                envet.target表示	返回触发此事件的元素（事件的目标节点
//                event.srcElement表示  对于生成事件的 Window 对象、Document 对象或 Element 对象的引用
                var target = event.target || event.srcElement;

                if (target.id == "inputUserName") {
                    if (document.getElementById("inputUserName").value == '') {
                        $('#tip_inputUserName').html("请输入用户名");
                        return;
                    } else if (document.getElementById("inputUserPassword").value == '') {
                        document.getElementById("inputUserPassword").focus();
                        return;
                    }
                }
                <!--inputUserPassword-->
                else if (target.id == "inputUserPassword") {
                    if (document.getElementById("inputUserPassword").value == '') {
                        $('#tip_inputUserPassword').html("请输入密码");
                    }
                }
            }
        }
    </script>
</head>
<body>

<div style="width: 100%">
    <div align="center">
        <div>
            <form id="login" method="post" action="/login.do">
                <div>HYGBlog Login</div>
                <div>
                    <label>登陆用户名</label>
                    <%--event为 HTML DOM Event 对象
                    Event 对象代表事件的状态，比如事件在其中发生的元素、键盘按键的状态、鼠标的位置、鼠标按钮的状态。
                    事件通常与函数结合使用，函数不会在事件发生前被执行！
                    http://www.w3school.com.cn/jsref/dom_obj_event.asp
                    --%>
                    <input value="" id="inputUserName" name="userName" onkeydown="check_enter(event)"/>
                    <span id="tip_inputUserName"></span>

                </div>
                <div>
                    <label>登陆密码</label>
                    <input type="password" name="userPassword" value="" id="inputUserPassword" onkeydown="check_enter(event)"/>
                    <span id="tip_inputUserPassword"></span>
                </div>
                <div>
                    <%--<input type="button" value="登 陆" onclick="location.href = '../register/register.jsp'">--%>
                    <input type="submit"value="登 陆"/>
                </div>
            </form>
        </div>
    </div>

</div>
</body>
</html>
