package com.arvind.astreamchatapp.view.main;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import com.arvind.astreamchatapp.R;
import com.arvind.astreamchatapp.data.local.ChatUser;
import com.arvind.astreamchatapp.databinding.ActivityMainBinding;
import com.arvind.astreamchatapp.view.login.LoginFragmentDirections;
import dagger.hilt.android.AndroidEntryPoint;
import io.getstream.chat.android.client.ChatClient;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/arvind/astreamchatapp/view/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "client", "Lio/getstream/chat/android/client/ChatClient;", "navHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "initViews", "", "binding", "Lcom/arvind/astreamchatapp/databinding/ActivityMainBinding;", "observeNavElements", "navController", "Landroidx/navigation/NavController;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.navigation.fragment.NavHostFragment navHostFragment;
    private final io.getstream.chat.android.client.ChatClient client = null;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews(com.arvind.astreamchatapp.databinding.ActivityMainBinding binding) {
    }
    
    private final void observeNavElements(com.arvind.astreamchatapp.databinding.ActivityMainBinding binding, androidx.navigation.NavController navController) {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
}