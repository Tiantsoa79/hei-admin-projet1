package school.hei.haapi.endpoint.rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import school.hei.haapi.model.Place;
import school.hei.haapi.service.PlaceService;

import java.util.List;

@RestController
@Controller
@AllArgsConstructor
@RequestMapping("/place")
public class PLaceController {
    private final PlaceService placeService;

    @GetMapping("/{id}")
    public Place findPlaceById (
            @PathVariable String id) {
        return placeService.getPlaceById(id);
    }
    @GetMapping
    public List<Place> getAllPlace(
            @RequestParam int page,
            @RequestParam int pageSize
    ){
        return placeService.getAll(page, pageSize);
    }
    @PutMapping
    public List<school.hei.haapi.model.Place> saveAllPLace(
            @RequestBody List<Place> placeList
    ){
        return placeService.updatePlace(placeList);
    }
}

