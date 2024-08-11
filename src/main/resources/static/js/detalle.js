$('body').on('click', '.editarDetalle', function() {
	$('#id').val($(this).attr('id'));
	$('#pastel.id').val($(this).attr('idped'));
	document.getElementById("pastel.id").value = $(this).attr('idpas');
	$('#cantidad').val($(this).attr('param1'));
	$('#formularioModal').modal({ show: true });
});

$("#btnNueva").click(function() {
	$('#id').val('');
	$('#pastel.id').val('');
	document.getElementById("pastel.id").value = '';
	$('#cantidad').val('1');
});

$(document).ready(function() {
    $('.js-example-basic-single').select2();
});