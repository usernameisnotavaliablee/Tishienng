package cn.bluemobi.dylan.base.adapter.common.recyclerview.support;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class SectionAdapter<T> extends cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<T> {
    private static final int p = 0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.support.a l;
    private java.util.LinkedHashMap<java.lang.String, java.lang.Integer> m;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.a<T> n;
    final androidx.recyclerview.widget.RecyclerView.AdapterDataObserver o;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter f70b;

        a(cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter r1) {
                r0 = this;
                r0.f70b = r1
                r0.<init>()
                return
        }

        public void onChanged() {
                r1 = this;
                super.onChanged()
                cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter r0 = r1.f70b
                r0.p()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements cn.bluemobi.dylan.base.adapter.common.recyclerview.a<T> {
        final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter a;

        b(cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // cn.bluemobi.dylan.base.adapter.common.recyclerview.a
        public int a(int r1, T r2) {
                r0 = this;
                cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter r2 = r0.a
                r2.q(r1)
                cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter r2 = r0.a
                java.util.LinkedHashMap r2 = cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter.o(r2)
                java.util.Collection r2 = r2.values()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r1 = r2.contains(r1)
                r1 = r1 ^ 1
                return r1
        }

        @Override // cn.bluemobi.dylan.base.adapter.common.recyclerview.a
        public int b(int r1) {
                r0 = this;
                if (r1 != 0) goto Ld
                cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter r1 = r0.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.support.a r1 = cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter.m(r1)
                int r1 = r1.c()
                return r1
            Ld:
                cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter r1 = r0.a
                int r1 = cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter.n(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements cn.bluemobi.dylan.base.adapter.common.recyclerview.a<T> {
        final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.a a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter f71b;

        c(cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter r1, cn.bluemobi.dylan.base.adapter.common.recyclerview.a r2) {
                r0 = this;
                r0.f71b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // cn.bluemobi.dylan.base.adapter.common.recyclerview.a
        public int a(int r3, T r4) {
                r2 = this;
                cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter r0 = r2.f71b
                int r0 = r0.q(r3)
                cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter r1 = r2.f71b
                java.util.LinkedHashMap r1 = cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter.o(r1)
                java.util.Collection r1 = r1.values()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                boolean r3 = r1.contains(r3)
                if (r3 == 0) goto L1c
                r3 = 0
                return r3
            L1c:
                cn.bluemobi.dylan.base.adapter.common.recyclerview.a r3 = r2.a
                int r3 = r3.a(r0, r4)
                return r3
        }

        @Override // cn.bluemobi.dylan.base.adapter.common.recyclerview.a
        public int b(int r2) {
                r1 = this;
                if (r2 != 0) goto Ld
                cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter r2 = r1.f71b
                cn.bluemobi.dylan.base.adapter.common.recyclerview.support.a r2 = cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter.m(r2)
                int r2 = r2.c()
                return r2
            Ld:
                cn.bluemobi.dylan.base.adapter.common.recyclerview.a r0 = r1.a
                int r2 = r0.b(r2)
                return r2
        }
    }

    public SectionAdapter(android.content.Context r2, int r3, cn.bluemobi.dylan.base.adapter.common.recyclerview.a r4, java.util.List<T> r5, cn.bluemobi.dylan.base.adapter.common.recyclerview.support.a r6) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r5, r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter$a r2 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter$a
            r2.<init>(r1)
            r1.o = r2
            r1.f52f = r3
            r1.r(r3, r4)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.a<T> r3 = r1.n
            r1.f69k = r3
            r1.l = r6
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r1.m = r3
            r1.p()
            r1.registerAdapterDataObserver(r2)
            return
    }

    public SectionAdapter(android.content.Context r7, int r8, java.util.List<T> r9, cn.bluemobi.dylan.base.adapter.common.recyclerview.support.a r10) {
            r6 = this;
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public SectionAdapter(android.content.Context r7, cn.bluemobi.dylan.base.adapter.common.recyclerview.a r8, java.util.List<T> r9, cn.bluemobi.dylan.base.adapter.common.recyclerview.support.a r10) {
            r6 = this;
            r2 = -1
            r0 = r6
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.support.a m(cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.support.a r0 = r0.l
            return r0
    }

    static /* synthetic */ int n(cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter r0) {
            int r0 = r0.f52f
            return r0
    }

    static /* synthetic */ java.util.LinkedHashMap o(cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter r0) {
            java.util.LinkedHashMap<java.lang.String, java.lang.Integer> r0 = r0.m
            return r0
    }

    private void r(int r2, cn.bluemobi.dylan.base.adapter.common.recyclerview.a r3) {
            r1 = this;
            r0 = -1
            if (r2 == r0) goto Lb
            cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter$b r2 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter$b
            r2.<init>(r1)
            r1.n = r2
            return
        Lb:
            if (r3 == 0) goto L15
            cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter$c r2 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.support.SectionAdapter$c
            r2.<init>(r1, r3)
            r1.n = r2
            return
        L15:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "layoutId or MultiItemTypeSupport must set one."
            r2.<init>(r3)
            throw r2
    }

    @Override // cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter
    protected int e(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            int r1 = r1.getAdapterPosition()
            int r1 = r0.q(r1)
            return r1
    }

    @Override // cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter
    protected boolean f(int r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r1 = super.f(r1)
            return r1
    }

    @Override // cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter
    public int getItemCount() {
            r2 = this;
            int r0 = super.getItemCount()
            java.util.LinkedHashMap<java.lang.String, java.lang.Integer> r1 = r2.m
            int r1 = r1.size()
            int r0 = r0 + r1
            return r0
    }

    @Override // cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter
    public int getItemViewType(int r3) {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.a<T> r0 = r2.f69k
            r1 = 0
            int r3 = r0.a(r3, r1)
            return r3
    }

    @Override // cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter
    public void h(cn.bluemobi.dylan.base.adapter.common.ViewHolder r4, int r5) {
            r3 = this;
            int r5 = r3.q(r5)
            int r0 = r4.getItemViewType()
            if (r0 != 0) goto L20
            cn.bluemobi.dylan.base.adapter.common.recyclerview.support.a r0 = r3.l
            int r0 = r0.b()
            cn.bluemobi.dylan.base.adapter.common.recyclerview.support.a r1 = r3.l
            java.util.List<T> r2 = r3.f53g
            java.lang.Object r5 = r2.get(r5)
            java.lang.String r5 = r1.a(r5)
            r4.J(r0, r5)
            return
        L20:
            super.h(r4, r5)
            return
    }

    @Override // cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            cn.bluemobi.dylan.base.adapter.common.ViewHolder r1 = (cn.bluemobi.dylan.base.adapter.common.ViewHolder) r1
            r0.h(r1, r2)
            return
    }

    public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            super.onDetachedFromRecyclerView(r1)
            androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r1 = r0.o
            r0.unregisterAdapterDataObserver(r1)
            return
    }

    public void p() {
            r6 = this;
            java.util.List<T> r0 = r6.f53g
            int r0 = r0.size()
            java.util.LinkedHashMap<java.lang.String, java.lang.Integer> r1 = r6.m
            r1.clear()
            r1 = 0
            r2 = 0
        Ld:
            if (r1 >= r0) goto L33
            cn.bluemobi.dylan.base.adapter.common.recyclerview.support.a r3 = r6.l
            java.util.List<T> r4 = r6.f53g
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r3 = r3.a(r4)
            java.util.LinkedHashMap<java.lang.String, java.lang.Integer> r4 = r6.m
            boolean r4 = r4.containsKey(r3)
            if (r4 != 0) goto L30
            java.util.LinkedHashMap<java.lang.String, java.lang.Integer> r4 = r6.m
            int r5 = r1 + r2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.put(r3, r5)
            int r2 = r2 + 1
        L30:
            int r1 = r1 + 1
            goto Ld
        L33:
            return
    }

    public int q(int r4) {
            r3 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.Integer> r0 = r3.m
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 >= r4) goto Lb
            int r1 = r1 + 1
            goto Lb
        L26:
            int r4 = r4 - r1
            return r4
    }
}
