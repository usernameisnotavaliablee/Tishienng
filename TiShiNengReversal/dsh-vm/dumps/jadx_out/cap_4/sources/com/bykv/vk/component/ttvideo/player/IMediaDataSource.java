package com.bykv.vk.component.ttvideo.player;

@com.bykv.vk.component.ttvideo.player.Keep
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface IMediaDataSource extends java.io.Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @com.bykv.vk.component.ttvideo.player.Keep
    void close() throws java.io.IOException;

    @com.bykv.vk.component.ttvideo.player.Keep
    long getSize() throws java.io.IOException;

    @com.bykv.vk.component.ttvideo.player.Keep
    int readAt(long r1, byte[] r3, int r4, int r5) throws java.io.IOException;
}
