package com.github.barteksc.pdfviewer.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class FileUtils {
    private FileUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void copy(java.io.InputStream r3, java.io.File r4) throws java.io.IOException {
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L25
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L25
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L16
        La:
            int r0 = r3.read(r4)     // Catch: java.lang.Throwable -> L16
            r2 = -1
            if (r0 == r2) goto L19
            r2 = 0
            r1.write(r4, r2, r0)     // Catch: java.lang.Throwable -> L16
            goto La
        L16:
            r4 = move-exception
            r0 = r1
            goto L26
        L19:
            r3.close()     // Catch: java.lang.Throwable -> L20
            r1.close()
            return
        L20:
            r3 = move-exception
            r1.close()
            throw r3
        L25:
            r4 = move-exception
        L26:
            if (r3 == 0) goto L33
            r3.close()     // Catch: java.lang.Throwable -> L2c
            goto L33
        L2c:
            r3 = move-exception
            if (r0 == 0) goto L32
            r0.close()
        L32:
            throw r3
        L33:
            if (r0 == 0) goto L38
            r0.close()
        L38:
            throw r4
    }

    public static java.io.File fileFromAsset(android.content.Context r4, java.lang.String r5) throws java.io.IOException {
            java.io.File r0 = new java.io.File
            java.io.File r1 = r4.getCacheDir()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r3 = "-pdfview.pdf"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            java.lang.String r1 = "/"
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L29
            java.io.File r1 = r0.getParentFile()
            r1.mkdirs()
        L29:
            android.content.res.AssetManager r4 = r4.getAssets()
            java.io.InputStream r4 = r4.open(r5)
            copy(r4, r0)
            return r0
    }
}
