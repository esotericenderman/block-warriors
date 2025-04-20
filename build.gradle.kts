import xyz.jpenilla.resourcefactory.bukkit.BukkitPluginYaml

plugins {
  java
  `java-library`

  id("io.papermc.paperweight.userdev") version "1.7.1"
  id("xyz.jpenilla.resource-factory-bukkit-convention") version "1.1.1"
  id("xyz.jpenilla.run-paper") version "2.3.0"

  id("io.github.goooler.shadow") version "8.1.7"
}

description = "A collection of fun Minecraft minigames."

group = "dev.enderman"
version = "1.0.0-SNAPSHOT"

val javaVersion = 21
val minecraftVersion = "1.21"

java {
  toolchain.languageVersion = JavaLanguageVersion.of(javaVersion)
}

dependencies {
  paperweight.paperDevBundle("$minecraftVersion-R0.1-SNAPSHOT")
}

tasks {
  compileJava {
    options.release = javaVersion
  }

  javadoc {
    options.encoding = Charsets.UTF_8.name()
  }
}

bukkitPluginYaml {
  name = "BlockWarriors"
  description = project.description

  authors = listOf("Esoteric Enderman")
  website = "https://github.com/esotericenderman/block-warriors"

  version = project.version.toString()
  apiVersion = minecraftVersion
  main = "${project.group}.minecraft.plugins.games.warriors.${name.get()}Plugin"
  load = BukkitPluginYaml.PluginLoadOrder.POSTWORLD
}
