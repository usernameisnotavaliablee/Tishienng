package com.danikula.videocache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class g {
    private static final java.util.regex.Pattern d = null;
    private static final java.util.regex.Pattern e = null;
    public final java.lang.String a;
    public final long b;
    public final boolean c;

    static {
            java.lang.String r0 = "[R,r]ange:[ ]?bytes=(\\d*)-"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.danikula.videocache.g.d = r0
            java.lang.String r0 = "GET /(.*) HTTP"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.danikula.videocache.g.e = r0
            return
    }

    public g(java.lang.String r7) {
            r6 = this;
            r6.<init>()
            com.danikula.videocache.n.d(r7)
            long r0 = r6.a(r7)
            r2 = 0
            long r4 = java.lang.Math.max(r2, r0)
            r6.b = r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            r6.c = r0
            java.lang.String r7 = r6.b(r7)
            r6.a = r7
            return
    }

    private long a(java.lang.String r3) {
            r2 = this;
            java.util.regex.Pattern r0 = com.danikula.videocache.g.d
            java.util.regex.Matcher r3 = r0.matcher(r3)
            boolean r0 = r3.find()
            if (r0 == 0) goto L16
            r0 = 1
            java.lang.String r3 = r3.group(r0)
            long r0 = java.lang.Long.parseLong(r3)
            return r0
        L16:
            r0 = -1
            return r0
    }

    private java.lang.String b(java.lang.String r4) {
            r3 = this;
            java.util.regex.Pattern r0 = com.danikula.videocache.g.e
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r1 = r0.find()
            if (r1 == 0) goto L12
            r4 = 1
            java.lang.String r4 = r0.group(r4)
            return r4
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid request `"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "`: url not found!"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public static com.danikula.videocache.g c(java.io.InputStream r3) throws java.io.IOException {
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.lang.String r2 = "UTF-8"
            r1.<init>(r3, r2)
            r0.<init>(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L11:
            java.lang.String r1 = r0.readLine()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L24
            r3.append(r1)
            r1 = 10
            r3.append(r1)
            goto L11
        L24:
            com.danikula.videocache.g r0 = new com.danikula.videocache.g
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GetRequest{rangeOffset="
            r0.append(r1)
            long r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", partial="
            r0.append(r1)
            boolean r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", uri='"
            r0.append(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
