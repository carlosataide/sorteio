<%-- 
    Document   : sorteio
    Created on : 03/12/2015, 14:46:06
    Author     : carlo_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sorteio</title>
    </head>
    <body>
        <h1>Sorteio de Números</h1>
        <link
  href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"
  rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

  <div class="container" style="margin-top: 30px">
    <div class="col-md-12">
      <div class="modal-dialog" style="margin-bottom: 0">
        <div class="modal-content">
          <div class="panel-heading">
            <h3 class="panel-title">Cálculo de IMC</h3>
          </div>
          <div class="panel-body">
            <form role="form">
              <fieldset>
                <div class="form-group">
                  <input class="form-control" placeholder="Primeiro número" name="numero1"
                    type="text" value="${param.numero1}">
                </div>
                <div class="form-group">
                  <input class="form-control" placeholder="Segundo número" name="numero2"
                    type="text" value="${param.numero2}">
                </div>
                <input type="submit" class="btn btn-sm btn-success" value="Calcular">
              </fieldset>
            </form>
            <br>
            <%
            //Obtendo a variável definida no servlet.
            mvc.SorteioNumeroModel gerarNumero = (mvc.SorteioNumeroModel) request.getAttribute("sorteio");
            //Se parâmetros inválidos, ...
            if (gerarNumero.getNumero1() == 0 || gerarNumero.getNumero2() == 0) {
%>
<!-- Aqui posso colocar HTML. -->
<div class="alert alert-danger" role="alert">Coloque algum valor nos campos Peso e Altura.</div>
<%
           // } else {
              %>
<!-- Aqui posso colocar HTML. -->
<div class="alert alert-success" role="alert">

<br>
Resultado: ${calculoImc.resultado}
</div>
              <%
            }
            %>
            <br>
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
  <script
    src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <!-- Include all compiled plugins (below), or include individual files as needed -->
  <script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

    </body>
</html>
