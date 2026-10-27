package com.bytedance.adsdk.lottie.cw;

@com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class tl {
    private final com.bytedance.adsdk.lottie.cw.ae j;
    private final com.bytedance.adsdk.lottie.cw.m xt;

    public tl(com.bytedance.adsdk.lottie.cw.ae r1, com.bytedance.adsdk.lottie.cw.m r2) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r2
            return
    }

    @com.bytedance.component.sdk.annotation.WorkerThread
    private com.bytedance.adsdk.lottie.vl<com.bytedance.adsdk.lottie.m> cw(android.content.Context r10, java.lang.String r11, java.lang.String r12) {
            r9 = this;
            java.lang.String r1 = "LottieFetchResult close failed "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Fetching "
            r0.<init>(r2)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.bytedance.adsdk.lottie.up.up.j(r0)
            r2 = 0
            com.bytedance.adsdk.lottie.cw.m r0 = r9.xt     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            com.bytedance.adsdk.lottie.cw.r r2 = r0.j(r11)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r0 = r2.j()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            if (r0 == 0) goto L5a
            java.io.InputStream r6 = r2.xt()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            java.lang.String r7 = r2.cw()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r12
            com.bytedance.adsdk.lottie.vl r10 = r3.j(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            java.lang.String r12 = "Completed fetch from network. Success: "
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            java.lang.Object r12 = r10.j()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            if (r12 == 0) goto L3f
            r12 = 1
            goto L40
        L3f:
            r12 = 0
        L40:
            r11.append(r12)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            com.bytedance.adsdk.lottie.up.up.j(r11)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
        L4a:
            r2.close()     // Catch: java.io.IOException -> L4e
            return r10
        L4e:
            r0 = move-exception
            r11 = r0
            com.bytedance.adsdk.lottie.up.up.j(r1, r11)
            return r10
        L54:
            r0 = move-exception
            r10 = r0
            goto L7a
        L57:
            r0 = move-exception
            r10 = r0
            goto L69
        L5a:
            com.bytedance.adsdk.lottie.vl r10 = new com.bytedance.adsdk.lottie.vl     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            java.lang.String r12 = r2.r()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            goto L4a
        L69:
            com.bytedance.adsdk.lottie.vl r11 = new com.bytedance.adsdk.lottie.vl     // Catch: java.lang.Throwable -> L54
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L79
            r2.close()     // Catch: java.io.IOException -> L74
            goto L79
        L74:
            r0 = move-exception
            r10 = r0
            com.bytedance.adsdk.lottie.up.up.j(r1, r10)
        L79:
            return r11
        L7a:
            if (r2 == 0) goto L85
            r2.close()     // Catch: java.io.IOException -> L80
            goto L85
        L80:
            r0 = move-exception
            r11 = r0
            com.bytedance.adsdk.lottie.up.up.j(r1, r11)
        L85:
            throw r10
    }

    private com.bytedance.adsdk.lottie.vl<com.bytedance.adsdk.lottie.m> j(android.content.Context r2, java.lang.String r3, java.io.InputStream r4, java.lang.String r5) throws java.io.IOException {
            r1 = this;
            if (r5 == 0) goto L1c
            com.bytedance.adsdk.lottie.cw.ae r5 = r1.j
            if (r5 != 0) goto L7
            goto L1c
        L7:
            com.bytedance.adsdk.lottie.cw.cw r0 = com.bytedance.adsdk.lottie.cw.cw.xt
            java.io.File r4 = r5.j(r3, r4, r0)
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r4)
            r5.<init>(r0)
            com.bytedance.adsdk.lottie.vl r2 = com.bytedance.adsdk.lottie.ae.j(r2, r5, r3)
            return r2
        L1c:
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream
            r3.<init>(r4)
            r4 = 0
            com.bytedance.adsdk.lottie.vl r2 = com.bytedance.adsdk.lottie.ae.j(r2, r3, r4)
            return r2
    }

    private com.bytedance.adsdk.lottie.vl<com.bytedance.adsdk.lottie.m> j(android.content.Context r2, java.lang.String r3, java.io.InputStream r4, java.lang.String r5, java.lang.String r6) throws java.io.IOException {
            r1 = this;
            if (r5 != 0) goto L4
            java.lang.String r5 = "application/json"
        L4:
            java.lang.String r0 = "application/zip"
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L3a
            java.lang.String r0 = "application/x-zip"
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L3a
            java.lang.String r0 = "application/x-zip-compressed"
            boolean r5 = r5.contains(r0)
            if (r5 != 0) goto L3a
            java.lang.String r5 = "\\?"
            java.lang.String[] r5 = r3.split(r5)
            r0 = 0
            r5 = r5[r0]
            java.lang.String r0 = ".lottie"
            boolean r5 = r5.endsWith(r0)
            if (r5 == 0) goto L2e
            goto L3a
        L2e:
            java.lang.String r2 = "Received json response."
            com.bytedance.adsdk.lottie.up.up.j(r2)
            com.bytedance.adsdk.lottie.cw.cw r2 = com.bytedance.adsdk.lottie.cw.cw.j
            com.bytedance.adsdk.lottie.vl r4 = r1.j(r3, r4, r6)
            goto L46
        L3a:
            java.lang.String r5 = "Handling zip response."
            com.bytedance.adsdk.lottie.up.up.j(r5)
            com.bytedance.adsdk.lottie.cw.cw r5 = com.bytedance.adsdk.lottie.cw.cw.xt
            com.bytedance.adsdk.lottie.vl r4 = r1.j(r2, r3, r4, r6)
            r2 = r5
        L46:
            if (r6 == 0) goto L55
            java.lang.Object r5 = r4.j()
            if (r5 == 0) goto L55
            com.bytedance.adsdk.lottie.cw.ae r5 = r1.j
            if (r5 == 0) goto L55
            r5.j(r3, r2)
        L55:
            return r4
    }

    private com.bytedance.adsdk.lottie.vl<com.bytedance.adsdk.lottie.m> j(java.lang.String r2, java.io.InputStream r3, java.lang.String r4) throws java.io.IOException {
            r1 = this;
            if (r4 == 0) goto L1b
            com.bytedance.adsdk.lottie.cw.ae r4 = r1.j
            if (r4 != 0) goto L7
            goto L1b
        L7:
            com.bytedance.adsdk.lottie.cw.cw r0 = com.bytedance.adsdk.lottie.cw.cw.j
            java.io.File r3 = r4.j(r2, r3, r0)
            java.io.FileInputStream r4 = new java.io.FileInputStream
            java.lang.String r3 = r3.getAbsolutePath()
            r4.<init>(r3)
            com.bytedance.adsdk.lottie.vl r2 = com.bytedance.adsdk.lottie.ae.xt(r4, r2)
            return r2
        L1b:
            r2 = 0
            com.bytedance.adsdk.lottie.vl r2 = com.bytedance.adsdk.lottie.ae.xt(r3, r2)
            return r2
    }

    @com.bytedance.component.sdk.annotation.WorkerThread
    private com.bytedance.adsdk.lottie.m xt(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L36
            com.bytedance.adsdk.lottie.cw.ae r1 = r3.j
            if (r1 != 0) goto L8
            goto L36
        L8:
            android.util.Pair r5 = r1.j(r5)
            if (r5 != 0) goto Lf
            return r0
        Lf:
            java.lang.Object r1 = r5.first
            com.bytedance.adsdk.lottie.cw.cw r1 = (com.bytedance.adsdk.lottie.cw.cw) r1
            java.lang.Object r5 = r5.second
            java.io.InputStream r5 = (java.io.InputStream) r5
            com.bytedance.adsdk.lottie.cw.cw r2 = com.bytedance.adsdk.lottie.cw.cw.xt
            if (r1 != r2) goto L25
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream
            r1.<init>(r5)
            com.bytedance.adsdk.lottie.vl r4 = com.bytedance.adsdk.lottie.ae.j(r4, r1, r6)
            goto L29
        L25:
            com.bytedance.adsdk.lottie.vl r4 = com.bytedance.adsdk.lottie.ae.xt(r5, r6)
        L29:
            java.lang.Object r5 = r4.j()
            if (r5 == 0) goto L36
            java.lang.Object r4 = r4.j()
            com.bytedance.adsdk.lottie.m r4 = (com.bytedance.adsdk.lottie.m) r4
            return r4
        L36:
            return r0
    }

    @com.bytedance.component.sdk.annotation.WorkerThread
    public com.bytedance.adsdk.lottie.vl<com.bytedance.adsdk.lottie.m> j(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            com.bytedance.adsdk.lottie.m r0 = r2.xt(r3, r4, r5)
            if (r0 == 0) goto Lc
            com.bytedance.adsdk.lottie.vl r3 = new com.bytedance.adsdk.lottie.vl
            r3.<init>(r0)
            return r3
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Animation for "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = " not found in cache. Fetching from network."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.adsdk.lottie.up.up.j(r0)
            com.bytedance.adsdk.lottie.vl r3 = r2.cw(r3, r4, r5)
            return r3
    }
}
