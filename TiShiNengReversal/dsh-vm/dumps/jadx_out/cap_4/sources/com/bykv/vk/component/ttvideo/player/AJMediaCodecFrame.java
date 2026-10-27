package com.bykv.vk.component.ttvideo.player;

@com.bykv.vk.component.ttvideo.player.Keep
@android.annotation.TargetApi(16)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AJMediaCodecFrame implements java.lang.Cloneable {

    @com.bykv.vk.component.ttvideo.player.Keep
    public java.nio.ByteBuffer data;

    @com.bykv.vk.component.ttvideo.player.Keep
    public int flags;

    @com.bykv.vk.component.ttvideo.player.Keep
    public int index;

    @com.bykv.vk.component.ttvideo.player.Keep
    public long pts;

    @com.bykv.vk.component.ttvideo.player.Keep
    public int size;

    @com.bykv.vk.component.ttvideo.player.Keep
    public AJMediaCodecFrame() {
            r2 = this;
            r2.<init>()
            r0 = -269488145(0xffffffffefefefef, double:NaN)
            r2.pts = r0
            return
    }

    public com.bykv.vk.component.ttvideo.player.AJMediaCodecFrame clone() {
            r1 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.Throwable -> L7
            com.bykv.vk.component.ttvideo.player.AJMediaCodecFrame r0 = (com.bykv.vk.component.ttvideo.player.AJMediaCodecFrame) r0     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            r0 = 0
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m6clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.AJMediaCodecFrame r0 = r1.clone()
            return r0
    }
}
