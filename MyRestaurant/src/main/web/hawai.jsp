<%@ include file="index.jsp" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Hawai</title>
    <link rel="stylesheet" href="stylesheet.css"></link>
</head>

<body>
<!-- <nav class="navbar navbar-expand-lg bg-dark navbar-dark ">
  <div class="container-fluid">

    <a href="#" class="navbar-brand">Hawai Restaurant</a>
    <button
    class="navbar-toggler"
    type="button"
    data-bs-toggle="collapse"
    data-bs-target="#navmenu"
    >
    <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navmenu">
        <ul class="navbar-nav ms-auto">
            <li class="nav-item" >
                <a href="#learn" class="nav-link">List of Food items</a>
            </li>
            <li class="nav-item">
                <a href="#question" class="nav-link">Contact Details</a>
            </li>
            <li>
                <a href="#" class="nav-link">About Restaurant</a>
            </li>
        </ul>

    </div>
</div>
</nav> -->
<div class="margins">
    <span  style="font-family:sans-serif; font-size:larger; color:bisque;">Hawai Restaurant</span><br>
    <img src="—Pngtree—restaurant border_2331901.png "></img>
</div>
<div class="border border image border-3 ">
    <div class="inside">
        <form>
            <div class="row" style="width: 400px; height:auto;">
            <span class="badge ">
              Username:<input type="text" size="15px" name="username"/>
            </span>
            </div>

            <div class="row" style="width: 400px; height:auto">
            <span class="badge ">
                Password: <input type="text" size="15px" name="password">
              </span></br>
            </div>
            <br>
            <div  class="row" style="width: 150px; height:auto; margin-left: 110px;">
            <span class="badge">
              <input type="submit" style="background-color:white;
              " onclick =hover() id='h' value="Sign in">
            </span>
            </div>
        </form>
    </div>
</div>
</body>


<script>
    function hover(){
        document.getElementById('h').setAttribute("style","font-style:italic;background-color:gray");
    }
    function hoverleave(){
        document.getElementById('h').setAttribute("style","");
    }
    document.getElementById('h').addEventListener("mouseover",hover)
    document.getElementById('h').addEventListener("mouseleave",hoverleave)
</script>
</html>