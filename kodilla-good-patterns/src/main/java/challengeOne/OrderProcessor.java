package challengeOne;

import java.time.LocalDateTime;

    public class OrderProcessor {

        private Shop shop;
        private InformationService informationService;
        private OrderService orderService;

        public OrderProcessor( Shop shop, InformationService informationService,OrderService orderService) {
            this.shop = shop;
            this.informationService = informationService;
            this.orderService = orderService;
        }

        public boolean orderProcess(OrderRequest orderRequest, LocalDateTime dateOfOrder){
            boolean isOrdered = shop.process(orderRequest);

            if(isOrdered){
                orderService.order(orderRequest,LocalDateTime.now());
                informationService.inform(orderRequest);
                return true;
            } else {
                System.out.println("New order has not been created.");
                return false;
            }
        }

}
