package cn.bluemobi.dylan.base.adapter.common.recyclerview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class CommonAdapter<T> extends androidx.recyclerview.widget.RecyclerView.Adapter<cn.bluemobi.dylan.base.adapter.common.ViewHolder> {

    /* renamed from: e, reason: collision with root package name */
    protected android.content.Context f51e;

    /* renamed from: f, reason: collision with root package name */
    protected int f52f;

    /* renamed from: g, reason: collision with root package name */
    protected java.util.List<T> f53g;

    /* renamed from: h, reason: collision with root package name */
    protected android.view.LayoutInflater f54h;

    /* renamed from: i, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.b f55i;

    /* renamed from: j, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.c f56j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnClickListener {
        final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.ViewHolder a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.ViewGroup f57b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter f58c;

        a(cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1, cn.bluemobi.dylan.base.adapter.common.ViewHolder r2, android.view.ViewGroup r3) {
                r0 = this;
                r0.f58c = r1
                r0.a = r2
                r0.f57b = r3
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r5) {
                r4 = this;
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = r4.f58c
                cn.bluemobi.dylan.base.adapter.common.recyclerview.b r0 = cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter.a(r0)
                if (r0 == 0) goto L32
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = r4.f58c
                cn.bluemobi.dylan.base.adapter.common.ViewHolder r1 = r4.a
                int r0 = r0.e(r1)
                r1 = -1
                if (r0 == r1) goto L32
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = r4.f58c
                java.util.List<T> r1 = r1.f53g
                if (r1 == 0) goto L32
                int r1 = r1.size()
                if (r0 >= r1) goto L32
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = r4.f58c
                cn.bluemobi.dylan.base.adapter.common.recyclerview.b r1 = cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter.a(r1)
                android.view.ViewGroup r2 = r4.f57b
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = r4.f58c
                java.util.List<T> r3 = r3.f53g
                java.lang.Object r3 = r3.get(r0)
                r1.a(r2, r5, r3, r0)
            L32:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.view.View.OnLongClickListener {
        final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.ViewHolder a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.ViewGroup f59b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter f60c;

        b(cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1, cn.bluemobi.dylan.base.adapter.common.ViewHolder r2, android.view.ViewGroup r3) {
                r0 = this;
                r0.f60c = r1
                r0.a = r2
                r0.f59b = r3
                r0.<init>()
                return
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(android.view.View r5) {
                r4 = this;
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = r4.f60c
                cn.bluemobi.dylan.base.adapter.common.recyclerview.c r0 = cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter.b(r0)
                if (r0 == 0) goto L34
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = r4.f60c
                cn.bluemobi.dylan.base.adapter.common.ViewHolder r1 = r4.a
                int r0 = r0.e(r1)
                r1 = -1
                if (r0 == r1) goto L34
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = r4.f60c
                java.util.List<T> r1 = r1.f53g
                if (r1 == 0) goto L34
                int r1 = r1.size()
                if (r0 >= r1) goto L34
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = r4.f60c
                cn.bluemobi.dylan.base.adapter.common.recyclerview.c r1 = cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter.b(r1)
                android.view.ViewGroup r2 = r4.f59b
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = r4.f60c
                java.util.List<T> r3 = r3.f53g
                java.lang.Object r3 = r3.get(r0)
                boolean r5 = r1.a(r2, r5, r3, r0)
                return r5
            L34:
                r5 = 0
                return r5
        }
    }

    public CommonAdapter(android.content.Context r1, int r2, java.util.List<T> r3) {
            r0 = this;
            r0.<init>()
            r0.f51e = r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r0.f54h = r1
            r0.f52f = r2
            r0.f53g = r3
            return
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.b a(cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.b r0 = r0.f55i
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.c b(cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.c r0 = r0.f56j
            return r0
    }

    public abstract void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, T r2);

    public java.util.List<T> d() {
            r1 = this;
            java.util.List<T> r0 = r1.f53g
            return r0
    }

    protected int e(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            int r1 = r1.getAdapterPosition()
            return r1
    }

    protected boolean f(int r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    public void g(java.util.List<T> r1) {
            r0 = this;
            r0.f53g = r1
            r0.notifyDataSetChanged()
            return
    }

    public T getItem(int r2) {
            r1 = this;
            java.util.List<T> r0 = r1.f53g
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public int getItemCount() {
            r1 = this;
            java.util.List<T> r0 = r1.f53g
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.size()
            return r0
    }

    public void h(cn.bluemobi.dylan.base.adapter.common.ViewHolder r2, int r3) {
            r1 = this;
            r2.v(r3)
            java.util.List<T> r0 = r1.f53g
            java.lang.Object r3 = r0.get(r3)
            r1.c(r2, r3)
            return
    }

    public cn.bluemobi.dylan.base.adapter.common.ViewHolder i(android.view.ViewGroup r4, int r5) {
            r3 = this;
            android.content.Context r0 = r3.f51e
            r1 = 0
            int r2 = r3.f52f
            cn.bluemobi.dylan.base.adapter.common.ViewHolder r0 = cn.bluemobi.dylan.base.adapter.common.ViewHolder.a(r0, r1, r4, r2)
            r3.j(r4, r0, r5)
            return r0
    }

    protected void j(android.view.ViewGroup r2, cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, int r4) {
            r1 = this;
            boolean r4 = r1.f(r4)
            if (r4 != 0) goto L7
            return
        L7:
            android.view.View r4 = r3.b()
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter$a r0 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter$a
            r0.<init>(r1, r3, r2)
            r4.setOnClickListener(r0)
            android.view.View r4 = r3.b()
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter$b r0 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter$b
            r0.<init>(r1, r3, r2)
            r4.setOnLongClickListener(r0)
            return
    }

    public void k(cn.bluemobi.dylan.base.adapter.common.recyclerview.b r1) {
            r0 = this;
            r0.f55i = r1
            return
    }

    public void l(cn.bluemobi.dylan.base.adapter.common.recyclerview.c r1) {
            r0 = this;
            r0.f56j = r1
            return
    }

    public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            cn.bluemobi.dylan.base.adapter.common.ViewHolder r1 = (cn.bluemobi.dylan.base.adapter.common.ViewHolder) r1
            r0.h(r1, r2)
            return
    }

    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
            r0 = this;
            cn.bluemobi.dylan.base.adapter.common.ViewHolder r1 = r0.i(r1, r2)
            return r1
    }
}
