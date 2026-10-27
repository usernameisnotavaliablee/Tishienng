package com.bumptech.glide.load.data.mediastore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b {
    private static final int a = 512;
    private static final int b = 384;

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(android.net.Uri r1) {
            boolean r0 = b(r1)
            if (r0 == 0) goto Le
            boolean r1 = e(r1)
            if (r1 != 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static boolean b(android.net.Uri r2) {
            if (r2 == 0) goto L1c
            java.lang.String r0 = "content"
            java.lang.String r1 = r2.getScheme()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            java.lang.String r0 = "media"
            java.lang.String r2 = r2.getAuthority()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public static boolean c(android.net.Uri r1) {
            boolean r0 = b(r1)
            if (r0 == 0) goto Le
            boolean r1 = e(r1)
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static boolean d(int r1, int r2) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L10
            if (r2 == r0) goto L10
            r0 = 512(0x200, float:7.17E-43)
            if (r1 > r0) goto L10
            r1 = 384(0x180, float:5.38E-43)
            if (r2 > r1) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    private static boolean e(android.net.Uri r1) {
            java.util.List r1 = r1.getPathSegments()
            java.lang.String r0 = "video"
            boolean r1 = r1.contains(r0)
            return r1
    }
}
