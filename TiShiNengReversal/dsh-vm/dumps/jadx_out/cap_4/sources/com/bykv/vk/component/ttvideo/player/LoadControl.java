package com.bykv.vk.component.ttvideo.player;

@com.bykv.vk.component.ttvideo.player.JNINamespace("PLAYER")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class LoadControl extends com.bykv.vk.component.ttvideo.player.NativeObject {
    public LoadControl() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    protected abstract int onCodecStackSelected(int r1);

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    protected abstract int onFilterStackSelected(int r1);

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    protected abstract int onTrackSelected(int r1);

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    protected abstract boolean shouldStartPlayback(long r1, float r3, boolean r4);
}
