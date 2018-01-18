package challenges;

import java.time.LocalDateTime;
import java.util.HashMap;

public interface OrderRepository {

    void createOrder(User user, int itemId, LocalDateTime dateOfOrder);
}
