package com.blazebrain.reminderapp.util

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class ReminderWorker(
    private val context: Context, params: WorkerParameters) :
    Worker(context, params) {
    override fun doWork(): Result {
        NotificationHelper(context).createNotification(
            inputData.getString("title").toString(),
            inputData.getString("message").toString()
        )

        return Result.success()
    }
}