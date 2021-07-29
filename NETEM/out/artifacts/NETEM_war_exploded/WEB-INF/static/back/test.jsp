<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bootstrap4动态模态窗口jquery插件|DEMO_jQuery之家-自由分享jQuery、html5、css3的插件库</title>
    <link rel="stylesheet" href="css/lightbox_bootstrap.min.css"/>
    <style type="text/css">
        button {
            margin-bottom: 0.5em;
        }
    </style>
</head>
<body>
<div class="htmleaf-container">
    <button type="button" id="button-form" class="btn btn-primary">Show a complex Form</button>
</div>
<script src="js/jquery-3.4.1.js" type="text/javascript"></script>
<script src="js/bootstrap.bundle.min.js"></script>
<script src="js/bootstrap-show-modal.js"></script>
<script>
    document.getElementById("button-form").addEventListener("click", function () {
        $.showModal({
            title: 'Complex Form',
            body:
                '<form><div class="form-group row">' +
                '<div class="col-3"><label for="text" class="col-form-label">Text</label></div>' +
                '<div class="col-9"><input type="text" class="form-control" id="text"/></div>' +
                '</div>' +
                '<div class="form-group row">' +
                '<div class="col-3"><label for="select" class="col-form-label">Select</label></div>' +
                '<div class="col-9"><select id="select" class="form-control">' +
                '<option value=""></option>' +
                '<option value="red">red</option><option value="green">green</option><option value="blue">blue</option>' +
                '</select></div>' +
                '</div>' +
                '<div class="form-group row">' +
                '<div class="col-3"><label for="textarea" class="col-form-label">Textarea</label></div>' +
                '<div class="col-9"><textarea id="textarea" rows="5" class="form-control"></textarea></div>' +
                '</div></form>',
            footer: '<button type="button" class="btn btn-link" data-dismiss="modal">Cancel</button><button type="submit" class="btn btn-primary">Send</button>',
            onCreate: function (modal) {
                // create event handler for form submit and handle values
                $(modal.element).on("click", "button[type='submit']", function (event) {
                    event.preventDefault()
                    var $form = $(modal.element).find("form")
                    $.showAlert({
                        title: "Result",
                        body:
                            "<b>text:</b> " + $form.find("#text").val() + "<br/>" +
                            "<b>select:</b> " + $form.find("#select").val() + "<br/>" +
                            "<b>textarea:</b> " + $form.find("#textarea").val()
                    })
                    modal.hide()
                })
            }
        })
    })

</script>
</body>
</html>