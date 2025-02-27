package com.thechance.happysocialmedia.ui.profile

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.thechance.happysocialmedia.data.HappySocialRepository
import com.thechance.happysocialmedia.domain.models.Post
import com.thechance.happysocialmedia.ui.PostInteractionListener
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    repository: HappySocialRepository
): BaseViewModel(), PostInteractionListener {

    val user = repository.getCurrentUserInfo().asLiveData(Dispatchers.IO)
    val posts = repository.getAllPosts().asLiveData(Dispatchers.IO)


    override fun onClickItem() {
        TODO("Not yet implemented")
    }

    override fun onClickDownVote() {
        TODO("Not yet implemented")
    }

    override fun onClickUpVote() {
        TODO("Not yet implemented")
    }

}