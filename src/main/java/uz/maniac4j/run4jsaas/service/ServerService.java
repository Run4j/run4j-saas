package uz.maniac4j.run4jsaas.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.maniac4j.run4jsaas.repository.InstanceRepository;
import uz.maniac4j.run4jsaas.repository.ServerRepository;

@Service
@RequiredArgsConstructor
public class ServerService {
    private final ServerRepository serverRepository;
}
