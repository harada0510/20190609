import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/confirm")
    public String confirm(@ModelAttribute("msg") String arg) {
        System.out.println("入力された名前:" + arg);
        return "return";
    }
    /*@RequestMapping("/start")
    public String start() {
        System.out.println("ゲーム開始！！");
        return "test";
    }*/
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
