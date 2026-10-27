package androidx.databinding.library.baseAdapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DataBinderMapperImpl extends androidx.databinding.DataBinderMapper {
    private static final android.util.SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InnerBrLookup {
        static final android.util.SparseArray<java.lang.String> sKeys = null;

        static {
                android.util.SparseArray r0 = new android.util.SparseArray
                r1 = 1
                r0.<init>(r1)
                androidx.databinding.library.baseAdapters.DataBinderMapperImpl.InnerBrLookup.sKeys = r0
                r1 = 0
                java.lang.String r2 = "_all"
                r0.put(r1, r2)
                return
        }

        private InnerBrLookup() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InnerLayoutIdLookup {
        static final java.util.HashMap<java.lang.String, java.lang.Integer> sKeys = null;

        static {
                java.util.HashMap r0 = new java.util.HashMap
                r1 = 0
                r0.<init>(r1)
                androidx.databinding.library.baseAdapters.DataBinderMapperImpl.InnerLayoutIdLookup.sKeys = r0
                return
        }

        private InnerLayoutIdLookup() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r1 = 0
            r0.<init>(r1)
            androidx.databinding.library.baseAdapters.DataBinderMapperImpl.INTERNAL_LAYOUT_ID_LOOKUP = r0
            return
    }

    public DataBinderMapperImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.databinding.DataBinderMapper
    public java.util.List<androidx.databinding.DataBinderMapper> collectDependencies() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.databinding.DataBinderMapper
    public java.lang.String convertBrIdToString(int r2) {
            r1 = this;
            android.util.SparseArray<java.lang.String> r0 = androidx.databinding.library.baseAdapters.DataBinderMapperImpl.InnerBrLookup.sKeys
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    @Override // androidx.databinding.DataBinderMapper
    public androidx.databinding.ViewDataBinding getDataBinder(androidx.databinding.DataBindingComponent r1, android.view.View r2, int r3) {
            r0 = this;
            android.util.SparseIntArray r1 = androidx.databinding.library.baseAdapters.DataBinderMapperImpl.INTERNAL_LAYOUT_ID_LOOKUP
            int r1 = r1.get(r3)
            if (r1 <= 0) goto L18
            java.lang.Object r1 = r2.getTag()
            if (r1 == 0) goto Lf
            goto L18
        Lf:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "view must have a tag"
            r1.<init>(r2)
            throw r1
        L18:
            r1 = 0
            return r1
    }

    @Override // androidx.databinding.DataBinderMapper
    public androidx.databinding.ViewDataBinding getDataBinder(androidx.databinding.DataBindingComponent r2, android.view.View[] r3, int r4) {
            r1 = this;
            r2 = 0
            if (r3 == 0) goto L22
            int r0 = r3.length
            if (r0 != 0) goto L7
            goto L22
        L7:
            android.util.SparseIntArray r0 = androidx.databinding.library.baseAdapters.DataBinderMapperImpl.INTERNAL_LAYOUT_ID_LOOKUP
            int r4 = r0.get(r4)
            if (r4 <= 0) goto L22
            r4 = 0
            r3 = r3[r4]
            java.lang.Object r3 = r3.getTag()
            if (r3 == 0) goto L19
            goto L22
        L19:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "view must have a tag"
            r2.<init>(r3)
            throw r2
        L22:
            return r2
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = androidx.databinding.library.baseAdapters.DataBinderMapperImpl.InnerLayoutIdLookup.sKeys
            java.lang.Object r3 = r1.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto Lf
            return r0
        Lf:
            int r3 = r3.intValue()
            return r3
    }
}
