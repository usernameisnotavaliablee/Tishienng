package com.bykv.vk.component.ttvideo.player;

@com.bykv.vk.component.ttvideo.player.JNINamespace("PLAYER")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class NativeObject {
    protected long mNativeObj;

    public NativeObject() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mNativeObj = r0
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    private long getNativeObj() {
            r2 = this;
            long r0 = r2.mNativeObj
            return r0
    }

    private native void nativeRelease(long r1);

    protected void finalize() throws java.lang.Throwable {
            r0 = this;
            return
    }

    public synchronized void release() {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.mNativeObj     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L11
            r5.nativeRelease(r0)     // Catch: java.lang.Throwable -> Lf
            r5.mNativeObj = r2     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r0 = move-exception
            goto L13
        L11:
            monitor-exit(r5)
            return
        L13:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    protected void setNativeObj(long r1) {
            r0 = this;
            r0.mNativeObj = r1
            return
    }
}
