$(document).ready(function () {
    $.get("http://localhost:8888/api/test", function(data, status){
        alert("Data: " + data + "\nStatus: " + status);
    });
});

