document.getElementById('login-form').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form submission
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    // Perform your login logic here, for demonstration purposes, just log the input
    console.log('Username:', username);
    console.log('Password:', password);

    // Here you can redirect user to another page after successful login if needed
    let validusername="717822p202";
    let validpassword="qwertyuiop";
    if(username==validusername && password==validpassword){
        window.location.href="homepage.html";
    }
    else{
        alert("Login Failed!");
    }
     }
);