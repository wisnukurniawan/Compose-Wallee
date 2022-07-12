package com.wisnu.kurniawan.wallee.foundation.datasource.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update
import com.wisnu.kurniawan.wallee.foundation.datasource.local.model.AccountDb
import com.wisnu.kurniawan.wallee.foundation.datasource.local.model.TransactionDb

@Dao
abstract class WalleeWriteDao {

    @Insert
    abstract suspend fun insertAccount(data: List<AccountDb>)

    @Insert
    abstract suspend fun insertAccount(data: AccountDb)

    @Update
    abstract suspend fun updateAccount(data: AccountDb)

    @Insert
    abstract suspend fun insertTransaction(data: List<TransactionDb>)

    @Insert
    abstract suspend fun insertTransaction(data: TransactionDb)

}
