package org.apache.harmony.awt.datatransfer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DataTransferThread extends java.lang.Thread {
    private final org.apache.harmony.awt.datatransfer.DTK dtk;

    public DataTransferThread(org.apache.harmony.awt.datatransfer.DTK r2) {
            r1 = this;
            java.lang.String r0 = "AWT-DataTransferThread"
            r1.<init>(r0)
            r0 = 1
            r1.setDaemon(r0)
            r1.dtk = r2
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r1 = this;
            monitor-enter(r1)
            org.apache.harmony.awt.datatransfer.DTK r0 = r1.dtk     // Catch: java.lang.Throwable -> L12
            r0.initDragAndDrop()     // Catch: java.lang.Throwable -> L12
            r1.notifyAll()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            org.apache.harmony.awt.datatransfer.DTK r0 = r1.dtk
            r0.runEventLoop()
            return
        L10:
            r0 = move-exception
            goto L17
        L12:
            r0 = move-exception
            r1.notifyAll()     // Catch: java.lang.Throwable -> L10
            throw r0     // Catch: java.lang.Throwable -> L10
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    @Override // java.lang.Thread
    public void start() {
            r2 = this;
            monitor-enter(r2)
            super.start()     // Catch: java.lang.Throwable -> L9
            r2.wait()     // Catch: java.lang.Throwable -> L9 java.lang.InterruptedException -> Lb
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r0 = move-exception
            goto L12
        Lb:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L9
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L9
            throw r1     // Catch: java.lang.Throwable -> L9
        L12:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }
}
