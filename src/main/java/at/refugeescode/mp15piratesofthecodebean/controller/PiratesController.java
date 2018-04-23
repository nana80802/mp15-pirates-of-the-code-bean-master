package at.refugeescode.mp15piratesofthecodebean.controller;

import at.refugeescode.mp15piratesofthecodebean.model.Result;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PiratesController {
    private Result result;

    public PiratesController(Result result) {
        this.result = result;
        this.result = new Result("Start",true,true,true);
    }

    public Result getResult() {
        return result;
    }

    public void next(Integer number) {
        List<Result> results = Stream.of(
                //new Result("Step 1", true,true,true),
                new Result("Step 1", false,true,true),
                new Result("Step 2", false, false,true),
                new Result("Step 3", false,false,  false),
                new Result("Step 4",false,false,false)
                )
                .collect(Collectors.toList());
        result = results.get(number - 1);
    }
}
