package cn.bluemobi.dylan.base.adapter.common.recyclerview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class MultiItemCommonAdapter<T> extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<T> {

    /* renamed from: k, reason: collision with root package name */
    protected cn.bluemobi.dylan.base.adapter.common.recyclerview.a<T> f69k;

    public MultiItemCommonAdapter(android.content.Context r2, java.util.List<T> r3, cn.bluemobi.dylan.base.adapter.common.recyclerview.a<T> r4) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0, r3)
            r1.f69k = r4
            if (r4 == 0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "the mMultiItemTypeSupport can not be null."
            r2.<init>(r3)
            throw r2
    }

    public int getItemViewType(int r3) {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.a<T> r0 = r2.f69k
            if (r0 == 0) goto Lf
            java.util.List<T> r1 = r2.f53g
            java.lang.Object r1 = r1.get(r3)
            int r3 = r0.a(r3, r1)
            return r3
        Lf:
            int r3 = super.getItemViewType(r3)
            return r3
    }

    @Override // cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter
    public cn.bluemobi.dylan.base.adapter.common.ViewHolder i(android.view.ViewGroup r4, int r5) {
            r3 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.a<T> r0 = r3.f69k
            if (r0 != 0) goto L9
            cn.bluemobi.dylan.base.adapter.common.ViewHolder r4 = super.i(r4, r5)
            return r4
        L9:
            int r0 = r0.b(r5)
            android.content.Context r1 = r3.f51e
            r2 = 0
            cn.bluemobi.dylan.base.adapter.common.ViewHolder r0 = cn.bluemobi.dylan.base.adapter.common.ViewHolder.a(r1, r2, r4, r0)
            r3.j(r4, r0, r5)
            return r0
    }

    @Override // cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
            r0 = this;
            cn.bluemobi.dylan.base.adapter.common.ViewHolder r1 = r0.i(r1, r2)
            return r1
    }
}
