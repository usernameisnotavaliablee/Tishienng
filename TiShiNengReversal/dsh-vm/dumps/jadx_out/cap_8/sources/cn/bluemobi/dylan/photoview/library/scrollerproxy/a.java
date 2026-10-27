package cn.bluemobi.dylan.photoview.library.scrollerproxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(9)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends cn.bluemobi.dylan.photoview.library.scrollerproxy.d {
    protected final android.widget.OverScroller a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f192b;

    public a(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f192b = r0
            android.widget.OverScroller r0 = new android.widget.OverScroller
            r0.<init>(r2)
            r1.a = r0
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.scrollerproxy.d
    public boolean a() {
            r1 = this;
            boolean r0 = r1.f192b
            if (r0 == 0) goto Lc
            android.widget.OverScroller r0 = r1.a
            r0.computeScrollOffset()
            r0 = 0
            r1.f192b = r0
        Lc:
            android.widget.OverScroller r0 = r1.a
            boolean r0 = r0.computeScrollOffset()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.scrollerproxy.d
    public void b(int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21) {
            r11 = this;
            android.widget.OverScroller r0 = r11.a
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r0.fling(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.scrollerproxy.d
    public void c(boolean r2) {
            r1 = this;
            android.widget.OverScroller r0 = r1.a
            r0.forceFinished(r2)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.scrollerproxy.d
    public int d() {
            r1 = this;
            android.widget.OverScroller r0 = r1.a
            int r0 = r0.getCurrX()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.scrollerproxy.d
    public int e() {
            r1 = this;
            android.widget.OverScroller r0 = r1.a
            int r0 = r0.getCurrY()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.scrollerproxy.d
    public boolean g() {
            r1 = this;
            android.widget.OverScroller r0 = r1.a
            boolean r0 = r0.isFinished()
            return r0
    }
}
