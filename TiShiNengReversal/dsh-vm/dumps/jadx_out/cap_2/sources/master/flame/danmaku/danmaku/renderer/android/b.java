package master.flame.danmaku.danmaku.renderer.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class b {
    private master.flame.danmaku.danmaku.renderer.android.b.e a;
    private master.flame.danmaku.danmaku.renderer.android.b.e b;
    private master.flame.danmaku.danmaku.renderer.android.b.e c;
    private master.flame.danmaku.danmaku.renderer.android.b.e d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: master.flame.danmaku.danmaku.renderer.android.b$b, reason: collision with other inner class name */
    private static class C0127b extends master.flame.danmaku.danmaku.renderer.android.b.d {
        protected master.flame.danmaku.danmaku.renderer.android.b.C0127b.a d;
        protected master.flame.danmaku.danmaku.model.android.e e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: master.flame.danmaku.danmaku.renderer.android.b$b$a */
        protected class a extends master.flame.danmaku.danmaku.model.m.b<master.flame.danmaku.danmaku.model.d, master.flame.danmaku.danmaku.renderer.android.b.f> {
            public master.flame.danmaku.danmaku.model.n e;
            int f;
            public master.flame.danmaku.danmaku.model.d g;
            public master.flame.danmaku.danmaku.model.d h;
            public master.flame.danmaku.danmaku.model.d i;
            boolean j;
            float k;
            final /* synthetic */ master.flame.danmaku.danmaku.renderer.android.b.C0127b l;

            protected a(master.flame.danmaku.danmaku.renderer.android.b.C0127b r2) {
                    r1 = this;
                    r1.l = r2
                    r1.<init>()
                    r2 = 0
                    r1.f = r2
                    r0 = 0
                    r1.g = r0
                    r1.h = r0
                    r1.i = r0
                    r1.j = r2
                    return
            }

            @Override // master.flame.danmaku.danmaku.model.m.b
            public /* bridge */ /* synthetic */ int a(master.flame.danmaku.danmaku.model.d r1) {
                    r0 = this;
                    master.flame.danmaku.danmaku.model.d r1 = (master.flame.danmaku.danmaku.model.d) r1
                    int r1 = r0.e(r1)
                    return r1
            }

            @Override // master.flame.danmaku.danmaku.model.m.b
            public void c() {
                    r2 = this;
                    r0 = 0
                    r2.f = r0
                    r1 = 0
                    r2.h = r1
                    r2.g = r1
                    r2.j = r0
                    return
            }

            @Override // master.flame.danmaku.danmaku.model.m.b
            public /* bridge */ /* synthetic */ master.flame.danmaku.danmaku.renderer.android.b.f d() {
                    r1 = this;
                    master.flame.danmaku.danmaku.renderer.android.b$f r0 = r1.f()
                    return r0
            }

            public int e(master.flame.danmaku.danmaku.model.d r12) {
                    r11 = this;
                    master.flame.danmaku.danmaku.renderer.android.b$b r0 = r11.l
                    boolean r0 = r0.b
                    r1 = 1
                    if (r0 == 0) goto L8
                    return r1
                L8:
                    int r0 = r11.f
                    int r0 = r0 + r1
                    r11.f = r0
                    master.flame.danmaku.danmaku.model.d r0 = r11.i
                    r2 = 0
                    r3 = 0
                    if (r12 != r0) goto L18
                    r11.g = r3
                    r11.j = r2
                    return r1
                L18:
                    master.flame.danmaku.danmaku.model.d r0 = r11.h
                    if (r0 != 0) goto L2e
                    r11.h = r12
                    float r0 = r12.d()
                    master.flame.danmaku.danmaku.model.n r4 = r11.e
                    int r4 = r4.getHeight()
                    float r4 = (float) r4
                    int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                    if (r0 == 0) goto L2e
                    return r1
                L2e:
                    float r0 = r11.k
                    master.flame.danmaku.danmaku.model.n r4 = r11.e
                    int r4 = r4.k()
                    float r4 = (float) r4
                    int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                    if (r0 >= 0) goto L3e
                    r11.g = r3
                    return r1
                L3e:
                    master.flame.danmaku.danmaku.model.n r4 = r11.e
                    master.flame.danmaku.danmaku.model.d r6 = r11.i
                    long r7 = r6.f()
                    master.flame.danmaku.danmaku.model.d r0 = r11.i
                    master.flame.danmaku.danmaku.model.f r0 = r0.k()
                    long r9 = r0.a
                    r5 = r12
                    boolean r12 = v4.a.i(r4, r5, r6, r7, r9)
                    r11.j = r12
                    if (r12 != 0) goto L5a
                    r11.g = r5
                    return r1
                L5a:
                    float r12 = r5.l()
                    master.flame.danmaku.danmaku.model.n r0 = r11.e
                    int r0 = r0.h()
                    float r0 = (float) r0
                    float r12 = r12 - r0
                    master.flame.danmaku.danmaku.model.d r0 = r11.i
                    float r0 = r0.q
                    float r12 = r12 - r0
                    r11.k = r12
                    return r2
            }

            public master.flame.danmaku.danmaku.renderer.android.b.f f() {
                    r2 = this;
                    master.flame.danmaku.danmaku.renderer.android.b$f r0 = new master.flame.danmaku.danmaku.renderer.android.b$f
                    r1 = 0
                    r0.<init>(r1)
                    int r1 = r2.f
                    r0.a = r1
                    master.flame.danmaku.danmaku.model.d r1 = r2.h
                    r0.c = r1
                    master.flame.danmaku.danmaku.model.d r1 = r2.g
                    r0.f = r1
                    boolean r1 = r2.j
                    r0.i = r1
                    return r0
            }
        }

        private C0127b() {
                r2 = this;
                r0 = 0
                r2.<init>(r0)
                master.flame.danmaku.danmaku.renderer.android.b$b$a r0 = new master.flame.danmaku.danmaku.renderer.android.b$b$a
                r0.<init>(r2)
                r2.d = r0
                master.flame.danmaku.danmaku.model.android.e r0 = new master.flame.danmaku.danmaku.model.android.e
                r1 = 2
                r0.<init>(r1)
                r2.e = r0
                return
        }

        /* synthetic */ C0127b(master.flame.danmaku.danmaku.renderer.android.b.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // master.flame.danmaku.danmaku.renderer.android.b.c, master.flame.danmaku.danmaku.renderer.android.b.e
        public void a(master.flame.danmaku.danmaku.model.d r15, master.flame.danmaku.danmaku.model.n r16, master.flame.danmaku.danmaku.renderer.android.b.g r17) {
                r14 = this;
                r3 = r16
                r7 = r17
                boolean r0 = r15.s()
                if (r0 == 0) goto Lc
                goto Lc4
            Lc:
                boolean r0 = r15.v()
                if (r0 == 0) goto L17
                float r1 = r15.l()
                goto L19
            L17:
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            L19:
                r8 = 1
                r9 = 0
                if (r0 != 0) goto L27
                master.flame.danmaku.danmaku.model.android.e r4 = r14.e
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto L27
                r4 = 1
                goto L28
            L27:
                r4 = 0
            L28:
                int r5 = r3.k()
                float r5 = (float) r5
                int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r5 >= 0) goto L39
                int r1 = r3.getHeight()
                float r1 = (float) r1
                float r5 = r15.q
                float r1 = r1 - r5
            L39:
                r5 = 0
                if (r0 != 0) goto La1
                r14.b = r9
                master.flame.danmaku.danmaku.renderer.android.b$b$a r6 = r14.d
                r6.k = r1
                r6.e = r3
                r6.i = r15
                master.flame.danmaku.danmaku.model.android.e r1 = r14.e
                r1.a(r6)
                master.flame.danmaku.danmaku.renderer.android.b$b$a r1 = r14.d
                master.flame.danmaku.danmaku.renderer.android.b$f r1 = r1.f()
                master.flame.danmaku.danmaku.renderer.android.b$b$a r6 = r14.d
                float r6 = r6.k
                if (r1 == 0) goto L66
                int r0 = r1.a
                master.flame.danmaku.danmaku.model.d r5 = r1.c
                master.flame.danmaku.danmaku.model.d r4 = r1.f
                boolean r10 = r1.h
                boolean r1 = r1.i
                r12 = r1
                r13 = r4
                r11 = r10
                r10 = r0
                goto L6a
            L66:
                r11 = r0
                r12 = r4
                r13 = r5
                r10 = 0
            L6a:
                r1 = 0
                r4 = r6
                r6 = 0
                r0 = r14
                r2 = r15
                boolean r1 = r0.b(r1, r2, r3, r4, r5, r6)
                r6 = r3
                if (r1 == 0) goto L84
                int r0 = r6.getHeight()
                float r0 = (float) r0
                float r4 = r15.q
                float r0 = r0 - r4
                r9 = r1
                r5 = r13
                r4 = 1
                r1 = r0
            L82:
                r0 = r11
                goto La3
            L84:
                int r0 = r6.k()
                float r0 = (float) r0
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 < 0) goto L8f
                r8 = 0
                goto L90
            L8f:
                r8 = r12
            L90:
                if (r13 == 0) goto L9a
                int r0 = r10 + (-1)
                r9 = r1
                r1 = r4
                r4 = r8
                r5 = r13
                r8 = r0
                goto L82
            L9a:
                r9 = r1
                r1 = r4
                r4 = r8
                r8 = r10
                r0 = r11
                r5 = r13
                goto La3
            La1:
                r6 = r3
                r8 = 0
            La3:
                if (r7 == 0) goto Lac
                boolean r4 = r7.a(r15, r1, r8, r4)
                if (r4 == 0) goto Lac
                goto Lc4
            Lac:
                if (r9 == 0) goto Lb1
                r14.clear()
            Lb1:
                float r4 = r15.g()
                r15.y(r6, r4, r1)
                if (r0 != 0) goto Lc4
                master.flame.danmaku.danmaku.model.android.e r0 = r14.e
                r0.e(r5)
                master.flame.danmaku.danmaku.model.android.e r0 = r14.e
                r0.j(r15)
            Lc4:
                return
        }

        @Override // master.flame.danmaku.danmaku.renderer.android.b.d, master.flame.danmaku.danmaku.renderer.android.b.c
        protected boolean b(boolean r1, master.flame.danmaku.danmaku.model.d r2, master.flame.danmaku.danmaku.model.n r3, float r4, master.flame.danmaku.danmaku.model.d r5, master.flame.danmaku.danmaku.model.d r6) {
                r0 = this;
                int r1 = r3.k()
                float r1 = (float) r1
                int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r1 < 0) goto L1b
                if (r5 == 0) goto L19
                float r1 = r5.d()
                int r2 = r3.getHeight()
                float r2 = (float) r2
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 == 0) goto L19
                goto L1b
            L19:
                r1 = 0
                return r1
            L1b:
                r1 = 1
                return r1
        }

        @Override // master.flame.danmaku.danmaku.renderer.android.b.c, master.flame.danmaku.danmaku.renderer.android.b.e
        public void clear() {
                r1 = this;
                r0 = 1
                r1.b = r0
                master.flame.danmaku.danmaku.model.android.e r0 = r1.e
                r0.clear()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c implements master.flame.danmaku.danmaku.renderer.android.b.e {
        protected master.flame.danmaku.danmaku.model.android.e a;
        protected boolean b;
        protected master.flame.danmaku.danmaku.renderer.android.b.c.a c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        protected class a extends master.flame.danmaku.danmaku.model.m.b<master.flame.danmaku.danmaku.model.d, master.flame.danmaku.danmaku.renderer.android.b.f> {
            public master.flame.danmaku.danmaku.model.n e;
            int f;
            public master.flame.danmaku.danmaku.model.d g;
            public master.flame.danmaku.danmaku.model.d h;
            public master.flame.danmaku.danmaku.model.d i;
            public master.flame.danmaku.danmaku.model.d j;
            public master.flame.danmaku.danmaku.model.d k;
            boolean l;
            boolean m;
            boolean n;
            final /* synthetic */ master.flame.danmaku.danmaku.renderer.android.b.c o;

            protected a(master.flame.danmaku.danmaku.renderer.android.b.c r2) {
                    r1 = this;
                    r1.o = r2
                    r1.<init>()
                    r2 = 0
                    r1.f = r2
                    r0 = 0
                    r1.g = r0
                    r1.h = r0
                    r1.i = r0
                    r1.j = r0
                    r1.k = r0
                    r1.l = r2
                    r1.m = r2
                    r1.n = r2
                    return
            }

            @Override // master.flame.danmaku.danmaku.model.m.b
            public /* bridge */ /* synthetic */ int a(master.flame.danmaku.danmaku.model.d r1) {
                    r0 = this;
                    master.flame.danmaku.danmaku.model.d r1 = (master.flame.danmaku.danmaku.model.d) r1
                    int r1 = r0.e(r1)
                    return r1
            }

            @Override // master.flame.danmaku.danmaku.model.m.b
            public void c() {
                    r2 = this;
                    r0 = 0
                    r2.f = r0
                    r1 = 0
                    r2.j = r1
                    r2.i = r1
                    r2.h = r1
                    r2.g = r1
                    r2.n = r0
                    r2.m = r0
                    r2.l = r0
                    return
            }

            @Override // master.flame.danmaku.danmaku.model.m.b
            public /* bridge */ /* synthetic */ master.flame.danmaku.danmaku.renderer.android.b.f d() {
                    r1 = this;
                    master.flame.danmaku.danmaku.renderer.android.b$f r0 = r1.f()
                    return r0
            }

            public int e(master.flame.danmaku.danmaku.model.d r11) {
                    r10 = this;
                    master.flame.danmaku.danmaku.renderer.android.b$c r0 = r10.o
                    boolean r0 = r0.b
                    r1 = 1
                    if (r0 == 0) goto L8
                    return r1
                L8:
                    int r0 = r10.f
                    int r0 = r0 + r1
                    r10.f = r0
                    master.flame.danmaku.danmaku.model.d r0 = r10.k
                    r2 = 0
                    if (r11 != r0) goto L1c
                    r10.g = r11
                    r11 = 0
                    r10.i = r11
                    r10.m = r1
                    r10.n = r2
                    return r1
                L1c:
                    master.flame.danmaku.danmaku.model.d r3 = r10.h
                    if (r3 != 0) goto L22
                    r10.h = r11
                L22:
                    float r0 = r0.q
                    float r3 = r11.l()
                    float r0 = r0 + r3
                    master.flame.danmaku.danmaku.model.n r3 = r10.e
                    int r3 = r3.getHeight()
                    float r3 = (float) r3
                    int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                    if (r0 <= 0) goto L37
                    r10.l = r1
                    return r1
                L37:
                    master.flame.danmaku.danmaku.model.d r0 = r10.j
                    if (r0 != 0) goto L3e
                    r10.j = r11
                    goto L4c
                L3e:
                    float r0 = r0.i()
                    float r3 = r11.i()
                    int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                    if (r0 < 0) goto L4c
                    r10.j = r11
                L4c:
                    master.flame.danmaku.danmaku.model.n r3 = r10.e
                    master.flame.danmaku.danmaku.model.d r5 = r10.k
                    long r6 = r5.f()
                    master.flame.danmaku.danmaku.model.d r0 = r10.k
                    master.flame.danmaku.danmaku.model.f r0 = r0.k()
                    long r8 = r0.a
                    r4 = r11
                    boolean r11 = v4.a.i(r3, r4, r5, r6, r8)
                    r10.n = r11
                    if (r11 != 0) goto L68
                    r10.g = r4
                    return r1
                L68:
                    r10.i = r4
                    return r2
            }

            public master.flame.danmaku.danmaku.renderer.android.b.f f() {
                    r2 = this;
                    master.flame.danmaku.danmaku.renderer.android.b$f r0 = new master.flame.danmaku.danmaku.renderer.android.b$f
                    r1 = 0
                    r0.<init>(r1)
                    int r1 = r2.f
                    r0.a = r1
                    master.flame.danmaku.danmaku.model.d r1 = r2.h
                    r0.c = r1
                    master.flame.danmaku.danmaku.model.d r1 = r2.g
                    r0.b = r1
                    master.flame.danmaku.danmaku.model.d r1 = r2.i
                    r0.d = r1
                    master.flame.danmaku.danmaku.model.d r1 = r2.j
                    r0.e = r1
                    boolean r1 = r2.l
                    r0.g = r1
                    boolean r1 = r2.m
                    r0.h = r1
                    boolean r1 = r2.n
                    r0.i = r1
                    return r0
            }
        }

        private c() {
                r2 = this;
                r2.<init>()
                master.flame.danmaku.danmaku.model.android.e r0 = new master.flame.danmaku.danmaku.model.android.e
                r1 = 1
                r0.<init>(r1)
                r2.a = r0
                r0 = 0
                r2.b = r0
                master.flame.danmaku.danmaku.renderer.android.b$c$a r0 = new master.flame.danmaku.danmaku.renderer.android.b$c$a
                r0.<init>(r2)
                r2.c = r0
                return
        }

        /* synthetic */ c(master.flame.danmaku.danmaku.renderer.android.b.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // master.flame.danmaku.danmaku.renderer.android.b.e
        public void a(master.flame.danmaku.danmaku.model.d r19, master.flame.danmaku.danmaku.model.n r20, master.flame.danmaku.danmaku.renderer.android.b.g r21) {
                r18 = this;
                r0 = r18
                r2 = r19
                r3 = r20
                r7 = r21
                boolean r1 = r2.s()
                if (r1 == 0) goto L10
                goto L109
            L10:
                int r1 = r3.k()
                float r1 = (float) r1
                boolean r4 = r2.v()
                r8 = 1
                r9 = 0
                if (r4 != 0) goto L27
                master.flame.danmaku.danmaku.model.android.e r5 = r0.a
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto L27
                r5 = 1
                goto L28
            L27:
                r5 = 0
            L28:
                int r6 = r3.h()
                r10 = 0
                if (r4 != 0) goto Le7
                r0.b = r9
                master.flame.danmaku.danmaku.renderer.android.b$c$a r1 = r0.c
                r1.e = r3
                r1.k = r2
                master.flame.danmaku.danmaku.model.android.e r11 = r0.a
                r11.a(r1)
                master.flame.danmaku.danmaku.renderer.android.b$c$a r1 = r0.c
                master.flame.danmaku.danmaku.renderer.android.b$f r1 = r1.f()
                if (r1 == 0) goto L5e
                int r4 = r1.a
                master.flame.danmaku.danmaku.model.d r5 = r1.b
                master.flame.danmaku.danmaku.model.d r11 = r1.c
                master.flame.danmaku.danmaku.model.d r12 = r1.d
                master.flame.danmaku.danmaku.model.d r13 = r1.e
                boolean r14 = r1.g
                boolean r15 = r1.h
                boolean r1 = r1.i
                r17 = r11
                r11 = r4
                r4 = r15
                r15 = r14
                r14 = r13
                r13 = r12
                r12 = r17
                goto L65
            L5e:
                r1 = r5
                r5 = r10
                r12 = r5
                r13 = r12
                r14 = r13
                r11 = 0
                r15 = 0
            L65:
                if (r5 == 0) goto L87
                if (r13 == 0) goto L70
                float r14 = r13.d()
                float r6 = (float) r6
                float r14 = r14 + r6
                goto L74
            L70:
                float r14 = r5.l()
            L74:
                if (r5 == r2) goto L7d
                r10 = r1
                r16 = r5
            L79:
                r4 = r14
                r1 = 1
                r14 = 0
                goto Lb7
            L7d:
                r16 = r14
                r14 = r4
                r4 = r16
                r16 = r10
                r10 = r1
                r1 = 1
                goto Lb7
            L87:
                if (r15 == 0) goto L96
                if (r14 == 0) goto L96
                float r14 = r14.l()
                r16 = r10
                r4 = r14
                r14 = 0
                r10 = r1
                r1 = 0
                goto Lb7
            L96:
                if (r13 == 0) goto La7
                float r1 = r13.d()
                float r5 = (float) r6
                float r14 = r1 + r5
                r1 = r14
                r14 = r4
                r4 = r1
                r16 = r10
                r1 = 1
                r10 = 0
                goto Lb7
            La7:
                if (r12 == 0) goto Lb1
                float r14 = r12.l()
                r10 = r1
                r16 = r12
                goto L79
            Lb1:
                int r5 = r3.k()
                float r14 = (float) r5
                goto L7d
            Lb7:
                if (r1 == 0) goto Lc1
                r5 = r12
                r6 = r13
                r1 = r15
                boolean r1 = r0.b(r1, r2, r3, r4, r5, r6)
                goto Lc2
            Lc1:
                r1 = 0
            Lc2:
                if (r1 == 0) goto Lcb
                int r4 = r3.k()
                float r4 = (float) r4
                r10 = 1
                goto Ld1
            Lcb:
                if (r16 == 0) goto Ld0
                int r8 = r11 + (-1)
                goto Ld1
            Ld0:
                r8 = r11
            Ld1:
                int r5 = r3.k()
                float r5 = (float) r5
                int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                r6 = r1
                r1 = r4
                r9 = r8
                if (r5 != 0) goto Le2
                r5 = r10
                r10 = r16
                r4 = 0
                goto Le8
            Le2:
                r5 = r10
                r4 = r14
                r10 = r16
                goto Le8
            Le7:
                r6 = 0
            Le8:
                if (r7 == 0) goto Lf1
                boolean r5 = r7.a(r2, r1, r9, r5)
                if (r5 == 0) goto Lf1
                goto L109
            Lf1:
                if (r6 == 0) goto Lf6
                r0.clear()
            Lf6:
                float r5 = r2.g()
                r2.y(r3, r5, r1)
                if (r4 != 0) goto L109
                master.flame.danmaku.danmaku.model.android.e r1 = r0.a
                r1.e(r10)
                master.flame.danmaku.danmaku.model.android.e r1 = r0.a
                r1.j(r2)
            L109:
                return
        }

        protected boolean b(boolean r1, master.flame.danmaku.danmaku.model.d r2, master.flame.danmaku.danmaku.model.n r3, float r4, master.flame.danmaku.danmaku.model.d r5, master.flame.danmaku.danmaku.model.d r6) {
                r0 = this;
                int r1 = r3.k()
                float r1 = (float) r1
                int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r1 < 0) goto L23
                if (r5 == 0) goto L14
                float r1 = r5.l()
                r5 = 0
                int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r1 > 0) goto L23
            L14:
                float r1 = r2.q
                float r4 = r4 + r1
                int r1 = r3.getHeight()
                float r1 = (float) r1
                int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r1 <= 0) goto L21
                goto L23
            L21:
                r1 = 0
                return r1
            L23:
                r1 = 1
                return r1
        }

        @Override // master.flame.danmaku.danmaku.renderer.android.b.e
        public void clear() {
                r1 = this;
                r0 = 1
                r1.b = r0
                master.flame.danmaku.danmaku.model.android.e r0 = r1.a
                r0.clear()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class d extends master.flame.danmaku.danmaku.renderer.android.b.c {
        private d() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ d(master.flame.danmaku.danmaku.renderer.android.b.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // master.flame.danmaku.danmaku.renderer.android.b.c
        protected boolean b(boolean r1, master.flame.danmaku.danmaku.model.d r2, master.flame.danmaku.danmaku.model.n r3, float r4, master.flame.danmaku.danmaku.model.d r5, master.flame.danmaku.danmaku.model.d r6) {
                r0 = this;
                float r1 = r2.q
                float r4 = r4 + r1
                int r1 = r3.getHeight()
                float r1 = (float) r1
                int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r1 <= 0) goto Le
                r1 = 1
                return r1
            Le:
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface e {
        void a(master.flame.danmaku.danmaku.model.d r1, master.flame.danmaku.danmaku.model.n r2, master.flame.danmaku.danmaku.renderer.android.b.g r3);

        void clear();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class f {
        public int a;
        public master.flame.danmaku.danmaku.model.d b;
        public master.flame.danmaku.danmaku.model.d c;
        public master.flame.danmaku.danmaku.model.d d;
        public master.flame.danmaku.danmaku.model.d e;
        public master.flame.danmaku.danmaku.model.d f;
        public boolean g;
        public boolean h;
        public boolean i;

        private f() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.a = r0
                r1 = 0
                r2.b = r1
                r2.c = r1
                r2.d = r1
                r2.e = r1
                r2.f = r1
                r2.g = r0
                r2.h = r0
                r2.i = r0
                return
        }

        /* synthetic */ f(master.flame.danmaku.danmaku.renderer.android.b.a r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface g {
        boolean a(master.flame.danmaku.danmaku.model.d r1, float r2, int r3, boolean r4);
    }

    public b(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.b = r0
            r1.c = r0
            r1.d = r0
            r1.a(r2)
            return
    }

    public void a(boolean r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            master.flame.danmaku.danmaku.renderer.android.b$b r1 = new master.flame.danmaku.danmaku.renderer.android.b$b
            r1.<init>(r0)
            goto Le
        L9:
            master.flame.danmaku.danmaku.renderer.android.b$c r1 = new master.flame.danmaku.danmaku.renderer.android.b$c
            r1.<init>(r0)
        Le:
            r2.a = r1
            if (r3 == 0) goto L18
            master.flame.danmaku.danmaku.renderer.android.b$b r3 = new master.flame.danmaku.danmaku.renderer.android.b$b
            r3.<init>(r0)
            goto L1d
        L18:
            master.flame.danmaku.danmaku.renderer.android.b$c r3 = new master.flame.danmaku.danmaku.renderer.android.b$c
            r3.<init>(r0)
        L1d:
            r2.b = r3
            master.flame.danmaku.danmaku.renderer.android.b$e r3 = r2.c
            if (r3 != 0) goto L2a
            master.flame.danmaku.danmaku.renderer.android.b$d r3 = new master.flame.danmaku.danmaku.renderer.android.b$d
            r3.<init>(r0)
            r2.c = r3
        L2a:
            master.flame.danmaku.danmaku.renderer.android.b$e r3 = r2.d
            if (r3 != 0) goto L35
            master.flame.danmaku.danmaku.renderer.android.b$b r3 = new master.flame.danmaku.danmaku.renderer.android.b$b
            r3.<init>(r0)
            r2.d = r3
        L35:
            return
    }

    public void b() {
            r1 = this;
            master.flame.danmaku.danmaku.renderer.android.b$e r0 = r1.a
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            master.flame.danmaku.danmaku.renderer.android.b$e r0 = r1.b
            if (r0 == 0) goto Le
            r0.clear()
        Le:
            master.flame.danmaku.danmaku.renderer.android.b$e r0 = r1.c
            if (r0 == 0) goto L15
            r0.clear()
        L15:
            master.flame.danmaku.danmaku.renderer.android.b$e r0 = r1.d
            if (r0 == 0) goto L1c
            r0.clear()
        L1c:
            return
    }

    public void c(master.flame.danmaku.danmaku.model.d r3, master.flame.danmaku.danmaku.model.n r4, master.flame.danmaku.danmaku.renderer.android.b.g r5) {
            r2 = this;
            int r0 = r3.getType()
            r1 = 1
            if (r0 == r1) goto L2b
            r1 = 4
            if (r0 == r1) goto L25
            r1 = 5
            if (r0 == r1) goto L1f
            r1 = 6
            if (r0 == r1) goto L19
            r5 = 7
            if (r0 == r5) goto L14
            return
        L14:
            r5 = 0
            r3.y(r4, r5, r5)
            return
        L19:
            master.flame.danmaku.danmaku.renderer.android.b$e r0 = r2.b
            r0.a(r3, r4, r5)
            return
        L1f:
            master.flame.danmaku.danmaku.renderer.android.b$e r0 = r2.c
            r0.a(r3, r4, r5)
            return
        L25:
            master.flame.danmaku.danmaku.renderer.android.b$e r0 = r2.d
            r0.a(r3, r4, r5)
            return
        L2b:
            master.flame.danmaku.danmaku.renderer.android.b$e r0 = r2.a
            r0.a(r3, r4, r5)
            return
    }

    public void d() {
            r0 = this;
            r0.b()
            return
    }
}
