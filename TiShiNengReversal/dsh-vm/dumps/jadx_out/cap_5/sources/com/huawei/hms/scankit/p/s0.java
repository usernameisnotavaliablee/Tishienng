package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class s0 extends com.huawei.hms.scankit.p.h5 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum a extends java.lang.Enum<com.huawei.hms.scankit.p.s0.a> {
        public static final com.huawei.hms.scankit.p.s0.a a = null;
        public static final com.huawei.hms.scankit.p.s0.a b = null;
        public static final com.huawei.hms.scankit.p.s0.a c = null;
        public static final com.huawei.hms.scankit.p.s0.a d = null;
        private static final /* synthetic */ com.huawei.hms.scankit.p.s0.a[] e = null;

        static {
                com.huawei.hms.scankit.p.s0$a r0 = new com.huawei.hms.scankit.p.s0$a
                java.lang.String r1 = "UNCODABLE"
                r2 = 0
                r0.<init>(r1, r2)
                com.huawei.hms.scankit.p.s0.a.a = r0
                com.huawei.hms.scankit.p.s0$a r1 = new com.huawei.hms.scankit.p.s0$a
                java.lang.String r3 = "ONE_DIGIT"
                r4 = 1
                r1.<init>(r3, r4)
                com.huawei.hms.scankit.p.s0.a.b = r1
                com.huawei.hms.scankit.p.s0$a r3 = new com.huawei.hms.scankit.p.s0$a
                java.lang.String r5 = "TWO_DIGITS"
                r6 = 2
                r3.<init>(r5, r6)
                com.huawei.hms.scankit.p.s0.a.c = r3
                com.huawei.hms.scankit.p.s0$a r5 = new com.huawei.hms.scankit.p.s0$a
                java.lang.String r7 = "FNC_1"
                r8 = 3
                r5.<init>(r7, r8)
                com.huawei.hms.scankit.p.s0.a.d = r5
                r7 = 4
                com.huawei.hms.scankit.p.s0$a[] r7 = new com.huawei.hms.scankit.p.s0.a[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.huawei.hms.scankit.p.s0.a.e = r7
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.huawei.hms.scankit.p.s0.a valueOf(java.lang.String r1) {
                java.lang.Class<com.huawei.hms.scankit.p.s0$a> r0 = com.huawei.hms.scankit.p.s0.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.huawei.hms.scankit.p.s0$a r1 = (com.huawei.hms.scankit.p.s0.a) r1
                return r1
        }

        public static com.huawei.hms.scankit.p.s0.a[] values() {
                com.huawei.hms.scankit.p.s0$a[] r0 = com.huawei.hms.scankit.p.s0.a.e
                java.lang.Object r0 = r0.clone()
                com.huawei.hms.scankit.p.s0$a[] r0 = (com.huawei.hms.scankit.p.s0.a[]) r0
                return r0
        }
    }

    public s0() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int a(java.lang.CharSequence r5, int r6, int r7) {
            com.huawei.hms.scankit.p.s0$a r0 = a(r5, r6)
            com.huawei.hms.scankit.p.s0$a r1 = com.huawei.hms.scankit.p.s0.a.a
            r2 = 100
            if (r0 == r1) goto L57
            com.huawei.hms.scankit.p.s0$a r3 = com.huawei.hms.scankit.p.s0.a.b
            if (r0 != r3) goto Lf
            goto L57
        Lf:
            r4 = 99
            if (r7 != r4) goto L14
            return r4
        L14:
            if (r7 != r2) goto L48
            com.huawei.hms.scankit.p.s0$a r7 = com.huawei.hms.scankit.p.s0.a.d
            if (r0 != r7) goto L1b
            return r2
        L1b:
            int r0 = r6 + 2
            com.huawei.hms.scankit.p.s0$a r0 = a(r5, r0)
            if (r0 == r1) goto L47
            if (r0 != r3) goto L26
            goto L47
        L26:
            if (r0 != r7) goto L34
            int r6 = r6 + 3
            com.huawei.hms.scankit.p.s0$a r5 = a(r5, r6)
            com.huawei.hms.scankit.p.s0$a r6 = com.huawei.hms.scankit.p.s0.a.c
            if (r5 != r6) goto L33
            return r4
        L33:
            return r2
        L34:
            int r6 = r6 + 4
        L36:
            com.huawei.hms.scankit.p.s0$a r7 = a(r5, r6)
            com.huawei.hms.scankit.p.s0$a r0 = com.huawei.hms.scankit.p.s0.a.c
            if (r7 != r0) goto L41
            int r6 = r6 + 2
            goto L36
        L41:
            com.huawei.hms.scankit.p.s0$a r5 = com.huawei.hms.scankit.p.s0.a.b
            if (r7 != r5) goto L46
            return r2
        L46:
            return r4
        L47:
            return r2
        L48:
            com.huawei.hms.scankit.p.s0$a r7 = com.huawei.hms.scankit.p.s0.a.d
            if (r0 != r7) goto L52
            int r6 = r6 + 1
            com.huawei.hms.scankit.p.s0$a r0 = a(r5, r6)
        L52:
            com.huawei.hms.scankit.p.s0$a r5 = com.huawei.hms.scankit.p.s0.a.c
            if (r0 != r5) goto L57
            return r4
        L57:
            return r2
    }

    private static com.huawei.hms.scankit.p.s0.a a(java.lang.CharSequence r4, int r5) {
            int r0 = r4.length()
            if (r5 < r0) goto L9
            com.huawei.hms.scankit.p.s0$a r4 = com.huawei.hms.scankit.p.s0.a.a
            return r4
        L9:
            char r1 = r4.charAt(r5)
            r2 = 241(0xf1, float:3.38E-43)
            if (r1 != r2) goto L14
            com.huawei.hms.scankit.p.s0$a r4 = com.huawei.hms.scankit.p.s0.a.d
            return r4
        L14:
            r2 = 48
            if (r1 < r2) goto L33
            r3 = 57
            if (r1 <= r3) goto L1d
            goto L33
        L1d:
            int r5 = r5 + 1
            if (r5 < r0) goto L24
            com.huawei.hms.scankit.p.s0$a r4 = com.huawei.hms.scankit.p.s0.a.b
            return r4
        L24:
            char r4 = r4.charAt(r5)
            if (r4 < r2) goto L30
            if (r4 <= r3) goto L2d
            goto L30
        L2d:
            com.huawei.hms.scankit.p.s0$a r4 = com.huawei.hms.scankit.p.s0.a.c
            return r4
        L30:
            com.huawei.hms.scankit.p.s0$a r4 = com.huawei.hms.scankit.p.s0.a.b
            return r4
        L33:
            com.huawei.hms.scankit.p.s0$a r4 = com.huawei.hms.scankit.p.s0.a.a
            return r4
    }

    @Override // com.huawei.hms.scankit.p.h5, com.huawei.hms.scankit.p.l8
    public com.huawei.hms.scankit.p.s a(java.lang.String r2, com.huawei.hms.scankit.aiscan.common.BarcodeFormat r3, int r4, int r5, java.util.Map<com.huawei.hms.scankit.p.u2, ?> r6) throws com.huawei.hms.hmsscankit.WriterException {
            r1 = this;
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.e
            if (r3 != r0) goto L9
            com.huawei.hms.scankit.p.s r2 = super.a(r2, r3, r4, r5, r6)
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Can only encode CODE_128, but got "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // com.huawei.hms.scankit.p.h5
    public boolean[] a(java.lang.String r12) {
            r11 = this;
            int r0 = r12.length()
            r1 = 1
            if (r0 < r1) goto Ldd
            r2 = 80
            if (r0 > r2) goto Ldd
            r2 = 0
            r3 = 0
        Ld:
            r4 = 32
            if (r3 >= r0) goto L38
            char r5 = r12.charAt(r3)
            if (r5 < r4) goto L1b
            r4 = 126(0x7e, float:1.77E-43)
            if (r5 <= r4) goto L35
        L1b:
            switch(r5) {
                case 241: goto L35;
                case 242: goto L35;
                case 243: goto L35;
                case 244: goto L35;
                default: goto L1e;
            }
        L1e:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Bad character in input: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L35:
            int r3 = r3 + 1
            goto Ld
        L38:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
        L41:
            if (r5 >= r0) goto L99
            int r9 = a(r12, r5, r7)
            r10 = 100
            if (r9 != r7) goto L7a
            char r9 = r12.charAt(r5)
            switch(r9) {
                case 241: goto L76;
                case 242: goto L73;
                case 243: goto L70;
                case 244: goto L78;
                default: goto L52;
            }
        L52:
            if (r7 != r10) goto L5b
            char r9 = r12.charAt(r5)
            int r10 = r9 + (-32)
            goto L78
        L5b:
            int r9 = r5 + 2
            java.lang.String r9 = r12.substring(r5, r9)     // Catch: java.lang.NumberFormatException -> L68
            int r10 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> L68
            int r5 = r5 + 1
            goto L78
        L68:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "contents substring can not format integer"
            r12.<init>(r0)
            throw r12
        L70:
            r10 = 96
            goto L78
        L73:
            r10 = 97
            goto L78
        L76:
            r10 = 102(0x66, float:1.43E-43)
        L78:
            int r5 = r5 + r1
            goto L8a
        L7a:
            if (r7 != 0) goto L88
            if (r9 != r10) goto L83
            r7 = 104(0x68, float:1.46E-43)
            r10 = 104(0x68, float:1.46E-43)
            goto L89
        L83:
            r7 = 105(0x69, float:1.47E-43)
            r10 = 105(0x69, float:1.47E-43)
            goto L89
        L88:
            r10 = r9
        L89:
            r7 = r9
        L8a:
            int[][] r9 = com.huawei.hms.scankit.p.r0.a
            r9 = r9[r10]
            r3.add(r9)
            int r10 = r10 * r8
            int r6 = r6 + r10
            if (r5 == 0) goto L41
            int r8 = r8 + 1
            goto L41
        L99:
            int r6 = r6 % 103
            int[][] r12 = com.huawei.hms.scankit.p.r0.a
            r0 = r12[r6]
            r3.add(r0)
            r0 = 106(0x6a, float:1.49E-43)
            r12 = r12[r0]
            r3.add(r12)
            java.util.Iterator r12 = r3.iterator()
            r0 = 0
        Lae:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto Lc4
            java.lang.Object r4 = r12.next()
            int[] r4 = (int[]) r4
            int r5 = r4.length
            r6 = 0
        Lbc:
            if (r6 >= r5) goto Lae
            r7 = r4[r6]
            int r0 = r0 + r7
            int r6 = r6 + 1
            goto Lbc
        Lc4:
            boolean[] r12 = new boolean[r0]
            java.util.Iterator r0 = r3.iterator()
        Lca:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Ldc
            java.lang.Object r3 = r0.next()
            int[] r3 = (int[]) r3
            int r3 = com.huawei.hms.scankit.p.h5.a(r12, r2, r3, r1)
            int r2 = r2 + r3
            goto Lca
        Ldc:
            return r12
        Ldd:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Contents length should be between 1 and 80 characters, but got "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r12.<init>(r0)
            throw r12
    }
}
