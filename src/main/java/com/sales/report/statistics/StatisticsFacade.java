package com.sales.report.statistics;

import org.springframework.boot.CommandLineRunner;
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
}
