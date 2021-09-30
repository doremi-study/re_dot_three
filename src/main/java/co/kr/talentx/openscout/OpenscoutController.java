package co.kr.talentx.openscout;

import co.kr.talentx.openscout.domain.user.User;
import co.kr.talentx.openscout.dto.CUserRequest;
import co.kr.talentx.openscout.dto.NjUserRequest;
import co.kr.talentx.openscout.dto.ResultMessage;
import co.kr.talentx.openscout.service.UserSerivice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RequiredArgsConstructor
@RestController
public class OpenscoutController {

  private final UserSerivice userSerivice;


  // 오픈 스카우트 지원자 이메일을 반환하도록 구현하세요.
  @GetMapping("/")
  public String author_email() {
    return "juuxmee@gmail.com";
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
  public ResponseEntity<ResultMessage> cu_signup(@RequestBody CUserRequest cUserRequest) throws Exception {
    userSerivice.saveCUser(cUserRequest);
    return ResponseEntity.ok(ResultMessage.builder().code(HttpStatus.OK.value()).build());
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
  public ResponseEntity<ResultMessage> nju_signup(@RequestBody NjUserRequest njUserRequest) throws Exception {
    userSerivice.saveNjUser(njUserRequest);
    return ResponseEntity.ok(ResultMessage.builder().code(HttpStatus.OK.value()).build());
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
