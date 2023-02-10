package com.ersubhadip.devblogs.domain.helpers

import kotlinx.coroutines.*


fun launch(coroutineDispatcher: CoroutineDispatcher = Dispatchers.IO, builder: suspend CoroutineScope.() -> Unit) {
    CoroutineScope(coroutineDispatcher).launch { builder.invoke(this) }
}

fun launchOnIo(builder: suspend CoroutineScope.() -> Unit) {
    CoroutineScope(Dispatchers.IO).launch { builder.invoke(this) }
}

fun launchOnMain(builder: suspend CoroutineScope.() -> Unit) {
    CoroutineScope(Dispatchers.Main).launch { builder.invoke(this) }
}

fun launchOnMainImmediate(builder: suspend CoroutineScope.() -> Unit) {
    CoroutineScope(Dispatchers.Main.immediate).launch { builder.invoke(this) }
}

fun launchOnDefault(builder: suspend CoroutineScope.() -> Unit) {
    CoroutineScope(Dispatchers.Default).launch { builder.invoke(this) }
}

suspend fun <T> runOnMain(builder: () -> T) {
    return withContext(Dispatchers.Main.immediate) { builder() }
}

suspend fun <T> runOnIo(builder: () -> T) {
    return withContext(Dispatchers.IO) {builder()}
}