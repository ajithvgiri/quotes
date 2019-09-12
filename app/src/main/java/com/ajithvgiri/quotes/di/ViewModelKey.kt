/*
 * Created by @ajithvgiri on 29/12/18 10:15 PM
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 22/11/18 10:52 PM
 */
package com.ajithvgiri.quotes.di

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass


@Target(AnnotationTarget.FUNCTION,
        AnnotationTarget.PROPERTY_GETTER,
        AnnotationTarget.PROPERTY_SETTER)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)