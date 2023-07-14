<%-- 
    Document   : ordermanage
    Created on : Jul 14, 2023, 11:48:41 PM
    Author     : admin
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">


        <title>Product Management</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <style type="text/css">
            body{
                margin-top:20px;
                background:#f8f8f8
            }
        </style>
    </head>
    <body>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
        <div class="container">
            <div class="row flex-lg-nowrap">
                <div class="col">
                    <div class="e-tabs mb-3 px-3">
                        <ul class="nav nav-tabs">
                            <li class="nav-item"><a class="nav-link active" href="index.jsp">Home</a></li>
                        </ul>
                    </div>
                    <div class="row flex-lg-nowrap">
                        <div class="col mb-3">
                            <div class="e-panel card">
                                <div class="card-body">
                                    <div class="card-title">
                                        <h6 class="mr-2"><span>Admin</span><small class="px-1">Manage Product</small></h6>
                                    </div>
                                    <div class="e-table">
                                        <div class="table-responsive table-lg mt-3">
                                            <table class="table table-bordered">
                                                <thead>
                                                    <tr>
                                                        <th class="align-top">
                                                            <div class="custom-control custom-control-inline custom-checkbox custom-control-nameless m-0">
                                                                <input type="checkbox" class="custom-control-input" id="all-items">
                                                                <label class="custom-control-label" for="all-items"></label>
                                                            </div>
                                                        </th>
                                                        <th style="text-align: center">Order ID</th>
                                                        <th class="sortable ">Order date</th>
                                                        <th class="max-width">Motor name</th>   
                                                        <th class="max-width">Full Name</th>
                                                        <th class="max-width">Phone </th>
                                                        <th>Address </th>
                                                        <th>Total Price </th>
                                                        <th>Quantity</th>
                                                        <th>Status</th>
                                                        <th>Actions</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <c:forEach items="${listor}" var="o">
                                                        <tr>
                                                            <td class="align-middle">
                                                                <div class="custom-control custom-control-inline custom-checkbox custom-control-nameless m-0 align-top">
                                                                    <input type="checkbox" class="custom-control-input" id="item-1">
                                                                    <label class="custom-control-label" for="item-1"></label>
                                                                </div>
                                                            </td>
                                                            <td class="align-middle text-center">${o.orderID.orderID}</td>
                                                            <td class="text-nowrap align-middle">${o.orderID.orderDate}</td>
                                                            <td style="text-align: left">${o.orderID.userID.userDetail.fullName}</td>
                                                            <td style="text-align: left">${o.orderID.userID.userDetail.phone}</td>
                                                            <td style="text-align: left">${o.orderID.userID.userDetail.address}</td>
                                                            <td class="text-nowrap align-middle"><span>${o.motorBikeID.motorName}</span></td>
                                                            <td style="text-align: left">${o.totalPrice}</td>
                                                            <td style="text-align: center">${o.quantity}</td>
                                                            <td style="text-align: left">${o.orderID.statusID.detail}</td>
                                                            <td class="text-center align-middle">
                                                                <div class="btn-group align-top">
                                                                    <a href="edit?motorBikeID=${o.motorBikeID}" class="btn btn-sm btn-outline-secondary badge">Edit</a>
                                                                    <a href="delete?motorBikeID=${o.motorBikeID}" class="btn btn-sm btn-outline-secondary badge" onclick="doDelete(${o.motorBikeID})"><i class="fa fa-trash"></i></a>
                                                                </div>
                                                            </td>
                                                        </tr>
                                                    </c:forEach>
                                                </tbody>
                                            </table>
                                        </div>
                                        <div class="d-flex justify-content-center">
                                            <ul class="pagination mt-3 mb-0">
                                                <li class="disabled page-item"><a href="#" class="page-link">‹</a></li>
                                                <li class="active page-item"><a href="#" class="page-link">1</a></li>
                                                <li class="page-item"><a href="#" class="page-link">2</a></li>
                                                <li class="page-item"><a href="#" class="page-link">3</a></li>
                                                <li class="page-item"><a href="#" class="page-link">4</a></li>
                                                <li class="page-item"><a href="#" class="page-link">5</a></li>
                                                <li class="page-item"><a href="#" class="page-link">›</a></li>
                                                <li class="page-item"><a href="#" class="page-link">»</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>                       
                        <div class="modal fade" role="dialog" tabindex="-1" id="user-form-modal">
                            <div class="modal-dialog modal-lg" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title">Edit Product</h5>
                                        <button type="button" class="close" data-dismiss="modal">
                                            <span aria-hidden="true">×</span>
                                        </button>
                                    </div>
                                    <div class="modal-body">
                                        <div class="py-1">
                                            <form action="add" method="post" class="form" novalidate>
                                                <div class="row">
                                                    <div class="col">
                                                        <div class="row">
                                                            <div class="col">
                                                                <div class="form-group">
                                                                    <label>Name</label>
                                                                    <input class="form-control" type="text" name="motorName" placeholder="John Smith" value="John Smith">
                                                                </div>
                                                            </div>
                                                            <div class="col">
                                                                <div class="form-group">
                                                                    <label>Manufacturer ID</label>
                                                                    <input class="form-control" type="text" name="manuID" placeholder="johnny.s" value="johnny.s">
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="row">
                                                            <div class="col">
                                                                <div class="form-group">
                                                                    <label>Price</label>
                                                                    <input class="form-control" type="text" name="price" placeholder="johnny.s" value="johnny.s">
                                                                </div>
                                                            </div>
                                                            <div class="col">
                                                                <div class="form-group">
                                                                    <label>Stock</label>
                                                                    <input class="form-control" type="text" name="stock" placeholder="johnny.s" value="johnny.s">
                                                                </div>
                                                            </div> 
                                                        </div>
                                                        <div class="row">
                                                            <div class="col">
                                                                <div class="form-group">
                                                                    <label>Image</label>
                                                                    <input class="form-control" name="img" type="text" placeholder="">
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="row">
                                                            <div class="col mb-3">
                                                                <div class="form-group">
                                                                    <label>Detail</label>
                                                                    <textarea class="form-control" name="detail" rows="5" placeholder="About product..."></textarea>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col d-flex justify-content-end">
                                                        <button class="btn btn-primary" type="submit">Save Change</button>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.1/dist/js/bootstrap.bundle.min.js"></script>
            <script type="text/javascript">
                                                                        function doDelete(id)
                                                                        {
                                                                            var c = confirm("Xóa sản phẩm?");
                                                                            if (c)
                                                                            {
                                                                                window.location.href = "delete?motorBikeID=" + id;
                                                                            }
                                                                        }
            </script>
    </body>
</html>

