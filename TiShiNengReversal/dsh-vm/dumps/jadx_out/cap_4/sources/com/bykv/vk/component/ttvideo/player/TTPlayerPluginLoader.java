package com.bykv.vk.component.ttvideo.player;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TTPlayerPluginLoader {
    public static final int PLUGIN_INTERTRUST_DRM = 100;
    private static com.bykv.vk.component.ttvideo.player.IPluginLoader mPluginLoader;

    static {
            return
    }

    public TTPlayerPluginLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.ClassLoader loadPlugin(int r1) {
            com.bykv.vk.component.ttvideo.player.IPluginLoader r0 = com.bykv.vk.component.ttvideo.player.TTPlayerPluginLoader.mPluginLoader
            if (r0 == 0) goto L9
            java.lang.ClassLoader r1 = r0.loadPlugin(r1)
            return r1
        L9:
            r1 = 0
            return r1
    }

    public static void setPluginLoader(com.bykv.vk.component.ttvideo.player.IPluginLoader r0) {
            com.bykv.vk.component.ttvideo.player.TTPlayerPluginLoader.mPluginLoader = r0
            return
    }
}
