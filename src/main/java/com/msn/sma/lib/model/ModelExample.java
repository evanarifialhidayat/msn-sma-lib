package com.msn.sma.lib.model;

public class ModelExample {
	    public String name;
	    public String language;
	    public String id;
	    public String bio;
	    public double version;
	    
	    
	    ModelExample(){}
	    
		public ModelExample(String name, String language, String id, String bio, double version) {
			super();
			this.name = name;
			this.language = language;
			this.id = id;
			this.bio = bio;
			this.version = version;
		}
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getBio() {
			return bio;
		}
		public void setBio(String bio) {
			this.bio = bio;
		}
		public double getVersion() {
			return version;
		}
		public void setVersion(double version) {
			this.version = version;
		}
	    
	    
	    
}
