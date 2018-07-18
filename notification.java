
package com.example.gavinovillapiano.pal_app_summer2018njcusummerinternship;


import android.app.NotificationManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.R;
import android.R.id;


public class notification extends AppCompatActivity {

   @Override
    protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(com.example.gavinovillapiano.pal_app_summer2018njcusummerinternship.R.layout.onclicknotification);

       Button btn = (Button) findViewById(com.example.gavinovillapiano.pal_app_summer2018njcusummerinternship.R.id.notifybtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                notificationcall();
           }
       });

   }

    public void notificationcall(){
       NotificationCompat.Builder notificationBuilder = (NotificationCompat.Builder) new NotificationCompat.Builder(this)
       .setDefaults(NotificationCompat.DEFAULT_ALL)
       .setSmallIcon(com.example.gavinovillapiano.pal_app_summer2018njcusummerinternship.R.drawable.pal_app_icon)
       .setLargeIcon(BitmapFactory.decodeResource(getResources(), com.example.gavinovillapiano.pal_app_summer2018njcusummerinternship.R.drawable.pal_app_icon))
       .setContentTitle("PAL APP")
       .setContentText("Fill Out New Questionnaire");
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(1, notificationBuilder.build());
   }
}


