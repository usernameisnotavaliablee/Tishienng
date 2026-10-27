package com.bykv.vk.openvk.component.video.j.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw {
    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.io.File cw(java.lang.String r1, java.lang.String r2) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.isFile()
            if (r1 == 0) goto Le
            r0.delete()
        Le:
            boolean r1 = r0.exists()
            if (r1 != 0) goto L17
            r0.mkdirs()
        L17:
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r2)
            return r1
    }

    public static long j(java.lang.String r2, java.lang.String r3) {
            java.io.File r0 = cw(r2, r3)
            boolean r1 = r0.exists()
            if (r1 == 0) goto Lf
            long r2 = r0.length()
            return r2
        Lf:
            java.io.File r2 = xt(r2, r3)
            boolean r3 = r2.exists()
            if (r3 == 0) goto L1e
            long r2 = r2.length()
            return r2
        L1e:
            r2 = 0
            return r2
    }

    public static boolean j(java.io.RandomAccessFile r1, byte[] r2, long r3, int r5) throws java.io.IOException {
            r0 = 0
            r1.seek(r3)     // Catch: java.lang.Throwable -> L9
            r1.write(r2, r0, r5)     // Catch: java.lang.Throwable -> L9
            r1 = 1
            return r1
        L9:
            r1 = move-exception
            java.lang.String r2 = "VideoFilesUtils"
            java.lang.String r3 = "append failed"
            com.bykv.vk.openvk.component.video.api.m.cw.j(r2, r3, r1)
            return r0
    }

    public static java.io.File xt(java.lang.String r2, java.lang.String r3) {
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r2 = r0.isFile()
            if (r2 == 0) goto Le
            r0.delete()
        Le:
            boolean r2 = r0.exists()
            if (r2 != 0) goto L17
            r0.mkdirs()
        L17:
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = ".temp"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r2.<init>(r0, r3)
            return r2
    }
}
