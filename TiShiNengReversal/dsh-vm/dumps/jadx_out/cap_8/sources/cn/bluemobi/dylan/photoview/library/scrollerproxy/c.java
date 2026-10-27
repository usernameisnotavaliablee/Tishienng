package cn.bluemobi.dylan.photoview.library.scrollerproxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c extends cn.bluemobi.dylan.photoview.library.scrollerproxy.d {
    private final android.widget.Scroller a;

    public c(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.widget.Scroller r0 = new android.widget.Scroller
            r0.<init>(r2)
            r1.a = r0
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.scrollerproxy.d
    public boolean a() {
            r1 = this;
            android.widget.Scroller r0 = r1.a
            boolean r0 = r0.computeScrollOffset()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.scrollerproxy.d
    public void b(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0 = this;
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            android.widget.Scroller r1 = r0.a
            r1.fling(r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.scrollerproxy.d
    public void c(boolean r2) {
            r1 = this;
            android.widget.Scroller r0 = r1.a
            r0.forceFinished(r2)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.scrollerproxy.d
    public int d() {
            r1 = this;
            android.widget.Scroller r0 = r1.a
            int r0 = r0.getCurrX()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.scrollerproxy.d
    public int e() {
            r1 = this;
            android.widget.Scroller r0 = r1.a
            int r0 = r0.getCurrY()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.scrollerproxy.d
    public boolean g() {
            r1 = this;
            android.widget.Scroller r0 = r1.a
            boolean r0 = r0.isFinished()
            return r0
    }
}
