package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class w1 {
    public static final java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f4773b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f4774c = null;

    static {
            java.lang.String r0 = "SYmFja3Vwcw"
            java.lang.String r0 = com.amap.api.col.s.j1.t(r0)
            com.amap.api.col.s.w1.a = r0
            java.lang.String r0 = "SLmFkaXU"
            java.lang.String r0 = com.amap.api.col.s.j1.t(r0)
            com.amap.api.col.s.w1.f4773b = r0
            java.lang.String r0 = "JIw"
            java.lang.String r0 = com.amap.api.col.s.j1.t(r0)
            com.amap.api.col.s.w1.f4774c = r0
            return
    }

    public w1() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a(android.content.Context r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 >= r1) goto L77
            android.content.pm.ApplicationInfo r1 = r7.getApplicationInfo()
            int r1 = r1.targetSdkVersion
            r2 = 30
            if (r1 < r2) goto L13
            if (r0 < r2) goto L13
            goto L77
        L13:
            java.lang.String r0 = "storage"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.os.storage.StorageManager r7 = (android.os.storage.StorageManager) r7
            java.lang.String r0 = "SYW5kcm9pZC5vcy5zdG9yYWdlLlN0b3JhZ2VWb2x1bWU"
            java.lang.String r0 = com.amap.api.col.s.j1.t(r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = "FZ2V0Vm9sdW1lTGlzdA"
            java.lang.String r2 = com.amap.api.col.s.j1.t(r2)     // Catch: java.lang.Throwable -> L6e
            r3 = 0
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = "ZZ2V0UGF0aA"
            java.lang.String r2 = com.amap.api.col.s.j1.t(r2)     // Catch: java.lang.Throwable -> L6e
            java.lang.reflect.Method r2 = r0.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = "AaXNSZW1vdmFibGUK"
            java.lang.String r4 = com.amap.api.col.s.j1.t(r4)     // Catch: java.lang.Throwable -> L6e
            java.lang.reflect.Method r0 = r0.getMethod(r4, r3)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r7 = r1.invoke(r7, r3)     // Catch: java.lang.Throwable -> L6e
            int r1 = java.lang.reflect.Array.getLength(r7)     // Catch: java.lang.Throwable -> L6e
            r4 = 0
        L51:
            if (r4 >= r1) goto L6d
            java.lang.Object r5 = java.lang.reflect.Array.get(r7, r4)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r6 = r2.invoke(r5, r3)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r5 = r0.invoke(r5, r3)     // Catch: java.lang.Throwable -> L6e
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L6e
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L6e
            if (r5 != 0) goto L6a
            return r6
        L6a:
            int r4 = r4 + 1
            goto L51
        L6d:
            return r3
        L6e:
            java.io.File r7 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r7 = r7.getAbsolutePath()
            return r7
        L77:
            android.content.Context r7 = r7.getApplicationContext()
            android.content.Context r7 = com.stub.StubApp.getOrigApplicationContext(r7)
            java.lang.String r0 = ""
            java.io.File r7 = r7.getExternalFilesDir(r0)
            java.lang.String r7 = r7.getAbsolutePath()
            return r7
    }

    public static synchronized void b(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            java.lang.Class<com.amap.api.col.s.w1> r0 = com.amap.api.col.s.w1.class
            monitor-enter(r0)
            if (r3 == 0) goto Lbf
            java.lang.String r1 = "EYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX0VYVEVSTkFMX1NUT1JBR0U="
            java.lang.String r1 = com.amap.api.col.s.j1.t(r1)     // Catch: java.lang.Throwable -> L9b
            int r1 = r3.checkCallingOrSelfPermission(r1)     // Catch: java.lang.Throwable -> L9b
            if (r1 != 0) goto Lbf
            java.lang.String r1 = "EYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfRVhURVJOQUxfU1RPUkFHRQ=="
            java.lang.String r1 = com.amap.api.col.s.j1.t(r1)     // Catch: java.lang.Throwable -> L9b
            int r1 = r3.checkCallingOrSelfPermission(r1)     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L1f
            goto Lbf
        L1f:
            java.lang.String r3 = a(r3)     // Catch: java.lang.Throwable -> L9b
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L2b
            monitor-exit(r0)
            return
        L2b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r1.<init>()     // Catch: java.lang.Throwable -> L9b
            r1.append(r4)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r4 = com.amap.api.col.s.w1.f4774c     // Catch: java.lang.Throwable -> L9b
            r1.append(r4)     // Catch: java.lang.Throwable -> L9b
            r1.append(r5)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r5.<init>()     // Catch: java.lang.Throwable -> L9b
            r5.append(r3)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r3 = java.io.File.separator     // Catch: java.lang.Throwable -> L9b
            r5.append(r3)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r3 = com.amap.api.col.s.w1.a     // Catch: java.lang.Throwable -> L9b
            r5.append(r3)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L9b
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L9b
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L9b
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = com.amap.api.col.s.w1.f4773b     // Catch: java.lang.Throwable -> L9b
            r3.<init>(r5, r1)     // Catch: java.lang.Throwable -> L9b
            r1 = 0
            boolean r2 = r5.exists()     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L71
            boolean r2 = r5.isDirectory()     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L74
            goto L71
        L6f:
            goto Laa
        L71:
            r5.mkdirs()     // Catch: java.lang.Throwable -> L6f
        L74:
            r3.createNewFile()     // Catch: java.lang.Throwable -> L6f
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = "rws"
            r5.<init>(r3, r2)     // Catch: java.lang.Throwable -> L6f
            java.nio.channels.FileChannel r3 = r5.getChannel()     // Catch: java.lang.Throwable -> La7
            java.nio.channels.FileLock r1 = r3.tryLock()     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto L95
            java.lang.String r2 = "UTF-8"
            byte[] r4 = r4.getBytes(r2)     // Catch: java.lang.Throwable -> La5
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)     // Catch: java.lang.Throwable -> La5
            r3.write(r4)     // Catch: java.lang.Throwable -> La5
        L95:
            if (r1 == 0) goto L9d
            r1.release()     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            goto L9d
        L9b:
            r3 = move-exception
            goto Lbd
        L9d:
            r3.close()     // Catch: java.lang.Throwable -> L9b java.io.IOException -> La0
        La0:
            c(r5)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r0)
            return
        La5:
            goto Lac
        La7:
            r3 = r1
            goto Lac
        Laa:
            r3 = r1
            r5 = r3
        Lac:
            if (r1 == 0) goto Lb3
            r1.release()     // Catch: java.lang.Throwable -> L9b java.io.IOException -> Lb2
            goto Lb3
        Lb2:
        Lb3:
            if (r3 == 0) goto Lb8
            r3.close()     // Catch: java.lang.Throwable -> L9b java.io.IOException -> Lb8
        Lb8:
            c(r5)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r0)
            return
        Lbd:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            throw r3
        Lbf:
            monitor-exit(r0)
            return
    }

    private static void c(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }
}
