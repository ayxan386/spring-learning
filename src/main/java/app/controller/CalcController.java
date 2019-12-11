package app.controller;

import app.entity.CalcResult;
import app.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CalcController {

  private final CalcService calcService;

  public CalcController(@Autowired CalcService calcService) {
    this.calcService = calcService;
  }

  @GetMapping("/calc")
  public CalcResult calculateRP(@RequestParam("x") int x, @RequestParam("y") int y,
                                @RequestParam("op") String op) {
    return calcService.calc(x, y, op);
  }

  @GetMapping("/calc/{x}/{y}/{op}")
  public CalcResult calculatePV(@PathVariable("x") int x, @PathVariable("y") int y,
                                @PathVariable("op") String op) {
    return calcService.calc(x, y, op);
  }

  @PostMapping("/calc/{x}/{y}/{op}")
  public CalcResult calculatePPV(@PathVariable("x") int x, @PathVariable("y") int y,
                                 @PathVariable("op") String op) {
    return calcService.calc(x, y, op);
  }

  @PostMapping("/calc")
  public CalcResult calculatePRP(@RequestParam("x") int x, @RequestParam("y") int y,
                                 @RequestParam("op") String op) {
    return calcService.calc(x, y, op);
  }

  @GetMapping("/calc/history")
  public List<CalcResult> getAll() {
    return calcService.getAll();
  }

}
