package com.ajc.mvvmbasic.repo

import com.ajc.mvvmbasic.data.local.RoomDatabaseClass

class MyRepository {

    val roomDb = RoomDatabaseClass()

    fun getDataFromRoom(): String {
        return roomDb.getData()
    }

}