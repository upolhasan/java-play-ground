package upol.functional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalPlayground {

    public static void main(String args[]){


        Optional<String> ownerId = Optional.of("987654");
        Optional<String> emptyOwnerId = Optional.ofNullable(null);

        Map<String, Object> body = new HashMap<String, Object>();

        final Optional<Object> productId = productId().map(p -> body.put("productId", p));
    }

    static Optional<String> productId(){
        Optional<String> productId = Optional.of("123456");
        Optional<String> emptyProductId = Optional.ofNullable(null);

        return productId;
    }
}
