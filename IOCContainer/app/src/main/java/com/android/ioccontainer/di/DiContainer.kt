package com.android.ioccontainer.di

import com.android.ioccontainer.ConcreteMain
import kotlin.reflect.KClass

class DiContainer {
    private val creator : IActivateTypes
    val registrations : TypeRegistry

    constructor () : this(TypeRegistry())
    constructor (typeRegistry : TypeRegistry) {
        registrations = typeRegistry
        creator = LifeCycleManagingTypeActivator(TypeActivator(registrations))
    }

    inline fun <reified T: Any> resolve(): T {
        return resolve(T::class) as T
    }

    fun resolve(requestedType: KClass<*>):Any{

        try {
            return creator.create { requestedType }
        } catch (ex : StackOverflowError){
            throw IllegalStateException(ex)
        }
    }
}