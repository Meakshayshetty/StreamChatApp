package com.arvind.astreamchatapp.app;

import android.app.Application;
import com.arvind.astreamchatapp.R;
import dagger.hilt.android.HiltAndroidApp;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.logger.ChatLogLevel;
import io.getstream.chat.android.livedata.ChatDomain;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lcom/arvind/astreamchatapp/app/AStreamChatApp;", "Landroid/app/Application;", "()V", "onCreate", "", "app_debug"})
@dagger.hilt.android.HiltAndroidApp()
public final class AStreamChatApp extends android.app.Application {
    
    public AStreamChatApp() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
}