package com.android.ioccontainer

import com.android.ioccontainer.di.DiContainer
import com.android.ioccontainer.stubs.Bar
import com.android.ioccontainer.stubs.Foo
import com.android.ioccontainer.stubs.IBar
import junit.framework.Assert
import org.junit.Before
import org.junit.Test

class DIContainerTest {

    private lateinit var _container: DiContainer

    @Before
    fun setUp(){
        _container = DiContainer()
        _container.registrations.bind(IFoo::class, Foo::class)
        _container.registrations.bind(IBar::class, Bar::class)
    }

    @Test
    fun resolveT_ResolvesTypesFromRegistry() {
        val instance = _container.resolve<IFoo>()
        Assert.assertNotNull(instance)
    }


    @Test
    fun resolve_ResolvesTypesFromRegistry() {
        val instance = _container.resolve(IFoo::class)
        Assert.assertNotNull(instance)
    }
}