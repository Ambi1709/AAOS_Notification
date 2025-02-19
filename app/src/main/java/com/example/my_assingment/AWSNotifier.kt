package com.example.my_assingment

class AWSNotifier: Notification {
    override fun sendNotificationAlert(renter: String, content: String) {
        println("AWS Notification Alert to $renter: $content")
    }
}