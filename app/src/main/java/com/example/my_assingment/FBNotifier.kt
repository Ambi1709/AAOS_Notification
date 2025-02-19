package com.example.my_assingment

class FBNotifier:Notification {
    override fun sendNotificationAlert(renter: String, content: String) {
        println("Notification Alert to $renter: $content")
    }
}