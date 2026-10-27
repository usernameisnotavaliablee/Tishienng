package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class V2AdSwitchBindingImpl extends com.bxkj.student.databinding.V2AdSwitchBinding {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @androidx.annotation.NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;

    static {
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = new androidx.databinding.ViewDataBinding$IncludedLayouts
            r1 = 3
            r0.<init>(r1)
            com.bxkj.student.databinding.V2AdSwitchBindingImpl.sIncludes = r0
            java.lang.String r1 = "v2_pub_title"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 1
            int[] r2 = new int[]{r2}
            r3 = 2131493723(0x7f0c035b, float:1.8610934E38)
            int[] r3 = new int[]{r3}
            r4 = 0
            r0.setIncludes(r4, r1, r2, r3)
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            com.bxkj.student.databinding.V2AdSwitchBindingImpl.sViewsWithIds = r0
            r1 = 2131298616(0x7f090938, float:1.821521E38)
            r2 = 2
            r0.put(r1, r2)
            return
    }

    public V2AdSwitchBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.V2AdSwitchBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.V2AdSwitchBindingImpl.sViewsWithIds
            r2 = 3
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private V2AdSwitchBindingImpl(androidx.databinding.DataBindingComponent r8, android.view.View r9, java.lang.Object[] r10) {
            r7 = this;
            r0 = 1
            r0 = r10[r0]
            r5 = r0
            com.bxkj.student.databinding.V2PubTitleBinding r5 = (com.bxkj.student.databinding.V2PubTitleBinding) r5
            r0 = 2
            r0 = r10[r0]
            r6 = r0
            com.bxkj.student.common.view.ToggleButton r6 = (com.bxkj.student.common.view.ToggleButton) r6
            r4 = 1
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = -1
            r1.mDirtyFlags = r8
            com.bxkj.student.databinding.V2PubTitleBinding r8 = r1.includeTitle
            r7.setContainedBinding(r8)
            r8 = 0
            r8 = r10[r8]
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            r1.mboundView0 = r8
            r9 = 0
            r8.setTag(r9)
            r7.setRootTag(r3)
            r7.invalidateAll()
            return
    }

    private boolean onChangeIncludeTitle(com.bxkj.student.databinding.V2PubTitleBinding r3, int r4) {
            r2 = this;
            if (r4 != 0) goto L10
            monitor-enter(r2)
            long r3 = r2.mDirtyFlags     // Catch: java.lang.Throwable -> Ld
            r0 = 1
            long r3 = r3 | r0
            r2.mDirtyFlags = r3     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            r3 = 1
            return r3
        Ld:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
        L10:
            r3 = 0
            return r3
    }

    protected void executeBindings() {
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.mDirtyFlags     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            r8.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L2a
            com.bxkj.base.v2.common.view.b r4 = r8.mBackEvent
            r5 = 6
            long r5 = r5 & r0
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 == 0) goto L16
            com.bxkj.student.databinding.V2PubTitleBinding r5 = r8.includeTitle
            r5.setActivity(r4)
        L16:
            r4 = 4
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L24
            com.bxkj.student.databinding.V2PubTitleBinding r0 = r8.includeTitle
            java.lang.String r1 = "隐私设置"
            r0.setTitle(r1)
        L24:
            com.bxkj.student.databinding.V2PubTitleBinding r0 = r8.includeTitle
            androidx.databinding.ViewDataBinding.executeBindingsOn(r0)
            return
        L2a:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L2a
            throw r0
    }

    public boolean hasPendingBindings() {
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.mDirtyFlags     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto Le
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            return r4
        Lc:
            r0 = move-exception
            goto L1a
        Le:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            com.bxkj.student.databinding.V2PubTitleBinding r0 = r6.includeTitle
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L18
            return r4
        L18:
            r0 = 0
            return r0
        L1a:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    public void invalidateAll() {
            r2 = this;
            monitor-enter(r2)
            r0 = 4
            r2.mDirtyFlags = r0     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            com.bxkj.student.databinding.V2PubTitleBinding r0 = r2.includeTitle
            r0.invalidateAll()
            r2.requestRebind()
            return
        Lf:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    protected boolean onFieldChange(int r1, java.lang.Object r2, int r3) {
            r0 = this;
            if (r1 == 0) goto L4
            r1 = 0
            return r1
        L4:
            com.bxkj.student.databinding.V2PubTitleBinding r2 = (com.bxkj.student.databinding.V2PubTitleBinding) r2
            boolean r1 = r0.onChangeIncludeTitle(r2, r3)
            return r1
    }

    @Override // com.bxkj.student.databinding.V2AdSwitchBinding
    public void setBackEvent(@androidx.annotation.Nullable com.bxkj.base.v2.common.view.b r5) {
            r4 = this;
            r4.mBackEvent = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L13
            r2 = 2
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L13
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            r5 = 4
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L13:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            throw r5
    }

    public void setLifecycleOwner(@androidx.annotation.Nullable androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            super.setLifecycleOwner(r2)
            com.bxkj.student.databinding.V2PubTitleBinding r0 = r1.includeTitle
            r0.setLifecycleOwner(r2)
            return
    }

    public boolean setVariable(int r2, @androidx.annotation.Nullable java.lang.Object r3) {
            r1 = this;
            r0 = 4
            if (r0 != r2) goto La
            com.bxkj.base.v2.common.view.b r3 = (com.bxkj.base.v2.common.view.b) r3
            r1.setBackEvent(r3)
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }
}
