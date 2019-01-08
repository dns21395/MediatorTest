package com.example.coreutils.flow

import ru.terrakok.cicerone.Router

/**
 * Created by Konstantin Tskhovrebov (aka @terrakok) on 19.12.17.
 */
class FlowRouter(private val appRouter: Router) : Router() {

    fun startFlow(screen: SupportAppScreen) {
        appRouter.navigateTo(screen)
    }

    fun newRootFlow(screen: SupportAppScreen) {
        appRouter.newRootScreen(screen)
    }

    fun finishFlow() {
        appRouter.exit()
    }
}