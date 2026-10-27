package com.bykv.vk.component.ttvideo.player;

@com.bykv.vk.component.ttvideo.player.JNINamespace("PLAYER")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class NativeMaskInfo extends com.bykv.vk.component.ttvideo.player.MaskInfo {
    public NativeMaskInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    private static boolean isNativeMaskInfo(com.bykv.vk.component.ttvideo.player.MaskInfo r0) {
            boolean r0 = r0 instanceof com.bykv.vk.component.ttvideo.player.NativeMaskInfo
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MaskInfo
    protected void onMaskInfoCallback(int r1, int r2, java.lang.String r3) {
            r0 = this;
            android.util.AndroidRuntimeException r1 = new android.util.AndroidRuntimeException
            java.lang.String r2 = "Should not be here"
            r1.<init>(r2)
            throw r1
    }
}
