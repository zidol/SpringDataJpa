package study.datajpa.repository;

import org.springframework.beans.factory.annotation.Value;

import javax.validation.Valid;

public interface UsernameOnly {

    @Value("#{target.username + ' ' + target.age}")
    String getUsername();
}
