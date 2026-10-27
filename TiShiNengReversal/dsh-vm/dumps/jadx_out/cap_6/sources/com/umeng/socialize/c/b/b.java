package com.umeng.socialize.c.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    private static final com.umeng.socialize.c.b.b a = null;

    static {
            com.umeng.socialize.c.b.b r0 = new com.umeng.socialize.c.b.b
            r0.<init>()
            com.umeng.socialize.c.b.b.a = r0
            return
    }

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.umeng.socialize.c.b.b a() {
            com.umeng.socialize.c.b.b r0 = com.umeng.socialize.c.b.b.a
            return r0
    }

    public byte[] a(java.io.File r6) {
            r5 = this;
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L34
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L34
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L2f
            r6.<init>()     // Catch: java.lang.Throwable -> L2f
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L1b
        Lf:
            int r2 = r1.read(r0)     // Catch: java.lang.Throwable -> L1b
            r3 = -1
            if (r2 == r3) goto L1d
            r3 = 0
            r6.write(r0, r3, r2)     // Catch: java.lang.Throwable -> L1b
            goto Lf
        L1b:
            r0 = move-exception
            goto L38
        L1d:
            byte[] r0 = r6.toByteArray()     // Catch: java.lang.Throwable -> L1b
            r1.close()     // Catch: java.io.IOException -> L28
            r6.close()     // Catch: java.io.IOException -> L28
            return r0
        L28:
            r6 = move-exception
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.IMAGE.CLOSE
            com.umeng.socialize.utils.SLog.error(r1, r6)
            return r0
        L2f:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
            goto L38
        L34:
            r6 = move-exception
            r1 = r0
            r0 = r6
            r6 = r1
        L38:
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.IMAGE.READ_IMAGE_ERROR     // Catch: java.lang.Throwable -> L55
            com.umeng.socialize.utils.SLog.error(r2, r0)     // Catch: java.lang.Throwable -> L55
            byte[] r0 = com.umeng.socialize.utils.DefaultClass.getBytes()     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L49
            r1.close()     // Catch: java.io.IOException -> L47
            goto L49
        L47:
            r6 = move-exception
            goto L4f
        L49:
            if (r6 == 0) goto L54
            r6.close()     // Catch: java.io.IOException -> L47
            goto L54
        L4f:
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.IMAGE.CLOSE
            com.umeng.socialize.utils.SLog.error(r1, r6)
        L54:
            return r0
        L55:
            r0 = move-exception
            if (r1 == 0) goto L5e
            r1.close()     // Catch: java.io.IOException -> L5c
            goto L5e
        L5c:
            r6 = move-exception
            goto L64
        L5e:
            if (r6 == 0) goto L69
            r6.close()     // Catch: java.io.IOException -> L5c
            goto L69
        L64:
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.IMAGE.CLOSE
            com.umeng.socialize.utils.SLog.error(r1, r6)
        L69:
            throw r0
    }

    public java.io.File b() throws java.io.IOException {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.c()
            java.lang.String r2 = r3.d()
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L16
            r0.delete()
        L16:
            r0.createNewFile()
            return r0
    }

    public java.io.File c() {
            r3 = this;
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.getContext()
            java.io.File r1 = new java.io.File
            r2 = 0
            java.io.File r0 = r0.getExternalFilesDir(r2)
            java.lang.String r2 = "umeng_cache"
            r1.<init>(r0, r2)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L19
            r1.mkdirs()
        L19:
            return r1
    }

    public java.lang.String d() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = com.umeng.socialize.utils.SocializeUtils.hexdigest(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ".jpg"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
