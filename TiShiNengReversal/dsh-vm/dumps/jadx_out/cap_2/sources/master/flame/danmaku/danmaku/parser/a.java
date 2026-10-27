package master.flame.danmaku.danmaku.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class a {
    protected master.flame.danmaku.danmaku.parser.b<?> a;
    protected master.flame.danmaku.danmaku.model.f b;
    protected int c;
    protected int d;
    protected float e;
    protected float f;
    private master.flame.danmaku.danmaku.model.m g;
    protected master.flame.danmaku.danmaku.model.n h;
    protected master.flame.danmaku.danmaku.model.android.DanmakuContext i;
    protected master.flame.danmaku.danmaku.parser.a.InterfaceC0125a j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: master.flame.danmaku.danmaku.parser.a$a, reason: collision with other inner class name */
    public interface InterfaceC0125a {
        void b(master.flame.danmaku.danmaku.model.d r1);
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public master.flame.danmaku.danmaku.model.m a() {
            r1 = this;
            master.flame.danmaku.danmaku.model.m r0 = r1.g
            if (r0 == 0) goto L5
            return r0
        L5:
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r1.i
            master.flame.danmaku.danmaku.model.android.d r0 = r0.D
            r0.k()
            master.flame.danmaku.danmaku.model.m r0 = r1.f()
            r1.g = r0
            r1.h()
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r1.i
            master.flame.danmaku.danmaku.model.android.d r0 = r0.D
            r0.m()
            master.flame.danmaku.danmaku.model.m r0 = r1.g
            return r0
    }

    public master.flame.danmaku.danmaku.model.n b() {
            r1 = this;
            master.flame.danmaku.danmaku.model.n r0 = r1.h
            return r0
    }

    public master.flame.danmaku.danmaku.model.f c() {
            r1 = this;
            master.flame.danmaku.danmaku.model.f r0 = r1.b
            return r0
    }

    protected float d() {
            r2 = this;
            float r0 = r2.e
            r1 = 1058642330(0x3f19999a, float:0.6)
            float r0 = r0 - r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r0
            return r1
    }

    public master.flame.danmaku.danmaku.parser.a e(master.flame.danmaku.danmaku.parser.b<?> r1) {
            r0 = this;
            r0.a = r1
            return r0
    }

    protected abstract master.flame.danmaku.danmaku.model.m f();

    public void g() {
            r0 = this;
            r0.h()
            return
    }

    protected void h() {
            r1 = this;
            master.flame.danmaku.danmaku.parser.b<?> r0 = r1.a
            if (r0 == 0) goto L7
            r0.release()
        L7:
            r0 = 0
            r1.a = r0
            return
    }

    public master.flame.danmaku.danmaku.parser.a i(master.flame.danmaku.danmaku.model.android.DanmakuContext r2) {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r1.i
            if (r0 == 0) goto L9
            if (r0 == r2) goto L9
            r0 = 0
            r1.g = r0
        L9:
            r1.i = r2
            return r1
    }

    public master.flame.danmaku.danmaku.parser.a j(master.flame.danmaku.danmaku.model.n r4) {
            r3 = this;
            r3.h = r4
            int r0 = r4.getWidth()
            r3.c = r0
            int r0 = r4.getHeight()
            r3.d = r0
            float r0 = r4.getDensity()
            r3.e = r0
            float r4 = r4.d()
            r3.f = r4
            master.flame.danmaku.danmaku.model.android.DanmakuContext r4 = r3.i
            master.flame.danmaku.danmaku.model.android.d r4 = r4.D
            int r0 = r3.c
            float r0 = (float) r0
            int r1 = r3.d
            float r1 = (float) r1
            float r2 = r3.d()
            r4.p(r0, r1, r2)
            master.flame.danmaku.danmaku.model.android.DanmakuContext r4 = r3.i
            master.flame.danmaku.danmaku.model.android.d r4 = r4.D
            r4.m()
            return r3
    }

    public master.flame.danmaku.danmaku.parser.a k(master.flame.danmaku.danmaku.parser.a.InterfaceC0125a r1) {
            r0 = this;
            r0.j = r1
            return r0
    }

    public master.flame.danmaku.danmaku.parser.a l(master.flame.danmaku.danmaku.model.f r1) {
            r0 = this;
            r0.b = r1
            return r0
    }
}
