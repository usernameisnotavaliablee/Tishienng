package cn.bluemobi.dylan.base.adapter.common.abslistview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class b<T> extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<T> {

    /* renamed from: e, reason: collision with root package name */
    protected cn.bluemobi.dylan.base.adapter.common.abslistview.c<T> f50e;

    public b(android.content.Context r2, java.util.List<T> r3, cn.bluemobi.dylan.base.adapter.common.abslistview.c<T> r4) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0, r3)
            r1.f50e = r4
            if (r4 == 0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "the mMultiItemTypeSupport can not be null."
            r2.<init>(r3)
            throw r2
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int r3) {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.abslistview.c<T> r0 = r2.f50e
            if (r0 == 0) goto Lf
            java.util.List<T> r1 = r2.f47b
            java.lang.Object r1 = r1.get(r3)
            int r3 = r0.a(r3, r1)
            return r3
        Lf:
            int r3 = super.getItemViewType(r3)
            return r3
    }

    @Override // cn.bluemobi.dylan.base.adapter.common.abslistview.a, android.widget.Adapter
    public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.abslistview.c<T> r0 = r2.f50e
            if (r0 != 0) goto L9
            android.view.View r3 = super.getView(r3, r4, r5)
            return r3
        L9:
            java.lang.Object r1 = r2.getItem(r3)
            int r0 = r0.b(r3, r1)
            android.content.Context r1 = r2.a
            cn.bluemobi.dylan.base.adapter.common.ViewHolder r4 = cn.bluemobi.dylan.base.adapter.common.ViewHolder.a(r1, r4, r5, r0)
            r4.v(r3)
            java.lang.Object r3 = r2.getItem(r3)
            r2.a(r4, r3)
            android.view.View r3 = r4.b()
            return r3
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
            r1 = this;
            cn.bluemobi.dylan.base.adapter.common.abslistview.c<T> r0 = r1.f50e
            if (r0 == 0) goto L9
            int r0 = r0.getViewTypeCount()
            return r0
        L9:
            int r0 = super.getViewTypeCount()
            return r0
    }
}
