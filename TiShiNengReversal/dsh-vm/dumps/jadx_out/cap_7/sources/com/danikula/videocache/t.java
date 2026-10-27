package com.danikula.videocache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
final class t {
    private static final org.slf4j.c a = null;
    private static final java.lang.String b = "video-cache";

    static {
            java.lang.String r0 = "StorageUtils"
            org.slf4j.c r0 = org.slf4j.d.j(r0)
            com.danikula.videocache.t.a = r0
            return
    }

    t() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.io.File a(android.content.Context r2, boolean r3) {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.NullPointerException -> L5
            goto L7
        L5:
            java.lang.String r0 = ""
        L7:
            if (r3 == 0) goto L16
            java.lang.String r3 = "mounted"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L16
            java.io.File r3 = b(r2)
            goto L17
        L16:
            r3 = 0
        L17:
            if (r3 != 0) goto L1d
            java.io.File r3 = r2.getCacheDir()
        L1d:
            if (r3 != 0) goto L59
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "/data/data/"
            r3.append(r0)
            java.lang.String r2 = r2.getPackageName()
            r3.append(r2)
            java.lang.String r2 = "/cache/"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            org.slf4j.c r3 = com.danikula.videocache.t.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't define system cache directory! '"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "%s' will be used."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.warn(r0)
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
        L59:
            return r3
    }

    private static java.io.File b(android.content.Context r4) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r3 = "Android"
            r1.<init>(r2, r3)
            java.lang.String r2 = "data"
            r0.<init>(r1, r2)
            java.io.File r1 = new java.io.File
            java.io.File r2 = new java.io.File
            java.lang.String r4 = r4.getPackageName()
            r2.<init>(r0, r4)
            java.lang.String r4 = "cache"
            r1.<init>(r2, r4)
            boolean r4 = r1.exists()
            if (r4 != 0) goto L37
            boolean r4 = r1.mkdirs()
            if (r4 != 0) goto L37
            org.slf4j.c r4 = com.danikula.videocache.t.a
            java.lang.String r0 = "Unable to create external cache directory"
            r4.warn(r0)
            r4 = 0
            return r4
        L37:
            return r1
    }

    public static java.io.File c(android.content.Context r2) {
            r0 = 1
            java.io.File r2 = a(r2, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "video-cache"
            r0.<init>(r2, r1)
            return r0
    }
}
