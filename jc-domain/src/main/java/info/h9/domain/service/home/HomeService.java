package info.h9.domain.service.home;

import info.h9.domain.home.Home;
import info.h9.domain.home.HomeDto;
import info.h9.domain.repository.home.HomeRepository;
import info.h9.domain.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class HomeService implements BaseService {

    private final HomeRepository homeRepository;

    public HomeService(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
    }

    public HomeDto getHome(HomeDto dto) {
        Iterable<Home> homeList = homeRepository.findAll();
        System.out.println(homeList);
        return dto;
    }

}
