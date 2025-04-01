package com.tour.booking.tyme.mapper;

import com.tour.booking.tyme.dto.response.PaymentResponse;
import com.tour.booking.tyme.entity.Payment;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-01T17:07:10+0700",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.2 (Homebrew)"
)
@Component
public class PaymentMapperImpl implements PaymentMapper {

    @Override
    public PaymentResponse toDTO(Payment payment) {
        if ( payment == null ) {
            return null;
        }

        PaymentResponse.PaymentResponseBuilder paymentResponse = PaymentResponse.builder();

        paymentResponse.id( payment.getId() );
        paymentResponse.bookingId( payment.getBookingId() );
        paymentResponse.amount( payment.getAmount() );
        paymentResponse.paymentDate( payment.getPaymentDate() );
        paymentResponse.status( payment.getStatus() );
        paymentResponse.customerId( payment.getCustomerId() );

        return paymentResponse.build();
    }

    @Override
    public List<PaymentResponse> toDTOs(List<Payment> payments) {
        if ( payments == null ) {
            return null;
        }

        List<PaymentResponse> list = new ArrayList<PaymentResponse>( payments.size() );
        for ( Payment payment : payments ) {
            list.add( toDTO( payment ) );
        }

        return list;
    }
}
