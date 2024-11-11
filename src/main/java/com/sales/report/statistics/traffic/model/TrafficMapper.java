package com.sales.report.statistics.traffic.model;

import com.sales.report.statistics.traffic.Traffic;
import com.sales.report.statistics.traffic.TrafficByAsin;
import com.sales.report.statistics.traffic.TrafficByDates;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class TrafficMapper {

    public static Traffic from(TrafficDTO trafficDTO) {
        return Traffic.builder()
                .browserPageViews(trafficDTO.getBrowserPageViews())
                .browserPageViewsB2B(trafficDTO.getBrowserPageViewsB2B())
                .mobileAppPageViews(trafficDTO.getMobileAppPageViews())
                .mobileAppPageViewsB2B(trafficDTO.getMobileAppPageViewsB2B())
                .pageViews(trafficDTO.getPageViews())
                .pageViewsB2B(trafficDTO.getPageViewsB2B())
                .browserSessions(trafficDTO.getBrowserSessions())
                .browserSessionsB2B(trafficDTO.getBrowserSessionsB2B())
                .mobileAppSessions(trafficDTO.getMobileAppSessions())
                .mobileAppSessionsB2B(trafficDTO.getMobileAppSessionsB2B())
                .sessions(trafficDTO.getSessions())
                .sessionsB2B(trafficDTO.getSessionsB2B())
                .buyBoxPercentage(trafficDTO.getBuyBoxPercentage())
                .buyBoxPercentageB2B(trafficDTO.getBuyBoxPercentageB2B())
                .unitSessionPercentage(trafficDTO.getUnitSessionPercentage())
                .unitSessionPercentageB2B(trafficDTO.getUnitSessionPercentageB2B())
                .build();
    }

    public static TrafficByAsinDTO from(TrafficByAsin trafficByAsin) {
        return TrafficByAsinDTO.builder()
                .browserSessions(trafficByAsin.getBrowserSessions())
                .browserSessionsB2B(trafficByAsin.getBrowserSessionsB2B())
                .mobileAppSessions(trafficByAsin.getMobileAppSessions())
                .mobileAppSessionsB2B(trafficByAsin.getMobileAppSessionsB2B())
                .sessions(trafficByAsin.getSessions())
                .sessionsB2B(trafficByAsin.getSessionsB2B())
                .browserSessionPercentage(trafficByAsin.getBrowserSessionPercentage())
                .browserSessionPercentageB2B(trafficByAsin.getBrowserSessionPercentageB2B())
                .mobileAppSessionPercentage(trafficByAsin.getMobileAppSessionPercentage())
                .mobileAppSessionPercentageB2B(trafficByAsin.getMobileAppSessionPercentageB2B())
                .sessionPercentage(trafficByAsin.getSessionPercentage())
                .sessionPercentageB2B(trafficByAsin.getSessionPercentageB2B())
                .browserPageViews(trafficByAsin.getBrowserPageViews())
                .browserPageViewsB2B(trafficByAsin.getBrowserPageViewsB2B())
                .mobileAppPageViews(trafficByAsin.getMobileAppPageViews())
                .mobileAppPageViewsB2B(trafficByAsin.getMobileAppPageViewsB2B())
                .pageViews(trafficByAsin.getPageViews())
                .pageViewsB2B(trafficByAsin.getPageViewsB2B())
                .browserPageViewsPercentage(trafficByAsin.getBrowserPageViewsPercentage())
                .browserPageViewsPercentageB2B(trafficByAsin.getBrowserPageViewsPercentageB2B())
                .mobileAppPageViewsPercentage(trafficByAsin.getMobileAppPageViewsPercentage())
                .mobileAppPageViewsPercentageB2B(trafficByAsin.getMobileAppPageViewsPercentageB2B())
                .pageViewsPercentage(trafficByAsin.getPageViewsPercentage())
                .pageViewsPercentageB2B(trafficByAsin.getPageViewsPercentageB2B())
                .buyBoxPercentage(trafficByAsin.getBuyBoxPercentage())
                .buyBoxPercentageB2B(trafficByAsin.getBuyBoxPercentageB2B())
                .unitSessionPercentage(trafficByAsin.getUnitSessionPercentage())
                .unitSessionPercentageB2B(trafficByAsin.getUnitSessionPercentageB2B())
                .build();
    }

    public static TrafficByAsin from(TrafficByAsinDTO trafficByAsinDTO) {
        return TrafficByAsin.builder()
                .browserSessions(trafficByAsinDTO.getBrowserSessions())
                .browserSessionsB2B(trafficByAsinDTO.getBrowserSessionsB2B())
                .mobileAppSessions(trafficByAsinDTO.getMobileAppSessions())
                .mobileAppSessionsB2B(trafficByAsinDTO.getMobileAppSessionsB2B())
                .sessions(trafficByAsinDTO.getSessions())
                .sessionsB2B(trafficByAsinDTO.getSessionsB2B())
                .browserSessionPercentage(trafficByAsinDTO.getBrowserSessionPercentage())
                .browserSessionPercentageB2B(trafficByAsinDTO.getBrowserSessionPercentageB2B())
                .mobileAppSessionPercentage(trafficByAsinDTO.getMobileAppSessionPercentage())
                .mobileAppSessionPercentageB2B(trafficByAsinDTO.getMobileAppSessionPercentageB2B())
                .sessionPercentage(trafficByAsinDTO.getSessionPercentage())
                .sessionPercentageB2B(trafficByAsinDTO.getSessionPercentageB2B())
                .browserPageViews(trafficByAsinDTO.getBrowserPageViews())
                .browserPageViewsB2B(trafficByAsinDTO.getBrowserPageViewsB2B())
                .mobileAppPageViews(trafficByAsinDTO.getMobileAppPageViews())
                .mobileAppPageViewsB2B(trafficByAsinDTO.getMobileAppPageViewsB2B())
                .pageViews(trafficByAsinDTO.getPageViews())
                .pageViewsB2B(trafficByAsinDTO.getPageViewsB2B())
                .browserPageViewsPercentage(trafficByAsinDTO.getBrowserPageViewsPercentage())
                .browserPageViewsPercentageB2B(trafficByAsinDTO.getBrowserPageViewsPercentageB2B())
                .mobileAppPageViewsPercentage(trafficByAsinDTO.getMobileAppPageViewsPercentage())
                .mobileAppPageViewsPercentageB2B(trafficByAsinDTO.getMobileAppPageViewsPercentageB2B())
                .pageViewsPercentage(trafficByAsinDTO.getPageViewsPercentage())
                .pageViewsPercentageB2B(trafficByAsinDTO.getPageViewsPercentageB2B())
                .buyBoxPercentage(trafficByAsinDTO.getBuyBoxPercentage())
                .buyBoxPercentageB2B(trafficByAsinDTO.getBuyBoxPercentageB2B())
                .unitSessionPercentage(trafficByAsinDTO.getUnitSessionPercentage())
                .unitSessionPercentageB2B(trafficByAsinDTO.getUnitSessionPercentageB2B())
                .build();
    }

    public static TrafficByDates from(TrafficByDatesDTO trafficByDatesDTO) {
        return TrafficByDates.builder()
                .browserPageViews(trafficByDatesDTO.getBrowserPageViews())
                .browserPageViewsB2B(trafficByDatesDTO.getBrowserPageViewsB2B())
                .mobileAppPageViews(trafficByDatesDTO.getMobileAppPageViews())
                .mobileAppPageViewsB2B(trafficByDatesDTO.getMobileAppPageViewsB2B())
                .pageViews(trafficByDatesDTO.getPageViews())
                .pageViewsB2B(trafficByDatesDTO.getPageViewsB2B())
                .browserSessions(trafficByDatesDTO.getBrowserSessions())
                .browserSessionsB2B(trafficByDatesDTO.getBrowserSessionsB2B())
                .mobileAppSessions(trafficByDatesDTO.getMobileAppSessions())
                .mobileAppSessionsB2B(trafficByDatesDTO.getMobileAppSessionsB2B())
                .sessions(trafficByDatesDTO.getSessions())
                .sessionsB2B(trafficByDatesDTO.getSessionsB2B())
                .buyBoxPercentage(trafficByDatesDTO.getBuyBoxPercentage())
                .buyBoxPercentageB2B(trafficByDatesDTO.getBuyBoxPercentageB2B())
                .unitSessionPercentage(trafficByDatesDTO.getUnitSessionPercentage())
                .unitSessionPercentageB2B(trafficByDatesDTO.getUnitSessionPercentageB2B())
                .build();
    }

    public static TrafficByDatesDTO from(TrafficByDates trafficByDates) {
        return TrafficByDatesDTO.builder()
                .browserPageViews(trafficByDates.getBrowserPageViews())
                .browserPageViewsB2B(trafficByDates.getBrowserPageViewsB2B())
                .mobileAppPageViews(trafficByDates.getMobileAppPageViews())
                .mobileAppPageViewsB2B(trafficByDates.getMobileAppPageViewsB2B())
                .pageViews(trafficByDates.getPageViews())
                .pageViewsB2B(trafficByDates.getPageViewsB2B())
                .browserSessions(trafficByDates.getBrowserSessions())
                .browserSessionsB2B(trafficByDates.getBrowserSessionsB2B())
                .mobileAppSessions(trafficByDates.getMobileAppSessions())
                .mobileAppSessionsB2B(trafficByDates.getMobileAppSessionsB2B())
                .sessions(trafficByDates.getSessions())
                .sessionsB2B(trafficByDates.getSessionsB2B())
                .buyBoxPercentage(trafficByDates.getBuyBoxPercentage())
                .buyBoxPercentageB2B(trafficByDates.getBuyBoxPercentageB2B())
                .unitSessionPercentage(trafficByDates.getUnitSessionPercentage())
                .unitSessionPercentageB2B(trafficByDates.getUnitSessionPercentageB2B())
                .build();
    }

}
