package cn.bluemobi.dylan.base.adapter.common.recyclerview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class EmptyRecyclerView extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: f, reason: collision with root package name */
    android.view.View f66f;

    /* renamed from: g, reason: collision with root package name */
    final androidx.recyclerview.widget.RecyclerView.AdapterDataObserver f67g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView f68b;

        a(cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1) {
                r0 = this;
                r0.f68b = r1
                r0.<init>()
                return
        }

        public void onChanged() {
                r1 = this;
                super.onChanged()
                cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r1.f68b
                r0.a()
                return
        }
    }

    public EmptyRecyclerView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView$a r1 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView$a
            r1.<init>(r0)
            r0.f67g = r1
            return
    }

    public EmptyRecyclerView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView$a r1 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView$a
            r1.<init>(r0)
            r0.f67g = r1
            return
    }

    public EmptyRecyclerView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView$a r1 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView$a
            r1.<init>(r0)
            r0.f67g = r1
            return
    }

    void a() {
            r2 = this;
            android.view.View r0 = r2.f66f
            if (r0 == 0) goto L15
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r2.getAdapter()
            int r1 = r1.getItemCount()
            if (r1 <= 0) goto L11
            r1 = 8
            goto L12
        L11:
            r1 = 0
        L12:
            r0.setVisibility(r1)
        L15:
            return
    }

    public void setAdapter(androidx.recyclerview.widget.RecyclerView.Adapter r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r2.getAdapter()
            if (r0 == 0) goto Lb
            androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r1 = r2.f67g
            r0.unregisterAdapterDataObserver(r1)
        Lb:
            super.setAdapter(r3)
            if (r3 == 0) goto L15
            androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r0 = r2.f67g
            r3.registerAdapterDataObserver(r0)
        L15:
            return
    }

    public void setEmptyView(android.view.View r1) {
            r0 = this;
            r0.f66f = r1
            r0.a()
            return
    }

    public void swapAdapter(androidx.recyclerview.widget.RecyclerView.Adapter r3, boolean r4) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r2.getAdapter()
            if (r0 == 0) goto Lb
            androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r1 = r2.f67g
            r0.unregisterAdapterDataObserver(r1)
        Lb:
            if (r3 == 0) goto L12
            androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r0 = r2.f67g
            r3.registerAdapterDataObserver(r0)
        L12:
            super.swapAdapter(r3, r4)
            r2.a()
            return
    }
}
