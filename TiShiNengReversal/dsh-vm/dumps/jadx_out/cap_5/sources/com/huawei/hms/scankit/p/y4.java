package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class y4 {
    private static byte[] a;
    private static byte[] b;
    private static byte[] c;

    public y4() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r3, java.lang.String r4) {
            java.lang.String r0 = "loadAngleModel inputStream.close() IOException"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "load angle model...."
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MsModel"
            com.huawei.hms.scankit.p.o4.d(r2, r1)
            byte[] r1 = com.huawei.hms.scankit.p.y4.b
            if (r1 == 0) goto L1d
            goto L67
        L1d:
            r1 = 0
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            java.io.InputStream r1 = r3.open(r4)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            r3.<init>()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            java.lang.String r4 = "3inputStream"
            r3.append(r4)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            r3.append(r1)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            com.huawei.hms.scankit.p.o4.d(r2, r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            int r3 = r1.available()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            r1.read(r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            r1.close()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            com.huawei.hms.scankit.p.y4.b = r3     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            r1.close()     // Catch: java.io.IOException -> L64
            return
        L4c:
            r3 = move-exception
            goto L68
        L4e:
            java.lang.String r3 = "loadAngleModel Exception"
            com.huawei.hms.scankit.p.o4.b(r2, r3)     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L67
            r1.close()     // Catch: java.io.IOException -> L64
            goto L67
        L59:
            java.lang.String r3 = "loadAngleModel IOException"
            com.huawei.hms.scankit.p.o4.b(r2, r3)     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L67
            r1.close()     // Catch: java.io.IOException -> L64
            goto L67
        L64:
            com.huawei.hms.scankit.p.o4.b(r2, r0)
        L67:
            return
        L68:
            if (r1 == 0) goto L71
            r1.close()     // Catch: java.io.IOException -> L6e
            goto L71
        L6e:
            com.huawei.hms.scankit.p.o4.b(r2, r0)
        L71:
            throw r3
    }

    public static byte[] a() {
            byte[] r0 = com.huawei.hms.scankit.p.y4.b
            return r0
    }

    public static void b(android.content.Context r3, java.lang.String r4) {
            java.lang.String r0 = "loadConerModel inputStream.close() IOException"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "load corner model...."
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MsModel"
            com.huawei.hms.scankit.p.o4.d(r2, r1)
            byte[] r1 = com.huawei.hms.scankit.p.y4.c
            if (r1 == 0) goto L1d
            goto L67
        L1d:
            r1 = 0
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            java.io.InputStream r1 = r3.open(r4)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            r3.<init>()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            java.lang.String r4 = "4inputStream"
            r3.append(r4)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            r3.append(r1)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            com.huawei.hms.scankit.p.o4.d(r2, r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            int r3 = r1.available()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            r1.read(r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            r1.close()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            com.huawei.hms.scankit.p.y4.c = r3     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            r1.close()     // Catch: java.io.IOException -> L64
            return
        L4c:
            r3 = move-exception
            goto L68
        L4e:
            java.lang.String r3 = "loadConerModel Exception"
            com.huawei.hms.scankit.p.o4.b(r2, r3)     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L67
            r1.close()     // Catch: java.io.IOException -> L64
            goto L67
        L59:
            java.lang.String r3 = "loadConerModel IOException"
            com.huawei.hms.scankit.p.o4.b(r2, r3)     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L67
            r1.close()     // Catch: java.io.IOException -> L64
            goto L67
        L64:
            com.huawei.hms.scankit.p.o4.b(r2, r0)
        L67:
            return
        L68:
            if (r1 == 0) goto L71
            r1.close()     // Catch: java.io.IOException -> L6e
            goto L71
        L6e:
            com.huawei.hms.scankit.p.o4.b(r2, r0)
        L71:
            throw r3
    }

    public static byte[] b() {
            byte[] r0 = com.huawei.hms.scankit.p.y4.c
            return r0
    }

    public static void c(android.content.Context r3, java.lang.String r4) {
            java.lang.String r0 = "loadModel inputStream.close() IOException"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "load model...."
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MsModel"
            com.huawei.hms.scankit.p.o4.d(r2, r1)
            byte[] r1 = com.huawei.hms.scankit.p.y4.a
            if (r1 == 0) goto L1d
            goto L67
        L1d:
            r1 = 0
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            java.io.InputStream r1 = r3.open(r4)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            r3.<init>()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            java.lang.String r4 = "inputStream"
            r3.append(r4)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            r3.append(r1)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            com.huawei.hms.scankit.p.o4.d(r2, r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            int r3 = r1.available()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            r1.read(r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            r1.close()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            com.huawei.hms.scankit.p.y4.a = r3     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e java.io.IOException -> L59
            r1.close()     // Catch: java.io.IOException -> L64
            return
        L4c:
            r3 = move-exception
            goto L68
        L4e:
            java.lang.String r3 = "loadModel Exception"
            com.huawei.hms.scankit.p.o4.b(r2, r3)     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L67
            r1.close()     // Catch: java.io.IOException -> L64
            goto L67
        L59:
            java.lang.String r3 = "loadModel IOException"
            com.huawei.hms.scankit.p.o4.b(r2, r3)     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L67
            r1.close()     // Catch: java.io.IOException -> L64
            goto L67
        L64:
            com.huawei.hms.scankit.p.o4.b(r2, r0)
        L67:
            return
        L68:
            if (r1 == 0) goto L71
            r1.close()     // Catch: java.io.IOException -> L6e
            goto L71
        L6e:
            com.huawei.hms.scankit.p.o4.b(r2, r0)
        L71:
            throw r3
    }

    public static byte[] c() {
            byte[] r0 = com.huawei.hms.scankit.p.y4.a
            return r0
    }
}
