package com.tour.booking.tyme.mapper;

import com.tour.booking.tyme.dto.response.PaymentResponse;
import com.tour.booking.tyme.entity.Payment;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
<<<<<<< HEAD
    date = "2025-04-01T14:10:42+0700",
=======
    date = "2025-04-01T14:08:35+0700",
>>>>>>> f37d255 (fixing the dependency)
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.42.0.v20250325-2231, environment: Java 21.0.6 (Eclipse Adoptium)"
)
@Component
public class PaymentMapperImpl implements PaymentMapper {

    @Override
    public PaymentResponse toDTO(Payment payment) {
        if ( payment == null ) {
            return null;
        }

        PaymentResponse.PaymentResponseBuilder paymentResponse = PaymentResponse.builder();

        paymentResponse.amount( payment.getAmount() );
        paymentResponse.bookingId( payment.getBookingId() );
        paymentResponse.customerId( payment.getCustomerId() );
        paymentResponse.id( payment.getId() );
        paymentResponse.paymentDate( payment.getPaymentDate() );
        paymentResponse.status( payment.getStatus() );

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
