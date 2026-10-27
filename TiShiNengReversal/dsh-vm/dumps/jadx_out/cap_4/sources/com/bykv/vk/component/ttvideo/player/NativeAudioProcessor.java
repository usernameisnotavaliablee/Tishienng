package com.bykv.vk.component.ttvideo.player;

@com.bykv.vk.component.ttvideo.player.JNINamespace("PLAYER")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class NativeAudioProcessor extends com.bykv.vk.component.ttvideo.player.AudioProcessor {
    protected long mNativeWrapper;

    public NativeAudioProcessor() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mNativeWrapper = r0
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    private long getNativeWrapper() {
            r2 = this;
            long r0 = r2.mNativeWrapper
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public static boolean isNativeAudioProcessor(com.bykv.vk.component.ttvideo.player.AudioProcessor r0) {
            boolean r0 = r0 instanceof com.bykv.vk.component.ttvideo.player.NativeAudioProcessor
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.AudioProcessor
    public void audioClose() {
            r2 = this;
            android.util.AndroidRuntimeException r0 = new android.util.AndroidRuntimeException
            java.lang.String r1 = "Should not be here"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.AudioProcessor
    public void audioOpen(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.util.AndroidRuntimeException r1 = new android.util.AndroidRuntimeException
            java.lang.String r2 = "Should not be here"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.bykv.vk.component.ttvideo.player.AudioProcessor
    public void audioProcess(java.nio.ByteBuffer[] r1, int r2, long r3) {
            r0 = this;
            android.util.AndroidRuntimeException r1 = new android.util.AndroidRuntimeException
            java.lang.String r2 = "Should not be here"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.bykv.vk.component.ttvideo.player.AudioProcessor
    public void audioRelease(int r2) {
            r1 = this;
            android.util.AndroidRuntimeException r2 = new android.util.AndroidRuntimeException
            java.lang.String r0 = "Should not be here"
            r2.<init>(r0)
            throw r2
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void setNativeWrapper(long r1) {
            r0 = this;
            r0.mNativeWrapper = r1
            return
    }
}
