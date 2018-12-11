package com.thavath.user.sqlitedatabase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.thavath.user.sqlitedatabase.data.ChoreDatabaseHandler
import com.thavath.user.sqlitedatabase.model.Chore

class MainActivity : AppCompatActivity() {

    var dbHandler: ChoreDatabaseHandler? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dbHandler = ChoreDatabaseHandler(this)

        var chore: Chore = Chore()
        chore.ChoreName = "Chore Name 1"
        chore.assignBy = "Thavath 1"
        chore.assignTo = "Daravika 1"

        dbHandler!!.createChore(chore)
    }
}
