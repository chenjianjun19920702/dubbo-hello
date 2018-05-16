package org.dubbo.hello.api.service;

import javax.validation.constraints.Min;

import org.dubbo.hello.api.model.User;

public interface UserRestService {
	User getUser(@Min(value = 1L, message = "User ID must be greater than 1") Long id);
}
