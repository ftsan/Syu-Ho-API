package com.syuho.domain.model.repository;

import java.util.Optional;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.syuho.domain.model.account.User;

@ConfigAutowireable
@Dao
public interface UserRepository {

    @Select
    public Optional<User> findById(long id);
}
