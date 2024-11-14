package com.sales.report.statistics;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StatisticsByAsinRepository extends MongoRepository<StatisticsByAsin, String> {
}
