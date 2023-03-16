package com.sultonbek1547.roomwithcoroutines.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Subscriber::class], version = 1)
abstract class SubscriberDataBase : RoomDatabase() {
    abstract val subscriberDao: SubscriberDao

    companion object {
        @Volatile
        private var INSTANCE: SubscriberDataBase? = null

        fun getInstance(context: Context): SubscriberDataBase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        SubscriberDataBase::class.java,
                        "subscriber_data_table"
                    ).build()
                    INSTANCE = instance
                }
                return instance
            }
        }


    }

}
