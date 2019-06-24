
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <div class="row">
        <div class="col-md-12">
            <div class="card card-topline-green">
                <div class="card-head">
                    <header>EMPLOYEES</header>
                    <div class="tools">
                        <a class="fa fa-repeat btn-color box-refresh" href="javascript:;"></a>
                        <a class="t-collapse btn-color fa fa-chevron-down" href="javascript:;"></a>
                        <a class="t-close btn-color fa fa-times" href="javascript:;"></a>
                    </div>
                </div>
                <div class="card-body ">
                    <table class="table table-striped table-bordered table-hover table-checkable order-column " style="width: 100%" id="datos_empleados">
                        <thead>
                            <tr>

                                <th class="center"> Number </th>
                                <th class="center"> First name </th>
                                <th class="center"> Last name </th>
                                <th class="center"> Gender </th>
                                <th class="center"> Birth date </th>
                                <th class="center"> Hire date </th>
                                <th class="center"> Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${requestScope.listado}" var="listado">
                                <tr class="odd gradeX" id="${listado.emp_no}">
                                    <td> ${listado.emp_no} </td>
                                    <td> ${listado.first_name} </td> 
                                    <td> ${listado.last_name}  </td>
                                    <td> ${listado.gender} </td>
                                    <td> ${listado.birth_date} </td>
                                    <td> ${listado.hire_date} </td>
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