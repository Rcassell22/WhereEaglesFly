function initialize(){
	hideAddressInput();
	
	$("#exampleSelect2").change(function(){
		if($("#exampleSelect2 option:selected").val() != "placeholder")
		{
			showAddressInput();
		}
		else
		{
			hideAddressInput();
		}	
	});
	
	function hideAddressInput(){
		$("#inputUSAddress").hide();
		$("#inputGenericAddress").hide();
		$("#lblAddress").hide();	
	}
	
	function showAddressInput(){
		$("#inputUSAddress").show();
		$("#inputGenericAddress").show();
		$("#lblAddress").show();	
	}
}