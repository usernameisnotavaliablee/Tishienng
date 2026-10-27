package com.baidu.liantian.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class j {
    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(java.io.InputStream r5, java.io.OutputStream r6) {
            java.util.zip.GZIPOutputStream r0 = new java.util.zip.GZIPOutputStream
            r0.<init>(r6)
            r6 = 2048(0x800, float:2.87E-42)
            byte[] r1 = new byte[r6]
        L9:
            r2 = 0
            int r3 = r5.read(r1, r2, r6)
            r4 = -1
            if (r3 == r4) goto L15
            r0.write(r1, r2, r3)
            goto L9
        L15:
            r0.flush()
            r0.finish()
            r0.close()
            return
    }

    public static void b(java.io.InputStream r5, java.io.OutputStream r6) {
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream
            r0.<init>(r5)
            r5 = 2048(0x800, float:2.87E-42)
            byte[] r1 = new byte[r5]
        L9:
            r2 = 0
            int r3 = r0.read(r1, r2, r5)
            r4 = -1
            if (r3 == r4) goto L15
            r6.write(r1, r2, r3)
            goto L9
        L15:
            r0.close()
            return
    }
}
