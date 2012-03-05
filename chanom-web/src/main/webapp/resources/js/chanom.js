jQuery(document).ready(function() {
	jQuery('.nav').hover(function() {
		jQuery(this.nextElementSibling).css('display', 'block');
	}, function() {
		//jQuery(this.nextElementSibling).css('display', 'none');
	});

	jQuery('html').click(function() {
		//Hide the menus if visible
		jQuery('.about-sub-menu').css('display', 'none');
	});

	jQuery('.about-sub-menu').click(function(event) {
		event.stopPropagation();
	});
});