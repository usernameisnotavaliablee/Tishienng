package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class e4 {
    private static int a = 6;

    static {
            return
    }

    public e4() {
            r1 = this;
            r1.<init>()
            return
    }

    private static byte[] a() {
            java.lang.String r0 = "16,99,86,77,511,98,86,97,511,99,86,77,511,18,48,97,511,99,86,77,511,58,601,77,511,58,48,77,511,58,86,87,511,18,48,97,511,58,86,87,511,18,48,97,511,98,48,87,511,98,48,97,511,99,86,77,511,58,221,77,511,98,601,87"
            byte[] r0 = b(r0)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = "AMU"
            java.lang.String r2 = "grk"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            r0 = 0
            return r0
    }

    private static byte[] b(java.lang.String r6) {
            java.lang.String r0 = ","
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L58
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L58
            java.lang.StringBuffer r6 = r1.reverse()     // Catch: java.lang.Throwable -> L58
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L58
            java.lang.String[] r6 = r6.split(r0)     // Catch: java.lang.Throwable -> L58
            int r1 = r6.length     // Catch: java.lang.Throwable -> L58
            byte[] r2 = new byte[r1]     // Catch: java.lang.Throwable -> L58
            r3 = 0
            r4 = 0
        L18:
            if (r4 >= r1) goto L25
            r5 = r6[r4]     // Catch: java.lang.Throwable -> L58
            byte r5 = java.lang.Byte.parseByte(r5)     // Catch: java.lang.Throwable -> L58
            r2[r4] = r5     // Catch: java.lang.Throwable -> L58
            int r4 = r4 + 1
            goto L18
        L25:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L58
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L58
            byte[] r6 = com.amap.api.col.p0003l.j5.c(r6)     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "UTF-8"
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L58
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L58
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L58
            java.lang.StringBuffer r6 = r6.reverse()     // Catch: java.lang.Throwable -> L58
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L58
            java.lang.String[] r6 = r6.split(r0)     // Catch: java.lang.Throwable -> L58
            int r0 = r6.length     // Catch: java.lang.Throwable -> L58
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L58
        L49:
            int r1 = r6.length     // Catch: java.lang.Throwable -> L58
            if (r3 >= r1) goto L57
            r1 = r6[r3]     // Catch: java.lang.Throwable -> L58
            byte r1 = java.lang.Byte.parseByte(r1)     // Catch: java.lang.Throwable -> L58
            r0[r3] = r1     // Catch: java.lang.Throwable -> L58
            int r3 = r3 + 1
            goto L49
        L57:
            return r0
        L58:
            r6 = move-exception
            java.lang.String r0 = "AMU"
            java.lang.String r1 = "rcs"
            com.amap.api.col.p0003l.w5.p(r6, r0, r1)
            r6 = 0
            return r6
    }

    public static byte[] c(byte[] r2) {
            byte[] r0 = a()     // Catch: java.lang.Throwable -> Ld
            byte[] r1 = d()     // Catch: java.lang.Throwable -> Ld
            byte[] r2 = com.amap.api.col.p0003l.j4.h(r0, r2, r1)     // Catch: java.lang.Throwable -> Ld
            return r2
        Ld:
            r2 = 0
            byte[] r2 = new byte[r2]
            return r2
    }

    private static byte[] d() {
            java.lang.String r0 = "16,18,86,97,511,18,48,97,511,18,86,97,511,58,86,77,511,18,86,97,511,58,48,77,511,18,86,97,511,58,601,77,511,18,86,97,511,58,221,77,511,18,86,97,511,58,86,87,511,18,86,97,511,58,48,87,511,18,86,97,511,58,601,87"
            byte[] r0 = b(r0)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = "AMU"
            java.lang.String r2 = "giv"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            r0 = 0
            return r0
    }

    public static byte[] e(byte[] r2) {
            byte[] r0 = a()     // Catch: java.lang.Exception -> Ld
            byte[] r1 = d()     // Catch: java.lang.Exception -> Ld
            byte[] r2 = com.amap.api.col.p0003l.j4.e(r0, r2, r1)     // Catch: java.lang.Exception -> Ld
            return r2
        Ld:
            r2 = 0
            byte[] r2 = new byte[r2]
            return r2
    }
}
