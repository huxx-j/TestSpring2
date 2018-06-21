<%--
  Created by IntelliJ IDEA.
  User: Huxx_j
  Date: 2018. 6. 20.
  Time: 오후 2:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>jQuery UI Sortable - Connect lists</title>
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
    <script type="text/javascript" src="${pageContext.request.contextPath }/assets/js/jquery/jquery-1.12.4.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/assets/js/jquery/jquery-ui.js"></script>

    <style>
        #sortable1, #sortable2 {
            border: 1px solid #eee;
            width: 142px;
            min-height: 200px;
            list-style-type: none;
            margin: 0;
            padding: 5px 0 0 0;
            float: left;
            margin-right: 10px;
        }
        #sortable1 li, #sortable2 li {
            margin: 0 5px 5px 5px;
            padding: 5px;
            font-size: 1.2em;
            width: 120px;
        }
    </style>

</head>
<body>
<ul id="sortable1" class="connectedSortable">

</ul>
<ul id="sortable2" class="connectedSortable"></ul> <br />

<input type="button" id="mod" value="수정" />
<input type="button" id="addBtn" value="Add">

add <input type="text" id="addCate">

<input id="enrolledIdx" type="text">
<input id="standbyIdx" type="text">

</body>
</html>

<script type="text/javascript">
    $(document).ready(function () {
        fetchList()
    });

    $("#addBtn").on("click", function () {
       var title = $("#addCate").val();
        $.ajax({
            url: "/api/add",
            type: "post",
            data: {"title": title},
            dataType: "json",
            success: function (result) {
                if (result=="SaVeFaIl") {
                    alert("저장실패")
                } else {
                    renderAdd(title)
                }
            },
            error: function (XHR, status, error) {
                console.error(status + " : " + error);
            }
        });
    });

    function fetchList() {
        $.ajax({
            url: "/api/get",
            type: "post",
            dataType: "json",
            success: function (list) {
                for(var i = 0; i < list.length; i++ ) {
                    render(list[i]);
                }
            },
            error: function (XHR, status, error) {
                console.error(status + " : " + error);
            }
        });
    }

    function renderAdd(title) {
        var str = "";
        str += "<li class='ui-state-default' id='"+ title +"'>" + title + "</li>";
        $("#sortable1").append(str);

    }

    function render(cateVo) {
        var str = "";
        str += "<li class='ui-state-default' id='"+ cateVo.title +"'>" + cateVo.title + "</li>";
        if (cateVo.enroll =='n') {
            $("#sortable1").append(str);
        } else {
            $("#sortable2").append(str);

        }
    }

    $(function() {
        $( "#sortable1, #sortable2" ).sortable({
            connectWith: ".connectedSortable",
            update: function() {
                var enrolledOrder = $('#sortable2').sortable('toArray').toString();
                var standbyOrder = $('#sortable1').sortable('toArray').toString();
                $("#enrolledIdx").val(enrolledOrder);
                $("#standbyIdx").val(standbyOrder);
            }
        }).disableSelection();
    });

    $("#mod").on("click", function(){
        var enrolledOrder = $("#enrolledIdx").val();
        var stnadbyOrder = $("#standbyIdx").val();
        console.log(enrolledOrder)
        console.log(stnadbyOrder)
        $.ajax({
            url: "/api/update",
            type: "post",
            // contentType: "application/json",
            data: {'enrolledOrder': enrolledOrder, 'standbyOrder': stnadbyOrder},
            // data: {enrolledOrder: enrolledOrder},
            dataType: "json",
            success: function (result) {
                console.log(result)
                if(result!=0) {
                    alert("수정성공")
                }
            },
            error: function (XHR, status, error) {
                console.error(status + " : " + error);
            }
        });
    });

</script>