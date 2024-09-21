package net.github.io.qzimyion.neoforge;

import net.neoforged.fml.common.Mod;

import net.github.io.qzimyion.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
