package com.arvind.astreamchatapp.view.users

import android.os.Bundle
import androidx.navigation.NavDirections
import com.arvind.astreamchatapp.R
import kotlin.Int
import kotlin.String

public class UsersFragmentDirections private constructor() {
  private data class ActionUsersFragmentToChatFragment(
    public val channelId: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_usersFragment_to_chatFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("channelId", this.channelId)
        return result
      }
  }

  public companion object {
    public fun actionUsersFragmentToChatFragment(channelId: String): NavDirections =
        ActionUsersFragmentToChatFragment(channelId)
  }
}
