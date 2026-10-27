package com.bykv.vk.component.ttvideo.player;

@com.bykv.vk.component.ttvideo.player.Keep
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TTVersion {
    public static final boolean ENABLE_AUDIO_EFFECT = false;
    public static final boolean ENABLE_BORINGSSL = false;
    public static final boolean ENABLE_EXT_LIBYUV = false;
    public static final boolean ENABLE_EXT_SSL = false;
    public static final boolean ENABLE_SHARED_FFMPEG = true;

    @com.bykv.vk.component.ttvideo.player.Keep
    public static final int VERSION = 1;
    public static final java.lang.String VERSION_INFO = "c7b53fdb5e 2023-01-18 14:58:56";
    public static final java.lang.String VERSION_NAME = "2.10.42.103-csj";

    public TTVersion() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void saveVersionInfo() {
            r0 = 15
            java.lang.String r1 = "c7b53fdb5e 2023-01-18 14:58:56"
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.setValue(r0, r1)
            r0 = 13
            r1 = 1
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.setValue(r0, r1)
            r0 = 14
            java.lang.String r1 = "2.10.42.103-csj"
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.setValue(r0, r1)
            return
    }
}
