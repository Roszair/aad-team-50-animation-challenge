package com.alc.team50animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.animation.AnimatorInflater
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    
    boolean capetownShowing = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun rotateAnimation(view: View) {

        val rotateAnimator = AnimatorInflater.loadAnimator(this, R.animator.rotate)
        rotateAnimator?.apply {
            setTarget(targetImage)
            start()
        }
    }

    fun scaleAnimation(view: View) {

        val scaleAnimator = AnimatorInflater.loadAnimator(this, R.animator.scale)
        scaleAnimator?.apply {
            setTarget(targetImage)
            start()
        }
    }

    fun translateAnimation(view: View) {

        val translateAnimator = AnimatorInflater.loadAnimator(this, R.animator.translate)
        translateAnimator.apply {
            setTarget(targetImage)
            start()
        }
    }

    fun fadeAnimation(view: View) {

        val fadeAnimator = AnimatorInflater.loadAnimator(this, R.animator.alpha)
        fadeAnimator.apply{
            setTarget(targetImage)
            start()
        }
    }

    fun startScenario1(view: View) {
        val intent = Intent(this, AnimConstraintActivity::class.java)
        startActivity(intent)
    }
    
    public void fade (view: View) {
        
        ImageView capeTownImage = findViewById(R.id.capetown)
        ImageView okavangoImage = findViewById(R.id.okavango)
        
        if(capetownShowing) {
            
             boolean capetownShowing = false
            
            capeTownImage.animate().alpha(0).setDuration(1000)
            okavangoImage.animate().alpha(1).setDuration(1000)
        }
        else {
            
            boolean capetownShowing = true
            
            capeTownImage.animate().alpha(1).setDuration(1000)
            okavangoImage.animate().alpha(0).setDuration(1000)
        }
    }
}

