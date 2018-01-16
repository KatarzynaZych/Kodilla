package challenges;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface OrderService {

    boolean order(User userName, int itemId, LocalDateTime dateOfOrder);
}
