package com.example.coreutils

import com.example.coreutils.flow.SupportAppScreen
import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.commands.BackTo
import ru.terrakok.cicerone.commands.Replace

fun Navigator.setLaunchScreen(screen: SupportAppScreen) {
    applyCommands(
        arrayOf(
            BackTo(null),
            Replace(screen)
        )
    )
}