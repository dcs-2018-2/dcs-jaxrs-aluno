$(document).ready(function () {
    $('#calcular').click(function () {
        $.ajax('webresources/aluno', {
            method: 'GET',
            data: {
                nome: $('#nome').val(),
                p1: $('#p1').val(),
                p2: $('#p2').val()
            },
            success: function (data) {
                alert(data);
            }
        });
    });
});
