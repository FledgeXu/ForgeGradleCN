/*
 * ForgeGradle
 * Copyright (C) 2018 Forge Development LLC
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
 * USA
 */

package net.minecraftforge.gradle.common.util;

import org.gradle.api.Project;

import java.util.Objects;

public class Mirrors {
    public static String MINECRAFT_JAR ;
    public static String FORGE_MAVEN ;
    public static String MINECRAFT_LIB;
    public static String MINECRAFT_ASSERTS ;
    public static final String ALIYUN_CENTRAL = "https://maven.aliyun.com/repository/central";

    public static void changeMirror(Project project) {
        MINECRAFT_JAR = project.hasProperty("MINECRAFT_JAR") ? ((String) Objects.requireNonNull(project.property("MINECRAFT_JAR"))).replaceAll("/$", "") : "https://download.mcbbs.net";
        FORGE_MAVEN = project.hasProperty("FORGE_MAVEN") ? ((String) Objects.requireNonNull(project.property("FORGE_MAVEN"))).replaceAll("/$", "") : "https://lss233.littleservice.cn/repositories/forgedev";
        MINECRAFT_LIB = project.hasProperty("MINECRAFT_LIB") ? ((String) Objects.requireNonNull(project.property("MINECRAFT_LIB"))).replaceAll("/$", "") : "https://lss233.littleservice.cn/repositories/forgedev";
        MINECRAFT_ASSERTS = project.hasProperty("MINECRAFT_ASSERTS") ? ((String) Objects.requireNonNull(project.property("MINECRAFT_ASSERTS"))).replaceAll("/$", "") : "https://download.mcbbs.net/assets";
    }
}
