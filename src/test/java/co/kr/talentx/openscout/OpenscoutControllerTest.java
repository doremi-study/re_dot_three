package co.kr.talentx.openscout;

import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.assertj.core.util.VisibleForTesting;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@AutoConfigureMockMvc
public class OpenscoutControllerTest {

    @Autowired
    private MockMvc mvc;

    // @Autowired
    // private UserRepository userRepository;

    // @Autowired
    // private ObjectMapper objectMapper;

//  @Autowired
//  private TestRestTemplate restTemplate;

    @Test
    @DisplayName("지원자 이메일을 반환하도록 구현")
    public void getAuthorEmail() throws Exception {
        mvc.perform(get("/").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
                .andExpect(content().string(equalTo("juuxmee@gmail.com")));
    }

    @Test
    public void postAdminUploadCSV() throws Exception {
        mvc.perform(post("/admin/upload-csv").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andExpect(content().string(equalTo("Uploading bigdata by the admin user...")));
    }

    @Test
    public void getNJUValuationReview() throws Exception {


        mvc.perform(get("/nju-valuation-review").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Downloading a N-Job user's imcome and review...")));
    }

    @Test
    @DisplayName("기업_회원가입")
    public void getCUSignup() throws Exception {

    }

    @Test
    @Transactional
    public void 기업회원가입_중복체크() throws Exception {

    }

    @Test
    public void postCULogin() throws Exception {
        mvc.perform(post("/cu/login").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
                .andExpect(content().string(equalTo("Company user logging in...")));
    }

    @Test
    public void postCUNJUPaymentReview() throws Exception {
        mvc.perform(post("/cu/nju-payment-review").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Uploading a company's payment and feeback about a N-Job User...")));
    }

    @Test
    @DisplayName("N잡러_회원가입")
    public void postNJUSignup() throws Exception {

    }

    @Test
    public void postNJULogin() throws Exception {
        mvc.perform(post("/nju/login").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
                .andExpect(content().string(equalTo("N-Job user logging in...")));
    }

    @Test
    public void getNJUIncomeReview() throws Exception {
        mvc.perform(get("/nju/income-review").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andExpect(content().string(equalTo("Downloading your imcome and review...")));
    }

}
