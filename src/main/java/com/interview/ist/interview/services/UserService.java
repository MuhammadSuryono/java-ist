package com.interview.ist.interview.services;

import com.interview.ist.interview.domain.dao.User;
import com.interview.ist.interview.domain.dto.request.SearchRequest;
import com.interview.ist.interview.domain.dto.request.SearchSpecification;
import com.interview.ist.interview.domain.dto.response.ResponseUtil;
import com.interview.ist.interview.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public ResponseEntity<Object> allUser(SearchRequest searchRequest) {
        SearchSpecification<User> searchSpecification = new SearchSpecification<>(searchRequest);
        Pageable pageable = SearchSpecification.getPageable(searchRequest.getPage(), searchRequest.getSize());
        return ResponseUtil.buildResponse(
                "Success getting data",
                (Serializable) userRepository.findAll(searchSpecification, pageable),
                HttpStatus.OK);
    }
}
