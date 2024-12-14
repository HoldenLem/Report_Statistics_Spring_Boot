package com.sales.report.statistics;

import com.sales.report.statistics.model.StatisticsByDatesDTO;
import com.sales.report.statistics.model.StatisticsMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class StatisticsFacade implements CommandLineRunner {
    private final StatisticsService statisticService;

    public StatisticsFacade(StatisticsService statisticService) {
        this.statisticService = statisticService;
    }

    @Override
    public void run(String... args) throws Exception {
        statisticService.initDatabase();
    }


    @Cacheable(value = "statistic", key = "#date")
    public StatisticsByDatesDTO findByDate(LocalDate date) {
        return StatisticsMapper.from(statisticService.findByDate(date));
    }
}
