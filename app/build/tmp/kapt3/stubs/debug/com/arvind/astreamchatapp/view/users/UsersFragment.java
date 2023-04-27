package com.arvind.astreamchatapp.view.users;

import android.os.Bundle;
import android.util.Log;
import android.view.*;
import androidx.appcompat.widget.SearchView;
import com.arvind.astreamchatapp.R;
import com.arvind.astreamchatapp.adapter.UsersAdapter;
import com.arvind.astreamchatapp.databinding.FragmentUsersBinding;
import com.arvind.astreamchatapp.view.base.BaseFragment;
import dagger.hilt.android.AndroidEntryPoint;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.models.QueryUsersRequest;
import io.getstream.chat.android.client.models.Filters;
import io.getstream.chat.android.client.models.User;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0002H\u0002J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006$"}, d2 = {"Lcom/arvind/astreamchatapp/view/users/UsersFragment;", "Lcom/arvind/astreamchatapp/view/base/BaseFragment;", "Lcom/arvind/astreamchatapp/databinding/FragmentUsersBinding;", "()V", "client", "Lio/getstream/chat/android/client/ChatClient;", "usersAdapter", "Lcom/arvind/astreamchatapp/adapter/UsersAdapter;", "getUsersAdapter", "()Lcom/arvind/astreamchatapp/adapter/UsersAdapter;", "usersAdapter$delegate", "Lkotlin/Lazy;", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "initView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "Landroid/view/MenuInflater;", "onViewCreated", "view", "Landroid/view/View;", "queryAllUsers", "searchUser", "query", "", "setupRecyclerView", "binding", "setupToolbar", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class UsersFragment extends com.arvind.astreamchatapp.view.base.BaseFragment<com.arvind.astreamchatapp.databinding.FragmentUsersBinding> {
    private final io.getstream.chat.android.client.ChatClient client = null;
    private final kotlin.Lazy usersAdapter$delegate = null;
    
    public UsersFragment() {
        super();
    }
    
    private final com.arvind.astreamchatapp.adapter.UsersAdapter getUsersAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    private final void searchUser(java.lang.String query) {
    }
    
    private final void setupToolbar(com.arvind.astreamchatapp.databinding.FragmentUsersBinding binding) {
    }
    
    private final void setupRecyclerView(com.arvind.astreamchatapp.databinding.FragmentUsersBinding binding) {
    }
    
    private final void queryAllUsers() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.arvind.astreamchatapp.databinding.FragmentUsersBinding getViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
}