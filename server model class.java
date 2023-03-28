@Document(collection = "servers")
public class Server {
 
   @Id
   private String id;
   private String name;
   private String language;
   private String framework;
 
   public String getId() {
      return id;
   }
 
   public void setId(String id) {
      this.id = id;
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
 
   public String getFramework() {
      return framework;
   }
 
   public void setFramework(String framework) {
      this.framework = framework;
   }
}
