package com.tour.booking.tyme.mapper;

import com.tour.booking.tyme.dto.request.TourRequest;
import com.tour.booking.tyme.dto.response.TourResponse;
import com.tour.booking.tyme.entity.Tour;
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
public class TourMapperImpl implements TourMapper {

    @Override
    public TourResponse toDTO(Tour tour) {
        if ( tour == null ) {
            return null;
        }

        TourResponse.TourResponseBuilder tourResponse = TourResponse.builder();

        tourResponse.availability( tour.getAvailability() );
        tourResponse.description( tour.getDescription() );
        tourResponse.id( tour.getId() );
        tourResponse.name( tour.getName() );
        tourResponse.price( tour.getPrice() );

        return tourResponse.build();
    }

    @Override
    public Tour toEntity(TourResponse tourResponse) {
        if ( tourResponse == null ) {
            return null;
        }

        Tour.TourBuilder tour = Tour.builder();

        tour.description( tourResponse.getDescription() );
        tour.name( tourResponse.getName() );
        tour.price( tourResponse.getPrice() );

        return tour.build();
    }

    @Override
    public Tour toEntity(TourRequest tourRequest) {
        if ( tourRequest == null ) {
            return null;
        }

        Tour.TourBuilder tour = Tour.builder();

        tour.availability( tourRequest.getAvailability() );
        tour.category( tourRequest.getCategory() );
        tour.description( tourRequest.getDescription() );
        tour.name( tourRequest.getName() );
        tour.price( tourRequest.getPrice() );

        return tour.build();
    }

    @Override
    public List<TourResponse> toDTOs(List<Tour> tours) {
        if ( tours == null ) {
            return null;
        }

        List<TourResponse> list = new ArrayList<TourResponse>( tours.size() );
        for ( Tour tour : tours ) {
            list.add( toDTO( tour ) );
        }

        return list;
    }

    @Override
    public List<Tour> toEntities(List<TourRequest> tourRequests) {
        if ( tourRequests == null ) {
            return null;
        }

        List<Tour> list = new ArrayList<Tour>( tourRequests.size() );
        for ( TourRequest tourRequest : tourRequests ) {
            list.add( toEntity( tourRequest ) );
        }

        return list;
    }
}
