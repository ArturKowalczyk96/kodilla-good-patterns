package com.kodilla.good.patterns.food2door;

public class OrderProcessor {

    private InformationServices informationService;
    private ProductOrderService productOrderService;
    private OrderRepository orderRepository;

    public OrderProcessor (final InformationServices informationService,
                           final ProductOrderService productOrderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto proces (final OrderRequest orderRequest) {
        boolean isOrdered = productOrderService.order(orderRequest.getShopper(),
                orderRequest.getProduct());

        if (isOrdered) {
            informationService.inform(orderRequest.getShopper());
            orderRepository.createOrder(orderRequest.getShopper(),
                    orderRequest.getProduct());
            return new OrderDto(orderRequest.getShopper(), true);
        } else {
            return new OrderDto(orderRequest.getShopper(), false);
        }
    }
}
