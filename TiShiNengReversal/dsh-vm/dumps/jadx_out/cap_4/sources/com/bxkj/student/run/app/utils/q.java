package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class q {
    private final long a;
    private final long b;
    private final int c;
    private int d;
    private long e;
    private final float f;
    private java.util.ArrayList<com.bxkj.student.run.app.utils.q.a> g;
    private android.graphics.PathMeasure h;
    private android.graphics.Path i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a {
        private android.graphics.Path a;
        private android.graphics.Shader b;
        private float c;
        private int d;
        private android.graphics.Point e;
        private int f;
        final /* synthetic */ com.bxkj.student.run.app.utils.q g;

        public a(com.bxkj.student.run.app.utils.q r1, android.graphics.Path r2, float r3, android.graphics.Shader r4) {
                r0 = this;
                r0.g = r1
                r0.<init>()
                r0.a = r2
                r0.c = r3
                r0.b = r4
                return
        }

        public int a() {
                r1 = this;
                int r0 = r1.f
                return r0
        }

        public android.graphics.Point b() {
                r1 = this;
                android.graphics.Point r0 = r1.e
                return r0
        }

        public int c() {
                r1 = this;
                int r0 = r1.d
                return r0
        }

        public android.graphics.Path d() {
                r1 = this;
                android.graphics.Path r0 = r1.a
                return r0
        }

        public float e() {
                r1 = this;
                float r0 = r1.c
                return r0
        }

        public android.graphics.Shader f() {
                r1 = this;
                android.graphics.Shader r0 = r1.b
                return r0
        }

        public void g(int r1) {
                r0 = this;
                r0.f = r1
                return
        }

        public void h(android.graphics.Point r1) {
                r0 = this;
                r0.e = r1
                return
        }

        public void i(int r1) {
                r0 = this;
                r0.d = r1
                return
        }
    }

    public q() {
            r3 = this;
            r3.<init>()
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.a = r0
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.b = r0
            r2 = 1080(0x438, float:1.513E-42)
            r3.c = r2
            r3.e = r0
            r0 = 1157234688(0x44fa0000, float:2000.0)
            r3.f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.g = r0
            com.bxkj.base.BaseApp r0 = com.bxkj.base.BaseApp.c()
            int r0 = com.bxkj.student.run.app.utils.r.e(r0)
            r3.d = r0
            return
    }

    private void b(float r5) {
            r4 = this;
            int r0 = r4.d
            float r0 = (float) r0
            r1 = 1157234688(0x44fa0000, float:2000.0)
            float r0 = r0 * r1
            r2 = 1149698048(0x44870000, float:1080.0)
            float r0 = r0 / r2
            float r5 = r5 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L12
            return
        L12:
            float r5 = r5 * r1
            long r0 = (long) r5
            r2 = 5000(0x1388, double:2.4703E-320)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L1f
            r4.g(r2)
            return
        L1f:
            r4.g(r0)
            return
    }

    public void a(android.graphics.Point r12, android.graphics.Point r13, int r14, int r15) {
            r11 = this;
            android.graphics.Path r0 = r11.i
            if (r0 != 0) goto L1f
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r11.i = r0
            int r1 = r12.x
            float r1 = (float) r1
            int r2 = r12.y
            float r2 = (float) r2
            r0.moveTo(r1, r2)
            android.graphics.Path r0 = r11.i
            int r1 = r13.x
            float r1 = (float) r1
            int r2 = r13.y
            float r2 = (float) r2
            r0.lineTo(r1, r2)
        L1f:
            android.graphics.Path r0 = r11.i
            int r1 = r13.x
            float r1 = (float) r1
            int r2 = r13.y
            float r2 = (float) r2
            r0.lineTo(r1, r2)
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            int r1 = r12.x
            float r1 = (float) r1
            int r2 = r12.y
            float r2 = (float) r2
            r0.moveTo(r1, r2)
            int r1 = r13.x
            float r1 = (float) r1
            int r2 = r13.y
            float r2 = (float) r2
            r0.lineTo(r1, r2)
            android.graphics.PathMeasure r1 = new android.graphics.PathMeasure
            r2 = 0
            r1.<init>(r0, r2)
            r11.h = r1
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            int r1 = r12.x
            float r4 = (float) r1
            int r12 = r12.y
            float r5 = (float) r12
            int r12 = r13.x
            float r6 = (float) r12
            int r12 = r13.y
            float r7 = (float) r12
            int[] r8 = new int[]{r14, r15}
            r9 = 0
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.CLAMP
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.bxkj.student.run.app.utils.q$a r12 = new com.bxkj.student.run.app.utils.q$a
            android.graphics.PathMeasure r14 = r11.h
            float r14 = r14.getLength()
            r12.<init>(r11, r0, r14, r3)
            r12.h(r13)
            r12.g(r15)
            java.util.ArrayList<com.bxkj.student.run.app.utils.q$a> r13 = r11.g
            r13.add(r12)
            java.util.ArrayList<com.bxkj.student.run.app.utils.q$a> r13 = r11.g
            int r13 = r13.size()
            int r13 = r13 + (-1)
            r12.i(r13)
            return
    }

    public long c() {
            r2 = this;
            long r0 = r2.e
            return r0
    }

    public float d() {
            r4 = this;
            java.util.ArrayList<com.bxkj.student.run.app.utils.q$a> r0 = r4.g
            r1 = 0
            if (r0 == 0) goto L1c
            int r0 = r0.size()
            r2 = 0
        La:
            if (r2 >= r0) goto L1c
            java.util.ArrayList<com.bxkj.student.run.app.utils.q$a> r3 = r4.g
            java.lang.Object r3 = r3.get(r2)
            com.bxkj.student.run.app.utils.q$a r3 = (com.bxkj.student.run.app.utils.q.a) r3
            float r3 = r3.e()
            float r1 = r1 + r3
            int r2 = r2 + 1
            goto La
        L1c:
            r4.b(r1)
            return r1
    }

    public java.util.ArrayList<com.bxkj.student.run.app.utils.q.a> e() {
            r1 = this;
            java.util.ArrayList<com.bxkj.student.run.app.utils.q$a> r0 = r1.g
            return r0
    }

    public android.graphics.Path f() {
            r1 = this;
            android.graphics.Path r0 = r1.i
            return r0
    }

    public void g(long r1) {
            r0 = this;
            r0.e = r1
            return
    }
}
