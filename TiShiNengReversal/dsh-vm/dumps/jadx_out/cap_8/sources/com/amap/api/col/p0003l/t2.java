package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class t2 {
    private static java.lang.String a = "0123456789";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        private int f3981b;

        /* renamed from: c, reason: collision with root package name */
        private int f3982c;

        public a() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        private a(byte r2) {
                r1 = this;
                java.lang.String r2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                r0 = 11
                r1.<init>(r2, r0)
                return
        }

        public a(java.lang.String r2, int r3) {
                r1 = this;
                r1.<init>()
                r0 = 1103515245(0x41c64e6d, float:24.788294)
                r1.f3981b = r0
                r0 = 12345(0x3039, float:1.7299E-41)
                r1.f3982c = r0
                int r0 = r2.length()
                java.lang.String r2 = r1.d(r2, r3, r0)
                r1.a = r2
                return
        }

        private char a(int r2) {
                r1 = this;
                java.lang.String r0 = r1.a
                r0.getClass()
                java.lang.String r0 = r1.a
                char r2 = r0.charAt(r2)
                return r2
        }

        private int b(char r2) {
                r1 = this;
                java.lang.String r0 = r1.a
                r0.getClass()
                java.lang.String r0 = r1.a
                int r2 = r0.indexOf(r2)
                return r2
        }

        private java.lang.String d(java.lang.String r7, int r8, int r9) {
                r6 = this;
                java.lang.StringBuffer r0 = new java.lang.StringBuffer
                r0.<init>(r7)
                int r7 = r7.length()
                r1 = 0
            La:
                if (r1 >= r9) goto L29
                int r8 = r6.e(r8)
                int r2 = r8 % r7
                int r8 = r6.e(r8)
                int r3 = r8 % r7
                char r4 = r0.charAt(r2)
                char r5 = r0.charAt(r3)
                r0.setCharAt(r2, r5)
                r0.setCharAt(r3, r4)
                int r1 = r1 + 1
                goto La
            L29:
                java.lang.String r7 = r0.toString()
                return r7
        }

        private int e(int r5) {
                r4 = this;
                long r0 = (long) r5
                int r5 = r4.f3981b
                long r2 = (long) r5
                long r0 = r0 * r2
                int r5 = r4.f3982c
                long r2 = (long) r5
                long r0 = r0 + r2
                r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
                long r0 = r0 & r2
                int r5 = (int) r0
                return r5
        }

        private java.lang.String f(int r6, java.lang.String r7) {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r5.a
                int r1 = r1.length()
                int r2 = r7.length()
                r3 = 0
            L10:
                if (r3 >= r2) goto L29
                char r4 = r7.charAt(r3)
                int r4 = r5.b(r4)
                if (r4 < 0) goto L29
                int r4 = r4 + r6
                int r4 = r4 + r3
                int r4 = r4 % r1
                char r4 = r5.a(r4)
                r0.append(r4)
                int r3 = r3 + 1
                goto L10
            L29:
                int r6 = r0.length()
                if (r6 != r2) goto L34
                java.lang.String r6 = r0.toString()
                return r6
            L34:
                r6 = 0
                return r6
        }

        public final java.lang.String c(int r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r1 = r0.f(r1, r2)
                return r1
        }
    }

    static {
            return
    }

    public t2() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a() {
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r1 = 10
            int r2 = r0.nextInt(r1)
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r2
            java.lang.String r2 = "%05d"
            java.lang.String r2 = java.lang.String.format(r3, r2, r5)
            int r1 = r0.nextInt(r1)
            r5 = 100
            int r0 = r0.nextInt(r5)
            com.amap.api.col.3l.t2$a r5 = new com.amap.api.col.3l.t2$a
            java.lang.String r7 = com.amap.api.col.p0003l.t2.a
            r5.<init>(r7, r0)
            java.lang.String r2 = r5.c(r1, r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r6] = r1
            java.lang.String r1 = "%01d"
            java.lang.String r1 = java.lang.String.format(r3, r1, r2)
            r5.append(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r6] = r0
            java.lang.String r0 = "%02d"
            java.lang.String r0 = java.lang.String.format(r3, r0, r1)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            return r0
    }
}
