package edu.uca.ni.pelicula.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import edu.uca.ni.pelicula.R
import edu.uca.ni.pelicula.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMenuBinding.inflate(inflater,container, false)

        val view = binding.root

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnClasificacion.setOnClickListener {
            it.findNavController().navigate(R.id.irAClasificacion)
        }

        binding.btnGenero.setOnClickListener{
            it.findNavController().navigate(R.id.irAGenero)
        }

        binding.btnIdioma.setOnClickListener {
            it.findNavController().navigate(R.id.irAIdioma)
        }

        binding.btnNacionalidad.setOnClickListener {
            it.findNavController().navigate(R.id.irANacionalidad)
        }

        binding.btnPelicula.setOnClickListener {
            it.findNavController().navigate(R.id.irAPelicula)
        }
    }


}