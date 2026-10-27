package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
abstract class l {
    boolean cw;
    boolean j;

    /* renamed from: r, reason: collision with root package name */
    boolean f2086r;
    boolean xt;

    l(boolean r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.xt = r1
            r0.cw = r2
            r1 = 0
            r0.f2086r = r1
            return
    }

    l(boolean r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.xt = r1
            r0.cw = r2
            r0.f2086r = r3
            return
    }

    java.lang.String j(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto Le
            goto Ldd
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r1 = r1.getPath()
            r0.append(r1)
            java.lang.String r1 = "/Android/data/com.snssdk.api.embed/cache"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r2 = "/"
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L53
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L53
            boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L53
            if (r0 != 0) goto L56
            boolean r0 = r2.mkdirs()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L53
            if (r0 != 0) goto L56
            goto Ldd
        L4f:
            r8 = move-exception
            r0 = r1
            goto Lde
        L53:
            r8 = move-exception
            r0 = r1
            goto Lb1
        L56:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L53
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L53
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L53
            java.lang.String r2 = "rwd"
            r8.<init>(r0, r2)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L53
            java.nio.channels.FileChannel r2 = r8.getChannel()     // Catch: java.lang.Throwable -> L93 java.io.IOException -> L97
            java.nio.channels.FileLock r1 = r2.lock()     // Catch: java.lang.Throwable -> L93 java.io.IOException -> L97
            boolean r0 = r0.isFile()     // Catch: java.lang.Throwable -> L93 java.io.IOException -> L97
            java.lang.String r2 = "UTF-8"
            if (r0 == 0) goto L9c
            r0 = 129(0x81, float:1.81E-43)
            byte[] r3 = new byte[r0]     // Catch: java.lang.Throwable -> L93 java.io.IOException -> L97
            r4 = 0
            int r5 = r8.read(r3, r4, r0)     // Catch: java.lang.Throwable -> L93 java.io.IOException -> L97
            if (r5 <= 0) goto L9c
            if (r5 >= r0) goto L9c
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L93 java.io.IOException -> L97
            r0.<init>(r3, r4, r5, r2)     // Catch: java.lang.Throwable -> L93 java.io.IOException -> L97
            boolean r3 = com.bytedance.embedapplog.wq.j(r0)     // Catch: java.lang.Throwable -> L93 java.io.IOException -> L97
            if (r3 == 0) goto L9c
            if (r1 == 0) goto L8f
            r1.release()     // Catch: java.lang.Exception -> L8f
        L8f:
            r8.close()     // Catch: java.lang.Exception -> L92
        L92:
            return r0
        L93:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto Lde
        L97:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
            goto Lb1
        L9c:
            byte[] r0 = r9.getBytes(r2)     // Catch: java.lang.Throwable -> L93 java.io.IOException -> L97
            r2 = 0
            r8.setLength(r2)     // Catch: java.lang.Throwable -> L93 java.io.IOException -> L97
            r8.write(r0)     // Catch: java.lang.Throwable -> L93 java.io.IOException -> L97
            if (r1 == 0) goto Lad
            r1.release()     // Catch: java.lang.Exception -> Lad
        Lad:
            r8.close()     // Catch: java.lang.Exception -> Lb0
        Lb0:
            return r9
        Lb1:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lc9
            r3 = 23
            if (r2 < r3) goto Ld1
            com.bytedance.embedapplog.f r2 = com.bytedance.embedapplog.f.m()     // Catch: java.lang.Throwable -> Lc9
            android.app.Application r2 = r2.j     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = "android.permission.READ_EXTERNAL_STORAGE"
            int r2 = androidx.core.app.q.a(r2, r3)     // Catch: java.lang.Throwable -> Lc9
            if (r2 != 0) goto Lcb
            com.bytedance.embedapplog.uc.xt(r8)     // Catch: java.lang.Throwable -> Lc9
            goto Ld1
        Lc9:
            r8 = move-exception
            goto Lde
        Lcb:
            java.lang.SecurityException r9 = new java.lang.SecurityException     // Catch: java.lang.Throwable -> Lc9
            r9.<init>(r8)     // Catch: java.lang.Throwable -> Lc9
            throw r9     // Catch: java.lang.Throwable -> Lc9
        Ld1:
            if (r1 == 0) goto Ld8
            r1.release()     // Catch: java.lang.Exception -> Ld7
            goto Ld8
        Ld7:
        Ld8:
            if (r0 == 0) goto Ldd
            r0.close()     // Catch: java.lang.Exception -> Ldd
        Ldd:
            return r9
        Lde:
            if (r1 == 0) goto Le5
            r1.release()     // Catch: java.lang.Exception -> Le4
            goto Le5
        Le4:
        Le5:
            if (r0 == 0) goto Lea
            r0.close()     // Catch: java.lang.Exception -> Lea
        Lea:
            throw r8
    }

    protected abstract boolean j(org.json.JSONObject r1);
}
