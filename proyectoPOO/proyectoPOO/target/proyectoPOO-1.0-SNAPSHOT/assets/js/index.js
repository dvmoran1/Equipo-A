$(document).ready(function(){
   $("#empleados").on('click',function(){
      Datos_Empleados.cargarModulo(); 
   });
   $("#departamentos").on('click',function(){
      Datos_Departamentos.cargarModulo(); 
   });
});


