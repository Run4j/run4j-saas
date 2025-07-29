package uz.maniac4j.run4jsaas.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.maniac4j.run4jsaas.repository.InstanceRepository;

@Service
@RequiredArgsConstructor
public class InstanceService {
    private final InstanceRepository instanceRepository;
}
