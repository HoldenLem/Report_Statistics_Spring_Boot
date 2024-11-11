package com.sales.report.statistics.model;

import com.sales.report.statistics.StatisticsByAsin;
import com.sales.report.statistics.StatisticsByDates;
import com.sales.report.statistics.sales.model.SalesMapper;
import com.sales.report.statistics.traffic.model.TrafficMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class StatisticsMapper {

    public static StatisticsByDatesDTO from(StatisticsByDates statisticsByDates) {
        return StatisticsByDatesDTO.builder()
                .date(statisticsByDates.getDate())
                .salesByDate(SalesMapper.from(statisticsByDates.getSalesByDate()))
                .trafficByDate(TrafficMapper.from(statisticsByDates.getTrafficByDate()))
                .build();
    }

    public static StatisticsByDates from(StatisticsByDatesDTO statisticsByDatesDTO) {
        return StatisticsByDates.builder()
                .date(statisticsByDatesDTO.getDate())
                .salesByDate(SalesMapper.from(statisticsByDatesDTO.getSalesByDate()))
                .trafficByDate(TrafficMapper.from(statisticsByDatesDTO.getTrafficByDate()))
                .build();
    }

    public static StatisticsByAsinDTO from(StatisticsByAsin statisticsByAsin) {
        return StatisticsByAsinDTO.builder()
                .parentAsin(statisticsByAsin.getParentAsin())
                .salesByAsin(SalesMapper.from(statisticsByAsin.getSalesByAsin()))
                .trafficByAsin(TrafficMapper.from(statisticsByAsin.getTrafficByAsin()))
                .build();
    }

    public static StatisticsByAsin from(StatisticsByAsinDTO statisticsByAsinDTO) {
        return StatisticsByAsin.builder()
                .parentAsin(statisticsByAsinDTO.getParentAsin())
                .salesByAsin(SalesMapper.from(statisticsByAsinDTO.getSalesByAsin()))
                .trafficByAsin(TrafficMapper.from(statisticsByAsinDTO.getTrafficByAsin()))
                .build();
    }

}
