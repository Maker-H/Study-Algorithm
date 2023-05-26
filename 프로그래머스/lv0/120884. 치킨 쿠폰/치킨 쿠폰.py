def solution(chicken):
    coupon = 0
    service_chicken = 0
    an = []
    while chicken != 0:
        while chicken != 0:
            coupon = coupon + chicken % 10

            chicken = chicken // 10
            service_chicken += chicken

        chicken = coupon // 10
        service_chicken = service_chicken + coupon // 10
        coupon %= 10

    return service_chicken