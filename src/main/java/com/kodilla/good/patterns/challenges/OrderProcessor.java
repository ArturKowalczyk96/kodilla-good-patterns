package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private InformationService informationService;
    private ProductOrderService productOrderService;
    private OrderRepository orderRepository;

    public OrderProcessor (final InformationService informationService,
                           final ProductOrderService productOrderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto proces (final OrderRequest orderRequest) {
        boolean isOrdered = productOrderService.order(orderRequest.getUser(),
                orderRequest.getProduct(),
                orderRequest.getOrderDate());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(),
                    orderRequest.getProduct(),
                    orderRequest.getOrderDate());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
