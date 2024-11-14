package com.sales.report.statistics;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StatisticsByDatesRepository extends MongoRepository<StatisticsByDates, String> {
}
