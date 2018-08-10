$(function() {
  $("username_error").hide();	
  $("password_error").hide();	
  
  var username_error = false;
  var password_error = false;
	
    $("#username").focusout(function() {
	  validateUserName();
	  
    });
    
    $("#password").focusout(function() {
  	  validatePassword();
  	  
      });
    
    function validateUserName() {
      var usernameLength = $("#username").val().length;	
      if (usernameLength < 7) {
    	  $("#username_error").html("username is less than 7 characters");
    	  $("#username_error").show();
    	  username_error = true;
      } else {
    	$("#username_error").hide();  
      }	
    }
    
    function validatePassword() {
      var passwordLength = $("#password").val().length; 	
      if (passwordLength < 7) {
    	  $("#password_error").html("password is less than 7 characters");
    	  $("#password_error").show();
    	  username_error = true;  
      } else {
    	$("#password_error").hide();  
      }	
    }
    
    $("#loginForm").submit(function() {
    	username_error = false;
    	password_error = false;
    	
    	validateUserName();
    	validatePassword();
    	
    	if (username_error == false && password_error == false) {
    	  return true;	
    	} else {
    	  return false;	
    	}
    });
});