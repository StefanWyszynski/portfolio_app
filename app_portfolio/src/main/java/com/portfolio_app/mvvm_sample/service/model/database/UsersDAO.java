package com.portfolio_app.mvvm_sample.service.model.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

/*
 * Copyright 2018, The Portfolio project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author Stefan Wyszynski
 */
@Dao
public interface UsersDAO {

    @Insert(onConflict = REPLACE)
    void insert(Users users);

    @Query("DELETE FROM Users")
    void deleteAll();

    @Query("SELECT * from Users ORDER BY id ASC")
    List<Users> getAll();

    @Query("SELECT * from Users WHERE id = :usersID")
    Users get(String usersID);
}