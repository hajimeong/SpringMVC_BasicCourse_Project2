package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller의 return은 view
//RestController의 return은 String
//RestAPI를 만들때 핵심적인 controller
@RestController
@Slf4j
public class LogTestController {

    //private final Logger log= LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){
        String name="Spring";

        //System.out.println("name = " + name);

        //trace, debug는 로그에 나오지 않음
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
