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
    date = "2025-04-01T17:07:10+0700",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.2 (Homebrew)"
)
@Component
public class TourMapperImpl implements TourMapper {

    @Override
    public TourResponse toDTO(Tour tour) {
        if ( tour == null ) {
            return null;
        }

        TourResponse.TourResponseBuilder tourResponse = TourResponse.builder();

        tourResponse.id( tour.getId() );
        tourResponse.name( tour.getName() );
        tourResponse.description( tour.getDescription() );
        tourResponse.price( tour.getPrice() );
        tourResponse.availability( tour.getAvailability() );

        return tourResponse.build();
    }

    @Override
    public Tour toEntity(TourResponse tourResponse) {
        if ( tourResponse == null ) {
            return null;
        }

        Tour.TourBuilder tour = Tour.builder();

        tour.name( tourResponse.getName() );
        tour.description( tourResponse.getDescription() );
        tour.price( tourResponse.getPrice() );

        return tour.build();
    }

    @Override
    public Tour toEntity(TourRequest tourRequest) {
        if ( tourRequest == null ) {
            return null;
        }

        Tour.TourBuilder tour = Tour.builder();

        tour.name( tourRequest.getName() );
        tour.description( tourRequest.getDescription() );
        tour.price( tourRequest.getPrice() );
        tour.availability( tourRequest.getAvailability() );
        tour.category( tourRequest.getCategory() );

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
