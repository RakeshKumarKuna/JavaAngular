<html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<body>
<div>
<h1 style="color:red;text-align:center">Welcome to Spring Web</h1>
</div>
<div class="d-flex justify-content-center align-items-center mt-4">
<form action="formData" method="post">
  <dl>
  <dt>Email</dt>
  <dd><input name="email" type="text" placeholder="enter your email" class="form-control"></dd>
  <dt>Password</dt>
  <dd><input name="password" type="password" placeholder="enter your password" class="form-control"></dd>
  </dl>
  <div>
  <button type="submit" class="btn btn-primary">Submit</button>
  <button type="reset"  class="btn btn-danger">Reset</button>
  </div>
</form>
</div>
</body>
</html>
