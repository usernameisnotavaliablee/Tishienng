package com.ss.android.socialbase.downloader.m;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j {
    private static int j = 4;
    private static com.ss.android.socialbase.downloader.m.j.AbstractC0009j xt;

    /* renamed from: com.ss.android.socialbase.downloader.m.j$j, reason: collision with other inner class name */
    public static abstract class AbstractC0009j {
        public AbstractC0009j() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            return
    }

    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void cw(java.lang.String r1) {
            java.lang.String r0 = "DownloaderLogger"
            r(r0, r1)
            return
    }

    public static void cw(java.lang.String r2, java.lang.String r3) {
            if (r3 != 0) goto L3
            goto L16
        L3:
            int r0 = com.ss.android.socialbase.downloader.m.j.j
            r1 = 4
            if (r0 > r1) goto Lf
            java.lang.String r0 = xt(r2)
            com.bytedance.sdk.component.utils.vl.j(r0, r3)
        Lf:
            com.ss.android.socialbase.downloader.m.j$j r3 = com.ss.android.socialbase.downloader.m.j.xt
            if (r3 == 0) goto L16
            xt(r2)
        L16:
            return
    }

    public static void j(int r0) {
            com.ss.android.socialbase.downloader.m.j.j = r0
            return
    }

    public static void j(java.lang.String r1) {
            java.lang.String r0 = "DownloaderLogger"
            xt(r0, r1)
            return
    }

    public static void j(java.lang.String r0, java.lang.String r1) {
            if (r1 != 0) goto L3
            goto La
        L3:
            com.ss.android.socialbase.downloader.m.j$j r1 = com.ss.android.socialbase.downloader.m.j.xt
            if (r1 == 0) goto La
            xt(r0)
        La:
            return
    }

    public static void j(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            if (r1 != 0) goto L5
            if (r2 != 0) goto L5
            goto L14
        L5:
            int r1 = com.ss.android.socialbase.downloader.m.j.j
            r2 = 3
            if (r1 > r2) goto Ld
            xt(r0)
        Ld:
            com.ss.android.socialbase.downloader.m.j$j r1 = com.ss.android.socialbase.downloader.m.j.xt
            if (r1 == 0) goto L14
            xt(r0)
        L14:
            return
    }

    public static boolean j() {
            int r0 = com.ss.android.socialbase.downloader.m.j.j
            r1 = 3
            if (r0 > r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static void r(java.lang.String r2, java.lang.String r3) {
            if (r3 != 0) goto L3
            goto L16
        L3:
            int r0 = com.ss.android.socialbase.downloader.m.j.j
            r1 = 5
            if (r0 > r1) goto Lf
            java.lang.String r0 = xt(r2)
            com.bytedance.sdk.component.utils.vl.xt(r0, r3)
        Lf:
            com.ss.android.socialbase.downloader.m.j$j r3 = com.ss.android.socialbase.downloader.m.j.xt
            if (r3 == 0) goto L16
            xt(r2)
        L16:
            return
    }

    public static void up(java.lang.String r2, java.lang.String r3) {
            if (r3 != 0) goto L3
            goto L16
        L3:
            int r0 = com.ss.android.socialbase.downloader.m.j.j
            r1 = 6
            if (r0 > r1) goto Lf
            java.lang.String r0 = xt(r2)
            com.bytedance.sdk.component.utils.vl.r(r0, r3)
        Lf:
            com.ss.android.socialbase.downloader.m.j$j r3 = com.ss.android.socialbase.downloader.m.j.xt
            if (r3 == 0) goto L16
            xt(r2)
        L16:
            return
    }

    public static java.lang.String xt(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L15
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Downloader-"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L15:
            java.lang.String r2 = "DownloaderLogger"
            return r2
    }

    public static void xt(java.lang.String r1, java.lang.String r2) {
            if (r2 != 0) goto L3
            goto L12
        L3:
            int r2 = com.ss.android.socialbase.downloader.m.j.j
            r0 = 3
            if (r2 > r0) goto Lb
            xt(r1)
        Lb:
            com.ss.android.socialbase.downloader.m.j$j r2 = com.ss.android.socialbase.downloader.m.j.xt
            if (r2 == 0) goto L12
            xt(r1)
        L12:
            return
    }

    public static void xt(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            if (r3 != 0) goto L5
            if (r4 != 0) goto L5
            goto L18
        L5:
            int r0 = com.ss.android.socialbase.downloader.m.j.j
            r1 = 6
            if (r0 > r1) goto L11
            java.lang.String r0 = xt(r2)
            com.bytedance.sdk.component.utils.vl.cw(r0, r3, r4)
        L11:
            com.ss.android.socialbase.downloader.m.j$j r3 = com.ss.android.socialbase.downloader.m.j.xt
            if (r3 == 0) goto L18
            xt(r2)
        L18:
            return
    }
}
