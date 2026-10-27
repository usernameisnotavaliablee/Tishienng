package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ItemForSchoolListV2BindingImpl extends com.bxkj.student.databinding.ItemForSchoolListV2Binding {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @androidx.annotation.NonNull
    private final android.widget.LinearLayout mboundView0;

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            com.bxkj.student.databinding.ItemForSchoolListV2BindingImpl.sViewsWithIds = r0
            r1 = 2131296688(0x7f0901b0, float:1.82113E38)
            r2 = 1
            r0.put(r1, r2)
            r1 = 2131298986(0x7f090aaa, float:1.821596E38)
            r2 = 2
            r0.put(r1, r2)
            return
    }

    public ItemForSchoolListV2BindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.ItemForSchoolListV2BindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.ItemForSchoolListV2BindingImpl.sViewsWithIds
            r2 = 3
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private ItemForSchoolListV2BindingImpl(androidx.databinding.DataBindingComponent r8, android.view.View r9, java.lang.Object[] r10) {
            r7 = this;
            r0 = 1
            r0 = r10[r0]
            r5 = r0
            androidx.cardview.widget.CardView r5 = (androidx.cardview.widget.CardView) r5
            r0 = 2
            r0 = r10[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = -1
            r1.mDirtyFlags = r8
            r8 = 0
            r8 = r10[r8]
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r1.mboundView0 = r8
            r9 = 0
            r8.setTag(r9)
            r7.setRootTag(r3)
            r7.invalidateAll()
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
