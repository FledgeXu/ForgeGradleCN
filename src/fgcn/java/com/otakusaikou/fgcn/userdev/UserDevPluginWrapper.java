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
        logger.lifecycle("FORGE_MAVEN 版本: " + Mirrors.FORGE_MAVEN);
        logger.lifecycle("MINECRAFT_LIB 版本: " + Mirrors.MINECRAFT_LIB);
        logger.lifecycle("MINECRAFT_ASSETS 版本: " + Mirrors.MINECRAFT_ASSETS);
        System.setProperty("http.agent", "ForgeGradleCN/1.0 Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.198 Safari/537.36");
        super.apply(project);
    }
}

