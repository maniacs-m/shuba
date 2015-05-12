package com.qiwenge.android.module;

import com.qiwenge.android.mvp.presenter.BookDetailPresenter;
import com.qiwenge.android.mvp.presenter.SettingsPresenter;

import dagger.Module;

/**
 * Created by Eric on 15/5/12.
 */
@Module(
        injects = {
                SettingsPresenter.class,
                BookDetailPresenter.class
        }
)
public class PresenterModule {
}