package co.kr.talentx.openscout;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenscoutController {

  // 오픈 스카우트 지원자 이메일을 반환하도록 구현하세요.
  @GetMapping("/")
  public String author_email() {
    return "support@talentx.co.kr";
  }

  // 오픈 스카우트 과제 요구사항 3)를 참고해서 구현하세요.
  @PostMapping("/admin/upload-csv")
  public String admin_upload() {
    return "Uploading bigdata by the admin user...";
  }

  // 오픈 스카우트 과제 요구사항 5)를 참고해서 구현하세요.
  @GetMapping("/nju-valuation-review")
  public String nju_valuation_review() {
    return "Downloading a N-Job user's imcome and review...";
  }

  // 오픈 스카우트 과제 요구사항 4)를 참고해서 구현하세요.
  @PostMapping("/cu/signup")
  public String cu_signup() {
    return "Company user signing up...";
  }

  // 오픈 스카우트 과제 요구사항 4)를 참고해서 구현하세요.
  @PostMapping("/cu/login")
  public String cu_login() {
    return "Company user logging in...";
  }

  // 오픈 스카우트 과제 요구사항 6)과 3)을 참고해서 구현하세요.
  @PostMapping("/cu/nju-payment-review")
  public String cu_nju_payment_review() {
    return "Uploading a company's payment and feeback about a N-Job User...";
  }

  // 오픈 스카우트 과제 요구사항 4)를 참고해서 구현하세요.
  @PostMapping("/nju/signup")
  public String nju_signup() {
    return "N-Job user signing up...";
  }

  // 오픈 스카우트 과제 요구사항 4)를 참고해서 구현하세요.
  @PostMapping("/nju/login")
  public String nju_login() {
    return "N-Job user logging in...";
  }

  // 오픈 스카우트 과제 요구사항 7)을 참고해서 구현하세요.
  @GetMapping("/nju/income-review")
  public String nju_income_review() {
    return "Downloading your imcome and review...";
  }

}