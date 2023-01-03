package com.ersubhadip.devblogs.presentation.splashModule

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.DisposableEffect
import androidx.navigation.fragment.findNavController
import com.ersubhadip.devblogs.R
import com.ersubhadip.devblogs.databinding.FragmentSplashBinding
import kotlinx.coroutines.*

class SplashFragment : Fragment() {
    private lateinit var binding: FragmentSplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(layoutInflater)
        return binding.root
    }

    @OptIn(DelicateCoroutinesApi::class)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        GlobalScope.launch(Dispatchers.Main) {
            delay(2000L)
            findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
        }
    }
}