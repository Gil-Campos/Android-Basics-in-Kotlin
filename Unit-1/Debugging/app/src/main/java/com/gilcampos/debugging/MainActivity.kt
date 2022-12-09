package com.gilcampos.debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlin.concurrent.thread

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logging()
        division()
    }

    private fun division() {
        val numerator = 60
        var denominator = 4

        /**
         * new thread that can run the repeat loop. Otherwise, Thread.sleep(3000) would block the
         * main thread, and the app view would not render until onCreate() is finished (including
         * division() with its repeat loop).
         */
        thread(start = true) {
            repeat(4) {
                Thread.sleep(3000)

                /**
                 * If you try running the app now, you notice a FATAL EXCEPTION. The reason for this
                 * exception is that only threads that created a view are allowed to change it.
                 * Luckily, you can reference the UI thread using runOnUiThread().
                 */
                runOnUiThread {
                    findViewById<TextView>(R.id.division_textview).setText("${numerator / denominator}")
                    denominator--
                }
            }
        }
    }

    private fun logging() {
        Log.e(TAG, "ERROR: a serious error like an app crash")
        Log.w(TAG, "WARN: warns about the potential for serious errors")
        Log.i(TAG, "INFO: reporting technical information, such as an operation succeeding")
        Log.d(TAG, "DEBUG: reporting technical information useful for debugging")
        Log.v(TAG, "VERBOSE: more verbose than DEBUG logs")
    }
}