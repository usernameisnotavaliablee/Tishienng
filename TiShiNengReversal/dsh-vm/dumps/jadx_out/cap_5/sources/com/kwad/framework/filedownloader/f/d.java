package com.kwad.framework.filedownloader.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d {
    public static boolean apD;

    static {
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void a(int r1, java.lang.Object r2, java.lang.String r3, java.lang.Object... r4) {
            r0 = 0
            a(r1, r2, r0, r3, r4)
            return
    }

    private static void a(int r0, java.lang.Object r1, java.lang.Throwable r2, java.lang.String r3, java.lang.Object... r4) {
            r2 = 5
            if (r0 < r2) goto L4
            goto L9
        L4:
            boolean r2 = com.kwad.framework.filedownloader.f.d.apD
            if (r2 != 0) goto L9
            return
        L9:
            java.lang.String r1 = g(r1)
            java.lang.String r2 = com.kwad.framework.filedownloader.f.f.c(r3, r4)
            android.util.Log.println(r0, r1, r2)
            return
    }

    public static void a(java.lang.Object r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = 6
            a(r0, r1, r2, r3)
            return
    }

    public static void a(java.lang.Object r1, java.lang.Throwable r2, java.lang.String r3, java.lang.Object... r4) {
            r0 = 6
            a(r0, r1, r2, r3, r4)
            return
    }

    public static void b(java.lang.Object r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = 4
            a(r0, r1, r2, r3)
            return
    }

    public static void c(java.lang.Object r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = 3
            a(r0, r1, r2, r3)
            return
    }

    public static void d(java.lang.Object r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = 5
            a(r0, r1, r2, r3)
            return
    }

    public static void e(java.lang.Object r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = 2
            a(r0, r1, r2, r3)
            return
    }

    private static java.lang.String g(java.lang.Object r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FileDownloader."
            r0.<init>(r1)
            boolean r1 = r2 instanceof java.lang.Class
            if (r1 == 0) goto L12
            java.lang.Class r2 = (java.lang.Class) r2
        Ld:
            java.lang.String r2 = r2.getSimpleName()
            goto L17
        L12:
            java.lang.Class r2 = r2.getClass()
            goto Ld
        L17:
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
