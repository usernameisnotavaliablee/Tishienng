package com.ss.android.socialbase.appdownloader.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class i {
    public i() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.ss.android.socialbase.appdownloader.j.d a(android.content.Context r9, java.lang.String r10, org.json.JSONObject r11, com.ss.android.socialbase.downloader.ae.cw r12) {
            r0 = 0
            if (r12 == 0) goto L103
            if (r9 == 0) goto L103
            if (r11 != 0) goto L9
            goto L103
        L9:
            java.lang.String r1 = r12.qv()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L103
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 == 0) goto L1b
            goto L103
        L1b:
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            com.ss.android.socialbase.downloader.jy.j r5 = com.ss.android.socialbase.downloader.jy.j.j(r12)
            java.lang.String r1 = "v1"
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L36
            com.ss.android.socialbase.appdownloader.j.g r10 = new com.ss.android.socialbase.appdownloader.j.g
            java.lang.String r11 = r12.ws()
            r10.<init>(r9, r5, r11)
            return r10
        L36:
            java.lang.String r1 = "v2"
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L48
            com.ss.android.socialbase.appdownloader.j.h r10 = new com.ss.android.socialbase.appdownloader.j.h
            java.lang.String r11 = r2.getAbsolutePath()
            r10.<init>(r9, r5, r11)
            return r10
        L48:
            java.lang.String r1 = "v3"
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L5a
            com.ss.android.socialbase.appdownloader.j.l r10 = new com.ss.android.socialbase.appdownloader.j.l
            java.lang.String r11 = r2.getAbsolutePath()
            r10.<init>(r9, r5, r11)
            return r10
        L5a:
            java.lang.String r1 = "o1"
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L6c
            com.ss.android.socialbase.appdownloader.j.a r10 = new com.ss.android.socialbase.appdownloader.j.a
            java.lang.String r11 = r2.getAbsolutePath()
            r10.<init>(r9, r5, r11)
            return r10
        L6c:
            java.lang.String r1 = "o2"
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L7e
            com.ss.android.socialbase.appdownloader.j.j r10 = new com.ss.android.socialbase.appdownloader.j.j
            java.lang.String r11 = r2.getAbsolutePath()
            r10.<init>(r9, r5, r11)
            return r10
        L7e:
            java.lang.String r1 = "o3"
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto La1
            java.lang.String r10 = "file_content_uri"
            java.lang.String r7 = r12.ws(r10)
            boolean r10 = android.text.TextUtils.isEmpty(r7)
            if (r10 != 0) goto L103
            com.ss.android.socialbase.appdownloader.j.c r3 = new com.ss.android.socialbase.appdownloader.j.c
            java.lang.String r6 = r2.getAbsolutePath()
            java.lang.String r8 = r12.tl()
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        La1:
            r4 = r9
            java.lang.String r9 = "custom"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto Lb4
            com.ss.android.socialbase.appdownloader.j.b r9 = new com.ss.android.socialbase.appdownloader.j.b
            java.lang.String r10 = r2.getAbsolutePath()
            r9.<init>(r4, r5, r10, r11)
            return r9
        Lb4:
            java.lang.String r9 = "vbi"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L103
            com.ss.android.socialbase.downloader.downloader.ae r9 = com.ss.android.socialbase.downloader.downloader.ae.xt(r4)
            int r10 = r12.ae()
            com.ss.android.socialbase.downloader.r.tj r9 = r9.vl(r10)
            com.ss.android.socialbase.appdownloader.f r10 = com.ss.android.socialbase.appdownloader.f.L()
            java.lang.String r10 = r10.P()
            java.io.File r11 = new java.io.File
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r12.qv()
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r1 = r12.tl()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            int r12 = r12.ae()
            android.net.Uri r9 = com.ss.android.socialbase.appdownloader.b.n(r12, r9, r4, r10, r11)
            com.ss.android.socialbase.appdownloader.j.e r10 = new com.ss.android.socialbase.appdownloader.j.e
            java.lang.String r9 = r9.toString()
            r10.<init>(r4, r5, r9)
            return r10
        L103:
            return r0
    }

    public static boolean b(android.content.Context r7, java.lang.String r8, org.json.JSONObject r9, com.ss.android.socialbase.downloader.jy.j r10) {
            r0 = 0
            if (r7 == 0) goto Lce
            if (r8 != 0) goto L7
            goto Lce
        L7:
            java.lang.String r4 = com.ss.android.socialbase.appdownloader.b.L()
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto Lce
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 == 0) goto L19
            goto Lce
        L19:
            boolean r1 = com.ss.android.socialbase.appdownloader.m.e.p()
            if (r1 == 0) goto L2e
            java.lang.String r1 = "v1"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L2e
            com.ss.android.socialbase.appdownloader.j.g r8 = new com.ss.android.socialbase.appdownloader.j.g
            r8.<init>(r7, r10, r4)
            goto Lc4
        L2e:
            boolean r1 = com.ss.android.socialbase.appdownloader.m.e.p()
            if (r1 == 0) goto L43
            java.lang.String r1 = "v2"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L43
            com.ss.android.socialbase.appdownloader.j.h r8 = new com.ss.android.socialbase.appdownloader.j.h
            r8.<init>(r7, r10, r4)
            goto Lc4
        L43:
            boolean r1 = com.ss.android.socialbase.appdownloader.m.e.p()
            if (r1 == 0) goto L58
            java.lang.String r1 = "v3"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L58
            com.ss.android.socialbase.appdownloader.j.l r8 = new com.ss.android.socialbase.appdownloader.j.l
            r8.<init>(r7, r10, r4)
            goto Lc4
        L58:
            boolean r1 = com.ss.android.socialbase.appdownloader.m.e.r()
            if (r1 == 0) goto L6c
            java.lang.String r1 = "o1"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L6c
            com.ss.android.socialbase.appdownloader.j.a r8 = new com.ss.android.socialbase.appdownloader.j.a
            r8.<init>(r7, r10, r4)
            goto Lc4
        L6c:
            boolean r1 = com.ss.android.socialbase.appdownloader.m.e.r()
            if (r1 == 0) goto L80
            java.lang.String r1 = "o2"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L80
            com.ss.android.socialbase.appdownloader.j.j r8 = new com.ss.android.socialbase.appdownloader.j.j
            r8.<init>(r7, r10, r4)
            goto Lc4
        L80:
            boolean r1 = com.ss.android.socialbase.appdownloader.m.e.r()
            if (r1 == 0) goto L99
            java.lang.String r1 = "o3"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L99
            com.ss.android.socialbase.appdownloader.j.c r1 = new com.ss.android.socialbase.appdownloader.j.c
            r5 = r4
            r6 = r4
            r2 = r7
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = r1
            goto Lc4
        L99:
            r2 = r7
            r3 = r10
            boolean r7 = com.ss.android.socialbase.appdownloader.m.e.p()
            if (r7 == 0) goto Laf
            java.lang.String r7 = "custom"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto Laf
            com.ss.android.socialbase.appdownloader.j.b r8 = new com.ss.android.socialbase.appdownloader.j.b
            r8.<init>(r2, r3, r4, r9)
            goto Lc4
        Laf:
            boolean r7 = com.ss.android.socialbase.appdownloader.m.e.p()
            if (r7 == 0) goto Lc3
            java.lang.String r7 = "vbi"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto Lc3
            com.ss.android.socialbase.appdownloader.j.e r8 = new com.ss.android.socialbase.appdownloader.j.e
            r8.<init>(r2, r3, r4)
            goto Lc4
        Lc3:
            r8 = 0
        Lc4:
            if (r8 == 0) goto Lce
            boolean r7 = r8.a()
            if (r7 == 0) goto Lce
            r7 = 1
            return r7
        Lce:
            return r0
    }
}
