package br.com.arch.toolkit.recycler.adapter

import android.content.Context
import android.view.View

/**
 * Implementation of BaseRecyclerAdapter with represents a single viewType
 */
open class SimpleAdapter<MODEL, out VIEW>(private val creator: (context: Context) -> VIEW) :
        BaseRecyclerAdapter<MODEL>()
        where VIEW : View, VIEW : ViewBinder<MODEL> {

    override fun viewCreator(context: Context, viewType: Int) = creator.invoke(context)
}