package com.example.Kotlin

fun main(args: Array<String>) {
    val tv = Tv(listOf<String>("K", "M", "S"))
    tv.channelDown()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()

}

class Tv(val channels: List<String>) {

    var onOrOff: Boolean = false //True ->On, False ->Off
    var currentChannelNumber = 0
        set(value){
            field = value
            if (field>2){
                field =0
            }
            if (field <0){
                field =2
            }
        }
        get(){
            println("호출되었습니다")
            return  field
        }

    fun switch() { //변수 기능은 소문자 fn ,class는 대문자로 적어주자
        onOrOff = !onOrOff
    }

    fun checkCurrentChannel(): String { //현재 채널 방송사를 출력합니다.
        return channels[currentChannelNumber]//채널의 밸류를 출력하기위해서  .."M사", "S사---등..
    }

    fun channelUp() { //채널 업
        currentChannelNumber += 1

//        channels.forEachIndexed { i, v ->
//            if (currentChannelNumber == i) { //currentChannelNumber는 채널의 인덱스 입니다.
//                currentChannelNumber += 1
//                return
//            }
    }


    fun channelDown() { //채널 다운.
        currentChannelNumber -= 1

//        channels.forEachIndexed { i, v ->
//            if (currentChannelNumber == i) { //현재 채널 인덱스값이 i와 같다면
//                currentChannelNumber -= 1
//                return
//            }
    }
}

