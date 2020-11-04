package com.otakusaikou.fgcn.userdev;

import net.minecraftforge.gradle.userdev.UserDevPlugin;
import org.gradle.api.Project;

import javax.annotation.Nonnull;

public class UserDevPluginWrapper extends UserDevPlugin {
    @Override
    public void apply(@Nonnull Project project) {
        super.apply(project);
    }
}

