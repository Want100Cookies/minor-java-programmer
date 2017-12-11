package com.want100cookies.testing.service;

import com.want100cookies.testing.model.User;

public interface UserService {

    public void setPersistenceService(PersistenceService persistenceService);
    public User disableUser(User user);
}
