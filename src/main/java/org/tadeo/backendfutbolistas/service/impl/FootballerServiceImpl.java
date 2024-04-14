package org.tadeo.backendfutbolistas.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.tadeo.backendfutbolistas.model.Footballer;
import org.tadeo.backendfutbolistas.repository.IFootballerRepo;
import org.tadeo.backendfutbolistas.repository.IGenericRepo;
import org.tadeo.backendfutbolistas.service.IFootballerService;

@Service
@RequiredArgsConstructor
public class FootballerServiceImpl extends CRUDImpl<Footballer, Integer> implements IFootballerService {

    private final IFootballerRepo repo;

    @Override
    protected IGenericRepo<Footballer, Integer> getRepo() {
        return repo;
    }
}
