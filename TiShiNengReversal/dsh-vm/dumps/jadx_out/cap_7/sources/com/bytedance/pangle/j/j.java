package com.bytedance.pangle.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    java.lang.Throwable j;
    private final java.util.concurrent.CountDownLatch xt;


    /* renamed from: com.bytedance.pangle.j.j$j, reason: collision with other inner class name */
    public interface InterfaceC0007j {
        void j() throws java.lang.Throwable;
    }

    private j(boolean r5, com.bytedance.pangle.j.j.InterfaceC0007j[] r6) {
            r4 = this;
            r4.<init>()
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            int r1 = r6.length
            r0.<init>(r1)
            r4.xt = r0
            int r0 = r6.length
            r1 = 0
        Ld:
            if (r1 >= r0) goto L1c
            r2 = r6[r1]
            com.bytedance.pangle.j.j$1 r3 = new com.bytedance.pangle.j.j$1
            r3.<init>(r4, r2)
            com.bytedance.pangle.up.up.j(r3, r5)
            int r1 = r1 + 1
            goto Ld
        L1c:
            return
    }

    static /* synthetic */ java.util.concurrent.CountDownLatch j(com.bytedance.pangle.j.j r0) {
            java.util.concurrent.CountDownLatch r0 = r0.xt
            return r0
    }

    private void j() throws java.lang.Throwable {
            r2 = this;
            java.util.concurrent.CountDownLatch r0 = r2.xt     // Catch: java.lang.InterruptedException -> Lb
            r0.await()     // Catch: java.lang.InterruptedException -> Lb
            java.lang.Throwable r0 = r2.j
            if (r0 != 0) goto La
            return
        La:
            throw r0
        Lb:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public static void j(boolean r1, com.bytedance.pangle.j.j.InterfaceC0007j... r2) throws java.lang.Throwable {
            com.bytedance.pangle.j.j r0 = new com.bytedance.pangle.j.j
            r0.<init>(r1, r2)
            r0.j()
            return
    }
}
