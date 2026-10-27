package com.danikula.videocache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class b implements com.danikula.videocache.d {
    private volatile byte[] a;
    private volatile boolean b;

    public b() {
            r1 = this;
            r0 = 0
            byte[] r0 = new byte[r0]
            r1.<init>(r0)
            return
    }

    public b(byte[] r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.danikula.videocache.n.d(r1)
            byte[] r1 = (byte[]) r1
            r0.a = r1
            return
    }

    @Override // com.danikula.videocache.d
    public void a(byte[] r4, int r5) throws com.danikula.videocache.ProxyCacheException {
            r3 = this;
            byte[] r0 = r3.a
            com.danikula.videocache.n.d(r0)
            r0 = 0
            if (r5 < 0) goto Ld
            int r1 = r4.length
            if (r5 > r1) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            com.danikula.videocache.n.b(r1)
            byte[] r1 = r3.a
            byte[] r2 = r3.a
            int r2 = r2.length
            int r2 = r2 + r5
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            byte[] r2 = r3.a
            int r2 = r2.length
            java.lang.System.arraycopy(r4, r0, r1, r2, r5)
            r3.a = r1
            return
    }

    @Override // com.danikula.videocache.d
    public long available() throws com.danikula.videocache.ProxyCacheException {
            r2 = this;
            byte[] r0 = r2.a
            int r0 = r0.length
            long r0 = (long) r0
            return r0
    }

    @Override // com.danikula.videocache.d
    public int b(byte[] r4, long r5, int r7) throws com.danikula.videocache.ProxyCacheException {
            r3 = this;
            byte[] r0 = r3.a
            int r0 = r0.length
            long r0 = (long) r0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto La
            r4 = -1
            return r4
        La:
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L1e
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            byte[] r1 = r3.a
            r0.<init>(r1)
            int r6 = (int) r5
            int r4 = r0.read(r4, r6, r7)
            return r4
        L1e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Too long offset for memory cache "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r4.<init>(r5)
            throw r4
    }

    @Override // com.danikula.videocache.d
    public void close() throws com.danikula.videocache.ProxyCacheException {
            r0 = this;
            return
    }

    @Override // com.danikula.videocache.d
    public void complete() {
            r1 = this;
            r0 = 1
            r1.b = r0
            return
    }

    @Override // com.danikula.videocache.d
    public boolean isCompleted() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }
}
