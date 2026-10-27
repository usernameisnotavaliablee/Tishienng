package com.bykv.vk.component.ttvideo.player;

@com.bykv.vk.component.ttvideo.player.JNINamespace("PLAYER")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class AudioProcessor extends com.bykv.vk.component.ttvideo.player.NativeObject {
    public static final int AV_PCM_FMT_DBL = 4;
    public static final int AV_PCM_FMT_DBLP = 9;
    public static final int AV_PCM_FMT_FLT = 3;
    public static final int AV_PCM_FMT_FLTP = 8;
    public static final int AV_PCM_FMT_NONE = -1;
    public static final int AV_PCM_FMT_S16 = 1;
    public static final int AV_PCM_FMT_S16P = 6;
    public static final int AV_PCM_FMT_S32 = 2;
    public static final int AV_PCM_FMT_S32P = 7;
    public static final int AV_PCM_FMT_U8 = 0;
    public static final int AV_PCM_FMT_U8P = 5;
    public static final int RELEASE_REASEON_OSPLAYER_CREATED = 1;
    public static final int RELEASE_REASEON_TTPLAYER_NORMAL_CALL = 2;

    public AudioProcessor() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public abstract void audioClose();

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public abstract void audioOpen(int r1, int r2, int r3, int r4);

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public abstract void audioProcess(java.nio.ByteBuffer[] r1, int r2, long r3);

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public abstract void audioRelease(int r1);
}
