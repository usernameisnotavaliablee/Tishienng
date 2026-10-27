package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class V3FmDataBindingImpl extends com.bxkj.student.databinding.V3FmDataBinding {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @androidx.annotation.NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;

    @androidx.annotation.NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;

    @androidx.annotation.Nullable
    private final com.bxkj.student.databinding.V3LayoutSportDetailDataCommonBinding mboundView11;

    static {
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = new androidx.databinding.ViewDataBinding$IncludedLayouts
            r1 = 48
            r0.<init>(r1)
            com.bxkj.student.databinding.V3FmDataBindingImpl.sIncludes = r0
            java.lang.String r1 = "v3_layout_sport_detail_data_common"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 2
            int[] r2 = new int[]{r2}
            r3 = 2131493735(0x7f0c0367, float:1.8610959E38)
            int[] r3 = new int[]{r3}
            r4 = 1
            r0.setIncludes(r4, r1, r2, r3)
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            com.bxkj.student.databinding.V3FmDataBindingImpl.sViewsWithIds = r0
            r1 = 2131296747(0x7f0901eb, float:1.821142E38)
            r2 = 3
            r0.put(r1, r2)
            r1 = 2131296685(0x7f0901ad, float:1.8211294E38)
            r2 = 4
            r0.put(r1, r2)
            r1 = 2131298750(0x7f0909be, float:1.8215482E38)
            r2 = 5
            r0.put(r1, r2)
            r1 = 2131298753(0x7f0909c1, float:1.8215488E38)
            r2 = 6
            r0.put(r1, r2)
            r1 = 2131296712(0x7f0901c8, float:1.8211348E38)
            r2 = 7
            r0.put(r1, r2)
            r1 = 2131298083(0x7f090723, float:1.821413E38)
            r2 = 8
            r0.put(r1, r2)
            r1 = 2131297148(0x7f09037c, float:1.8212233E38)
            r2 = 9
            r0.put(r1, r2)
            r1 = 2131298986(0x7f090aaa, float:1.821596E38)
            r2 = 10
            r0.put(r1, r2)
            r1 = 2131298770(0x7f0909d2, float:1.8215523E38)
            r2 = 11
            r0.put(r1, r2)
            r1 = 2131296711(0x7f0901c7, float:1.8211346E38)
            r2 = 12
            r0.put(r1, r2)
            r1 = 2131299215(0x7f090b8f, float:1.8216425E38)
            r2 = 13
            r0.put(r1, r2)
            r1 = 2131297260(0x7f0903ec, float:1.821246E38)
            r2 = 14
            r0.put(r1, r2)
            r1 = 2131299209(0x7f090b89, float:1.8216413E38)
            r2 = 15
            r0.put(r1, r2)
            r1 = 2131299208(0x7f090b88, float:1.821641E38)
            r2 = 16
            r0.put(r1, r2)
            r1 = 2131299212(0x7f090b8c, float:1.821642E38)
            r2 = 17
            r0.put(r1, r2)
            r1 = 2131297119(0x7f09035f, float:1.8212174E38)
            r2 = 18
            r0.put(r1, r2)
            r1 = 2131298871(0x7f090a37, float:1.8215727E38)
            r2 = 19
            r0.put(r1, r2)
            r1 = 2131298870(0x7f090a36, float:1.8215725E38)
            r2 = 20
            r0.put(r1, r2)
            r1 = 2131298874(0x7f090a3a, float:1.8215733E38)
            r2 = 21
            r0.put(r1, r2)
            r1 = 2131297244(0x7f0903dc, float:1.8212427E38)
            r2 = 22
            r0.put(r1, r2)
            r1 = 2131299144(0x7f090b48, float:1.8216281E38)
            r2 = 23
            r0.put(r1, r2)
            r1 = 2131299143(0x7f090b47, float:1.821628E38)
            r2 = 24
            r0.put(r1, r2)
            r1 = 2131299147(0x7f090b4b, float:1.8216287E38)
            r2 = 25
            r0.put(r1, r2)
            r1 = 2131298304(0x7f090800, float:1.8214577E38)
            r2 = 26
            r0.put(r1, r2)
            r1 = 2131297262(0x7f0903ee, float:1.8212464E38)
            r2 = 27
            r0.put(r1, r2)
            r1 = 2131299203(0x7f090b83, float:1.82164E38)
            r2 = 28
            r0.put(r1, r2)
            r1 = 2131299202(0x7f090b82, float:1.8216399E38)
            r2 = 29
            r0.put(r1, r2)
            r1 = 2131299206(0x7f090b86, float:1.8216407E38)
            r2 = 30
            r0.put(r1, r2)
            r1 = 2131297117(0x7f09035d, float:1.821217E38)
            r2 = 31
            r0.put(r1, r2)
            r1 = 2131298865(0x7f090a31, float:1.8215715E38)
            r2 = 32
            r0.put(r1, r2)
            r1 = 2131298864(0x7f090a30, float:1.8215713E38)
            r2 = 33
            r0.put(r1, r2)
            r1 = 2131298868(0x7f090a34, float:1.8215721E38)
            r2 = 34
            r0.put(r1, r2)
            r1 = 2131297242(0x7f0903da, float:1.8212423E38)
            r2 = 35
            r0.put(r1, r2)
            r1 = 2131299138(0x7f090b42, float:1.8216269E38)
            r2 = 36
            r0.put(r1, r2)
            r1 = 2131299137(0x7f090b41, float:1.8216267E38)
            r2 = 37
            r0.put(r1, r2)
            r1 = 2131299141(0x7f090b45, float:1.8216275E38)
            r2 = 38
            r0.put(r1, r2)
            r1 = 2131298302(0x7f0907fe, float:1.8214573E38)
            r2 = 39
            r0.put(r1, r2)
            r1 = 2131297178(0x7f09039a, float:1.8212294E38)
            r2 = 40
            r0.put(r1, r2)
            r1 = 2131298970(0x7f090a9a, float:1.8215928E38)
            r2 = 41
            r0.put(r1, r2)
            r1 = 2131298962(0x7f090a92, float:1.8215912E38)
            r2 = 42
            r0.put(r1, r2)
            r1 = 2131298963(0x7f090a93, float:1.8215914E38)
            r2 = 43
            r0.put(r1, r2)
            r1 = 2131297204(0x7f0903b4, float:1.8212346E38)
            r2 = 44
            r0.put(r1, r2)
            r1 = 2131299020(0x7f090acc, float:1.821603E38)
            r2 = 45
            r0.put(r1, r2)
            r1 = 2131299019(0x7f090acb, float:1.8216028E38)
            r2 = 46
            r0.put(r1, r2)
            r1 = 2131299021(0x7f090acd, float:1.8216032E38)
            r2 = 47
            r0.put(r1, r2)
            return
    }

    public V3FmDataBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.V3FmDataBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.V3FmDataBindingImpl.sViewsWithIds
            r2 = 48
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private V3FmDataBindingImpl(androidx.databinding.DataBindingComponent r50, android.view.View r51, java.lang.Object[] r52) {
            r49 = this;
            r0 = 4
            r0 = r52[r0]
            r4 = r0
            com.google.android.material.card.MaterialCardView r4 = (com.google.android.material.card.MaterialCardView) r4
            r0 = 12
            r0 = r52[r0]
            r5 = r0
            com.google.android.material.card.MaterialCardView r5 = (com.google.android.material.card.MaterialCardView) r5
            r0 = 7
            r0 = r52[r0]
            r6 = r0
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            r0 = 3
            r0 = r52[r0]
            r7 = r0
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            r0 = 31
            r0 = r52[r0]
            r8 = r0
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0 = 18
            r0 = r52[r0]
            r9 = r0
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r0 = 9
            r0 = r52[r0]
            r10 = r0
            com.google.android.material.imageview.ShapeableImageView r10 = (com.google.android.material.imageview.ShapeableImageView) r10
            r0 = 40
            r0 = r52[r0]
            r11 = r0
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r0 = 44
            r0 = r52[r0]
            r12 = r0
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r0 = 35
            r0 = r52[r0]
            r13 = r0
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r0 = 22
            r0 = r52[r0]
            r14 = r0
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r0 = 14
            r0 = r52[r0]
            r15 = r0
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r0 = 27
            r0 = r52[r0]
            r16 = r0
            android.widget.ImageView r16 = (android.widget.ImageView) r16
            r0 = 8
            r0 = r52[r0]
            r17 = r0
            android.widget.LinearLayout r17 = (android.widget.LinearLayout) r17
            r0 = 39
            r0 = r52[r0]
            r18 = r0
            android.widget.ProgressBar r18 = (android.widget.ProgressBar) r18
            r0 = 26
            r0 = r52[r0]
            r19 = r0
            android.widget.ProgressBar r19 = (android.widget.ProgressBar) r19
            r0 = 5
            r0 = r52[r0]
            r20 = r0
            android.widget.TextView r20 = (android.widget.TextView) r20
            r0 = 6
            r0 = r52[r0]
            r21 = r0
            android.widget.TextView r21 = (android.widget.TextView) r21
            r0 = 11
            r0 = r52[r0]
            r22 = r0
            android.widget.TextView r22 = (android.widget.TextView) r22
            r0 = 33
            r0 = r52[r0]
            r23 = r0
            android.widget.TextView r23 = (android.widget.TextView) r23
            r0 = 32
            r0 = r52[r0]
            r24 = r0
            android.widget.TextView r24 = (android.widget.TextView) r24
            r0 = 34
            r0 = r52[r0]
            r25 = r0
            android.widget.TextView r25 = (android.widget.TextView) r25
            r0 = 20
            r0 = r52[r0]
            r26 = r0
            android.widget.TextView r26 = (android.widget.TextView) r26
            r0 = 19
            r0 = r52[r0]
            r27 = r0
            android.widget.TextView r27 = (android.widget.TextView) r27
            r0 = 21
            r0 = r52[r0]
            r28 = r0
            android.widget.TextView r28 = (android.widget.TextView) r28
            r0 = 42
            r0 = r52[r0]
            r29 = r0
            android.widget.TextView r29 = (android.widget.TextView) r29
            r0 = 43
            r0 = r52[r0]
            r30 = r0
            android.widget.TextView r30 = (android.widget.TextView) r30
            r0 = 41
            r0 = r52[r0]
            r31 = r0
            android.widget.TextView r31 = (android.widget.TextView) r31
            r0 = 10
            r0 = r52[r0]
            r32 = r0
            android.widget.TextView r32 = (android.widget.TextView) r32
            r0 = 46
            r0 = r52[r0]
            r33 = r0
            android.widget.TextView r33 = (android.widget.TextView) r33
            r0 = 45
            r0 = r52[r0]
            r34 = r0
            android.widget.TextView r34 = (android.widget.TextView) r34
            r0 = 47
            r0 = r52[r0]
            r35 = r0
            android.widget.TextView r35 = (android.widget.TextView) r35
            r0 = 37
            r0 = r52[r0]
            r36 = r0
            android.widget.TextView r36 = (android.widget.TextView) r36
            r0 = 36
            r0 = r52[r0]
            r37 = r0
            android.widget.TextView r37 = (android.widget.TextView) r37
            r0 = 38
            r0 = r52[r0]
            r38 = r0
            android.widget.TextView r38 = (android.widget.TextView) r38
            r0 = 24
            r0 = r52[r0]
            r39 = r0
            android.widget.TextView r39 = (android.widget.TextView) r39
            r0 = 23
            r0 = r52[r0]
            r40 = r0
            android.widget.TextView r40 = (android.widget.TextView) r40
            r0 = 25
            r0 = r52[r0]
            r41 = r0
            android.widget.TextView r41 = (android.widget.TextView) r41
            r0 = 29
            r0 = r52[r0]
            r42 = r0
            android.widget.TextView r42 = (android.widget.TextView) r42
            r0 = 28
            r0 = r52[r0]
            r43 = r0
            android.widget.TextView r43 = (android.widget.TextView) r43
            r0 = 30
            r0 = r52[r0]
            r44 = r0
            android.widget.TextView r44 = (android.widget.TextView) r44
            r0 = 16
            r0 = r52[r0]
            r45 = r0
            android.widget.TextView r45 = (android.widget.TextView) r45
            r0 = 15
            r0 = r52[r0]
            r46 = r0
            android.widget.TextView r46 = (android.widget.TextView) r46
            r0 = 17
            r0 = r52[r0]
            r47 = r0
            android.widget.TextView r47 = (android.widget.TextView) r47
            r0 = 13
            r0 = r52[r0]
            r48 = r0
            android.widget.TextView r48 = (android.widget.TextView) r48
            r3 = 0
            r0 = r49
            r1 = r50
            r2 = r51
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            r1 = -1
            r0.mDirtyFlags = r1
            r1 = 0
            r1 = r52[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r0.mboundView0 = r1
            r2 = 0
            r1.setTag(r2)
            r1 = 1
            r1 = r52[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r0.mboundView1 = r1
            r1.setTag(r2)
            r1 = 2
            r1 = r52[r1]
            com.bxkj.student.databinding.V3LayoutSportDetailDataCommonBinding r1 = (com.bxkj.student.databinding.V3LayoutSportDetailDataCommonBinding) r1
            r0.mboundView11 = r1
            r0.setContainedBinding(r1)
            r2 = r51
            r0.setRootTag(r2)
            r0.invalidateAll()
            return
    }

    protected void executeBindings() {
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.mDirtyFlags     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            r9.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L2a
            java.util.Map<java.lang.String, java.lang.Object> r4 = r9.mMap
            com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r5 = r9.mMActivity
            r6 = 5
            long r6 = r6 & r0
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r6 = 6
            long r0 = r0 & r6
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 == 0) goto L1d
            com.bxkj.student.databinding.V3LayoutSportDetailDataCommonBinding r0 = r9.mboundView11
            r0.setMap(r4)
        L1d:
            if (r6 == 0) goto L24
            com.bxkj.student.databinding.V3LayoutSportDetailDataCommonBinding r0 = r9.mboundView11
            r0.setMActivity(r5)
        L24:
            com.bxkj.student.databinding.V3LayoutSportDetailDataCommonBinding r0 = r9.mboundView11
            androidx.databinding.ViewDataBinding.executeBindingsOn(r0)
            return
        L2a:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L2a
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
            com.bxkj.student.databinding.V3LayoutSportDetailDataCommonBinding r0 = r6.mboundView11
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
            com.bxkj.student.databinding.V3LayoutSportDetailDataCommonBinding r0 = r2.mboundView11
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
            r1 = 0
            return r1
    }

    public void setLifecycleOwner(@androidx.annotation.Nullable androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            super.setLifecycleOwner(r2)
            com.bxkj.student.databinding.V3LayoutSportDetailDataCommonBinding r0 = r1.mboundView11
            r0.setLifecycleOwner(r2)
            return
    }

    @Override // com.bxkj.student.databinding.V3FmDataBinding
    public void setMActivity(@androidx.annotation.Nullable com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r5) {
            r4 = this;
            r4.mMActivity = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 2
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 17
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L14:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r5
    }

    @Override // com.bxkj.student.databinding.V3FmDataBinding
    public void setMap(@androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.Object> r5) {
            r4 = this;
            r4.mMap = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 1
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 20
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
            r0 = 20
            r1 = 1
            if (r0 != r3) goto Lb
            java.util.Map r4 = (java.util.Map) r4
            r2.setMap(r4)
            return r1
        Lb:
            r0 = 17
            if (r0 != r3) goto L15
            com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r4 = (com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity) r4
            r2.setMActivity(r4)
            return r1
        L15:
            r3 = 0
            return r3
    }
}
