package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c0 {
    public c0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r5) {
            java.lang.String r0 = ""
            r1 = 0
            r2 = r0
        L4:
            int r3 = r5.length()
            if (r1 >= r3) goto L4d
            char r3 = r5.charAt(r1)
            boolean r4 = b(r3)
            if (r4 == 0) goto L3b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.UnsupportedEncodingException -> L2a
            r4.<init>()     // Catch: java.io.UnsupportedEncodingException -> L2a
            r4.append(r3)     // Catch: java.io.UnsupportedEncodingException -> L2a
            r4.append(r0)     // Catch: java.io.UnsupportedEncodingException -> L2a
            java.lang.String r3 = r4.toString()     // Catch: java.io.UnsupportedEncodingException -> L2a
            java.lang.String r4 = "UTF-8"
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r4)     // Catch: java.io.UnsupportedEncodingException -> L2a
            goto L2b
        L2a:
            r3 = 0
        L2b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            goto L4a
        L3b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
        L4a:
            int r1 = r1 + 1
            goto L4
        L4d:
            return r2
    }

    private static boolean b(char r1) {
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "[一-龥]"
            boolean r1 = r1.matches(r0)
            return r1
    }
}
