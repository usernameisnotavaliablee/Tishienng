package com.bytedance.adsdk.lottie.cw;

@com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ae {
    private final com.bytedance.adsdk.lottie.cw.up j;

    public ae(com.bytedance.adsdk.lottie.cw.up r1) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            return
    }

    private java.io.File j() {
            r2 = this;
            com.bytedance.adsdk.lottie.cw.up r0 = r2.j
            java.io.File r0 = r0.j()
            boolean r1 = r0.isFile()
            if (r1 == 0) goto Lf
            r0.delete()
        Lf:
            boolean r1 = r0.exists()
            if (r1 != 0) goto L18
            r0.mkdirs()
        L18:
            return r0
    }

    private static java.lang.String j(java.lang.String r3, com.bytedance.adsdk.lottie.cw.cw r4, boolean r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "lottie_cache_"
            r0.<init>(r1)
            java.lang.String r1 = "\\W+"
            java.lang.String r2 = ""
            java.lang.String r3 = r3.replaceAll(r1, r2)
            r0.append(r3)
            if (r5 == 0) goto L19
            java.lang.String r3 = r4.j()
            goto L1b
        L19:
            java.lang.String r3 = r4.cw
        L1b:
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private java.io.File xt(java.lang.String r5) throws java.io.FileNotFoundException {
            r4 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r4.j()
            com.bytedance.adsdk.lottie.cw.cw r2 = com.bytedance.adsdk.lottie.cw.cw.j
            r3 = 0
            java.lang.String r2 = j(r5, r2, r3)
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L17
            return r0
        L17:
            java.io.File r0 = new java.io.File
            java.io.File r1 = r4.j()
            com.bytedance.adsdk.lottie.cw.cw r2 = com.bytedance.adsdk.lottie.cw.cw.xt
            java.lang.String r5 = j(r5, r2, r3)
            r0.<init>(r1, r5)
            boolean r5 = r0.exists()
            if (r5 == 0) goto L2d
            return r0
        L2d:
            r5 = 0
            return r5
    }

    @com.bytedance.component.sdk.annotation.WorkerThread
    android.util.Pair<com.bytedance.adsdk.lottie.cw.cw, java.io.InputStream> j(java.lang.String r6) {
            r5 = this;
            r0 = 0
            java.io.File r1 = r5.xt(r6)     // Catch: java.io.FileNotFoundException -> L41
            if (r1 != 0) goto L8
            return r0
        L8:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L41
            r2.<init>(r1)     // Catch: java.io.FileNotFoundException -> L41
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r3 = ".zip"
            boolean r0 = r0.endsWith(r3)
            if (r0 == 0) goto L1c
            com.bytedance.adsdk.lottie.cw.cw r0 = com.bytedance.adsdk.lottie.cw.cw.xt
            goto L1e
        L1c:
            com.bytedance.adsdk.lottie.cw.cw r0 = com.bytedance.adsdk.lottie.cw.cw.j
        L1e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Cache hit for "
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r6 = " at "
            r3.append(r6)
            java.lang.String r6 = r1.getAbsolutePath()
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            com.bytedance.adsdk.lottie.up.up.j(r6)
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r0, r2)
            return r6
        L41:
            return r0
    }

    java.io.File j(java.lang.String r4, java.io.InputStream r5, com.bytedance.adsdk.lottie.cw.cw r6) throws java.io.IOException {
            r3 = this;
            r0 = 1
            java.lang.String r4 = j(r4, r6, r0)
            java.io.File r6 = new java.io.File
            java.io.File r0 = r3.j()
            r6.<init>(r0, r4)
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2f
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L2f
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L23
        L17:
            int r1 = r5.read(r0)     // Catch: java.lang.Throwable -> L23
            r2 = -1
            if (r1 == r2) goto L25
            r2 = 0
            r4.write(r0, r2, r1)     // Catch: java.lang.Throwable -> L23
            goto L17
        L23:
            r6 = move-exception
            goto L31
        L25:
            r4.flush()     // Catch: java.lang.Throwable -> L23
            r4.close()     // Catch: java.lang.Throwable -> L2f
            r5.close()
            return r6
        L2f:
            r4 = move-exception
            goto L35
        L31:
            r4.close()     // Catch: java.lang.Throwable -> L2f
            throw r6     // Catch: java.lang.Throwable -> L2f
        L35:
            r5.close()
            throw r4
    }

    void j(java.lang.String r4, com.bytedance.adsdk.lottie.cw.cw r5) {
            r3 = this;
            r0 = 1
            java.lang.String r4 = j(r4, r5, r0)
            java.io.File r5 = new java.io.File
            java.io.File r0 = r3.j()
            r5.<init>(r0, r4)
            java.lang.String r4 = r5.getAbsolutePath()
            java.lang.String r0 = ".temp"
            java.lang.String r1 = ""
            java.lang.String r4 = r4.replace(r0, r1)
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r4 = r5.renameTo(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Copying temp file to real file ("
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.adsdk.lottie.up.up.j(r1)
            if (r4 != 0) goto L61
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to rename cache file "
            r4.<init>(r1)
            java.lang.String r5 = r5.getAbsolutePath()
            r4.append(r5)
            java.lang.String r5 = " to "
            r4.append(r5)
            java.lang.String r5 = r0.getAbsolutePath()
            r4.append(r5)
            java.lang.String r5 = "."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.bytedance.adsdk.lottie.up.up.xt(r4)
        L61:
            return
    }
}
