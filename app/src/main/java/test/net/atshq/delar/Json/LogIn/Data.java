package test.net.atshq.delar.Json.LogIn;


import com.google.gson.annotations.SerializedName;


public class Data{

	@SerializedName("image")
	private String image;

	@SerializedName("salt")
	private String salt;

	@SerializedName("activation_code")
	private String activationCode;

	@SerializedName("last_login")
	private String lastLogin;

	@SerializedName("designation_id")
	private Object designationId;

	@SerializedName("active")
	private String active;

	@SerializedName("last_name")
	private String lastName;

	@SerializedName("ip_address")
	private String ipAddress;

	@SerializedName("password")
	private String password;

	@SerializedName("forgotten_password_time")
	private Object forgottenPasswordTime;

	@SerializedName("created_on")
	private String createdOn;

	@SerializedName("phone")
	private String phone;

	@SerializedName("user_id")
	private String userId;

	@SerializedName("sidebar")
	private String sidebar;

	@SerializedName("remember_code")
	private String rememberCode;

	@SerializedName("company")
	private String company;

	@SerializedName("id")
	private String id;

	@SerializedName("first_name")
	private String firstName;

	@SerializedName("email")
	private String email;

	@SerializedName("forgotten_password_code")
	private Object forgottenPasswordCode;

	@SerializedName("username")
	private String username;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setSalt(String salt){
		this.salt = salt;
	}

	public String getSalt(){
		return salt;
	}

	public void setActivationCode(String activationCode){
		this.activationCode = activationCode;
	}

	public String getActivationCode(){
		return activationCode;
	}

	public void setLastLogin(String lastLogin){
		this.lastLogin = lastLogin;
	}

	public String getLastLogin(){
		return lastLogin;
	}

	public void setDesignationId(Object designationId){
		this.designationId = designationId;
	}

	public Object getDesignationId(){
		return designationId;
	}

	public void setActive(String active){
		this.active = active;
	}

	public String getActive(){
		return active;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setIpAddress(String ipAddress){
		this.ipAddress = ipAddress;
	}

	public String getIpAddress(){
		return ipAddress;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setForgottenPasswordTime(Object forgottenPasswordTime){
		this.forgottenPasswordTime = forgottenPasswordTime;
	}

	public Object getForgottenPasswordTime(){
		return forgottenPasswordTime;
	}

	public void setCreatedOn(String createdOn){
		this.createdOn = createdOn;
	}

	public String getCreatedOn(){
		return createdOn;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getUserId(){
		return userId;
	}

	public void setSidebar(String sidebar){
		this.sidebar = sidebar;
	}

	public String getSidebar(){
		return sidebar;
	}

	public void setRememberCode(String rememberCode){
		this.rememberCode = rememberCode;
	}

	public String getRememberCode(){
		return rememberCode;
	}

	public void setCompany(String company){
		this.company = company;
	}

	public String getCompany(){
		return company;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setForgottenPasswordCode(Object forgottenPasswordCode){
		this.forgottenPasswordCode = forgottenPasswordCode;
	}

	public Object getForgottenPasswordCode(){
		return forgottenPasswordCode;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"image = '" + image + '\'' + 
			",salt = '" + salt + '\'' + 
			",activation_code = '" + activationCode + '\'' + 
			",last_login = '" + lastLogin + '\'' + 
			",designation_id = '" + designationId + '\'' + 
			",active = '" + active + '\'' + 
			",last_name = '" + lastName + '\'' + 
			",ip_address = '" + ipAddress + '\'' + 
			",password = '" + password + '\'' + 
			",forgotten_password_time = '" + forgottenPasswordTime + '\'' + 
			",created_on = '" + createdOn + '\'' + 
			",phone = '" + phone + '\'' + 
			",user_id = '" + userId + '\'' + 
			",sidebar = '" + sidebar + '\'' + 
			",remember_code = '" + rememberCode + '\'' + 
			",company = '" + company + '\'' + 
			",id = '" + id + '\'' + 
			",first_name = '" + firstName + '\'' + 
			",email = '" + email + '\'' + 
			",forgotten_password_code = '" + forgottenPasswordCode + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}