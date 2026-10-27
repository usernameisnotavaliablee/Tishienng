package com.bytedance.pangle.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class tl implements com.bytedance.pangle.tl.qv {
    private final java.nio.ByteBuffer j;

    tl(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.<init>()
            java.nio.ByteBuffer r1 = r1.slice()
            r0.j = r1
            return
    }

    @Override // com.bytedance.pangle.tl.qv
    public long j() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.j
            int r0 = r0.capacity()
            long r0 = (long) r0
            return r0
    }

    @Override // com.bytedance.pangle.tl.qv
    public void j(com.bytedance.pangle.tl.oq r4, long r5, int r7) throws java.io.IOException, java.security.DigestException {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.j
            monitor-enter(r0)
            java.nio.ByteBuffer r1 = r3.j     // Catch: java.lang.Throwable -> L20
            r2 = 0
            r1.position(r2)     // Catch: java.lang.Throwable -> L20
            java.nio.ByteBuffer r1 = r3.j     // Catch: java.lang.Throwable -> L20
            int r6 = (int) r5     // Catch: java.lang.Throwable -> L20
            int r7 = r7 + r6
            r1.limit(r7)     // Catch: java.lang.Throwable -> L20
            java.nio.ByteBuffer r5 = r3.j     // Catch: java.lang.Throwable -> L20
            r5.position(r6)     // Catch: java.lang.Throwable -> L20
            java.nio.ByteBuffer r5 = r3.j     // Catch: java.lang.Throwable -> L20
            java.nio.ByteBuffer r5 = r5.slice()     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            r4.j(r5)
            return
        L20:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r4
    }
}
