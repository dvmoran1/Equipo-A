<%-- 
    Document   : Departamentos
    Created on : 23/06/2019, 08:55:06 PM
    Author     : Jauregui
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html
    <div class="row">
        <div class="col-md-12">
            <div class="card card-topline-green">
                <div class="card-head">
                    <header>DEPARTMENTS</header>
                    <div class="tools">
                        <a class="fa fa-repeat btn-color box-refresh" href="javascript:;"></a>
                        <a class="t-collapse btn-color fa fa-chevron-down" href="javascript:;"></a>
                        <a class="t-close btn-color fa fa-times" href="javascript:;"></a>
                    </div>
                </div>
                <div class="card-body ">
                    <table class="table table-striped table-bordered table-hover table-checkable order-column " style="width: 100%" id="datos_departamentos">
                        <thead>
                            <tr>
                                <th class="center"> Number </th>
                                <th class="center"> Name </th>
                                <th class="center"> Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${requestScope.listado}" var="listado">
                                <tr class="odd gradeX" >
                                    <td>${listado.dept_no}</td>
                                    <td>${listado.dept_name}</td> 
                                    <td class="center" >
                                        <button class="btn btn-success btn-xs verdatos" >
                                            <i class="fa fa-check"></i>
                                        </button>
                                    </td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</html>
