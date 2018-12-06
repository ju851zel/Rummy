package model


object ContState extends Enumeration {


  type state = Value
  val MENU, INSERTING_NAMES, P_TURN, P_FINISHED, TABLE_NOT_CORRECT,
  NOT_ENOUGH_PS, START, P_INSERTED, ENOUGH_PS, CREATED, INSERTED_NAME, P_WON, P_DOES_NOT_OWN_TILE = Value


}
