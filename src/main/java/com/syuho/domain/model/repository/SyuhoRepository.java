package com.syuho.domain.model.repository;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.Result;

import com.syuho.domain.model.syuho.Syuho;

@ConfigAutowireable
@Dao
public interface SyuhoRepository {

    @Select
    public List<Syuho> findAll();
    
    @Insert
    public Result<Syuho> insert(Syuho syuho);
}
