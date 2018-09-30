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
                $('#media').val(data.media);
                $('#aprovado').val(data.aprovado ? 'Sim' : 'Não');
            },
            statusCode: {
                400: function () {
                    alert('Por favor, entre com notas válidas!');
                }
            }
        });
    });

    $('#calcular-post').click(function () {
        $.ajax('webresources/aluno', {
            method: 'POST',
            contentType: 'application/json',
            data: JSON.stringify({
                nome: $('#nome').val(),
                p1: $('#p1').val(),
                p2: $('#p2').val()
            }),
            success: function (data) {
                $('#media').val(data.media);
                $('#aprovado').val(data.aprovado ? 'Sim' : 'Não');
            }
        });
    });
});
