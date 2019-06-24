var Datos_Departamentos = (function () {

    return {
        cargarModulo: function () {
            $.get("Datos_Departamentos", {
                ACCION: "MODULO"
            }).then(function () {
                $("#content").html(arguments[0]);
                $(".verdatos").unbind('click').bind('click', function () {
                    id = $(this).parents("tr").find("td").eq(0).html();
                    Datos_Departamentos.mostrarespecifico(id);
                });
                $("#datos_departamentos").DataTable({
                    "scrollX": true});
            });
        },
        mostrarespecifico: function (id) {
            $.get("Datos_Departamentos", {
                ACCION: "MostrarEspecifico",
                ID: id
            }).then(function () {
                $("#content").html(arguments[0]);
                $("#datos_departamentos").DataTable({
                    "scrollX": true});
            });
        }
    };
}());
