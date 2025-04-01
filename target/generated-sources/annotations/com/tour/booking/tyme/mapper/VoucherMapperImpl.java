package com.tour.booking.tyme.mapper;

import com.tour.booking.tyme.dto.request.VoucherRequest;
import com.tour.booking.tyme.dto.response.VoucherResponse;
import com.tour.booking.tyme.entity.Voucher;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-01T17:07:10+0700",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.2 (Homebrew)"
)
@Component
public class VoucherMapperImpl implements VoucherMapper {

    @Override
    public VoucherResponse toDTO(Voucher voucher) {
        if ( voucher == null ) {
            return null;
        }

        VoucherResponse.VoucherResponseBuilder voucherResponse = VoucherResponse.builder();

        voucherResponse.id( voucher.getId() );
        voucherResponse.code( voucher.getCode() );
        if ( voucher.getDiscountType() != null ) {
            voucherResponse.discountType( voucher.getDiscountType().name() );
        }
        voucherResponse.discountValue( voucher.getDiscountValue() );
        voucherResponse.expirationDate( voucher.getExpirationDate() );

        return voucherResponse.build();
    }

    @Override
    public Voucher toEntity(VoucherRequest request) {
        if ( request == null ) {
            return null;
        }

        Voucher.VoucherBuilder voucher = Voucher.builder();

        voucher.code( request.getCode() );
        voucher.discountType( request.getDiscountType() );
        voucher.discountValue( request.getDiscountValue() );
        voucher.expirationDate( request.getExpirationDate() );

        return voucher.build();
    }
}
