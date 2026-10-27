package master.flame.danmaku.danmaku.renderer.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class a extends u4.b {
    private master.flame.danmaku.danmaku.model.f d;
    private final master.flame.danmaku.danmaku.model.android.DanmakuContext e;
    private master.flame.danmaku.danmaku.renderer.android.b.g f;
    private final master.flame.danmaku.danmaku.renderer.android.b.g g;
    private final master.flame.danmaku.danmaku.renderer.android.b h;
    private master.flame.danmaku.danmaku.model.k i;
    private u4.a.b j;
    private master.flame.danmaku.danmaku.renderer.android.a.b k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: master.flame.danmaku.danmaku.renderer.android.a$a, reason: collision with other inner class name */
    class C0126a implements master.flame.danmaku.danmaku.renderer.android.b.g {
        final /* synthetic */ master.flame.danmaku.danmaku.renderer.android.a a;

        C0126a(master.flame.danmaku.danmaku.renderer.android.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // master.flame.danmaku.danmaku.renderer.android.b.g
        public boolean a(master.flame.danmaku.danmaku.model.d r9, float r10, int r11, boolean r12) {
                r8 = this;
                byte r10 = r9.o
                r0 = 0
                if (r10 != 0) goto L28
                master.flame.danmaku.danmaku.renderer.android.a r10 = r8.a
                master.flame.danmaku.danmaku.model.android.DanmakuContext r10 = master.flame.danmaku.danmaku.renderer.android.a.h(r10)
                master.flame.danmaku.controller.b r1 = r10.C
                master.flame.danmaku.danmaku.renderer.android.a r10 = r8.a
                master.flame.danmaku.danmaku.model.f r5 = master.flame.danmaku.danmaku.renderer.android.a.m(r10)
                master.flame.danmaku.danmaku.renderer.android.a r10 = r8.a
                master.flame.danmaku.danmaku.model.android.DanmakuContext r7 = master.flame.danmaku.danmaku.renderer.android.a.h(r10)
                r4 = 0
                r2 = r9
                r3 = r11
                r6 = r12
                boolean r9 = r1.c(r2, r3, r4, r5, r6, r7)
                if (r9 == 0) goto L28
                r2.G(r0)
                r9 = 1
                return r9
            L28:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b extends master.flame.danmaku.danmaku.model.m.c<master.flame.danmaku.danmaku.model.d> {
        private master.flame.danmaku.danmaku.model.d e;
        public master.flame.danmaku.danmaku.model.n f;
        public u4.a.c g;
        public long h;
        final /* synthetic */ master.flame.danmaku.danmaku.renderer.android.a i;

        private b(master.flame.danmaku.danmaku.renderer.android.a r1) {
                r0 = this;
                r0.i = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(master.flame.danmaku.danmaku.renderer.android.a r1, master.flame.danmaku.danmaku.renderer.android.a.C0126a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // master.flame.danmaku.danmaku.model.m.b
        public /* bridge */ /* synthetic */ int a(java.lang.Object r1) {
                r0 = this;
                master.flame.danmaku.danmaku.model.d r1 = (master.flame.danmaku.danmaku.model.d) r1
                int r1 = r0.e(r1)
                return r1
        }

        @Override // master.flame.danmaku.danmaku.model.m.b
        public void b() {
                r2 = this;
                u4.a$c r0 = r2.g
                master.flame.danmaku.danmaku.model.d r1 = r2.e
                r0.e = r1
                super.b()
                return
        }

        public int e(master.flame.danmaku.danmaku.model.d r11) {
                r10 = this;
                r10.e = r11
                boolean r0 = r11.w()
                r1 = 2
                r2 = 0
                if (r0 == 0) goto L17
                master.flame.danmaku.danmaku.model.n r0 = r10.f
                r0.g(r11)
                u4.a$c r11 = r10.g
                boolean r11 = r11.a
                if (r11 == 0) goto L16
                return r1
            L16:
                return r2
            L17:
                u4.a$c r0 = r10.g
                boolean r0 = r0.a
                if (r0 != 0) goto L24
                boolean r0 = r11.r()
                if (r0 == 0) goto L24
                return r2
            L24:
                boolean r0 = r11.m()
                if (r0 != 0) goto L46
                master.flame.danmaku.danmaku.renderer.android.a r0 = r10.i
                master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = master.flame.danmaku.danmaku.renderer.android.a.h(r0)
                master.flame.danmaku.controller.b r3 = r0.C
                u4.a$c r0 = r10.g
                int r5 = r0.c
                int r6 = r0.d
                master.flame.danmaku.danmaku.model.f r7 = r0.b
                master.flame.danmaku.danmaku.renderer.android.a r0 = r10.i
                master.flame.danmaku.danmaku.model.android.DanmakuContext r9 = master.flame.danmaku.danmaku.renderer.android.a.h(r0)
                r8 = 0
                r4 = r11
                r3.b(r4, r5, r6, r7, r8, r9)
                goto L47
            L46:
                r4 = r11
            L47:
                long r5 = r4.b()
                long r7 = r10.h
                int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r11 < 0) goto L13a
                byte r11 = r4.o
                if (r11 != 0) goto L5d
                boolean r11 = r4.n()
                if (r11 == 0) goto L5d
                goto L13a
            L5d:
                boolean r11 = r4.p()
                r0 = 1
                if (r11 == 0) goto L82
                master.flame.danmaku.danmaku.model.o r11 = r4.e()
                master.flame.danmaku.danmaku.renderer.android.a r1 = r10.i
                master.flame.danmaku.danmaku.model.k r1 = master.flame.danmaku.danmaku.renderer.android.a.i(r1)
                if (r1 == 0) goto L81
                if (r11 == 0) goto L78
                java.lang.Object r11 = r11.get()
                if (r11 != 0) goto L81
            L78:
                master.flame.danmaku.danmaku.renderer.android.a r11 = r10.i
                master.flame.danmaku.danmaku.model.k r11 = master.flame.danmaku.danmaku.renderer.android.a.i(r11)
                r11.a(r4)
            L81:
                return r0
            L82:
                int r11 = r4.getType()
                if (r11 != r0) goto L8f
                u4.a$c r11 = r10.g
                int r3 = r11.c
                int r3 = r3 + r0
                r11.c = r3
            L8f:
                boolean r11 = r4.q()
                if (r11 != 0) goto L9a
                master.flame.danmaku.danmaku.model.n r11 = r10.f
                r4.z(r11, r2)
            L9a:
                boolean r11 = r4.u()
                if (r11 != 0) goto La5
                master.flame.danmaku.danmaku.model.n r11 = r10.f
                r4.A(r11, r2)
            La5:
                master.flame.danmaku.danmaku.renderer.android.a r11 = r10.i
                master.flame.danmaku.danmaku.renderer.android.b r11 = master.flame.danmaku.danmaku.renderer.android.a.k(r11)
                master.flame.danmaku.danmaku.model.n r3 = r10.f
                master.flame.danmaku.danmaku.renderer.android.a r5 = r10.i
                master.flame.danmaku.danmaku.renderer.android.b$g r5 = master.flame.danmaku.danmaku.renderer.android.a.j(r5)
                r11.c(r4, r3, r5)
                boolean r11 = r4.v()
                if (r11 == 0) goto L13a
                java.lang.String[] r11 = r4.d
                if (r11 != 0) goto Ld0
                float r11 = r4.d()
                master.flame.danmaku.danmaku.model.n r3 = r10.f
                int r3 = r3.getHeight()
                float r3 = (float) r3
                int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r11 <= 0) goto Ld0
                return r2
            Ld0:
                master.flame.danmaku.danmaku.model.n r11 = r10.f
                int r11 = r4.a(r11)
                r5 = 1
                if (r11 != r0) goto Le2
                u4.a$c r11 = r10.g
                long r7 = r11.r
                long r7 = r7 + r5
                r11.r = r7
                goto Lfc
            Le2:
                if (r11 != r1) goto Lfc
                u4.a$c r11 = r10.g
                long r7 = r11.s
                long r7 = r7 + r5
                r11.s = r7
                master.flame.danmaku.danmaku.renderer.android.a r11 = r10.i
                master.flame.danmaku.danmaku.model.k r11 = master.flame.danmaku.danmaku.renderer.android.a.i(r11)
                if (r11 == 0) goto Lfc
                master.flame.danmaku.danmaku.renderer.android.a r11 = r10.i
                master.flame.danmaku.danmaku.model.k r11 = master.flame.danmaku.danmaku.renderer.android.a.i(r11)
                r11.a(r4)
            Lfc:
                u4.a$c r11 = r10.g
                int r1 = r4.getType()
                r11.a(r1, r0)
                u4.a$c r11 = r10.g
                r11.b(r0)
                u4.a$c r11 = r10.g
                r11.c(r4)
                master.flame.danmaku.danmaku.renderer.android.a r11 = r10.i
                u4.a$b r11 = master.flame.danmaku.danmaku.renderer.android.a.l(r11)
                if (r11 == 0) goto L13a
                int r11 = r4.K
                master.flame.danmaku.danmaku.renderer.android.a r0 = r10.i
                master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = master.flame.danmaku.danmaku.renderer.android.a.h(r0)
                master.flame.danmaku.danmaku.model.j r0 = r0.B
                int r0 = r0.d
                if (r11 == r0) goto L13a
                master.flame.danmaku.danmaku.renderer.android.a r11 = r10.i
                master.flame.danmaku.danmaku.model.android.DanmakuContext r11 = master.flame.danmaku.danmaku.renderer.android.a.h(r11)
                master.flame.danmaku.danmaku.model.j r11 = r11.B
                int r11 = r11.d
                r4.K = r11
                master.flame.danmaku.danmaku.renderer.android.a r11 = r10.i
                u4.a$b r11 = master.flame.danmaku.danmaku.renderer.android.a.l(r11)
                r11.a(r4)
            L13a:
                return r2
        }
    }

    public a(master.flame.danmaku.danmaku.model.android.DanmakuContext r3) {
            r2 = this;
            r2.<init>()
            master.flame.danmaku.danmaku.renderer.android.a$a r0 = new master.flame.danmaku.danmaku.renderer.android.a$a
            r0.<init>(r2)
            r2.g = r0
            master.flame.danmaku.danmaku.renderer.android.a$b r0 = new master.flame.danmaku.danmaku.renderer.android.a$b
            r1 = 0
            r0.<init>(r2, r1)
            r2.k = r0
            r2.e = r3
            master.flame.danmaku.danmaku.renderer.android.b r0 = new master.flame.danmaku.danmaku.renderer.android.b
            boolean r3 = r3.o()
            r0.<init>(r3)
            r2.h = r0
            return
    }

    static /* synthetic */ master.flame.danmaku.danmaku.model.android.DanmakuContext h(master.flame.danmaku.danmaku.renderer.android.a r0) {
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r0.e
            return r0
    }

    static /* synthetic */ master.flame.danmaku.danmaku.model.k i(master.flame.danmaku.danmaku.renderer.android.a r0) {
            master.flame.danmaku.danmaku.model.k r0 = r0.i
            return r0
    }

    static /* synthetic */ master.flame.danmaku.danmaku.renderer.android.b.g j(master.flame.danmaku.danmaku.renderer.android.a r0) {
            master.flame.danmaku.danmaku.renderer.android.b$g r0 = r0.f
            return r0
    }

    static /* synthetic */ master.flame.danmaku.danmaku.renderer.android.b k(master.flame.danmaku.danmaku.renderer.android.a r0) {
            master.flame.danmaku.danmaku.renderer.android.b r0 = r0.h
            return r0
    }

    static /* synthetic */ u4.a.b l(master.flame.danmaku.danmaku.renderer.android.a r0) {
            u4.a$b r0 = r0.j
            return r0
    }

    static /* synthetic */ master.flame.danmaku.danmaku.model.f m(master.flame.danmaku.danmaku.renderer.android.a r0) {
            master.flame.danmaku.danmaku.model.f r0 = r0.d
            return r0
    }

    public void a(u4.a.b r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void b(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            master.flame.danmaku.danmaku.renderer.android.b$g r1 = r0.g
            goto L6
        L5:
            r1 = 0
        L6:
            r0.f = r1
            return
    }

    public void c(master.flame.danmaku.danmaku.model.n r2, master.flame.danmaku.danmaku.model.m r3, long r4, u4.a.c r6) {
            r1 = this;
            master.flame.danmaku.danmaku.model.f r0 = r6.b
            r1.d = r0
            master.flame.danmaku.danmaku.renderer.android.a$b r0 = r1.k
            r0.f = r2
            r0.g = r6
            r0.h = r4
            r3.a(r0)
            return
    }

    public void clear() {
            r1 = this;
            r1.f()
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r1.e
            master.flame.danmaku.controller.b r0 = r0.C
            r0.a()
            return
    }

    public void d(boolean r2) {
            r1 = this;
            master.flame.danmaku.danmaku.renderer.android.b r0 = r1.h
            if (r0 == 0) goto L7
            r0.a(r2)
        L7:
            return
    }

    public void e(master.flame.danmaku.danmaku.model.k r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void f() {
            r1 = this;
            master.flame.danmaku.danmaku.renderer.android.b r0 = r1.h
            r0.b()
            return
    }

    public void g() {
            r1 = this;
            r0 = 0
            r1.j = r0
            return
    }

    public void release() {
            r1 = this;
            master.flame.danmaku.danmaku.renderer.android.b r0 = r1.h
            r0.d()
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r1.e
            master.flame.danmaku.controller.b r0 = r0.C
            r0.a()
            return
    }
}
