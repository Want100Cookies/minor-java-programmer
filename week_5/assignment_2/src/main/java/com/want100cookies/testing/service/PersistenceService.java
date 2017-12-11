package com.want100cookies.testing.service;

import com.want100cookies.testing.model.User;

public interface PersistenceService {
    User findUserById(Long id);
}
