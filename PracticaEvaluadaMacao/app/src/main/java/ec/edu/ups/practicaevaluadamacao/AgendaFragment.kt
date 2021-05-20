package ec.edu.ups.practicaevaluadamacao

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import ec.edu.ups.practicaevaluadamacao.databinding.FragmentAboutBinding
import ec.edu.ups.practicaevaluadamacao.databinding.FragmentAgendaBinding

class AgendaFragment : Fragment() {

    private  lateinit var binding: FragmentAgendaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_agenda, container, false)

        binding.editTextTextPersonName.setText("Congreso 1")
        binding.editTextTextPersonName2.setText("congreso tratado sobre politicas")
        binding.editTextTextPersonName3.setText("10/02/2021")

        return binding.root
    }

}