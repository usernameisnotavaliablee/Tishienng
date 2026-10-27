package com.jmolsmobile.landscapevideocapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c {
    private static final java.lang.String c = "/";
    private static final java.lang.String d = "yyyyMMdd_HHmmss";
    private static final java.lang.String e = "video_";
    private static final java.lang.String f = ".mp4";
    private final java.lang.String a;
    private java.util.Date b;

    public c(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public c(java.lang.String r1, java.util.Date r2) {
            r0 = this;
            r0.<init>(r1)
            r0.b = r2
            return
    }

    private java.lang.String a() {
            r3 = this;
            boolean r0 = r3.e()
            if (r0 == 0) goto L9
            java.lang.String r0 = r3.a
            return r0
        L9:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyyMMdd_HHmmss"
            java.util.Locale r2 = java.util.Locale.getDefault()
            r0.<init>(r1, r2)
            java.util.Date r1 = r3.b()
            java.lang.String r0 = r0.format(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "video_"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ".mp4"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    private java.util.Date b() {
            r1 = this;
            java.util.Date r0 = r1.b
            if (r0 != 0) goto Lb
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r1.b = r0
        Lb:
            java.util.Date r0 = r1.b
            return r0
    }

    private boolean e() {
            r2 = this;
            java.lang.String r0 = r2.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            return r1
        Ld:
            r0 = 1
            return r0
    }

    public java.io.File c() {
            r3 = this;
            java.lang.String r0 = r3.a()
            java.lang.String r1 = "/"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L12
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            return r1
        L12:
            java.lang.String r0 = android.os.Environment.DIRECTORY_MOVIES
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)
            r0.mkdirs()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r3.a()
            r1.<init>(r0, r2)
            return r1
    }

    public java.lang.String d() {
            r1 = this;
            java.io.File r0 = r1.c()
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
    }
}
