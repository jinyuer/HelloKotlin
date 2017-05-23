package dm.hellokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = listOf(
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/23 - Sunny - 31/17",
            "Wed 6/23 - Sunny - 31/17",
            "Thurs 6/23 - Sunny - 31/17",
            "Fri 6/23 - Sunny - 31/17",
            "Sat 6/23 - Sunny - 31/17",
            "Sun 6/23 - Sunny - 31/17"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView(): Unit {
        val recyclerView = findViewById(R.id.forecast_list) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ForecastAdapter(items)
    }

}
