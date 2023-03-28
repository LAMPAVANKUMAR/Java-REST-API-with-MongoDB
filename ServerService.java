@Service
public class ServerService {
 
   @Autowired
   private ServerRepository repository;
 
   public List<Server> getAllServers() {
      return repository.findAll();
   }
 
   public Server getServerById(String id) {
      Optional<Server> server = repository.findById(id);
      if(server.isPresent()) {
         return server.get();
      } else {
         throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Server not found");
      }
   }
 
   public List<Server> getServersByName(String name) {
      List<Server>
