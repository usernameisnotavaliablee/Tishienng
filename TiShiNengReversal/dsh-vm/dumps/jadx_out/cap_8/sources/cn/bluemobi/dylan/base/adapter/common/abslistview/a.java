package cn.bluemobi.dylan.base.adapter.common.abslistview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class a<T> extends android.widget.BaseAdapter {
    protected android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    protected java.util.List<T> f47b;

    /* renamed from: c, reason: collision with root package name */
    protected android.view.LayoutInflater f48c;

    /* renamed from: d, reason: collision with root package name */
    private int f49d;

    public a(android.content.Context r1, int r2, java.util.List<T> r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r0.f48c = r1
            r0.f47b = r3
            r0.f49d = r2
            return
    }

    public abstract void a(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, T r2);

    public java.util.List<T> b() {
            r1 = this;
            java.util.List<T> r0 = r1.f47b
            return r0
    }

    public void c(java.util.List<T> r1) {
            r0 = this;
            r0.f47b = r1
            r0.notifyDataSetChanged()
            return
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            java.util.List<T> r0 = r1.f47b
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.size()
            return r0
    }

    @Override // android.widget.Adapter
    public T getItem(int r2) {
            r1 = this;
            java.util.List<T> r0 = r1.f47b
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            android.content.Context r0 = r2.a
            int r1 = r2.f49d
            cn.bluemobi.dylan.base.adapter.common.ViewHolder r4 = cn.bluemobi.dylan.base.adapter.common.ViewHolder.a(r0, r4, r5, r1)
            r4.v(r3)
            java.lang.Object r3 = r2.getItem(r3)
            r2.a(r4, r3)
            android.view.View r3 = r4.b()
            return r3
    }
}
