package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class V2MainTabDiscoveryFragmentBindingImpl extends com.bxkj.student.databinding.V2MainTabDiscoveryFragmentBinding {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @androidx.annotation.NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            com.bxkj.student.databinding.V2MainTabDiscoveryFragmentBindingImpl.sViewsWithIds = r0
            r1 = 2131299164(0x7f090b5c, float:1.8216322E38)
            r2 = 1
            r0.put(r1, r2)
            r1 = 2131298564(0x7f090904, float:1.8215105E38)
            r2 = 2
            r0.put(r1, r2)
            r1 = 2131298538(0x7f0908ea, float:1.8215052E38)
            r2 = 3
            r0.put(r1, r2)
            return
    }

    public V2MainTabDiscoveryFragmentBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.V2MainTabDiscoveryFragmentBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.V2MainTabDiscoveryFragmentBindingImpl.sViewsWithIds
            r2 = 4
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private V2MainTabDiscoveryFragmentBindingImpl(androidx.databinding.DataBindingComponent r9, android.view.View r10, java.lang.Object[] r11) {
            r8 = this;
            r0 = 3
            r0 = r11[r0]
            r5 = r0
            cn.bluemobi.dylan.smartwebview.SmartWebView r5 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r5
            r0 = 2
            r0 = r11[r0]
            r6 = r0
            com.scwang.smartrefresh.layout.SmartRefreshLayout r6 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r6
            r0 = 1
            r0 = r11[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r4 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9 = -1
            r1.mDirtyFlags = r9
            r9 = 0
            r9 = r11[r9]
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            r1.mboundView0 = r9
            r10 = 0
            r9.setTag(r10)
            r8.setRootTag(r3)
            r8.invalidateAll()
            return
    }

    protected void executeBindings() {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L7
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
            throw r0
    }

    public boolean hasPendingBindings() {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.mDirtyFlags     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Le
            r0 = 1
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc
            return r0
        Lc:
            r0 = move-exception
            goto L11
        Le:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc
            r0 = 0
            return r0
        L11:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    public void invalidateAll() {
            r2 = this;
            monitor-enter(r2)
            r0 = 1
            r2.mDirtyFlags = r0     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            r2.requestRebind()
            return
        La:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    protected boolean onFieldChange(int r1, java.lang.Object r2, int r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean setVariable(int r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = this;
            r1 = 1
            return r1
    }
}
