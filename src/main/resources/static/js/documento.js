$('body').on('click', '.editarDocumento', function() {
	$('#id').val($(this).attr('id'));
	$('#nombre').val($(this).attr('param1'));
	$('#descripcion').val($(this).attr('param2'));
	$('#formularioModal').modal({ show: true });
});

$("#btnNueva").click(function() {
	$('#id').val('');
	$('#nombre').val('');
});