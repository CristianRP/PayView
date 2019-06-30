package com.fevziomurtekin.payview.data

data class PayModel(
    var cardOwnerName:String="",
    var cardMonth:Int=0,
    var cardYear:Int=0,
    var cardNo:String="",
    var cardCv:String="",
    var cardType: CardType = CardType.UNDEFINED
)