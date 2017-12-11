package com.want100cookies.testing;

import com.want100cookies.testing.model.User;
import com.want100cookies.testing.service.PersistenceService;
import com.want100cookies.testing.service.UserService;
import com.want100cookies.testing.service.impl.PersistenceServiceImpl;
import com.want100cookies.testing.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Test
    public void testDisableUserAccount() throws Exception {
        User user = new User(1L, "John Doe", true);
        PersistenceService mock = mock(PersistenceService.class);
        when(mock.findUserById(1L)).thenReturn(user);

        UserService userService = new UserServiceImpl();
        userService.setPersistenceService(mock);

        User disabledUser = userService.disableUser(user);

        assertThat(disabledUser.getActive(), is(equalTo(false)));
    }
}
