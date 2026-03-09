package com.msaitodev.socialworker.humanmed.di

import com.msaitodev.socialworker.humanmed.notifications.QuizNotificationPolicy
import com.msaitodev.core.notifications.NotificationPolicy
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class NotificationBindingModule {

    @Binds
    @Singleton
    abstract fun bindNotificationPolicy(
        impl: QuizNotificationPolicy
    ): NotificationPolicy
}
