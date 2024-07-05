package com.pp.model;

public class Customer {
	
		
		private Integer id;
		
		private String name;
		
		private String email;
		
		private String city;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + "]";
		}
		
		

	}


