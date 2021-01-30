package com.android.ioccontainer

import com.android.ioccontainer.di.DiContainer

fun main(){
//    print("Hai")

    val instance = DiContainer().resolve<IFoo>()
    print(instance)

}

class IFoo