package com.bytedance.pangle.res.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class qv {
    public qv() {
            r1 = this;
            r1.<init>()
            return
    }

    static int j(com.bytedance.pangle.res.j.ae r2) {
            com.bytedance.pangle.res.j.g r2 = r2.j
            com.bytedance.pangle.res.j.up r2 = r2.j()
            long r0 = r2.xt()
            int r2 = (int) r0
            return r2
    }

    static int j(byte[] r2, int r3, int r4, com.bytedance.pangle.res.j.tl r5) {
            r0 = 2130706432(0x7f000000, float:1.7014118E38)
            if (r3 < r0) goto L25
            int r3 = r5.j(r3)
            byte[] r5 = j(r3)
            r0 = 0
            r0 = r5[r0]
            r2[r4] = r0
            int r0 = r4 + 1
            r1 = 1
            r1 = r5[r1]
            r2[r0] = r1
            int r0 = r4 + 2
            r1 = 2
            r1 = r5[r1]
            r2[r0] = r1
            r0 = 3
            int r4 = r4 + r0
            r5 = r5[r0]
            r2[r4] = r5
        L25:
            return r3
    }

    public static void j(int r10, byte[] r11, int[] r12, int r13, java.util.HashMap<java.lang.Integer, java.lang.Integer> r14) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = -1
        Le:
            if (r4 >= r13) goto L4a
            int r6 = r4 * 5
            int r6 = r6 + 1
            r6 = r12[r6]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            boolean r7 = r14.containsKey(r7)
            if (r7 == 0) goto L47
            if (r5 != r2) goto L23
            r5 = r4
        L23:
            int r7 = r4 * 20
            int r7 = r7 + r10
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            int r9 = r7 + 20
            byte[] r7 = java.util.Arrays.copyOfRange(r11, r7, r9)
            r0.put(r8, r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r6 = r14.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            r6.intValue()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r1.put(r6, r7)
        L47:
            int r4 = r4 + 1
            goto Le
        L4a:
            java.util.ArrayList r12 = new java.util.ArrayList
            java.util.Set r13 = r1.keySet()
            r12.<init>(r13)
            java.util.Collections.sort(r12)
            java.util.Iterator r12 = r12.iterator()
            r13 = 0
        L5b:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L82
            java.lang.Object r14 = r12.next()
            java.lang.Integer r14 = (java.lang.Integer) r14
            java.lang.Object r14 = r1.get(r14)
            java.lang.Integer r14 = (java.lang.Integer) r14
            r14.intValue()
            java.lang.Object r14 = r0.get(r14)
            byte[] r14 = (byte[]) r14
            int r2 = r13 + 1
            int r13 = r13 + r5
            int r13 = r13 * 20
            int r13 = r13 + r10
            int r4 = r14.length
            java.lang.System.arraycopy(r14, r3, r11, r13, r4)
            r13 = r2
            goto L5b
        L82:
            return
    }

    static void j(java.lang.String r2, byte[] r3, com.bytedance.pangle.res.j.tl r4) throws java.lang.Throwable {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            goto L44
        L7:
            boolean r0 = r4.j(r2)
            if (r0 != 0) goto Le
            goto L44
        Le:
            java.lang.String r0 = "AndroidManifest.xml"
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto L1a
            j(r3, r4)
            return
        L1a:
            java.lang.String r1 = ".xml"
            boolean r1 = r2.endsWith(r1)
            if (r1 == 0) goto L2a
            java.lang.String r1 = "res/"
            boolean r1 = r2.startsWith(r1)
            if (r1 != 0) goto L30
        L2a:
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto L34
        L30:
            j(r3, r4)
            return
        L34:
            java.lang.String r0 = "resources.arsc"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L44
            com.bytedance.pangle.res.j.j r2 = new com.bytedance.pangle.res.j.j
            r2.<init>(r3, r4)
            r2.j()
        L44:
            return
    }

    static void j(byte[] r1, com.bytedance.pangle.res.j.tl r2) throws java.io.IOException {
            com.bytedance.pangle.res.j.xt r0 = new com.bytedance.pangle.res.j.xt
            r0.<init>(r1, r2)
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r1)
            r0.xt(r2)
        Ld:
            int r1 = r0.cw()
            r2 = 1
            if (r1 != r2) goto Ld
            return
    }

    static byte[] j(int r5) {
            byte r0 = (byte) r5
            int r1 = r5 >> 8
            byte r1 = (byte) r1
            int r2 = r5 >> 16
            byte r2 = (byte) r2
            int r5 = r5 >> 24
            byte r5 = (byte) r5
            r3 = 4
            byte[] r3 = new byte[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            r0 = 3
            r3[r0] = r5
            return r3
    }
}
