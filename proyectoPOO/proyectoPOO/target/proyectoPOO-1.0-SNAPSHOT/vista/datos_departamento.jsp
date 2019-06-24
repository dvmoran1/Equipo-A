<%-- 
    Document   : datos_departamento
    Created on : 23/06/2019, 09:32:06 PM
    Author     : Jauregui
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html
    <div class="row">
        <div class="col-md-12">
            <div class="card card-topline-green">
                <div class="card-head">
                    <header> DEPARTMENT DATA</header>
                    <div class="tools">
                        <a class="fa fa-repeat btn-color box-refresh" href="javascript:;"></a>
                        <a class="t-collapse btn-color fa fa-chevron-down" href="javascript:;"></a>
                        <a class="t-close btn-color fa fa-times" href="javascript:;"></a>
                    </div>
                </div>                
                <div class="col-md-5 col-6 b-r"> <strong>Name of the department</strong>
                    <br>
                    <p class="text-muted">${requestScope.listado[0].dept_name}</p>
                </div>
                <div class="card-body ">
                    <table class="table table-striped table-bordered table-hover table-checkable order-column " style="width: 100%" id="datos_departamentos">
                        <thead>
                            <tr>
                                <th class="center"> Employee</th>
                                <th class="center"> From date</th>
                                <th class="center"> To date</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${requestScope.listado}" var="listado">
                                <tr class="odd gradeX" >
                                    <td> ${listado.first_name} ${listado.last_name}</td> 
                                    <td> ${listado.from_date} </td> 
                                    <td> ${listado.to_date} </td> 
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</html>
