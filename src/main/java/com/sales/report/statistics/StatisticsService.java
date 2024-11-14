package com.sales.report.statistics;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sales.report.statistics.report.Reports;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class StatisticsService {

    private final StatisticsByDatesRepository dateRepository;

    private final StatisticsByAsinRepository asinRepository;

    @PostConstruct
    public void initDatabase() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION);

        if (dateRepository.count() == 0) {
            Reports statisticsByDates = mapper.readValue(
                    new ClassPathResource("test_report.json").getInputStream(),
                    new TypeReference<Reports>() {}
            );
            dateRepository.saveAll(statisticsByDates.getSalesAndTrafficByDate());
        }

        if (asinRepository.count() == 0) {
            Reports statisticsByAsin = mapper.readValue(
                    new ClassPathResource("test_report.json").getInputStream(),
                    new TypeReference<Reports>() {}
            );
            asinRepository.saveAll(statisticsByAsin.getSalesAndTrafficByAsin());
        }

    }
}
