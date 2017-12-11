package com.want100cookies.testing.service.impl;

import com.want100cookies.testing.model.User;
import com.want100cookies.testing.service.PersistenceService;
import com.want100cookies.testing.service.UserService;

public class UserServiceImpl implements UserService {

    private PersistenceService persistenceService;

    public void setPersistenceService(PersistenceService persistenceService) {
        this.persistenceService = persistenceService;
    }

    public User disableUser(User user) {
        User currentUser = persistenceService.findUserById(user.getId());
        currentUser.setActive(false);

        return currentUser;
    }
}
