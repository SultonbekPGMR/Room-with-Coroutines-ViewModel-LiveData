package com.sultonbek1547.roomwithcoroutines.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface SubscriberDao {

    @Insert
    suspend fun insertSubscriber(subscriber: Subscriber): Long

    @Update
    suspend fun updateSubscriber(subscriber: Subscriber):Int

    @Delete
    suspend fun deleteSubscriber(subscriber: Subscriber) // here we can also add more than one parameter as we did in Inserting

    @Query("DELETE FROM subscriber_data_table")
    suspend fun deleteAll()

    @Query("SELECT * FROM subscriber_data_table")
    fun getAllSubscribers():LiveData<List<Subscriber>>

//
//    @Insert
//    suspend fun insertSubscriber2(subscriber: Subscriber): Long
//    @Insert
//    suspend fun insertSubscribers(subscriber1: Subscriber,subscriber2: Subscriber,subscriber3: Subscriber,): Long
//    @Insert
//    suspend fun insertSubscribers(subscribers:List<Subscriber>): Long
//    @Insert
//    suspend fun insertSubscribers(subscriber: Subscriber,subscribers:List<Subscriber>): Long

}