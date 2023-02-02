package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        binding.one.setOnClickListener {
            val text = binding.one.text.toString()
            viewModel.addNum(text)

            showString()
        }
        binding.two.setOnClickListener {
            val text = binding.two.text.toString()
            viewModel.addNum(text)
            showString()
        }
        binding.three.setOnClickListener {
            val text = binding.three.text.toString()
            viewModel.addNum(text)
            showString()
        }
        binding.four.setOnClickListener {
            val text = binding.four.text.toString()
            viewModel.addNum(text)
            showString()
        }
        binding.five.setOnClickListener {
            val text = binding.five.text.toString()
            viewModel.addNum(text)
            showString()
        }
        binding.six.setOnClickListener {
            val text = binding.six.text.toString()
            viewModel.addNum(text)
            showString()
        }
        binding.seven.setOnClickListener {
            val text = binding.seven.text.toString()
            viewModel.addNum(text)
            showString()
        }
        binding.eight.setOnClickListener {
            val text = binding.eight.text.toString()
            viewModel.addNum(text)
            showString()
        }
        binding.nine.setOnClickListener {
            val text = binding.nine.text.toString()
            viewModel.addNum(text)
            showString()
        }
        binding.zero.setOnClickListener {
            val text = binding.zero.text.toString()
            viewModel.addNum(text)
            showString()
        }
        binding.plus.setOnClickListener {
            val text = binding.plus.text.toString()
            viewModel.addOperator(text)
            viewModel.splitter()
            showString()
        }
        binding.minus.setOnClickListener {
            val text = binding.minus.text.toString()
            viewModel.addOperator(text)
            viewModel.splitter()
            showString()
        }
        binding.divide.setOnClickListener {
            val text = binding.divide.text.toString()
            viewModel.addOperator(text)
            viewModel.splitter()
            showString()
        }
        binding.multiply.setOnClickListener {
            val text = binding.multiply.text.toString()
            viewModel.addOperator(text)
            viewModel.splitter()
            showString()
        }
        binding.equals.setOnClickListener {
            viewModel.splitter()
            val total = viewModel.calculation()
            binding.total.text = total
            Log.d("TAG", "onCreate: $total ")
        }
        binding.clear.setOnClickListener {
            viewModel.clearAll()
            showString()
        }
    }

    private fun showString() {
        binding.total.text = viewModel.showString()
    }


}