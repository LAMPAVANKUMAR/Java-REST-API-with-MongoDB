public interface ServerRepository extends MongoRepository<Server, String> {
 
   List<Server> findByNameContaining(String name);
}
