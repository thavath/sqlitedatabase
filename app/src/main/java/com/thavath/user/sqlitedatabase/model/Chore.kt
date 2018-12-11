package com.thavath.user.sqlitedatabase.model

class Chore {
    var ChoreName : String? = null
    var assignBy: String? = null
    var assignTo: String? = null
    var timeAssigned: Long? = null
    var id: Int? = null

    constructor()

    constructor( ChoreName : String,
                 assignBy: String,
                 assignTo: String,
                 timeAssigned: Long,
                 id: Int): this() {

        this.ChoreName = ChoreName
        this.assignBy = assignBy
        this.assignTo = assignTo
        this.timeAssigned = timeAssigned
        this.id = id
    }
}