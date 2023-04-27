package com.arvind.astreamchatapp.view.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.arvind.astreamchatapp.data.local.ChatUser;
import com.arvind.astreamchatapp.databinding.FragmentLoginBinding;
import com.arvind.astreamchatapp.view.base.BaseFragment;
import com.google.android.material.textfield.TextInputLayout;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u001a\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u00a8\u0006\u0017"}, d2 = {"Lcom/arvind/astreamchatapp/view/login/LoginFragment;", "Lcom/arvind/astreamchatapp/view/base/BaseFragment;", "Lcom/arvind/astreamchatapp/databinding/FragmentLoginBinding;", "()V", "authenticateTheUser", "", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "initView", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "validateInput", "", "inputText", "", "textInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LoginFragment extends com.arvind.astreamchatapp.view.base.BaseFragment<com.arvind.astreamchatapp.databinding.FragmentLoginBinding> {
    
    public LoginFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void authenticateTheUser() {
    }
    
    private final boolean validateInput(java.lang.String inputText, com.google.android.material.textfield.TextInputLayout textInputLayout) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.arvind.astreamchatapp.databinding.FragmentLoginBinding getViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
}