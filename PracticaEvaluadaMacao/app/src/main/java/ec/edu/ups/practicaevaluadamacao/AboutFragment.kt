package ec.edu.ups.practicaevaluadamacao

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import ec.edu.ups.practicaevaluadamacao.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {

    private  lateinit var binding: FragmentAboutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_about, container, false)


        binding.editTextTextPersonName.setText("John Macao")
        binding.editTextTextPersonName2.setText("macao@gmail.com")
        binding.editTextTextPersonName3.setText("0980644250")

        binding.button2.setOnClickListener { view: View ->
            //view.findNavController().navigate(R.id.action_dataFragment_to_homeFragment)
            view.findNavController().navigate(AboutFragmentDirections.actionAboutFragmentToInicioFragment())

        }

        return binding.root
    }

}