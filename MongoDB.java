@Configuration
public class MongoConfig {
 
   @Value("${spring.data.mongodb.uri}")
   private String uri;
 
   @Bean
   public MongoClient mongoClient() {
      return MongoClients.create(uri);
   }
 
   @Bean
   public MongoTemplate mongoTemplate() {
      return new MongoTemplate(mongoClient(), "servers");
   }
}
