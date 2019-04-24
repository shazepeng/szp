function power(){
    $.ajax({
        type:"get",
        url:"selectRole?id=" + sessionStorage.getItem('rids'),
        async:false,
        contentType:"application/json",
        dataType:"JSON",
        success:function(data){
            var str;
            $.each(data,function (index,element) {
                child = element.children;
                if(element.checked==true) {
                    str = "<li class=\"list-group-item\">\n" +
                        "\t\t\t\t\t\t\t<span><i class=\""+element.icon+"\"></i>" + element.name +
                        "<span class=\"badge\" style=\"float:right\">"+element.children.length+"</span></span>"
                    $.each(child, function (index2, ele) {
                        if (ele.checked == true && ele.pid == element.id) {
                            str += "<ul style=\"margin-top:10px;\">\n" +
                                "\t\t\t\t\t\t\t<li style=\"height:30px;\">\n" +
                                "\t\t\t\t\t\t\t<a href=\""+ele.url+"\"><i class=\""+ele.icon+"\"></i>" + ele.name +
                                "</a> \n" +
                                "\t\t\t\t\t\t\t</li>\n" +
                                "\t\t\t\t\t\t</ul>"
                        }
                    });
                    str += " </li>";
                    $("#caidan").append(str);
                }
            });
        }
    });
    $(".list-group-item").click(function(){
        if ( $(this).find("ul") ) {
            $(this).toggleClass("tree-closed");
            if ( $(this).hasClass("tree-closed") ) {
                $("ul", this).hide("fast");
            } else {
                $("ul", this).show("fast");
            }
        }
    });

    var name = sessionStorage.getItem("users");
    $("#name").text(name);
    $("#tc").click(function () {
        // $.ajax({
        //     type:"get",
        //     url:"removeLanJie"
        // })
        sessionStorage.removeItem("users");
        sessionStorage.removeItem("rids");
        sessionStorage.removeItem("classify")
        window.location.href="login.html";
    })

}
window.onload=function () {
    $.ajax({
        type:"get",
        url:"selectRole?id=" + sessionStorage.getItem('rids'),
        async:false,
        contentType:"application/json",
        dataType:"JSON",
        success:function(data){
            var str;
            $.each(data,function (index,element) {
                child = element.children;
                if(element.checked==true) {
                    str = "<li class=\"list-group-item\">\n" +
                        "\t\t\t\t\t\t\t<span><i class=\""+element.icon+"\"></i>" + element.name +
                        "<span class=\"badge\" style=\"float:right\">"+element.children.length+"</span></span>"
                    $.each(child, function (index2, ele) {
                        if (ele.checked == true && ele.pid == element.id) {
                            str += "<ul style=\"margin-top:10px;\">\n" +
                                "\t\t\t\t\t\t\t<li style=\"height:30px;\">\n" +
                                "\t\t\t\t\t\t\t<a href=\""+ele.url+"\"><i class=\""+ele.icon+"\"></i>" + ele.name +
                                "</a> \n" +
                                "\t\t\t\t\t\t\t</li>\n" +
                                "\t\t\t\t\t\t</ul>"
                        }
                    });
                    str += " </li>";
                    $("#caidan").append(str);
                }
            });
        }
    });
    $(".list-group-item").click(function(){
        if ( $(this).find("ul") ) {
            $(this).toggleClass("tree-closed");
            if ( $(this).hasClass("tree-closed") ) {
                $("ul", this).hide("fast");
            } else {
                $("ul", this).show("fast");
            }
        }
    });

    var name = sessionStorage.getItem("users");
    $("#name").text(name);
    $("#tc").click(function () {
        // $.ajax({
        //     type:"get",
        //     url:"removeLanJie"
        // })
        sessionStorage.removeItem("users");
        sessionStorage.removeItem("rids");
        sessionStorage.removeItem("classify")
        window.location.href="login.html";
    })
}


