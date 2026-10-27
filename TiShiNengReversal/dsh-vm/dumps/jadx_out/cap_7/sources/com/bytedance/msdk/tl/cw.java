package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class cw {
    private static java.util.Random j;

    static {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            com.bytedance.msdk.tl.cw.j = r0
            return
    }

    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j() {
            r0 = 16
            java.lang.String r0 = j(r0)
            if (r0 == 0) goto L12
            int r1 = r0.length()
            r2 = 32
            if (r1 == r2) goto L11
            goto L12
        L11:
            return r0
        L12:
            r0 = 0
            return r0
    }

    public static java.lang.String j(int r1) {
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> Lc
            java.util.Random r0 = com.bytedance.msdk.tl.cw.j     // Catch: java.lang.Exception -> Lc
            r0.nextBytes(r1)     // Catch: java.lang.Exception -> Lc
            java.lang.String r1 = com.bytedance.msdk.tl.jy.j(r1)     // Catch: java.lang.Exception -> Lc
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static java.lang.String j(java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7
            return r4
        L7:
            java.lang.String r0 = j()
            r1 = 32
            java.lang.String r1 = j(r0, r1)
            java.lang.String r2 = xt()
            if (r1 == 0) goto L1e
            if (r2 == 0) goto L1e
            java.lang.String r4 = com.bytedance.msdk.tl.j.j(r4, r2, r1)
            goto L1f
        L1e:
            r4 = 0
        L1f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3 = 3
            r1.append(r3)
            r1.append(r0)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    public static java.lang.String j(java.lang.String r2, int r3) {
            if (r2 == 0) goto L24
            int r0 = r2.length()
            if (r0 == r3) goto L9
            goto L24
        L9:
            int r0 = r3 / 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r2.substring(r0, r3)
            r1.append(r3)
            r3 = 0
            java.lang.String r2 = r2.substring(r3, r0)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            return r2
        L24:
            r2 = 0
            return r2
    }

    public static org.json.JSONObject j(org.json.JSONObject r6) {
            java.lang.String r0 = "cypher"
            java.lang.String r1 = "message"
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            if (r6 != 0) goto Lc
            goto L41
        Lc:
            r3 = 0
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = j(r4)     // Catch: java.lang.Throwable -> L2e
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L2e
            if (r5 != 0) goto L23
            r2.put(r1, r4)     // Catch: java.lang.Throwable -> L2e
            r4 = 3
            r2.put(r0, r4)     // Catch: java.lang.Throwable -> L2e
            return r2
        L23:
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L2e
            r2.put(r1, r4)     // Catch: java.lang.Throwable -> L2e
            r2.put(r0, r3)     // Catch: java.lang.Throwable -> L2e
            return r2
        L2e:
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L39
            r2.put(r1, r6)     // Catch: java.lang.Throwable -> L39
            r2.put(r0, r3)     // Catch: java.lang.Throwable -> L39
            goto L41
        L39:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            com.bytedance.msdk.j.up.cw.j(r6)
        L41:
            return r2
    }

    public static java.lang.String xt() {
            r0 = 8
            java.lang.String r0 = j(r0)
            if (r0 == 0) goto L12
            int r1 = r0.length()
            r2 = 16
            if (r1 == r2) goto L11
            goto L12
        L11:
            return r0
        L12:
            r0 = 0
            return r0
    }
}
