package com.bykv.vk.openvk.component.video.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j extends android.media.MediaDataSource {
    public static final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.openvk.component.video.j.j.j> j = null;
    private long cw;

    /* renamed from: r, reason: collision with root package name */
    private final android.content.Context f1688r;
    private final com.bykv.vk.openvk.component.video.api.cw.r up;
    private final com.bykv.vk.openvk.component.video.j.j.j.cw xt;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.bykv.vk.openvk.component.video.j.j.j.j = r0
            return
    }

    public j(android.content.Context r3, com.bykv.vk.openvk.component.video.api.cw.r r4) {
            r2 = this;
            r2.<init>()
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            r2.cw = r0
            r2.f1688r = r3
            r2.up = r4
            com.bykv.vk.openvk.component.video.j.j.j.xt r0 = new com.bykv.vk.openvk.component.video.j.j.j.xt
            r0.<init>(r3, r4)
            r2.xt = r0
            return
    }

    public static com.bykv.vk.openvk.component.video.j.j.j j(android.content.Context r1, com.bykv.vk.openvk.component.video.api.cw.r r2) {
            com.bykv.vk.openvk.component.video.j.j.j r0 = new com.bykv.vk.openvk.component.video.j.j.j
            r0.<init>(r1, r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.openvk.component.video.j.j.j> r1 = com.bykv.vk.openvk.component.video.j.j.j.j
            java.lang.String r2 = r2.i()
            r1.put(r2, r0)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r4 = this;
            com.bykv.vk.openvk.component.video.api.cw.r r0 = r4.up
            java.lang.String r0 = r0.av()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "close: "
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r0
            java.lang.String r0 = "SdkMediaDataSource"
            com.bykv.vk.openvk.component.video.api.m.cw.j(r0, r1)
            com.bykv.vk.openvk.component.video.j.j.j.cw r0 = r4.xt
            if (r0 == 0) goto L1d
            r0.cw()
        L1d:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.openvk.component.video.j.j.j> r0 = com.bykv.vk.openvk.component.video.j.j.j.j
            com.bykv.vk.openvk.component.video.api.cw.r r1 = r4.up
            java.lang.String r1 = r1.i()
            r0.remove(r1)
            return
    }

    @Override // android.media.MediaDataSource
    public long getSize() throws java.io.IOException {
            r5 = this;
            long r0 = r5.cw
            r2 = -2147483648(0xffffffff80000000, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L3b
            android.content.Context r0 = r5.f1688r
            if (r0 == 0) goto L38
            com.bykv.vk.openvk.component.video.api.cw.r r0 = r5.up
            java.lang.String r0 = r0.av()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1a
            goto L38
        L1a:
            com.bykv.vk.openvk.component.video.j.j.j.cw r0 = r5.xt
            long r0 = r0.r()
            r5.cw = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getSize: "
            r0.<init>(r1)
            long r1 = r5.cw
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SdkMediaDataSource"
            com.bykv.vk.openvk.component.video.api.m.cw.j(r1, r0)
            goto L3b
        L38:
            r0 = -1
            return r0
        L3b:
            long r0 = r5.cw
            return r0
    }

    public com.bykv.vk.openvk.component.video.api.cw.r j() {
            r1 = this;
            com.bykv.vk.openvk.component.video.api.cw.r r0 = r1.up
            return r0
    }

    @Override // android.media.MediaDataSource
    public int readAt(long r7, byte[] r9, int r10, int r11) throws java.io.IOException {
            r6 = this;
            com.bykv.vk.openvk.component.video.j.j.j.cw r0 = r6.xt
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            int r7 = r0.j(r1, r3, r4, r5)
            return r7
    }
}
