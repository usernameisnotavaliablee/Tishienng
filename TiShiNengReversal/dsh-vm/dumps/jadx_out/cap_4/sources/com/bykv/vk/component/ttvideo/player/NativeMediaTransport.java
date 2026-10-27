package com.bykv.vk.component.ttvideo.player;

@com.bykv.vk.component.ttvideo.player.JNINamespace("PLAYER")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class NativeMediaTransport extends com.bykv.vk.component.ttvideo.player.MediaTransport {
    public NativeMediaTransport() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    private static boolean isNativeMediaTransport(com.bykv.vk.component.ttvideo.player.MediaTransport r0) {
            boolean r0 = r0 instanceof com.bykv.vk.component.ttvideo.player.NativeMediaTransport
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaTransport
    protected void sendPacket(com.bykv.vk.component.ttvideo.player.MediaTransport.MediaPacket r2) {
            r1 = this;
            android.util.AndroidRuntimeException r2 = new android.util.AndroidRuntimeException
            java.lang.String r0 = "Should not be here"
            r2.<init>(r0)
            throw r2
    }
}
