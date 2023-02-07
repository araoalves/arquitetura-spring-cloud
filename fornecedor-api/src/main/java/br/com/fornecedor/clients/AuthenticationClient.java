package br.com.fornecedor.clients;

import br.com.fornecedor.models.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "authentication")
public interface AuthenticationClient {

    @RequestMapping(value = "/auth/getUser", method = RequestMethod.GET)
    public User getUser();
}
