package com.baidu.liantian.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class i {
    public static final java.lang.String[] a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f5919b = null;

    static {
            java.lang.String r0 = "java.lang.UnsatisfiedLinkError"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.baidu.liantian.b.i.a = r0
            java.lang.String r0 = "space left"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.baidu.liantian.b.i.f5919b = r0
            return
    }

    public i() {
            r1 = this;
            r1.<init>()
            return
    }

    private static long a(java.io.File r9, org.json.JSONArray r10) {
            r0 = 0
            if (r9 == 0) goto L4b
            if (r10 == 0) goto L4b
            boolean r2 = r9.isDirectory()
            if (r2 != 0) goto Ld
            goto L4b
        Ld:
            java.io.File[] r9 = r9.listFiles()
            int r2 = r9.length
            r3 = 0
        L13:
            if (r3 >= r2) goto L4b
            r4 = r9[r3]
            boolean r5 = r4.isDirectory()
            if (r5 == 0) goto L23
            long r4 = a(r4, r10)
        L21:
            long r0 = r0 + r4
            goto L48
        L23:
            boolean r5 = r4.exists()
            if (r5 == 0) goto L48
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r6 = "path"
            java.lang.String r7 = r4.getAbsolutePath()
            r5.put(r6, r7)
            java.lang.String r6 = "size"
            long r7 = r4.length()
            r5.put(r6, r7)
            r10.put(r5)
            long r4 = r4.length()
            goto L21
        L48:
            int r3 = r3 + 1
            goto L13
        L4b:
            return r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    private static java.lang.String a(android.content.Context r9, java.lang.String r10) {
            java.io.File r9 = r9.getFilesDir()     // Catch: java.lang.Throwable -> Lb0
            long r0 = r9.getFreeSpace()     // Catch: java.lang.Throwable -> Lb0
            long r2 = r9.getTotalSpace()     // Catch: java.lang.Throwable -> Lb0
            long r4 = r9.getUsableSpace()     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0
            r6.<init>()     // Catch: java.lang.Throwable -> Lb0
            r6.append(r10)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r7 = "\r\nFreeSpace="
            r6.append(r7)     // Catch: java.lang.Throwable -> Lb0
            r6.append(r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0
            r1.<init>()     // Catch: java.lang.Throwable -> Lb0
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = "  TotalSpace="
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb0
            r1.append(r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0
            r1.<init>()     // Catch: java.lang.Throwable -> Lb0
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = "  UsableSpace="
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb0
            r1.append(r4)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Lb0
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lb0
            r1.<init>()     // Catch: java.lang.Throwable -> Lb0
            java.io.File[] r9 = r9.listFiles()     // Catch: java.lang.Throwable -> Lb0
            int r2 = r9.length     // Catch: java.lang.Throwable -> Lb0
            r3 = 0
            r5 = 0
        L59:
            if (r5 >= r2) goto L77
            r6 = r9[r5]     // Catch: java.lang.Throwable -> Lb0
            boolean r7 = r6.isDirectory()     // Catch: java.lang.Throwable -> Lb0
            if (r7 == 0) goto L74
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r8 = "."
            boolean r7 = r7.startsWith(r8)     // Catch: java.lang.Throwable -> Lb0
            if (r7 == 0) goto L74
            long r6 = a(r6, r1)     // Catch: java.lang.Throwable -> Lb0
            long r3 = r3 + r6
        L74:
            int r5 = r5 + 1
            goto L59
        L77:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0
            r9.<init>()     // Catch: java.lang.Throwable -> Lb0
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = "\r\n"
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0
            r0.<init>()     // Catch: java.lang.Throwable -> Lb0
            r0.append(r9)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> Lb0
            r0.append(r9)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0
            r0.<init>()     // Catch: java.lang.Throwable -> Lb0
            r0.append(r9)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r9 = "\r\nAllFileSize="
            r0.append(r9)     // Catch: java.lang.Throwable -> Lb0
            r0.append(r3)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> Lb0
            return r9
        Lb0:
            return r10
    }

    public static java.lang.String a(android.content.Context r10, java.lang.String r11, java.lang.String r12) {
            java.lang.String r0 = ":"
            java.lang.String[] r1 = com.baidu.liantian.b.i.a     // Catch: java.lang.Throwable -> Ld0
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Throwable -> Ld0
            boolean r1 = r11.contains(r1)     // Catch: java.lang.Throwable -> Ld0
            if (r1 == 0) goto Lc0
            com.baidu.liantian.core.g r10 = com.baidu.liantian.core.g.a()     // Catch: java.lang.Throwable -> Ld0
            com.baidu.liantian.core.ApkInfo r10 = r10.d(r12)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = r10.libPath     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld0
            r1.<init>()     // Catch: java.lang.Throwable -> Ld0
            r1.append(r11)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r3 = "\r\n{libpath="
            r1.append(r3)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r10 = r10.libPath     // Catch: java.lang.Throwable -> Ld0
            r1.append(r10)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r10 = "}"
            r1.append(r10)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r10 = r1.toString()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String[] r12 = r12.split(r0)     // Catch: java.lang.Throwable -> Ld0
            int r1 = r12.length     // Catch: java.lang.Throwable -> Ld0
            r3 = 0
        L38:
            if (r3 >= r1) goto Lbf
            r4 = r12[r3]     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r5 = "/data/data/"
            boolean r5 = r4.startsWith(r5)     // Catch: java.lang.Throwable -> Ld0
            if (r5 == 0) goto Lbb
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> Ld0
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Ld0
            boolean r6 = r5.exists()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r7 = "\r\nsubLibPathFile "
            if (r6 != 0) goto L69
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld0
            r5.<init>()     // Catch: java.lang.Throwable -> Ld0
            r5.append(r10)     // Catch: java.lang.Throwable -> Ld0
            r5.append(r7)     // Catch: java.lang.Throwable -> Ld0
            r5.append(r4)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r10 = " not exists"
            r5.append(r10)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r10 = r5.toString()     // Catch: java.lang.Throwable -> Ld0
            goto Lbb
        L69:
            boolean r6 = r5.isDirectory()     // Catch: java.lang.Throwable -> Ld0
            if (r6 != 0) goto L87
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld0
            r5.<init>()     // Catch: java.lang.Throwable -> Ld0
            r5.append(r10)     // Catch: java.lang.Throwable -> Ld0
            r5.append(r7)     // Catch: java.lang.Throwable -> Ld0
            r5.append(r4)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r10 = " not a dir"
            r5.append(r10)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r10 = r5.toString()     // Catch: java.lang.Throwable -> Ld0
            goto Lbb
        L87:
            java.io.File[] r4 = r5.listFiles()     // Catch: java.lang.Throwable -> Ld0
            int r5 = r4.length     // Catch: java.lang.Throwable -> Ld0
            r6 = 0
        L8d:
            if (r6 >= r5) goto Lbb
            r7 = r4[r6]     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r8 = com.baidu.liantian.b.o.a(r7)     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld0
            r9.<init>()     // Catch: java.lang.Throwable -> Ld0
            r9.append(r10)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r10 = "\r\n{"
            r9.append(r10)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r10 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld0
            r9.append(r10)     // Catch: java.lang.Throwable -> Ld0
            r9.append(r0)     // Catch: java.lang.Throwable -> Ld0
            r9.append(r8)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r10 = "}\r\n"
            r9.append(r10)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r10 = r9.toString()     // Catch: java.lang.Throwable -> Ld0
            int r6 = r6 + 1
            goto L8d
        Lbb:
            int r3 = r3 + 1
            goto L38
        Lbf:
            return r10
        Lc0:
            java.lang.String[] r12 = com.baidu.liantian.b.i.f5919b     // Catch: java.lang.Throwable -> Ld0
            r12 = r12[r2]     // Catch: java.lang.Throwable -> Ld0
            boolean r12 = r11.contains(r12)     // Catch: java.lang.Throwable -> Ld0
            if (r12 == 0) goto Lcf
            java.lang.String r10 = a(r10, r11)     // Catch: java.lang.Throwable -> Ld0
            return r10
        Lcf:
            return r11
        Ld0:
            com.baidu.liantian.b.e.a()
            return r11
    }
}
