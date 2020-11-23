package com.otakusaikou.fgcn.userdev;

import net.minecraftforge.gradle.common.util.Mirrors;
import net.minecraftforge.gradle.userdev.UserDevPlugin;
import org.gradle.api.Project;
import org.gradle.api.logging.Logger;

import javax.annotation.Nonnull;

public class UserDevPluginWrapper extends UserDevPlugin {
    @Override
    public void apply(@Nonnull Project project) {
        final Logger logger = project.getLogger();
        logger.lifecycle("You are using the ForgeGradleCN which isn't supported by Forge Team");
        logger.lifecycle("你正在使用 ForgeGradleCN，它不受到 Forge 团队支持。");
        Mirrors.changeMirror(project);
        logger.lifecycle("MINECRAFT_JAR 版本: " + Mirrors.MINECRAFT_JAR);
        logger.lifecycle("FORGE_MAVEN 版本: " + Mirrors.MINECRAFT_JAR);
        logger.lifecycle("MINECRAFT_LIB 版本: " + Mirrors.MINECRAFT_JAR);
        logger.lifecycle("MINECRAFT_ASSETS 版本: " + Mirrors.MINECRAFT_JAR);
        super.apply(project);
    }
}

