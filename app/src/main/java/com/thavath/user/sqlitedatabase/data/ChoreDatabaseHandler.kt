package com.thavath.user.sqlitedatabase.data

import android.database.sqlite.SQLiteOpenHelper
import android.content.Context
import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import android.util.Log
import com.thavath.user.sqlitedatabase.model.*

class ChoreDatabaseHandler(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    override fun onCreate(db: SQLiteDatabase?) {

        var CREATE_CHORE_TABLE = "CREATE TABLE " + TABLE_NAME + "("+ KEY_ID + " INTEGER PRIMARY KEY," +
                KEY_CHORE_NAME + " TEXT," +
                KEY_CHORE_ASSIGNBY + " TEXT," +
                KEY_CHORE_ASSIGNTO + " TEXT," +
                KEY_CHORE_ASSIGN_TIME + " LONG" +")"

        db?.execSQL(CREATE_CHORE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {

        db?.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME)
        onCreate(db)
    }

    fun createChore(chore: Chore){
        var db: SQLiteDatabase = writableDatabase
        var values: ContentValues = ContentValues()
        values.put(KEY_CHORE_NAME, chore.ChoreName)
        values.put(KEY_CHORE_ASSIGNBY, chore.assignBy)
        values.put(KEY_CHORE_ASSIGNTO, chore.assignTo)
        values.put(KEY_CHORE_ASSIGN_TIME, System.currentTimeMillis())

        db.insert(TABLE_NAME, null, values)

//        Toast.makeText(this, KEY_CHORE_NAME, Toast.LENGTH_SHORT).show()
        Log.d("Success Data Inserted", "Success")
        db.close()
    }

//    fun readChore(id: Int) : Chore{
//        var db : SQLiteDatabase = readableDatabase
//        var cursor: Cursor
//    }
}