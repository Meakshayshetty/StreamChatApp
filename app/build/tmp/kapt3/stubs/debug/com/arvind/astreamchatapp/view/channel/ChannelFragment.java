package com.arvind.astreamchatapp.view.channel;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.GravityCompat;
import com.arvind.astreamchatapp.R;
import com.arvind.astreamchatapp.databinding.FragmentChannelBinding;
import com.arvind.astreamchatapp.view.base.BaseFragment;
import dagger.hilt.android.AndroidEntryPoint;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.models.Channel;
import io.getstream.chat.android.client.models.Filters;
import io.getstream.chat.android.client.models.User;
import io.getstream.chat.android.livedata.ChatDomain;
import io.getstream.chat.android.ui.avatar.AvatarView;
import io.getstream.chat.android.ui.channel.list.header.viewmodel.ChannelListHeaderViewModel;
import io.getstream.chat.android.ui.channel.list.viewmodel.ChannelListViewModel;
import io.getstream.chat.android.ui.channel.list.viewmodel.factory.ChannelListViewModelFactory;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002J\u001a\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0002J\b\u0010\u001f\u001a\u00020\u000fH\u0002J\b\u0010 \u001a\u00020\u000fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/arvind/astreamchatapp/view/channel/ChannelFragment;", "Lcom/arvind/astreamchatapp/view/base/BaseFragment;", "Lcom/arvind/astreamchatapp/databinding/FragmentChannelBinding;", "()V", "args", "Lcom/arvind/astreamchatapp/view/channel/ChannelFragmentArgs;", "getArgs", "()Lcom/arvind/astreamchatapp/view/channel/ChannelFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "client", "Lio/getstream/chat/android/client/ChatClient;", "user", "Lio/getstream/chat/android/client/models/User;", "deleteChannel", "", "channel", "Lio/getstream/chat/android/client/models/Channel;", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "initView", "logout", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupChannels", "setupDrawer", "setupUser", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ChannelFragment extends com.arvind.astreamchatapp.view.base.BaseFragment<com.arvind.astreamchatapp.databinding.FragmentChannelBinding> {
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final io.getstream.chat.android.client.ChatClient client = null;
    private io.getstream.chat.android.client.models.User user;
    
    public ChannelFragment() {
        super();
    }
    
    private final com.arvind.astreamchatapp.view.channel.ChannelFragmentArgs getArgs() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void deleteChannel(io.getstream.chat.android.client.models.Channel channel) {
    }
    
    private final void setupUser() {
    }
    
    private final void setupChannels() {
    }
    
    private final void setupDrawer() {
    }
    
    private final void logout() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.arvind.astreamchatapp.databinding.FragmentChannelBinding getViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
}