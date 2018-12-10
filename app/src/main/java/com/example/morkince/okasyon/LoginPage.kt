package com.example.morkince.okasyon

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.Constraints
import android.transition.Slide
import android.transition.TransitionManager
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.*
import kotlinx.android.synthetic.main.activity_loginpage.*

class LoginPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)
        //test
        login_btn_SignUp.setOnClickListener {
            // Initialize a new layout inflater instance
            val inflater: LayoutInflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

            // Inflate a custom view using layout inflater
            val view = inflater.inflate(R.layout.activity_modal1, null)

            // Initialize a new instance of popup window
            val popupWindow = PopupWindow(
                view, // Custom view to show in popup window
                Constraints.LayoutParams.WRAP_CONTENT, // Width of popup window
                Constraints.LayoutParams.WRAP_CONTENT // Window height
            )

            // Set an elevation for the popup window
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                popupWindow.elevation = 10.0F
            }


            // If API level 23 or higher then execute the code
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                // Create a new slide animation for popup window enter transition
                val slideIn = Slide()
                slideIn.slideEdge = Gravity.TOP
                popupWindow.enterTransition = slideIn

                // Slide animation for popup window exit transition
                val slideOut = Slide()
                slideOut.slideEdge = Gravity.RIGHT
                popupWindow.exitTransition = slideOut

            }

            // Get the widgets reference from custom view
            val tv = view.findViewById<TextView>(R.id.textView2)
            val buttonPopup = view.findViewById<ImageButton>(R.id.btn_cancel)
//
//            // Set click listener for popup window's text view
            tv.setOnClickListener{
                // Change the text color of popup window's text view
                tv.setTextColor(Color.RED)
            }
//
//            // Set a click listener for popup's button widget
            //Set a click listener for popup's button widget
            buttonPopup.setOnClickListener{
                // Dismiss the popup window
                popupWindow.dismiss()
            }


            //  Set a dismiss listener for popup window
            popupWindow.setOnDismissListener {
                Toast.makeText(applicationContext,"Popup closed", Toast.LENGTH_SHORT).show()
            }




            // Finally, show the popup window on app
            TransitionManager.beginDelayedTransition(root_layout)
            popupWindow.showAtLocation(
                root_layout, // Location to display popup window
                Gravity.CENTER, // Exact position of layout to display popup
                0, // X offset
                0 // Y offset


            )
            val button1 = view.findViewById<Button>(R.id.modal_btn_client)
//
            button1.setOnClickListener {
                val intent1 = Intent (this, SignUpPart1 :: class.java)
                startActivity (intent1)
            }
//            btn_organizer.setOnClickListener {
//                val intent = Intent(this, SignupPart1::class.java)
////        ////            // start your next activity
//                startActivity(intent)
//            }
        }

    }
}
