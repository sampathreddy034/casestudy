package ODCW;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface WasherRepository extends MongoRepository<Washer, String> {

    Washer findWashersById(String Id);
    Washer findByMobileNumber(String mobilenumber);
    Washer findByUserName(String username);

}
