package com.arvind.astreamchatapp.adapter;

import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.arvind.astreamchatapp.databinding.UserRowLayoutBinding;
import com.arvind.astreamchatapp.view.users.UsersFragmentDirections;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.models.User;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\nH\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0014\u0010\u001b\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/arvind/astreamchatapp/adapter/UsersAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/arvind/astreamchatapp/adapter/UsersAdapter$MyViewHolder;", "()V", "client", "Lio/getstream/chat/android/client/ChatClient;", "userList", "", "Lio/getstream/chat/android/client/models/User;", "convertDate", "", "milliseconds", "", "createNewChannel", "", "selectedUser", "holder", "getItemCount", "", "navigateToChatFragment", "cid", "onBindViewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "newList", "MyViewHolder", "app_debug"})
public final class UsersAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.arvind.astreamchatapp.adapter.UsersAdapter.MyViewHolder> {
    private final io.getstream.chat.android.client.ChatClient client = null;
    private java.util.List<io.getstream.chat.android.client.models.User> userList;
    
    public UsersAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.arvind.astreamchatapp.adapter.UsersAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.arvind.astreamchatapp.adapter.UsersAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<io.getstream.chat.android.client.models.User> newList) {
    }
    
    private final java.lang.String convertDate(long milliseconds) {
        return null;
    }
    
    private final void createNewChannel(java.lang.String selectedUser, com.arvind.astreamchatapp.adapter.UsersAdapter.MyViewHolder holder) {
    }
    
    private final void navigateToChatFragment(com.arvind.astreamchatapp.adapter.UsersAdapter.MyViewHolder holder, java.lang.String cid) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/arvind/astreamchatapp/adapter/UsersAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/arvind/astreamchatapp/databinding/UserRowLayoutBinding;", "(Lcom/arvind/astreamchatapp/databinding/UserRowLayoutBinding;)V", "getBinding", "()Lcom/arvind/astreamchatapp/databinding/UserRowLayoutBinding;", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.arvind.astreamchatapp.databinding.UserRowLayoutBinding binding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.arvind.astreamchatapp.databinding.UserRowLayoutBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.arvind.astreamchatapp.databinding.UserRowLayoutBinding getBinding() {
            return null;
        }
    }
}