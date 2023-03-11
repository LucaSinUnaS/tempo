package com.cappielloantonio.play.model

import android.os.Parcelable
import androidx.annotation.Keep
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Keep
@Parcelize
@Entity(tableName = "server")
data class Server(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val serverId: String,

    @ColumnInfo(name = "server_name")
    val serverName: String,

    @ColumnInfo(name = "username")
    val username: String,

    @ColumnInfo(name = "password")
    val password: String,

    @ColumnInfo(name = "address")
    val address: String,

    @ColumnInfo(name = "timestamp")
    val timestamp: Long,

    @ColumnInfo(name = "low_security", defaultValue = "false")
    val isLowSecurity: Boolean
) : Parcelable