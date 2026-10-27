package com.bxkj.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class DataBinderMapperImpl extends androidx.databinding.DataBinderMapper {
    private static final int a = 1;
    private static final int b = 2;
    private static final android.util.SparseIntArray c = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        static final android.util.SparseArray<java.lang.String> a = null;

        static {
                android.util.SparseArray r0 = new android.util.SparseArray
                r1 = 4
                r0.<init>(r1)
                com.bxkj.base.DataBinderMapperImpl.a.a = r0
                r1 = 0
                java.lang.String r2 = "_all"
                r0.put(r1, r2)
                r1 = 1
                java.lang.String r2 = "activity"
                r0.put(r1, r2)
                r1 = 2
                java.lang.String r2 = "isHideBack"
                r0.put(r1, r2)
                r1 = 3
                java.lang.String r2 = "title"
                r0.put(r1, r2)
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b {
        static final java.util.HashMap<java.lang.String, java.lang.Integer> a = null;

        static {
                java.util.HashMap r0 = new java.util.HashMap
                r1 = 2
                r0.<init>(r1)
                com.bxkj.base.DataBinderMapperImpl.b.a = r0
                int r1 = com.bxkj.base.R.layout.new_pub_title
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = "layout/new_pub_title_0"
                r0.put(r2, r1)
                int r1 = com.bxkj.base.R.layout.v2_pub_recyclerview_with_empty_view
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = "layout/v2_pub_recyclerview_with_empty_view_0"
                r0.put(r2, r1)
                return
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r1 = 2
            r0.<init>(r1)
            com.bxkj.base.DataBinderMapperImpl.c = r0
            int r2 = com.bxkj.base.R.layout.new_pub_title
            r3 = 1
            r0.put(r2, r3)
            int r2 = com.bxkj.base.R.layout.v2_pub_recyclerview_with_empty_view
            r0.put(r2, r1)
            return
    }

    public DataBinderMapperImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.List<androidx.databinding.DataBinderMapper> collectDependencies() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            androidx.databinding.library.baseAdapters.DataBinderMapperImpl r1 = new androidx.databinding.library.baseAdapters.DataBinderMapperImpl
            r1.<init>()
            r0.add(r1)
            return r0
    }

    public java.lang.String convertBrIdToString(int r2) {
            r1 = this;
            android.util.SparseArray<java.lang.String> r0 = com.bxkj.base.DataBinderMapperImpl.a.a
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public androidx.databinding.ViewDataBinding getDataBinder(androidx.databinding.DataBindingComponent r3, android.view.View r4, int r5) {
            r2 = this;
            android.util.SparseIntArray r0 = com.bxkj.base.DataBinderMapperImpl.c
            int r5 = r0.get(r5)
            if (r5 <= 0) goto L67
            java.lang.Object r0 = r4.getTag()
            if (r0 == 0) goto L5f
            r1 = 1
            if (r5 == r1) goto L3a
            r1 = 2
            if (r5 == r1) goto L15
            goto L67
        L15:
            java.lang.String r5 = "layout/v2_pub_recyclerview_with_empty_view_0"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L23
            com.bxkj.base.databinding.V2PubRecyclerviewWithEmptyViewBindingImpl r5 = new com.bxkj.base.databinding.V2PubRecyclerviewWithEmptyViewBindingImpl
            r5.<init>(r3, r4)
            return r5
        L23:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "The tag for v2_pub_recyclerview_with_empty_view is invalid. Received: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L3a:
            java.lang.String r5 = "layout/new_pub_title_0"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L48
            com.bxkj.base.databinding.NewPubTitleBindingImpl r5 = new com.bxkj.base.databinding.NewPubTitleBindingImpl
            r5.<init>(r3, r4)
            return r5
        L48:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "The tag for new_pub_title is invalid. Received: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L5f:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "view must have a tag"
            r3.<init>(r4)
            throw r3
        L67:
            r3 = 0
            return r3
    }

    public androidx.databinding.ViewDataBinding getDataBinder(androidx.databinding.DataBindingComponent r2, android.view.View[] r3, int r4) {
            r1 = this;
            r2 = 0
            if (r3 == 0) goto L21
            int r0 = r3.length
            if (r0 != 0) goto L7
            goto L21
        L7:
            android.util.SparseIntArray r0 = com.bxkj.base.DataBinderMapperImpl.c
            int r4 = r0.get(r4)
            if (r4 <= 0) goto L21
            r4 = 0
            r3 = r3[r4]
            java.lang.Object r3 = r3.getTag()
            if (r3 == 0) goto L19
            goto L21
        L19:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "view must have a tag"
            r2.<init>(r3)
            throw r2
        L21:
            return r2
    }

    public int getLayoutId(java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = com.bxkj.base.DataBinderMapperImpl.b.a
            java.lang.Object r3 = r1.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto Lf
            return r0
        Lf:
            int r3 = r3.intValue()
            return r3
    }
}
