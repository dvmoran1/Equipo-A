var Datos_Empleados = (function () {

    return {
        cargarModulo: function () {
            $.get("Datos_Empleados", {
                ACCION: "MODULO"
            }).then(function () {
                $("#content").html(arguments[0]);
                $(".verdatos").unbind('click').bind('click', function () {
                    npersonal = $(this).parents("tr").find("td").eq(0).html();
                    Datos_Empleados.mostrarespecifico(npersonal);
                });
                
                $("#datos_empleados").DataTable({
                    "scrollX": true});
            });
        },
        mostrarespecifico: function (npersonal) {
            $.get("Datos_Empleados", {
                ACCION: "MostrarEspecifico",
                npersonal: npersonal
            }).then(function () {
                $("#content").html(arguments[0]);
            });
        }
    };
}());

