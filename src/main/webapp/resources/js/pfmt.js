$(document).ready(function() {
    $('body').addClass('js');
    $('.login-form span').addClass('checked').children('input').attr('checked', true);
    $('.login-form span').on('click', function() {
        if ($(this).children('input').attr('checked')) {
            $(this).children('input').attr('checked', false);
            $(this).removeClass('checked');
        }
        else {
            $(this).children('input').attr('checked', true);
            $(this).addClass('checked');
        }
    });
    $("#datepicker").datepicker();
});
