package com.sales.report.statistics;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.time.LocalDate;

public interface StatisticsByDatesRepository extends MongoRepository<StatisticsByDates, String> {
    StatisticsByDates findByDate(LocalDate date);
}
