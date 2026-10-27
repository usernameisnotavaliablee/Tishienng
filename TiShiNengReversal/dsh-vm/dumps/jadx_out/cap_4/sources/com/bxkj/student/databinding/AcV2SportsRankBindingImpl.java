package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AcV2SportsRankBindingImpl extends com.bxkj.student.databinding.AcV2SportsRankBinding {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @androidx.annotation.NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;

    @androidx.annotation.NonNull
    private final android.widget.LinearLayout mboundView1;

    static {
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = new androidx.databinding.ViewDataBinding$IncludedLayouts
            r1 = 7
            r0.<init>(r1)
            com.bxkj.student.databinding.AcV2SportsRankBindingImpl.sIncludes = r0
            java.lang.String r1 = "new_pub_title"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 6
            int[] r2 = new int[]{r2}
            r3 = 2131493609(0x7f0c02e9, float:1.8610703E38)
            int[] r3 = new int[]{r3}
            r4 = 0
            r0.setIncludes(r4, r1, r2, r3)
            r0 = 0
            com.bxkj.student.databinding.AcV2SportsRankBindingImpl.sViewsWithIds = r0
            return
    }

    public AcV2SportsRankBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.AcV2SportsRankBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.AcV2SportsRankBindingImpl.sViewsWithIds
            r2 = 7
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private AcV2SportsRankBindingImpl(androidx.databinding.DataBindingComponent r11, android.view.View r12, java.lang.Object[] r13) {
            r10 = this;
            r0 = 6
            r0 = r13[r0]
            r5 = r0
            com.bxkj.base.databinding.NewPubTitleBinding r5 = (com.bxkj.base.databinding.NewPubTitleBinding) r5
            r0 = 2
            r0 = r13[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 4
            r0 = r13[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 3
            r0 = r13[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 5
            r0 = r13[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r4 = 1
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
            r11 = 1
            r11 = r13[r11]
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r1.mboundView1 = r11
            r11.setTag(r12)
            com.bxkj.base.databinding.NewPubTitleBinding r11 = r1.titleLayout
            r10.setContainedBinding(r11)
            android.widget.TextView r11 = r1.tvRunClassRank
            r11.setTag(r12)
            android.widget.TextView r11 = r1.tvRunDepartmentRank
            r11.setTag(r12)
            android.widget.TextView r11 = r1.tvRunMajorRank
            r11.setTag(r12)
            android.widget.TextView r11 = r1.tvRunSchoolRank
            r11.setTag(r12)
            r10.setRootTag(r3)
            r10.invalidateAll()
            return
    }

    private boolean onChangeTitleLayout(com.bxkj.base.databinding.NewPubTitleBinding r3, int r4) {
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
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            long r2 = r1.mDirtyFlags     // Catch: java.lang.Throwable -> L9e
            r4 = 0
            r1.mDirtyFlags = r4     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L9e
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mDataMap
            com.bxkj.base.v2.common.view.b r6 = r1.mMActvity
            r7 = 10
            long r9 = r2 & r7
            r11 = 0
            r12 = 0
            int r13 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r13 == 0) goto L5d
            if (r0 == 0) goto L33
            java.lang.String r9 = "majorRank"
            java.lang.Object r12 = r0.get(r9)
            java.lang.String r9 = "deptRank"
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r10 = "schoolRank"
            java.lang.Object r10 = r0.get(r10)
            java.lang.String r14 = "clazzRank"
            java.lang.Object r14 = r0.get(r14)
            goto L36
        L33:
            r9 = r12
            r10 = r9
            r14 = r10
        L36:
            if (r0 != 0) goto L3a
            r0 = 1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            if (r13 == 0) goto L46
            if (r0 == 0) goto L43
            r15 = 32
        L41:
            long r2 = r2 | r15
            goto L46
        L43:
            r15 = 16
            goto L41
        L46:
            java.lang.String r12 = com.bxkj.base.v2.common.utils.z.a(r12)
            java.lang.String r9 = com.bxkj.base.v2.common.utils.z.a(r9)
            java.lang.String r10 = com.bxkj.base.v2.common.utils.z.a(r10)
            java.lang.String r13 = com.bxkj.base.v2.common.utils.z.a(r14)
            if (r0 == 0) goto L5a
            r11 = 8
        L5a:
            r0 = r12
            r12 = r13
            goto L60
        L5d:
            r0 = r12
            r9 = r0
            r10 = r9
        L60:
            r13 = 12
            long r13 = r13 & r2
            int r15 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            long r7 = r7 & r2
            int r13 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r13 == 0) goto L83
            android.widget.LinearLayout r7 = r1.mboundView1
            r7.setVisibility(r11)
            android.widget.TextView r7 = r1.tvRunClassRank
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r7, r12)
            android.widget.TextView r7 = r1.tvRunDepartmentRank
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r7, r9)
            android.widget.TextView r7 = r1.tvRunMajorRank
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r7, r0)
            android.widget.TextView r0 = r1.tvRunSchoolRank
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r10)
        L83:
            if (r15 == 0) goto L8a
            com.bxkj.base.databinding.NewPubTitleBinding r0 = r1.titleLayout
            r0.setActivity(r6)
        L8a:
            r6 = 8
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L98
            com.bxkj.base.databinding.NewPubTitleBinding r0 = r1.titleLayout
            java.lang.String r2 = "锻炼排名"
            r0.setTitle(r2)
        L98:
            com.bxkj.base.databinding.NewPubTitleBinding r0 = r1.titleLayout
            androidx.databinding.ViewDataBinding.executeBindingsOn(r0)
            return
        L9e:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L9e
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
            com.bxkj.base.databinding.NewPubTitleBinding r0 = r6.titleLayout
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
            r0 = 8
            r2.mDirtyFlags = r0     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            com.bxkj.base.databinding.NewPubTitleBinding r0 = r2.titleLayout
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
            com.bxkj.base.databinding.NewPubTitleBinding r2 = (com.bxkj.base.databinding.NewPubTitleBinding) r2
            boolean r1 = r0.onChangeTitleLayout(r2, r3)
            return r1
    }

    @Override // com.bxkj.student.databinding.AcV2SportsRankBinding
    public void setDataMap(@androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.Object> r5) {
            r4 = this;
            r4.mDataMap = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 2
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 8
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L14:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r5
    }

    public void setLifecycleOwner(@androidx.annotation.Nullable androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            super.setLifecycleOwner(r2)
            com.bxkj.base.databinding.NewPubTitleBinding r0 = r1.titleLayout
            r0.setLifecycleOwner(r2)
            return
    }

    @Override // com.bxkj.student.databinding.AcV2SportsRankBinding
    public void setMActvity(@androidx.annotation.Nullable com.bxkj.base.v2.common.view.b r5) {
            r4 = this;
            r4.mMActvity = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 4
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

    public boolean setVariable(int r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r2 = this;
            r0 = 8
            r1 = 1
            if (r0 != r3) goto Lb
            java.util.Map r4 = (java.util.Map) r4
            r2.setDataMap(r4)
            return r1
        Lb:
            r0 = 18
            if (r0 != r3) goto L15
            com.bxkj.base.v2.common.view.b r4 = (com.bxkj.base.v2.common.view.b) r4
            r2.setMActvity(r4)
            return r1
        L15:
            r3 = 0
            return r3
    }
}
