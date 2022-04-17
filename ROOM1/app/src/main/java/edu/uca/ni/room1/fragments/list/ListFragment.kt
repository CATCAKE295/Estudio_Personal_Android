package edu.uca.ni.room1.fragments.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import edu.uca.ni.room1.R
import edu.uca.ni.room1.data.UserViewModel
import edu.uca.ni.room1.databinding.FragmentListBinding

class ListFragment : Fragment() {

    private  lateinit var  mUserViewModel: UserViewModel
    private var _binding: FragmentListBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding =  FragmentListBinding.inflate(inflater,container,false)
        val view = binding.root
        return view



    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnfloating.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_addFragment)

        }


        val adapter = ListAdapter()
        val recycler = binding.recyclerView
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(requireContext())

        mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        mUserViewModel.readAllData.observe(viewLifecycleOwner, Observer { user ->
            adapter.setData(user)
        })


    }


}