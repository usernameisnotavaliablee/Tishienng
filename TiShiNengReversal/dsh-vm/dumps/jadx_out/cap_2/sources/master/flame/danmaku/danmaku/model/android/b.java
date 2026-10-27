package master.flame.danmaku.danmaku.model.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class b {
    protected master.flame.danmaku.danmaku.model.android.b.a a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class a {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void a(master.flame.danmaku.danmaku.model.d r1, boolean r2);

        public abstract void b(master.flame.danmaku.danmaku.model.d r1);
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public void a(master.flame.danmaku.danmaku.model.d r1) {
            r0 = this;
            return
    }

    public abstract void b();

    public boolean c(master.flame.danmaku.danmaku.model.d r1, android.graphics.Canvas r2, float r3, float r4, android.graphics.Paint r5, android.text.TextPaint r6) {
            r0 = this;
            master.flame.danmaku.danmaku.model.o r1 = r1.e()
            if (r1 == 0) goto L13
            java.lang.Object r1 = r1.get()
            master.flame.danmaku.danmaku.model.android.g r1 = (master.flame.danmaku.danmaku.model.android.g) r1
            if (r1 == 0) goto L13
            boolean r1 = r1.b(r2, r3, r4, r5)
            return r1
        L13:
            r1 = 0
            return r1
    }

    public abstract void d(master.flame.danmaku.danmaku.model.d r1, android.graphics.Canvas r2, float r3, float r4, boolean r5, master.flame.danmaku.danmaku.model.android.a.C0124a r6);

    public abstract void e(master.flame.danmaku.danmaku.model.d r1, android.text.TextPaint r2, boolean r3);

    public void f(master.flame.danmaku.danmaku.model.d r2, boolean r3) {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.b$a r0 = r1.a
            if (r0 == 0) goto L7
            r0.a(r2, r3)
        L7:
            return
    }

    public void g(master.flame.danmaku.danmaku.model.d r2) {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.b$a r0 = r1.a
            if (r0 == 0) goto L7
            r0.b(r2)
        L7:
            return
    }

    public void h(master.flame.danmaku.danmaku.model.android.b.a r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
