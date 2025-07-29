package uz.maniac4j.run4jsaas.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.maniac4j.run4jsaas.repository.DatabaseRepository;
import uz.maniac4j.run4jsaas.repository.FeatureRepository;

@Service
@RequiredArgsConstructor
public class FeatureService {
    private final FeatureRepository featureRepository;
}
