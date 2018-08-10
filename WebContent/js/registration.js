$(function() {
	$("username_error").hide();	
	  $("password_error").hide();
	  $("reenterpassword_error").hide();
	  $("address_error").hide();
	  $("firstname_error").hide();
	  $("lastname_error").hide();
	  
	  var username_error = false;
	  var password_error = false;
	  var reenterpassword_error = false;
	  var address_error = false;
	  var firstname_error = false;
	  var lastname_error = false;
		
	    $("#username").focusout(function() {
		  validateUserName();
	    });
	    
	    $("#password").focusout(function() {
			  validatePassword(); 
		});
	    
	    $("#reenterpassword").focusout(function() {
		  validatePasswordAndReneterPassword();  
		});
	    
	    $("#address").focusout(function() {
		   validateAddress(); 
		});
	    
	    $("#firstname").focusout(function() {
		  validateFirstName();		  
		});
	    
	    $("#lastname").focusout(function() {
		  validateLastName();		  
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
	      	  password_error = true;
	        } else {
	      	  $("#password_error").hide();  
	        }	
	      }
	    
	    function validatePasswordAndReneterPassword() {
	        var password = $("#password").val();
	        var reneterpassword = $("#reenterpassword").val();
	        
	        if (password.localeCompare(reneterpassword) != 0 ) {
	      	  $("#reenterpassword_error").html("passwords do not match");
	      	  $("#reenterpassword_error").show();
	      	  reenterpassword_error = true;
	        } else {
	      	  $("#reenterpassword_error").hide();  
	        }	
	      }
	    
	    function validateAddress() {
	        var addressLength = $("#address").val().length;	
	        if (addressLength < 10) {
	      	  $("#address_error").html("address is less than 10 characters");
	      	  $("#address_error").show();
	      	  address_error = true;
	        } else {
	      	  $("#address_error").hide();  
	        }	
	     }
	    
	    function validateFirstName() {
	        var firstNameLength = $("#firstname").val().length;	
	        if (firstNameLength < 3) {
	      	  $("#firstname_error").html("firstname is less than 3 characters");
	      	  $("#firstname_error").show();
	      	  firstname_error = true;
	        } else {
	      	  $("#firstname_error").hide();  
	        }	
	     }
	    
	    function validateLastName() {
	        var lastNameLength = $("#lastname").val().length;	
	        if (lastNameLength < 3) {
	      	  $("#lastname_error").html("lastname is less than 3 characters");
	      	  $("#lastname_error").show();
	      	  lastname_error = true;
	        } else {
	      	  $("#lastname_error").hide();  
	        }	
	     }
	    
	    $("#registrationForm").submit(function() {
	    	username_error = false;
	    	password_error = false;
	    	reenterpassword_error = false;
	    	address_error = false;
	    	firstname_error = false;
	    	lastname_error = false;
	    	
	    	validateUserName();
	    	validatePassword();
	    	validatePasswordAndReneterPassword();
	    	validateAddress();
	    	validateFirstName();
	    	validateLastName();
	    	
	    	
	    	if (username_error == false && password_error == false &&
	    		reenterpassword_error == false && address_error == false &&	
	    		firstname_error == false && lastname_error == false
	    	   ) {
	    	  return true;	
	    	} else {
	    	  return false;	
	    	}
	    }); 
	
});