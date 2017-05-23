package dm.hellokotlin

import android.support.v7.widget.AppCompatTextView
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by m on 2017/5/22.
 * ${describe}
 */
class ForecastAdapter(val items: List<String>): RecyclerView.Adapter<ForecastAdapter.ViewHolder>() {

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val textView = holder.itemView as AppCompatTextView
        textView.text = items[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(AppCompatTextView(parent?.context))
    }


    class ViewHolder(textView: AppCompatTextView): RecyclerView.ViewHolder(textView)
}