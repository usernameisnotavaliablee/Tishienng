package com.bykv.vk.component.ttvideo.player;

@com.bykv.vk.component.ttvideo.player.JNINamespace("PLAYER")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class NativeSubInfo extends com.bykv.vk.component.ttvideo.player.SubInfo {
    public NativeSubInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    private static boolean isNativeSubInfo(com.bykv.vk.component.ttvideo.player.SubInfo r0) {
            boolean r0 = r0 instanceof com.bykv.vk.component.ttvideo.player.NativeSubInfo
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.SubInfo
    protected void onSubInfoCallback(int r1, int r2, java.lang.String r3) {
            r0 = this;
            android.util.AndroidRuntimeException r1 = new android.util.AndroidRuntimeException
            java.lang.String r2 = "Should not be here"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.bykv.vk.component.ttvideo.player.SubInfo
    protected void onSubInfoCallback2(int r1, java.lang.String r2) {
            r0 = this;
            android.util.AndroidRuntimeException r1 = new android.util.AndroidRuntimeException
            java.lang.String r2 = "Should not be here"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.bykv.vk.component.ttvideo.player.SubInfo
    protected void onSubLoadFinished(int r2) {
            r1 = this;
            android.util.AndroidRuntimeException r2 = new android.util.AndroidRuntimeException
            java.lang.String r0 = "Should not be here"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.SubInfo
    protected void onSubSwitchCompleted(int r1, int r2) {
            r0 = this;
            android.util.AndroidRuntimeException r1 = new android.util.AndroidRuntimeException
            java.lang.String r2 = "Should not be here"
            r1.<init>(r2)
            throw r1
    }
}
