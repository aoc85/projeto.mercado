$(function() {
	$('.adicionar').on('click', function(){
		$('#produtosModal').modal({
			backdrop : 'static',
			keyboard : false
		});
	});
	
	$('.preco').on('change', function(){
		if($('.preco').val().indexOf(',') !== -1){
			$(this).addClass('error');
			$('.btn-success').prop('disable', true);
		}else{
			$(this).removeClass('error');
		}
	});
	
	$('.quantidade').on('change', function(){
		if(isNaN($(this).val())){
			$(this).addClass('error');
		}else{
			$(this).removeClass('error');
		}
	})
	
});
