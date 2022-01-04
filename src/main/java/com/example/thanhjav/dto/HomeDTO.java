package com.example.thanhjav.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HomeDTO {
    private List<MovieDTO> listTrending;
    private List<MovieDTO> listHot;
    private List<MovieDTO> listSuggest;
    private List<MovieDTO> listWatch;
}
