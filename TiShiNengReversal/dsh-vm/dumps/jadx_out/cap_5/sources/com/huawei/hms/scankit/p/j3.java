package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class j3 {
    private final com.huawei.hms.scankit.p.s a;
    private final java.util.List<com.huawei.hms.scankit.p.f3> b;
    private final int[] c;
    private final com.huawei.hms.scankit.p.v6 d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b implements java.util.Comparator<com.huawei.hms.scankit.p.f3>, java.io.Serializable {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ b(com.huawei.hms.scankit.p.j3.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(com.huawei.hms.scankit.p.f3 r1, com.huawei.hms.scankit.p.f3 r2) {
                r0 = this;
                float r2 = r2.e()
                float r1 = r1.e()
                int r1 = java.lang.Float.compare(r2, r1)
                return r1
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(com.huawei.hms.scankit.p.f3 r1, com.huawei.hms.scankit.p.f3 r2) {
                r0 = this;
                com.huawei.hms.scankit.p.f3 r1 = (com.huawei.hms.scankit.p.f3) r1
                com.huawei.hms.scankit.p.f3 r2 = (com.huawei.hms.scankit.p.f3) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class c implements java.util.Comparator<com.huawei.hms.scankit.p.f3>, java.io.Serializable {
        private final float a;

        private c(float r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        /* synthetic */ c(float r1, com.huawei.hms.scankit.p.j3.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public int a(com.huawei.hms.scankit.p.f3 r2, com.huawei.hms.scankit.p.f3 r3) {
                r1 = this;
                float r3 = r3.e()
                float r0 = r1.a
                float r3 = r3 - r0
                float r3 = java.lang.Math.abs(r3)
                float r2 = r2.e()
                float r0 = r1.a
                float r2 = r2 - r0
                float r2 = java.lang.Math.abs(r2)
                int r2 = java.lang.Float.compare(r3, r2)
                return r2
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(com.huawei.hms.scankit.p.f3 r1, com.huawei.hms.scankit.p.f3 r2) {
                r0 = this;
                com.huawei.hms.scankit.p.f3 r1 = (com.huawei.hms.scankit.p.f3) r1
                com.huawei.hms.scankit.p.f3 r2 = (com.huawei.hms.scankit.p.f3) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    public j3(com.huawei.hms.scankit.p.s r1, com.huawei.hms.scankit.p.v6 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.b = r1
            r1 = 5
            int[] r1 = new int[r1]
            r0.c = r1
            r0.d = r2
            return
    }

    private static float a(int[] r1, int r2) {
            r0 = 4
            r0 = r1[r0]
            int r2 = r2 - r0
            r0 = 3
            r0 = r1[r0]
            int r2 = r2 - r0
            float r2 = (float) r2
            r0 = 2
            r1 = r1[r0]
            float r1 = (float) r1
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r2 = r2 - r1
            return r2
    }

    private void a(int[] r4) {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.length
            if (r1 >= r2) goto La
            r4[r1] = r0
            int r1 = r1 + 1
            goto L2
        La:
            return
    }

    private boolean a(int r13, int r14, int r15) {
            r12 = this;
            int[] r0 = r12.a()
            r1 = 0
            r2 = 0
        L6:
            r3 = 2
            r4 = 1
            if (r13 < r2) goto L20
            if (r14 < r2) goto L20
            com.huawei.hms.scankit.p.s r5 = r12.a
            int r6 = r14 - r2
            int r7 = r13 - r2
            boolean r5 = r5.b(r6, r7)
            if (r5 == 0) goto L20
            r5 = r0[r3]
            int r5 = r5 + r4
            r0[r3] = r5
            int r2 = r2 + 1
            goto L6
        L20:
            r5 = r0[r3]
            if (r5 != 0) goto L25
            return r1
        L25:
            if (r13 < r2) goto L3d
            if (r14 < r2) goto L3d
            com.huawei.hms.scankit.p.s r5 = r12.a
            int r6 = r14 - r2
            int r7 = r13 - r2
            boolean r5 = r5.b(r6, r7)
            if (r5 != 0) goto L3d
            r5 = r0[r4]
            int r5 = r5 + r4
            r0[r4] = r5
            int r2 = r2 + 1
            goto L25
        L3d:
            r5 = r0[r4]
            if (r5 != 0) goto L42
            return r1
        L42:
            if (r13 < r2) goto L5a
            if (r14 < r2) goto L5a
            com.huawei.hms.scankit.p.s r5 = r12.a
            int r6 = r14 - r2
            int r7 = r13 - r2
            boolean r5 = r5.b(r6, r7)
            if (r5 == 0) goto L5a
            r5 = r0[r1]
            int r5 = r5 + r4
            r0[r1] = r5
            int r2 = r2 + 1
            goto L42
        L5a:
            r2 = r0[r1]
            if (r2 != 0) goto L5f
            return r1
        L5f:
            com.huawei.hms.scankit.p.s r2 = r12.a
            int r2 = r2.c()
            com.huawei.hms.scankit.p.s r5 = r12.a
            int r5 = r5.e()
            r6 = 1
        L6c:
            int r7 = r13 + r6
            if (r7 >= r2) goto L84
            int r8 = r14 + r6
            if (r8 >= r5) goto L84
            com.huawei.hms.scankit.p.s r9 = r12.a
            boolean r7 = r9.b(r8, r7)
            if (r7 == 0) goto L84
            r7 = r0[r3]
            int r7 = r7 + r4
            r0[r3] = r7
            int r6 = r6 + 1
            goto L6c
        L84:
            int r7 = r13 + r6
            r8 = 3
            if (r7 >= r2) goto L9d
            int r9 = r14 + r6
            if (r9 >= r5) goto L9d
            com.huawei.hms.scankit.p.s r10 = r12.a
            boolean r7 = r10.b(r9, r7)
            if (r7 != 0) goto L9d
            r7 = r0[r8]
            int r7 = r7 + r4
            r0[r8] = r7
            int r6 = r6 + 1
            goto L84
        L9d:
            r7 = r0[r8]
            if (r7 != 0) goto La2
            return r1
        La2:
            int r7 = r13 + r6
            r9 = 4
            if (r7 >= r2) goto Lbb
            int r10 = r14 + r6
            if (r10 >= r5) goto Lbb
            com.huawei.hms.scankit.p.s r11 = r12.a
            boolean r7 = r11.b(r10, r7)
            if (r7 == 0) goto Lbb
            r7 = r0[r9]
            int r7 = r7 + r4
            r0[r9] = r7
            int r6 = r6 + 1
            goto La2
        Lbb:
            r13 = r0[r9]
            if (r13 != 0) goto Lc0
            return r1
        Lc0:
            r14 = r0[r1]
            r2 = r0[r4]
            int r14 = r14 + r2
            r2 = r0[r3]
            int r14 = r14 + r2
            r2 = r0[r8]
            int r14 = r14 + r2
            int r14 = r14 + r13
            int r14 = r14 - r15
            int r13 = java.lang.Math.abs(r14)
            float r13 = (float) r13
            float r14 = (float) r15
            r15 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14 * r15
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 < 0) goto Ldc
            return r1
        Ldc:
            boolean r13 = c(r0)
            return r13
    }

    private int[] a() {
            r1 = this;
            int[] r0 = r1.c
            r1.a(r0)
            int[] r0 = r1.c
            return r0
    }

    private boolean b(int r12, int r13, int r14) {
            r11 = this;
            int[] r0 = r11.a()
            com.huawei.hms.scankit.p.s r1 = r11.a
            int r1 = r1.c()
            com.huawei.hms.scankit.p.s r2 = r11.a
            int r2 = r2.e()
            r3 = 0
            r4 = 0
        L12:
            int r5 = r12 + r4
            r6 = 2
            r7 = 1
            if (r5 >= r1) goto L2c
            if (r13 < r4) goto L2c
            com.huawei.hms.scankit.p.s r8 = r11.a
            int r9 = r13 - r4
            boolean r5 = r8.b(r9, r5)
            if (r5 == 0) goto L2c
            r5 = r0[r6]
            int r5 = r5 + r7
            r0[r6] = r5
            int r4 = r4 + 1
            goto L12
        L2c:
            r5 = r0[r6]
            if (r5 != 0) goto L31
            return r3
        L31:
            int r5 = r12 + r4
            if (r5 >= r1) goto L49
            if (r13 < r4) goto L49
            com.huawei.hms.scankit.p.s r8 = r11.a
            int r9 = r13 - r4
            boolean r5 = r8.b(r9, r5)
            if (r5 != 0) goto L49
            r5 = r0[r7]
            int r5 = r5 + r7
            r0[r7] = r5
            int r4 = r4 + 1
            goto L31
        L49:
            r5 = r0[r7]
            if (r5 != 0) goto L4e
            return r3
        L4e:
            int r5 = r12 + r4
            if (r5 >= r1) goto L66
            if (r13 < r4) goto L66
            com.huawei.hms.scankit.p.s r8 = r11.a
            int r9 = r13 - r4
            boolean r5 = r8.b(r9, r5)
            if (r5 == 0) goto L66
            r5 = r0[r3]
            int r5 = r5 + r7
            r0[r3] = r5
            int r4 = r4 + 1
            goto L4e
        L66:
            r1 = r0[r3]
            if (r1 != 0) goto L6b
            return r3
        L6b:
            r1 = 1
        L6c:
            if (r12 < r1) goto L84
            int r4 = r13 + r1
            if (r4 >= r2) goto L84
            com.huawei.hms.scankit.p.s r5 = r11.a
            int r8 = r12 - r1
            boolean r4 = r5.b(r4, r8)
            if (r4 == 0) goto L84
            r4 = r0[r6]
            int r4 = r4 + r7
            r0[r6] = r4
            int r1 = r1 + 1
            goto L6c
        L84:
            r4 = 3
            if (r12 < r1) goto L9d
            int r5 = r13 + r1
            if (r5 >= r2) goto L9d
            com.huawei.hms.scankit.p.s r8 = r11.a
            int r9 = r12 - r1
            boolean r5 = r8.b(r5, r9)
            if (r5 != 0) goto L9d
            r5 = r0[r4]
            int r5 = r5 + r7
            r0[r4] = r5
            int r1 = r1 + 1
            goto L84
        L9d:
            r5 = r0[r4]
            if (r5 != 0) goto La2
            return r3
        La2:
            r5 = 4
            if (r12 < r1) goto Lbb
            int r8 = r13 + r1
            if (r8 >= r2) goto Lbb
            com.huawei.hms.scankit.p.s r9 = r11.a
            int r10 = r12 - r1
            boolean r8 = r9.b(r8, r10)
            if (r8 == 0) goto Lbb
            r8 = r0[r5]
            int r8 = r8 + r7
            r0[r5] = r8
            int r1 = r1 + 1
            goto La2
        Lbb:
            r12 = r0[r5]
            if (r12 != 0) goto Lc0
            return r3
        Lc0:
            r13 = r0[r3]
            r1 = r0[r7]
            int r13 = r13 + r1
            r1 = r0[r6]
            int r13 = r13 + r1
            r1 = r0[r4]
            int r13 = r13 + r1
            int r13 = r13 + r12
            int r13 = r13 - r14
            int r12 = java.lang.Math.abs(r13)
            float r12 = (float) r12
            float r13 = (float) r14
            r14 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 * r14
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 < 0) goto Ldc
            return r3
        Ldc:
            boolean r12 = c(r0)
            return r12
    }

    protected static boolean b(int[] r9) {
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            r3 = 5
            if (r1 >= r3) goto Lf
            r3 = r9[r1]
            if (r3 != 0) goto Lb
            return r0
        Lb:
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L3
        Lf:
            if (r2 >= r3) goto L12
            return r0
        L12:
            float r1 = (float) r2
            r2 = 1084227584(0x40a00000, float:5.0)
            float r1 = r1 / r2
            r2 = 1070386381(0x3fcccccd, float:1.6)
            float r2 = r1 / r2
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            float r4 = r1 * r3
            r5 = r9[r0]
            float r5 = (float) r5
            float r5 = r4 - r5
            float r5 = java.lang.Math.abs(r5)
            float r3 = r3 * r2
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 >= 0) goto L6c
            r5 = 1067030938(0x3f99999a, float:1.2)
            float r6 = r1 * r5
            r7 = 1
            r8 = r9[r7]
            float r8 = (float) r8
            float r8 = r6 - r8
            float r8 = java.lang.Math.abs(r8)
            float r5 = r5 * r2
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 >= 0) goto L6c
            r8 = 2
            r8 = r9[r8]
            float r8 = (float) r8
            float r1 = r1 - r8
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L6c
            r1 = 3
            r1 = r9[r1]
            float r1 = (float) r1
            float r6 = r6 - r1
            float r1 = java.lang.Math.abs(r6)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L6c
            r1 = 4
            r9 = r9[r1]
            float r9 = (float) r9
            float r4 = r4 - r9
            float r9 = java.lang.Math.abs(r4)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 >= 0) goto L6c
            return r7
        L6c:
            return r0
    }

    private com.huawei.hms.scankit.p.f3[] b() throws com.huawei.hms.scankit.p.a {
            r8 = this;
            r0 = 0
            r1 = 0
        L2:
            java.util.List<com.huawei.hms.scankit.p.f3> r2 = r8.b
            int r2 = r2.size()
            if (r1 >= r2) goto L2d
            java.util.List<com.huawei.hms.scankit.p.f3> r2 = r8.b
            java.lang.Object r2 = r2.get(r1)
            com.huawei.hms.scankit.p.f3 r2 = (com.huawei.hms.scankit.p.f3) r2
            float r3 = r2.e()
            r4 = 1084227584(0x40a00000, float:5.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L23
            int r2 = r2.a()
            r3 = 2
            if (r2 > r3) goto L2a
        L23:
            java.util.List<com.huawei.hms.scankit.p.f3> r2 = r8.b
            r2.remove(r1)
            int r1 = r1 + (-1)
        L2a:
            int r1 = r1 + 1
            goto L2
        L2d:
            java.util.List<com.huawei.hms.scankit.p.f3> r1 = r8.b
            int r1 = r1.size()
            r2 = 3
            if (r1 < r2) goto L10d
            java.util.List<com.huawei.hms.scankit.p.f3> r3 = r8.b
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r5 = 0
            r6 = 0
        L3f:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L54
            java.lang.Object r7 = r3.next()
            com.huawei.hms.scankit.p.f3 r7 = (com.huawei.hms.scankit.p.f3) r7
            float r7 = r7.e()
            float r5 = r5 + r7
            float r7 = r7 * r7
            float r6 = r6 + r7
            goto L3f
        L54:
            float r1 = (float) r1
            float r5 = r5 / r1
            float r6 = r6 / r1
            float r1 = r5 * r5
            float r6 = r6 - r1
            double r6 = (double) r6
            double r6 = java.lang.Math.sqrt(r6)
            float r1 = (float) r6
            java.util.List<com.huawei.hms.scankit.p.f3> r3 = r8.b
            com.huawei.hms.scankit.p.j3$c r6 = new com.huawei.hms.scankit.p.j3$c
            r7 = 0
            r6.<init>(r5, r7)
            java.util.Collections.sort(r3, r6)
            r3 = 1052266988(0x3eb851ec, float:0.36)
            float r3 = r3 * r5
            float r1 = java.lang.Math.max(r3, r1)
            r3 = 0
        L75:
            java.util.List<com.huawei.hms.scankit.p.f3> r6 = r8.b
            int r6 = r6.size()
            if (r3 >= r6) goto La4
            java.util.List<com.huawei.hms.scankit.p.f3> r6 = r8.b
            int r6 = r6.size()
            if (r6 <= r2) goto La4
            java.util.List<com.huawei.hms.scankit.p.f3> r6 = r8.b
            java.lang.Object r6 = r6.get(r3)
            com.huawei.hms.scankit.p.f3 r6 = (com.huawei.hms.scankit.p.f3) r6
            float r6 = r6.e()
            float r6 = r6 - r5
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 <= 0) goto La1
            java.util.List<com.huawei.hms.scankit.p.f3> r6 = r8.b
            r6.remove(r3)
            int r3 = r3 + (-1)
        La1:
            int r3 = r3 + 1
            goto L75
        La4:
            java.util.List<com.huawei.hms.scankit.p.f3> r1 = r8.b
            int r1 = r1.size()
            java.util.List<com.huawei.hms.scankit.p.f3> r3 = r8.b
            java.util.Iterator r3 = r3.iterator()
        Lb0:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lc3
            java.lang.Object r5 = r3.next()
            com.huawei.hms.scankit.p.f3 r5 = (com.huawei.hms.scankit.p.f3) r5
            int r5 = r5.a()
            float r5 = (float) r5
            float r4 = r4 + r5
            goto Lb0
        Lc3:
            float r1 = (float) r1
            float r4 = r4 / r1
        Lc5:
            java.util.List<com.huawei.hms.scankit.p.f3> r1 = r8.b
            int r1 = r1.size()
            if (r0 >= r1) goto Lf4
            java.util.List<com.huawei.hms.scankit.p.f3> r1 = r8.b
            int r1 = r1.size()
            if (r1 <= r2) goto Lf4
            java.util.List<com.huawei.hms.scankit.p.f3> r1 = r8.b
            java.lang.Object r1 = r1.get(r0)
            com.huawei.hms.scankit.p.f3 r1 = (com.huawei.hms.scankit.p.f3) r1
            int r1 = r1.a()
            float r1 = (float) r1
            r3 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto Lf1
            java.util.List<com.huawei.hms.scankit.p.f3> r1 = r8.b
            r1.remove(r0)
            int r0 = r0 + (-1)
        Lf1:
            int r0 = r0 + 1
            goto Lc5
        Lf4:
            java.util.List<com.huawei.hms.scankit.p.f3> r0 = r8.b
            com.huawei.hms.scankit.p.j3$b r1 = new com.huawei.hms.scankit.p.j3$b
            r1.<init>(r7)
            java.util.Collections.sort(r0, r1)
            java.util.List<com.huawei.hms.scankit.p.f3> r0 = r8.b
            int r1 = r0.size()
            com.huawei.hms.scankit.p.f3[] r1 = new com.huawei.hms.scankit.p.f3[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            com.huawei.hms.scankit.p.f3[] r0 = (com.huawei.hms.scankit.p.f3[]) r0
            return r0
        L10d:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
    }

    private float c(int r11, int r12, int r13) {
            r10 = this;
            com.huawei.hms.scankit.p.s r0 = r10.a
            int r1 = r0.e()
            int[] r2 = r10.a()
            r3 = r11
        Lb:
            r4 = 2
            r5 = 1
            if (r3 < 0) goto L1d
            boolean r6 = r0.b(r3, r12)
            if (r6 == 0) goto L1d
            r6 = r2[r4]
            int r6 = r6 + r5
            r2[r4] = r6
            int r3 = r3 + (-1)
            goto Lb
        L1d:
            r6 = 2143289344(0x7fc00000, float:NaN)
            if (r3 >= 0) goto L22
            return r6
        L22:
            if (r3 < 0) goto L32
            boolean r7 = r0.b(r3, r12)
            if (r7 != 0) goto L32
            r7 = r2[r5]
            int r7 = r7 + r5
            r2[r5] = r7
            int r3 = r3 + (-1)
            goto L22
        L32:
            if (r3 < 0) goto Lbe
            r7 = r2[r5]
            if (r7 != 0) goto L3a
            goto Lbe
        L3a:
            r7 = 0
            if (r3 < 0) goto L4b
            boolean r8 = r0.b(r3, r12)
            if (r8 == 0) goto L4b
            r8 = r2[r7]
            int r8 = r8 + r5
            r2[r7] = r8
            int r3 = r3 + (-1)
            goto L3a
        L4b:
            r3 = r2[r7]
            if (r3 != 0) goto L50
            return r6
        L50:
            int r11 = r11 + r5
        L51:
            if (r11 >= r1) goto L61
            boolean r3 = r0.b(r11, r12)
            if (r3 == 0) goto L61
            r3 = r2[r4]
            int r3 = r3 + r5
            r2[r4] = r3
            int r11 = r11 + 1
            goto L51
        L61:
            if (r11 == r1) goto Lbe
            r3 = r2[r4]
            if (r3 != 0) goto L68
            goto Lbe
        L68:
            r3 = 3
            if (r11 >= r1) goto L79
            boolean r8 = r0.b(r11, r12)
            if (r8 != 0) goto L79
            r8 = r2[r3]
            int r8 = r8 + r5
            r2[r3] = r8
            int r11 = r11 + 1
            goto L68
        L79:
            if (r11 == r1) goto Lbe
            r8 = r2[r3]
            if (r8 != 0) goto L80
            goto Lbe
        L80:
            r8 = 4
            if (r11 >= r1) goto L91
            boolean r9 = r0.b(r11, r12)
            if (r9 == 0) goto L91
            r9 = r2[r8]
            int r9 = r9 + r5
            r2[r8] = r9
            int r11 = r11 + 1
            goto L80
        L91:
            r12 = r2[r8]
            if (r12 != 0) goto L96
            return r6
        L96:
            r0 = r2[r7]
            r1 = r2[r5]
            int r0 = r0 + r1
            r1 = r2[r4]
            int r0 = r0 + r1
            r1 = r2[r3]
            int r0 = r0 + r1
            int r0 = r0 + r12
            int r0 = r0 - r13
            int r12 = java.lang.Math.abs(r0)
            float r12 = (float) r12
            float r13 = (float) r13
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            float r13 = r13 * r0
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 < 0) goto Lb3
            return r6
        Lb3:
            boolean r12 = b(r2)
            if (r12 == 0) goto Lbe
            float r11 = a(r2, r11)
            return r11
        Lbe:
            return r6
    }

    protected static boolean c(int[] r9) {
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            r3 = 5
            if (r1 >= r3) goto Lf
            r3 = r9[r1]
            if (r3 != 0) goto Lb
            return r0
        Lb:
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L3
        Lf:
            if (r2 >= r3) goto L12
            return r0
        L12:
            float r1 = (float) r2
            r2 = 1084227584(0x40a00000, float:5.0)
            float r1 = r1 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r1 / r2
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            float r4 = r1 * r3
            r5 = r9[r0]
            float r5 = (float) r5
            float r5 = r4 - r5
            float r5 = java.lang.Math.abs(r5)
            float r3 = r3 * r2
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 >= 0) goto L6b
            r5 = 1067030938(0x3f99999a, float:1.2)
            float r6 = r1 * r5
            r7 = 1
            r8 = r9[r7]
            float r8 = (float) r8
            float r8 = r6 - r8
            float r8 = java.lang.Math.abs(r8)
            float r5 = r5 * r2
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 >= 0) goto L6b
            r8 = 2
            r8 = r9[r8]
            float r8 = (float) r8
            float r1 = r1 - r8
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L6b
            r1 = 3
            r1 = r9[r1]
            float r1 = (float) r1
            float r6 = r6 - r1
            float r1 = java.lang.Math.abs(r6)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L6b
            r1 = 4
            r9 = r9[r1]
            float r9 = (float) r9
            float r4 = r4 - r9
            float r9 = java.lang.Math.abs(r4)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 >= 0) goto L6b
            return r7
        L6b:
            return r0
    }

    private float d(int r11, int r12, int r13) {
            r10 = this;
            com.huawei.hms.scankit.p.s r0 = r10.a
            int r1 = r0.c()
            int[] r2 = r10.a()
            r3 = r11
        Lb:
            r4 = 2
            r5 = 1
            if (r3 < 0) goto L1d
            boolean r6 = r0.b(r12, r3)
            if (r6 == 0) goto L1d
            r6 = r2[r4]
            int r6 = r6 + r5
            r2[r4] = r6
            int r3 = r3 + (-1)
            goto Lb
        L1d:
            r6 = 2143289344(0x7fc00000, float:NaN)
            if (r3 >= 0) goto L22
            return r6
        L22:
            if (r3 < 0) goto L32
            boolean r7 = r0.b(r12, r3)
            if (r7 != 0) goto L32
            r7 = r2[r5]
            int r7 = r7 + r5
            r2[r5] = r7
            int r3 = r3 + (-1)
            goto L22
        L32:
            if (r3 < 0) goto Lbe
            r7 = r2[r5]
            if (r7 != 0) goto L3a
            goto Lbe
        L3a:
            r7 = 0
            if (r3 < 0) goto L4b
            boolean r8 = r0.b(r12, r3)
            if (r8 == 0) goto L4b
            r8 = r2[r7]
            int r8 = r8 + r5
            r2[r7] = r8
            int r3 = r3 + (-1)
            goto L3a
        L4b:
            r3 = r2[r7]
            if (r3 != 0) goto L50
            return r6
        L50:
            int r11 = r11 + r5
        L51:
            if (r11 >= r1) goto L61
            boolean r3 = r0.b(r12, r11)
            if (r3 == 0) goto L61
            r3 = r2[r4]
            int r3 = r3 + r5
            r2[r4] = r3
            int r11 = r11 + 1
            goto L51
        L61:
            if (r11 == r1) goto Lbe
            r3 = r2[r4]
            if (r3 != 0) goto L68
            goto Lbe
        L68:
            r3 = 3
            if (r11 >= r1) goto L79
            boolean r8 = r0.b(r12, r11)
            if (r8 != 0) goto L79
            r8 = r2[r3]
            int r8 = r8 + r5
            r2[r3] = r8
            int r11 = r11 + 1
            goto L68
        L79:
            if (r11 == r1) goto Lbe
            r8 = r2[r3]
            if (r8 != 0) goto L80
            goto Lbe
        L80:
            r8 = 4
            if (r11 >= r1) goto L91
            boolean r9 = r0.b(r12, r11)
            if (r9 == 0) goto L91
            r9 = r2[r8]
            int r9 = r9 + r5
            r2[r8] = r9
            int r11 = r11 + 1
            goto L80
        L91:
            r12 = r2[r8]
            if (r12 != 0) goto L96
            return r6
        L96:
            r0 = r2[r7]
            r1 = r2[r5]
            int r0 = r0 + r1
            r1 = r2[r4]
            int r0 = r0 + r1
            r1 = r2[r3]
            int r0 = r0 + r1
            int r0 = r0 + r12
            int r0 = r0 - r13
            int r12 = java.lang.Math.abs(r0)
            float r12 = (float) r12
            float r13 = (float) r13
            r0 = 1053609165(0x3ecccccd, float:0.4)
            float r13 = r13 * r0
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 < 0) goto Lb3
            return r6
        Lb3:
            boolean r12 = b(r2)
            if (r12 == 0) goto Lbe
            float r11 = a(r2, r11)
            return r11
        Lbe:
            return r6
    }

    private void d(int[] r7) {
            r6 = this;
            r0 = 2
            r1 = r7[r0]
            r2 = 0
            r7[r2] = r1
            r1 = 3
            r3 = r7[r1]
            r4 = 1
            r7[r4] = r3
            r3 = 4
            r5 = r7[r3]
            r7[r0] = r5
            r7[r1] = r4
            r7[r3] = r2
            return
    }

    protected final boolean a(int[] r6, int r7, int r8) {
            r5 = this;
            r0 = 0
            r1 = r6[r0]
            r2 = 1
            r3 = r6[r2]
            int r1 = r1 + r3
            r3 = 2
            r3 = r6[r3]
            int r1 = r1 + r3
            r3 = 3
            r3 = r6[r3]
            int r1 = r1 + r3
            r3 = 4
            r3 = r6[r3]
            int r1 = r1 + r3
            float r6 = a(r6, r8)
            int r6 = (int) r6
            float r7 = r5.d(r7, r6, r1)
            boolean r8 = java.lang.Float.isNaN(r7)
            if (r8 != 0) goto L73
            int r8 = (int) r7
            float r6 = r5.c(r6, r8, r1)
            boolean r3 = java.lang.Float.isNaN(r6)
            if (r3 != 0) goto L73
            int r3 = (int) r6
            boolean r4 = r5.a(r8, r3, r1)
            if (r4 == 0) goto L73
            boolean r8 = r5.b(r8, r3, r1)
            if (r8 == 0) goto L73
            float r8 = (float) r1
            r1 = 1084227584(0x40a00000, float:5.0)
            float r8 = r8 / r1
        L3e:
            java.util.List<com.huawei.hms.scankit.p.f3> r1 = r5.b
            int r1 = r1.size()
            if (r0 >= r1) goto L61
            java.util.List<com.huawei.hms.scankit.p.f3> r1 = r5.b
            java.lang.Object r1 = r1.get(r0)
            com.huawei.hms.scankit.p.f3 r1 = (com.huawei.hms.scankit.p.f3) r1
            boolean r3 = r1.b(r8, r7, r6)
            if (r3 == 0) goto L5e
            java.util.List<com.huawei.hms.scankit.p.f3> r3 = r5.b
            com.huawei.hms.scankit.p.f3 r6 = r1.c(r7, r6, r8)
            r3.set(r0, r6)
            goto L72
        L5e:
            int r0 = r0 + 1
            goto L3e
        L61:
            com.huawei.hms.scankit.p.f3 r0 = new com.huawei.hms.scankit.p.f3
            r0.<init>(r6, r7, r8)
            java.util.List<com.huawei.hms.scankit.p.f3> r6 = r5.b
            r6.add(r0)
            com.huawei.hms.scankit.p.v6 r6 = r5.d
            if (r6 == 0) goto L72
            r6.a(r0)
        L72:
            return r2
        L73:
            return r0
    }

    final com.huawei.hms.scankit.p.f3[] a(java.util.Map<com.huawei.hms.scankit.p.l1, ?> r9) throws com.huawei.hms.scankit.p.a {
            r8 = this;
            com.huawei.hms.scankit.p.s r9 = r8.a
            int r9 = r9.c()
            com.huawei.hms.scankit.p.s r0 = r8.a
            int r0 = r0.e()
            r1 = 5
            int[] r1 = new int[r1]
            r2 = 1
            r3 = 1
        L11:
            if (r3 >= r9) goto L6d
            r8.a(r1)
            r4 = 0
            r5 = 0
            r6 = 0
        L19:
            if (r5 >= r0) goto L61
            com.huawei.hms.scankit.p.s r7 = r8.a
            boolean r7 = r7.b(r5, r3)
            if (r7 == 0) goto L2f
            r7 = r6 & 1
            if (r7 != r2) goto L29
            int r6 = r6 + 1
        L29:
            r7 = r1[r6]
            int r7 = r7 + r2
            r1[r6] = r7
            goto L5e
        L2f:
            r7 = r6 & 1
            if (r7 != 0) goto L59
            r7 = 4
            if (r6 != r7) goto L51
            boolean r6 = b(r1)
            r7 = 3
            if (r6 == 0) goto L4d
            boolean r6 = r8.a(r1, r3, r5)
            if (r6 != 0) goto L48
            r8.d(r1)
        L46:
            r6 = 3
            goto L5e
        L48:
            r8.a(r1)
            r6 = 0
            goto L5e
        L4d:
            r8.d(r1)
            goto L46
        L51:
            int r6 = r6 + 1
            r7 = r1[r6]
            int r7 = r7 + r2
            r1[r6] = r7
            goto L5e
        L59:
            r7 = r1[r6]
            int r7 = r7 + r2
            r1[r6] = r7
        L5e:
            int r5 = r5 + 1
            goto L19
        L61:
            boolean r4 = b(r1)
            if (r4 == 0) goto L6a
            r8.a(r1, r3, r0)
        L6a:
            int r3 = r3 + 2
            goto L11
        L6d:
            com.huawei.hms.scankit.p.f3[] r9 = r8.b()
            return r9
    }
}
