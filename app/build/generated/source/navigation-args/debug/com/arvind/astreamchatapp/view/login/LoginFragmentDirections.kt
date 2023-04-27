package com.arvind.astreamchatapp.view.login

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.arvind.astreamchatapp.R
import com.arvind.astreamchatapp.`data`.local.ChatUser
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class LoginFragmentDirections private constructor() {
  private data class ActionLoginFragmentToChannelFragment(
    public val chatUser: ChatUser
  ) : NavDirections {
    public override val actionId: Int = R.id.action_loginFragment_to_channelFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  public companion object {
    public fun actionLoginFragmentToChannelFragment(chatUser: ChatUser): NavDirections =
        ActionLoginFragmentToChannelFragment(chatUser)
  }
}
