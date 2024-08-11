$('body').on('click','.editarPastel',function(){
	$('#id').val($(this).attr('id'));
	$('#nombre').val($(this).attr('param1'));
	$('#descripcion').val($(this).attr('param2'));
	$('#costo').val($(this).attr('param3'));
	$('#formularioModal').modal({show:true});
});

$("#btnNueva").click(function(){
	$('#id').val('');
	$('#nombre').val('');
	$('#descripcion').val('');
	$('#costo').val('');
});