<%--
  Created by IntelliJ IDEA.
  User: bit-user
  Date: 2018-06-29
  Time: 오전 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>Title</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../../assets/jqGrid/jquery-ui/jquery-ui.css" />
    <link rel="stylesheet" type="text/css" href="../../assets/jqGrid/css/ui.jqgrid.css" />
    <link rel="stylesheet" type="text/css" href="../../assets/jqGrid/css/addons/ui.multiselect.css" />
    <script type="text/javascript" src="../../assets/jqGrid/jquery.js"></script>
    <script type="text/javascript" src="../../assets/jqGrid/js/i18n/grid.locale-kr.js"></script>
    <script type="text/javascript" src="../../assets/jqGrid/js/jquery.jqGrid.min.js"></script>
    <style type="text/css">
        .row {
            font-size: 5px;
        }
    </style>
</head>
<body>

<div class="row">
    <div>
        <table id="jqGrid"></table>

        <div id="jqGridPager"></div>
    </div>
</div>

</body>
</html>


<script type="text/javascript">
    $(document).ready(function() {

        var cnames = ['번호','아이디','이름','가입일'];

        $("#jqGrid").jqGrid({
            url: "jqgridStartMain.do",
            datatype: "local",
            colNames: cnames,
            colModel:[
                {name:'seq',index:'seq', width:110, align:"center"},
                {name:'userId',index:'userId', width:200, align:"center"},
                {name:'name',index:'name', width:200},
                {name:'regDate',index:'regDate', width:200}
            ],
            // UserVo{num=20, id='xxbdsb', pw='null', name='장성우23'
            rowheight: 20,
            height: 450,
            rowNum: 15,
            rowList: [10,20,30],
            pager: '#jqGridPager',
            rownumbers  : true,
            ondblClickRow : function(rowId, iRow, iCol, e) {

                if(iCol == 1) {

                    alert(rowId+" 째줄 입니다.");
                }
            },

            viewrecords : true,
            caption:"유저 정보"


        });

        $(function () {

            $.ajax({
                url: "/api/getuserinfo",
                type: "post",
                dataType: "json",
                success: function (result) {
                    console.log(result);

                    for (var i = 0; i<result.length; i++)
                        $("#jqGrid").jqGrid('addRowData', i+1, result[i]);
                },
                error: function (XHR, status, error) {
                    console.error(status + " : " + error);
                }
            });

        });


    });

</script>

