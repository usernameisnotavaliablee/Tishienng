package com.bxkj.base.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class V2PubRecyclerviewWithEmptyViewBinding extends androidx.databinding.ViewDataBinding {

    @androidx.annotation.NonNull
    public final cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView recyclerView;

    @androidx.annotation.NonNull
    public final com.scwang.smartrefresh.layout.SmartRefreshLayout refresh;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvEmptyView;

    protected V2PubRecyclerviewWithEmptyViewBinding(java.lang.Object r1, android.view.View r2, int r3, cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r4, com.scwang.smartrefresh.layout.SmartRefreshLayout r5, android.widget.TextView r6) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.recyclerView = r4
            r0.refresh = r5
            r0.tvEmptyView = r6
            return
    }

    public static com.bxkj.base.databinding.V2PubRecyclerviewWithEmptyViewBinding bind(@androidx.annotation.NonNull android.view.View r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.base.databinding.V2PubRecyclerviewWithEmptyViewBinding r1 = bind(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static com.bxkj.base.databinding.V2PubRecyclerviewWithEmptyViewBinding bind(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.Object r2) {
            int r0 = com.bxkj.base.R.layout.v2_pub_recyclerview_with_empty_view
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.bind(r2, r1, r0)
            com.bxkj.base.databinding.V2PubRecyclerviewWithEmptyViewBinding r1 = (com.bxkj.base.databinding.V2PubRecyclerviewWithEmptyViewBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.base.databinding.V2PubRecyclerviewWithEmptyViewBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.base.databinding.V2PubRecyclerviewWithEmptyViewBinding r1 = inflate(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.base.databinding.V2PubRecyclerviewWithEmptyViewBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.base.databinding.V2PubRecyclerviewWithEmptyViewBinding r1 = inflate(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.base.databinding.V2PubRecyclerviewWithEmptyViewBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3, @androidx.annotation.Nullable java.lang.Object r4) {
            int r0 = com.bxkj.base.R.layout.v2_pub_recyclerview_with_empty_view
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.inflateInternal(r1, r0, r2, r3, r4)
            com.bxkj.base.databinding.V2PubRecyclerviewWithEmptyViewBinding r1 = (com.bxkj.base.databinding.V2PubRecyclerviewWithEmptyViewBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.base.databinding.V2PubRecyclerviewWithEmptyViewBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r3, @androidx.annotation.Nullable java.lang.Object r4) {
            int r0 = com.bxkj.base.R.layout.v2_pub_recyclerview_with_empty_view
            r1 = 0
            r2 = 0
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.inflateInternal(r3, r0, r1, r2, r4)
            com.bxkj.base.databinding.V2PubRecyclerviewWithEmptyViewBinding r3 = (com.bxkj.base.databinding.V2PubRecyclerviewWithEmptyViewBinding) r3
            return r3
    }
}
