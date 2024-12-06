package com.sales.report.statistics;

import com.sales.report.statistics.model.StatisticsByDatesDTO;
import com.sales.report.statistics.model.StatisticsMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

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


    public StatisticsByDatesDTO findByDate(String date) {
        return StatisticsMapper.from(statisticService.findByDate(date));
    }
}
