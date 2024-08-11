$('body').on('click', '.editarDetalle', function() {
	$('#id').val($(this).attr('id'));
	$('#nombre').val($(this).attr('param1'));
	$('#appaterno').val($(this).attr('param2'));
	$('#apmaterno').val($(this).attr('param10'));
	document.getElementById("documento.id").value = $(this).attr('param3');
	$('#numero_doc').val($(this).attr('param4'));
	document.getElementById("genero").value = $(this).attr('param5');
	document.getElementById("estado").value = $(this).attr('param6');
	document.getElementById("fecha_nac").value = $(this).attr('param7');
	$('#telefono').val($(this).attr('param8'));
	document.getElementById("cargo.id").value = $(this).attr('param9');
	$('#formularioModal').modal({ show: true });
});

$("#btnNueva").click(function() {
	$('#id').val('');
	$('#nombre').val('');
	$('#appaterno').val('');
	$('#apmaterno').val('');
	document.getElementById("documento.id").value = '';
	$('#numerp_doc').val('');
	document.getElementById("genero").value = '';
	document.getElementById("estado").value = '';
	document.getElementById("fecha_nac").value = '';
	$('#telefono').val('');
	document.getElementById("cargo.id").value = '';
});