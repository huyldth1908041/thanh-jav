package com.example.thanhjav.service;

import com.example.thanhjav.dto.HomeDTO;
import com.example.thanhjav.dto.MovieDTO;
import com.example.thanhjav.entity.Movie;
import com.example.thanhjav.repository.MovieRepository;
import com.example.thanhjav.util.RESTResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;

    public ResponseEntity<?> fetchHomePageData() {
        HashMap<String, Object> restResponse;
        //todo: sorting or searching here
        List<Movie> list = movieRepository.findAll();
        //convert to dto
        List<MovieDTO> listDTOs = list.stream().map(MovieDTO::new).collect(Collectors.toList());
        HomeDTO homeDTO = new HomeDTO(listDTOs, listDTOs, listDTOs, listDTOs);
        restResponse = new RESTResponse.Success()
                .setMessage("OK")
                .setStatus(HttpStatus.CREATED.value())
                .setData(homeDTO).build();
        return ResponseEntity.ok().body(restResponse);
    }


}
