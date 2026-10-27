package com.bykv.vk.component.ttvideo.player;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AJCodecBuffer implements java.lang.Cloneable {
    public java.nio.ByteBuffer data;
    public int index;
    public long pts;
    public int size;

    public AJCodecBuffer() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.bykv.vk.component.ttvideo.player.AJCodecBuffer clone() {
            r3 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.Throwable -> L7
            com.bykv.vk.component.ttvideo.player.AJCodecBuffer r0 = (com.bykv.vk.component.ttvideo.player.AJCodecBuffer) r0     // Catch: java.lang.Throwable -> L7
            goto Lc
        L7:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            r0 = 0
        Lc:
            int r1 = r3.size
            r0.size = r1
            long r1 = r3.pts
            r0.pts = r1
            int r1 = r3.index
            r0.index = r1
            int r1 = r3.size
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteBuffer r2 = r3.data
            r1.put(r2)
            r0.data = r1
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m5clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.AJCodecBuffer r0 = r1.clone()
            return r0
    }
}
