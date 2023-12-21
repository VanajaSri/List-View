package com.example.listview

import android.app.Application

class MyApplication : Application() {
    // This is a custom application class for your app.
    // You can use it to perform global initialization and cleanup tasks.

    override fun onTerminate() {
        super.onTerminate()

        // Add the finish() call here to finish your activities when the application is terminated.
        //finish()
    }
}
