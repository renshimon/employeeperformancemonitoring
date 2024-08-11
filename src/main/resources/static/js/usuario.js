$('body').on('click', '.editarDetalle', function() {
	$('#id').val($(this).attr('id'));
	$('#nombre').val($(this).attr('param1'));
	$('#appaterno').val($(this).attr('param2'));
	$('#apmaterno').val($(this).attr('param12'));
	document.getElementById("documento.id").value = $(this).attr('param3');
	$('#numdocumento').val($(this).attr('param4'));
	$('#telefono').val($(this).attr('param5'));
	$('#correo').val($(this).attr('param6'));
	document.getElementById("fecha_nac").value = $(this).attr('param7');
	document.getElementById("perfil.id").value = $(this).attr('param8');
	$('#password').val($(this).attr('param11'));
	$('#formularioModal').modal({ show: true });
});

$("#btnNueva").click(function() {
	$('#id').val('');
	$('#nombre').val('');
	$('#appaterno').val('');
	$('#apmaterno').val('');
	document.getElementById("documento.id").value = '';
	$('#numdocumento').val('');
	$('#telefono').val('');
	$('#correo').val('');
	document.getElementById("fecha_nac").value = '';
	document.getElementById("perfil.id").value = '';
	$('#password').val('');
});