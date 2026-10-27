package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class V2MainTabHomeFragmentBindingImpl extends com.bxkj.student.databinding.V2MainTabHomeFragmentBinding {

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
            com.bxkj.student.databinding.V2MainTabHomeFragmentBindingImpl.sViewsWithIds = r0
            r1 = 2131299164(0x7f090b5c, float:1.8216322E38)
            r2 = 1
            r0.put(r1, r2)
            r1 = 2131296691(0x7f0901b3, float:1.8211306E38)
            r2 = 2
            r0.put(r1, r2)
            r1 = 2131296806(0x7f090226, float:1.821154E38)
            r2 = 3
            r0.put(r1, r2)
            r1 = 2131298431(0x7f09087f, float:1.8214835E38)
            r2 = 4
            r0.put(r1, r2)
            r1 = 2131298538(0x7f0908ea, float:1.8215052E38)
            r2 = 5
            r0.put(r1, r2)
            return
    }

    public V2MainTabHomeFragmentBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.V2MainTabHomeFragmentBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.V2MainTabHomeFragmentBindingImpl.sViewsWithIds
            r2 = 6
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private V2MainTabHomeFragmentBindingImpl(androidx.databinding.DataBindingComponent r11, android.view.View r12, java.lang.Object[] r13) {
            r10 = this;
            r0 = 2
            r0 = r13[r0]
            r5 = r0
            androidx.cardview.widget.CardView r5 = (androidx.cardview.widget.CardView) r5
            r0 = 3
            r0 = r13[r0]
            r6 = r0
            com.bxkj.base.v2.common.view.CycleViewPager r6 = (com.bxkj.base.v2.common.view.CycleViewPager) r6
            r0 = 4
            r0 = r13[r0]
            r7 = r0
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r0 = 5
            r0 = r13[r0]
            r8 = r0
            cn.bluemobi.dylan.smartwebview.SmartWebView r8 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r8
            r0 = 1
            r0 = r13[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r4 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r11 = -1
            r1.mDirtyFlags = r11
            r11 = 0
            r11 = r13[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r1.mboundView0 = r11
            r12 = 0
            r11.setTag(r12)
            r10.setRootTag(r3)
            r10.invalidateAll()
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
