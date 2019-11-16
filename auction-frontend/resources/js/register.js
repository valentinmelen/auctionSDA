$(document).ready(function () {
    $("form#register_form button").click(function () {
        const firstName = $("form input#firstName").val();

        const lastName = $("form#register_form input#lastName").val();

        const email = $("form#register_form input#email").val();

        const password = $("form#register_form input#password").val();

        const confirmPassword = $("form#register_form input#confirmPassword").val();

        const userDto = JSON.stringify({firstName, lastName, email, password, confirmPassword});
        console.log("hello " + userDto);
    });
});

