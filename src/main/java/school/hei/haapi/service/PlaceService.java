package school.hei.haapi.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import school.hei.haapi.model.Event;
import school.hei.haapi.model.Place;
import school.hei.haapi.repository.PlaceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PlaceService {
  private  final PlaceRepository placeRepository;

  public List<Place> getAll(int page, int pageSize){
    Pageable pageable = PageRequest.of(page, pageSize);
    return placeRepository.findAll(pageable).toList();
  }
  public Place getPlaceById(String id){
    return placeRepository.getById(id);
  }

  @Transactional
  public List<Place> updatePlace(List<Place> placeList) {
    return placeRepository.saveAll(placeList);
  }
}
