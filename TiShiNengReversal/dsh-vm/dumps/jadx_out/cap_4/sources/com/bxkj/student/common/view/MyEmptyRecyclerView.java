package com.bxkj.student.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MyEmptyRecyclerView extends androidx.recyclerview.widget.RecyclerView {
    private android.view.View mEmptyView;
    private androidx.recyclerview.widget.RecyclerView.AdapterDataObserver mObserver;


    public MyEmptyRecyclerView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            com.bxkj.student.common.view.MyEmptyRecyclerView$1 r1 = new com.bxkj.student.common.view.MyEmptyRecyclerView$1
            r1.<init>(r0)
            r0.mObserver = r1
            return
    }

    static /* bridge */ /* synthetic */ android.view.View a(com.bxkj.student.common.view.MyEmptyRecyclerView r0) {
            android.view.View r0 = r0.mEmptyView
            return r0
    }

    public void setAdapter(androidx.recyclerview.widget.RecyclerView.Adapter r2) {
            r1 = this;
            super.setAdapter(r2)
            androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r0 = r1.mObserver
            r2.registerAdapterDataObserver(r0)
            androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r2 = r1.mObserver
            r2.onChanged()
            return
    }

    public void setEmptyView(android.view.View r1) {
            r0 = this;
            r0.mEmptyView = r1
            return
    }
}
