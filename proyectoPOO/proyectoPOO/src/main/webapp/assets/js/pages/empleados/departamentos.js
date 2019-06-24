var Datos_Departamentos = (function () {

    return {
        cargarModulo: function () {
            $.get("Datos_Departamentos", {
                ACCION: "MODULO"
            }).then(function () {
                $("#content").html(arguments[0]);
                $(".verdatos").unbind('click').bind('click', function () {
                    npersonal = $(this).parents("tr").find("td").eq(0).html();
                    Datos_Departamentos.mostrarespecifico(npersonal);
                });
                $("#datos_departamentos").DataTable({
                    "scrollX": true});
            });
        },
        mostrarespecifico: function (npersonal) {
            $.get("Datos_Departamentos", {
                ACCION: "MostrarEspecifico",
                npersonal: npersonal
            }).then(function () {
                $("#content").html(arguments[0]);
                $("#datos_departamentos").DataTable({
                    "scrollX": true});
            });
        }
    };
}());
