package co.kr.talentx.openscout;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class OpenscoutControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getAuthorEmail() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
            .andExpect(content().string(equalTo("support@talentx.co.kr")));
    }

    @Test
    public void postAdminUploadCSV() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/admin/upload-csv").accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk()).andExpect(content().string(equalTo("Uploading bigdata by the admin user...")));
    }

    @Test
    public void getNJUValuationReview() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/nju-valuation-review").accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().string(equalTo("Downloading a N-Job user's imcome and review...")));
    }

    @Test
    public void getCUSignup() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/cu/signup").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
            .andExpect(content().string(equalTo("Company user signing up...")));
    }

    @Test
    public void postCULogin() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/cu/login").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
            .andExpect(content().string(equalTo("Company user logging in...")));
    }

    @Test
    public void postCUNJUPaymentReview() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/cu/nju-payment-review").accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().string(equalTo("Uploading a company's payment and feeback about a N-Job User...")));
    }

    @Test
    public void postNJUSignup() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/nju/signup").accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk()).andExpect(content().string(equalTo("N-Job user signing up...")));
    }

    @Test
    public void postNJULogin() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/nju/login").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
            .andExpect(content().string(equalTo("N-Job user logging in...")));
    }

    @Test
    public void getNJUIncomeReview() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/nju/income-review").accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk()).andExpect(content().string(equalTo("Downloading your imcome and review...")));
    }

}