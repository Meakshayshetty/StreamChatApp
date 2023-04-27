package com.arvind.astreamchatapp.view.channel

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.arvind.astreamchatapp.`data`.local.ChatUser
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ChannelFragmentArgs(
  public val chatUser: ChatUser
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(ChatUser::class.java)) {
      result.putParcelable("chatUser", this.chatUser as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ChatUser::class.java)) {
      result.putSerializable("chatUser", this.chatUser as Serializable)
    } else {
      throw UnsupportedOperationException(ChatUser::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(ChatUser::class.java)) {
      result.set("chatUser", this.chatUser as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ChatUser::class.java)) {
      result.set("chatUser", this.chatUser as Serializable)
    } else {
      throw UnsupportedOperationException(ChatUser::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): ChannelFragmentArgs {
      bundle.setClassLoader(ChannelFragmentArgs::class.java.classLoader)
      val __chatUser : ChatUser?
      if (bundle.containsKey("chatUser")) {
        if (Parcelable::class.java.isAssignableFrom(ChatUser::class.java) ||
            Serializable::class.java.isAssignableFrom(ChatUser::class.java)) {
          __chatUser = bundle.get("chatUser") as ChatUser?
        } else {
          throw UnsupportedOperationException(ChatUser::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__chatUser == null) {
          throw IllegalArgumentException("Argument \"chatUser\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"chatUser\" is missing and does not have an android:defaultValue")
      }
      return ChannelFragmentArgs(__chatUser)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ChannelFragmentArgs {
      val __chatUser : ChatUser?
      if (savedStateHandle.contains("chatUser")) {
        if (Parcelable::class.java.isAssignableFrom(ChatUser::class.java) ||
            Serializable::class.java.isAssignableFrom(ChatUser::class.java)) {
          __chatUser = savedStateHandle.get<ChatUser?>("chatUser")
        } else {
          throw UnsupportedOperationException(ChatUser::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__chatUser == null) {
          throw IllegalArgumentException("Argument \"chatUser\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"chatUser\" is missing and does not have an android:defaultValue")
      }
      return ChannelFragmentArgs(__chatUser)
    }
  }
}
