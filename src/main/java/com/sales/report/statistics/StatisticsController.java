package com.sales.report.statistics;

import com.sales.report.statistics.model.StatisticsByDatesDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StatisticsController {
    private final StatisticsFacade statisticsFacade;

    @GetMapping("/statistics/{date}")
    public ResponseEntity<StatisticsByDatesDTO>  findByDate(@PathVariable String date) {
        return ResponseEntity.ok(statisticsFacade.findByDate(date));
    }

}
