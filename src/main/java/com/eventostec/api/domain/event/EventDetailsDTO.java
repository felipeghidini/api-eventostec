package com.eventostec.api.domain.event;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public record EventDetailsDTO(
        UUID id,
        String title,
        String description,
        Date date,
        String city,
        String state,
        Boolean remote,
        String eventUrl,
        String imageUrl,
        List<CouponDTO> coupons) {

    public record CouponDTO(
            String code,
            Integer discount,
            Date validUntil) {

    }
}
