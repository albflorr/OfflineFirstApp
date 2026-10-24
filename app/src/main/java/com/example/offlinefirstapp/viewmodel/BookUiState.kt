package com.example.offlinefirstapp.viewmodel

import com.example.offlinefirstapp.data.local.BookEntity

data class BookUiState(
    val searchQuery:String = "android",
    val books:List<BookEntity> = emptyList(),
    val isLoading: Boolean = false,
    val isOffline: Boolean = false,
    val filterMode: FilterMode = FilterMode.ALL,
    val errorMessage : String? = null,
    val selectedBook : BookEntity?=null
)
