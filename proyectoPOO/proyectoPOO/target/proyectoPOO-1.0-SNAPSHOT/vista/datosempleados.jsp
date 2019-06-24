<%-- 
    Document   : tabs
    Created on : 4/05/2019, 01:54:31 PM
    Author     : David VM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <div class="row">
        <div class="col-md-12">
            <div class="card card-topline-green">
                <div class="card-head">
                    <header>EMPLOYEE DATA</header>
                    <div class="tools">
                        <a class="fa fa-repeat btn-color box-refresh" href="javascript:;"></a>
                        <a class="t-collapse btn-color fa fa-chevron-down" href="javascript:;"></a>
                        <a class="t-close btn-color fa fa-times" href="javascript:;"></a>
                    </div>
                </div>
                <div class="card-body ">
                    <div class="row">
                        <div class="col-md-3 col-6 b-r"> <strong>Name of the employee</strong>
                            <br>
                            <p class="text-muted">${Emplo.first_name} ${Emplo.last_name}</p>
                        </div>
                        <div class="col-md-3 col-6 b-r"> <strong>Gender</strong>
                            <br>
                            <p class="text-muted">${Emplo.gender}</p>
                        </div>
                        <div class="col-md-3 col-6 b-r"> <strong>Birth date</strong>
                            <br>
                            <p class="text-muted">${Emplo.birth_date}</p>
                        </div>
                        <div class="col-md-3 col-6 b-r"> <strong>hire date</strong>
                            <br>
                            <p class="text-muted">${Emplo.hire_date}</p>
                        </div>
                    </div>
                    <br>
                    <br>
                    <br>
                    <div class="row">
                        <div class="col-md-4 col-6 b-r"> <strong>Salary</strong>
                            <br>
                            <p class="text-muted">${salarie.salary}</p>
                        </div>
                        <div class="col-md-4 col-6 b-r"> <strong>From date</strong>
                            <br>
                            <p class="text-muted">${salarie.from_date}</p>
                        </div> 
                        <div class="col-md-4 col-6"> <strong>To date</strong>
                            <br>
                            <p class="text-muted">${salarie.to_date}</p>
                        </div>   
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-md-4 col-6 b-r"> <strong>Title</strong>
                            <br>
                            <p class="text-muted">${title.title}</p>
                        </div> 
                        <div class="col-md-4 col-6 b-r"> <strong>From date</strong>
                            <br>
                            <p class="text-muted">${title.from_date}</p>
                        </div>
                        <div class="col-md-4 col-6 b-r"> <strong>To date</strong>
                            <br>
                            <p class="text-muted">${title.to_date}</p>
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-md-4 col-4"> <strong>Department</strong>
                            <br>
                            <p class="text-muted">${depart.dept_name}</p>
                        </div> 
                        <div class="col-md-4 col-4 b-r"> <strong>From date</strong>
                            <br>
                            <p class="text-muted">${depart.from_date}</p>
                        </div>
                        <div class="col-md-4 col-4 b-r"> <strong>To date</strong>
                            <br>
                            <p class="text-muted">${depart.to_date}</p>
                        </div>             
                    </div>
                    <br>
                </div>
            </div>
        </div>
    </div>
</html>