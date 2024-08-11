$('body').on('click', '.editarPedido', function() {
	$('#id').val($(this).attr('id'));
	document.getElementById("cliente.id").value = $(this).attr('param2');
	$('#total').val($(this).attr('param1'));
	$('#formularioModal').modal({ show: true });
});

$("#btnNueva").click(function() {
	document.getElementById("cliente.id").value = "";
	$('#id').val('');
	$('#total').val('');
});

	var date = new Date();
	var year = date.getFullYear();
	var month = date.getMonth() + 1;
	var todayDate = String(date.getDate()).padStart(2, '0');
	var datePattern = year + '-' + month + '-' + todayDate;
	document.getElementById("calendario").min = datePattern

