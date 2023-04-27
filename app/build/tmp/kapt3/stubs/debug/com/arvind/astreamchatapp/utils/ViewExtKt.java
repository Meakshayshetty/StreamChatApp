package com.arvind.astreamchatapp.utils;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.google.android.material.snackbar.Snackbar;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a9\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f\u00a2\u0006\u0002\u0010\u000e\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\r\u001a\u0012\u0010\u0010\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\r\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\u0012\u001a1\u0010\u0013\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f\u00a2\u0006\u0002\b\u0014H\u0000\u001a\n\u0010\u0015\u001a\u00020\u0001*\u00020\r\u001a(\u0010\u0016\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a\u001a?\u0010\u001b\u001a\u00020\u0001*\u00020\r2\b\b\u0001\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\f\u00a2\u0006\u0002\b\u0014H\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u001e"}, d2 = {"toast", "", "context", "Landroid/content/Context;", "message", "", "action", "Lcom/google/android/material/snackbar/Snackbar;", "text", "", "color", "listener", "Lkotlin/Function1;", "Landroid/view/View;", "(Lcom/google/android/material/snackbar/Snackbar;ILjava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "hide", "hideKeyboard", "view", "Landroidx/fragment/app/Fragment;", "longSnackBar", "Lkotlin/ExtensionFunctionType;", "show", "showPermissionRequestDialog", "title", "body", "callback", "Lkotlin/Function0;", "snack", "string", "length", "app_debug"})
public final class ViewExtKt {
    
    public static final void show(@org.jetbrains.annotations.NotNull()
    android.view.View $this$show) {
    }
    
    public static final void hide(@org.jetbrains.annotations.NotNull()
    android.view.View $this$hide) {
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public static final void snack(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snack, @androidx.annotation.StringRes()
    int string, int length, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.google.android.material.snackbar.Snackbar, kotlin.Unit> action) {
    }
    
    public static final void action(@org.jetbrains.annotations.NotNull()
    com.google.android.material.snackbar.Snackbar $this$action, @androidx.annotation.StringRes()
    int text, @org.jetbrains.annotations.Nullable()
    java.lang.Integer color, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> listener) {
    }
    
    public static final void longSnackBar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$longSnackBar, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.google.android.material.snackbar.Snackbar, kotlin.Unit> action) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$hideKeyboard) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$hideKeyboard, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public static final void showPermissionRequestDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showPermissionRequestDialog, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String body, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
}