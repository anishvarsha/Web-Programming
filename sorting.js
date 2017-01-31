function sortByPriceAsc(a,b){
	return $(a).find('.popularity').text()>$(b).find('.popularity').text()
}

function sortByPriceDesc(a, b) {
    return $(a).find('.popularity').text() <= $(b).find('.popularity').text();
}

function reorderEl(el) {
    var container = $('#rows');
    container.html('');
    el.each(function () {
        $(this).appendTo(container);
    });
}

$('#asc').click(function () {
    reorderEl($('.popularity').sort(sortByPrice));
});

$('#desc').click(function () {
    reorderEl($('.popularity').sort(sortByPriceDesc));
});