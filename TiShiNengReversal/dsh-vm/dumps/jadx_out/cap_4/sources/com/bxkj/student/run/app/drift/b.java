package com.bxkj.student.run.app.drift;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b {
    java.io.File a;
    java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;

    public b(java.lang.String r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)
            java.io.File r0 = r0.getAbsoluteFile()
            r3.a = r0
            java.lang.String r0 = "体适能跑步"
            r3.b = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.a
            java.lang.String r2 = r3.b
            r0.<init>(r1, r2)
            java.lang.String r0 = r0.getPath()
            r3.c = r0
            r3.d = r4
            return
    }

    private java.io.File a(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r3.b(r4)
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L25
            r2.<init>()     // Catch: java.lang.Exception -> L25
            r2.append(r4)     // Catch: java.lang.Exception -> L25
            r2.append(r5)     // Catch: java.lang.Exception -> L25
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Exception -> L25
            r1.<init>(r4)     // Catch: java.lang.Exception -> L25
            boolean r4 = r1.exists()     // Catch: java.lang.Exception -> L22
            if (r4 != 0) goto L24
            r1.createNewFile()     // Catch: java.lang.Exception -> L22
            return r1
        L22:
            r0 = r1
            goto L25
        L24:
            return r1
        L25:
            return r0
    }

    private void b(java.lang.String r2) {
            r1 = this;
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> Lf
            r0.<init>(r2)     // Catch: java.lang.Exception -> Lf
            boolean r2 = r0.exists()     // Catch: java.lang.Exception -> Lf
            if (r2 != 0) goto L11
            r0.mkdir()     // Catch: java.lang.Exception -> Lf
            return
        Lf:
            r2 = move-exception
            goto L12
        L11:
            return
        L12:
            r2.toString()
            return
    }

    public void c(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = r3.c
            java.lang.String r1 = r3.d
            r3.a(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            java.lang.String r1 = r3.d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = "\r\n"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L46
            r1.<init>(r0)     // Catch: java.lang.Exception -> L46
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> L46
            if (r0 != 0) goto L48
            java.io.File r0 = r1.getParentFile()     // Catch: java.lang.Exception -> L46
            r0.mkdirs()     // Catch: java.lang.Exception -> L46
            r1.createNewFile()     // Catch: java.lang.Exception -> L46
            goto L48
        L46:
            r4 = move-exception
            goto L61
        L48:
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = "rwd"
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L46
            long r1 = r1.length()     // Catch: java.lang.Exception -> L46
            r0.seek(r1)     // Catch: java.lang.Exception -> L46
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Exception -> L46
            r0.write(r4)     // Catch: java.lang.Exception -> L46
            r0.close()     // Catch: java.lang.Exception -> L46
            return
        L61:
            r4.toString()
            return
    }
}
