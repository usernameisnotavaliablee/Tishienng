package cn.bluemobi.dylan.photoview.library.scrollerproxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(14)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b extends cn.bluemobi.dylan.photoview.library.scrollerproxy.a {
    public b(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.scrollerproxy.a, cn.bluemobi.dylan.photoview.library.scrollerproxy.d
    public boolean a() {
            r1 = this;
            android.widget.OverScroller r0 = r1.a
            boolean r0 = r0.computeScrollOffset()
            return r0
    }
}
