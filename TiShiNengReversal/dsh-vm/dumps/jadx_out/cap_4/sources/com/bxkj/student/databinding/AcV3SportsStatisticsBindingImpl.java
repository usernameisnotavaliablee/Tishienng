package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AcV3SportsStatisticsBindingImpl extends com.bxkj.student.databinding.AcV3SportsStatisticsBinding {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @androidx.annotation.NonNull
    private final android.widget.LinearLayout mboundView0;

    static {
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = new androidx.databinding.ViewDataBinding$IncludedLayouts
            r1 = 2
            r0.<init>(r1)
            com.bxkj.student.databinding.AcV3SportsStatisticsBindingImpl.sIncludes = r0
            java.lang.String r1 = "v3_pub_title"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 1
            int[] r2 = new int[]{r2}
            r3 = 2131493738(0x7f0c036a, float:1.8610965E38)
            int[] r3 = new int[]{r3}
            r4 = 0
            r0.setIncludes(r4, r1, r2, r3)
            r0 = 0
            com.bxkj.student.databinding.AcV3SportsStatisticsBindingImpl.sViewsWithIds = r0
            return
    }

    public AcV3SportsStatisticsBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.AcV3SportsStatisticsBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.AcV3SportsStatisticsBindingImpl.sViewsWithIds
            r2 = 2
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private AcV3SportsStatisticsBindingImpl(androidx.databinding.DataBindingComponent r3, android.view.View r4, java.lang.Object[] r5) {
            r2 = this;
            r0 = 1
            r1 = r5[r0]
            com.bxkj.student.databinding.V3PubTitleBinding r1 = (com.bxkj.student.databinding.V3PubTitleBinding) r1
            r2.<init>(r3, r4, r0, r1)
            r0 = -1
            r2.mDirtyFlags = r0
            r3 = 0
            r3 = r5[r3]
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2.mboundView0 = r3
            r5 = 0
            r3.setTag(r5)
            com.bxkj.student.databinding.V3PubTitleBinding r3 = r2.titleLayout
            r2.setContainedBinding(r3)
            r2.setRootTag(r4)
            r2.invalidateAll()
            return
    }

    private boolean onChangeTitleLayout(com.bxkj.student.databinding.V3PubTitleBinding r3, int r4) {
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
            com.bxkj.base.v2.common.view.b r4 = r8.mMActvity
            r5 = 6
            long r5 = r5 & r0
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 == 0) goto L16
            com.bxkj.student.databinding.V3PubTitleBinding r5 = r8.titleLayout
            r5.setActivity(r4)
        L16:
            r4 = 4
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L24
            com.bxkj.student.databinding.V3PubTitleBinding r0 = r8.titleLayout
            java.lang.String r1 = "锻炼统计"
            r0.setTitle(r1)
        L24:
            com.bxkj.student.databinding.V3PubTitleBinding r0 = r8.titleLayout
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
            com.bxkj.student.databinding.V3PubTitleBinding r0 = r6.titleLayout
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
            com.bxkj.student.databinding.V3PubTitleBinding r0 = r2.titleLayout
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
            com.bxkj.student.databinding.V3PubTitleBinding r2 = (com.bxkj.student.databinding.V3PubTitleBinding) r2
            boolean r1 = r0.onChangeTitleLayout(r2, r3)
            return r1
    }

    public void setLifecycleOwner(@androidx.annotation.Nullable androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            super.setLifecycleOwner(r2)
            com.bxkj.student.databinding.V3PubTitleBinding r0 = r1.titleLayout
            r0.setLifecycleOwner(r2)
            return
    }

    @Override // com.bxkj.student.databinding.AcV3SportsStatisticsBinding
    public void setMActvity(@androidx.annotation.Nullable com.bxkj.base.v2.common.view.b r5) {
            r4 = this;
            r4.mMActvity = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 2
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 18
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L14:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r5
    }

    public boolean setVariable(int r2, @androidx.annotation.Nullable java.lang.Object r3) {
            r1 = this;
            r0 = 18
            if (r0 != r2) goto Lb
            com.bxkj.base.v2.common.view.b r3 = (com.bxkj.base.v2.common.view.b) r3
            r1.setMActvity(r3)
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }
}
