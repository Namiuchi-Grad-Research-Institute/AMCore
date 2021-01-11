package com.accessmirai.mc.amcore;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.Metadata;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = AMCMain.MOD_ID, name = AMCMain.MOD_NAME, version = AMCMain.VERSION, updateJSON = "https://projectr.ddo.jp/assets/mcmod/AMCoreVersionCheck.json", certificateFingerprint = "29d3c3cad9a8070edb86fc6fc0c0088241f80770")
public class AMCMain {
    public static final String MOD_ID = "amcore";
    public static final String MOD_NAME = "AMCore";
    public static final String VERSION = "0.1.0-alpha";
    
    @Instance(MOD_ID)
    public static AMCMain instance;
    
    @Metadata(MOD_ID)
    public static ModMetadata meta;
    
    @EventHandler
    public void construct(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @EventHandler
    public void perInit(FMLPreInitializationEvent event) {
        AMCInfo.loadInfo(meta);
    }
}
