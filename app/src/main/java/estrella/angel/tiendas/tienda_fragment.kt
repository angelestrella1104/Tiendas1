package estrella.angel.tiendas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.util.*


class tienda_fragment : Fragment() {
    private lateinit var binding: fragment_tienda_fragment.binding
    private lateinit var tienda: Tienda

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tienda = Tienda(
            id = UUID.randomUUID(),
            nombre ="abarrotes guerrero",
            telefono = "3315248415"
        )
    }
    override fun onCreateView(
        inflater: LayoutInflater,container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DetalleTiendaFragment.inflate(layoutInflater, container, false)
        return binding.root
    }

}