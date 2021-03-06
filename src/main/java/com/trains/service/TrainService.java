package com.trains.service;

import com.trains.model.Train;

import java.util.List;
import java.util.Map;

public interface TrainService {
    public Map insert(List<Train> trains);
    public Map update(Train train, Long id);
    public Map delete(Long id);
    public Map getAllSharingTracks();
    public Map getAllAmenitiesContaining(String keyword);
    public Map getAll();
}
