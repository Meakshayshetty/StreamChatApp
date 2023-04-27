package com.arvind.astreamchatapp.view.channel

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.arvind.astreamchatapp.R
import kotlin.Int
import kotlin.String

public class ChannelFragmentDirections private constructor() {
  private data class ActionChannelFragmentToChatFragment(
    public val channelId: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_channelFragment_to_chatFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("channelId", this.channelId)
        return result
      }
  }

  public companion object {
    public fun actionChannelFragmentToChatFragment(channelId: String): NavDirections =
        ActionChannelFragmentToChatFragment(channelId)

    public fun actionChannelFragmentToUsersFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_channelFragment_to_usersFragment)

    public fun actionChannelFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_channelFragment_to_loginFragment)
  }
}
