package com.bxkj.student.v2.ui.sports.v3.record.tab;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3RecordInValidFragment$initAdapter$1 extends com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, ? extends java.lang.Object>, com.bxkj.student.databinding.V3ItemForValidRecordListBinding> {
    final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment f;

    V3RecordInValidFragment$initAdapter$1(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r1, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2) {
            r0 = this;
            r0.f = r1
            r0.<init>(r2)
            return
    }

    public static /* synthetic */ void m(kotlin.jvm.internal.Ref.BooleanRef r0, com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r1, java.lang.String r2, java.util.List r3, com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment$initAdapter$1 r4, com.bxkj.student.databinding.V3ItemForValidRecordListBinding r5, android.view.View r6) {
            o(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    private static final void o(kotlin.jvm.internal.Ref.BooleanRef r1, com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r2, java.lang.String r3, java.util.List r4, com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment$initAdapter$1 r5, com.bxkj.student.databinding.V3ItemForValidRecordListBinding r6, android.view.View r7) {
            boolean r7 = r1.element
            r7 = r7 ^ 1
            r1.element = r7
            com.bxkj.base.v2.base.BaseViewModel r7 = r2.C()
            com.bxkj.student.v2.vm.sports.record.RecordVM r7 = (com.bxkj.student.v2.vm.sports.record.RecordVM) r7
            java.util.Map r7 = r7.E()
            boolean r0 = r1.element
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.put(r3, r0)
            com.bxkj.base.v2.base.BaseViewModel r7 = r2.C()
            com.bxkj.student.v2.vm.sports.record.RecordVM r7 = (com.bxkj.student.v2.vm.sports.record.RecordVM) r7
            r7.N(r3)
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L2c
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment.l(r2)
            return
        L2c:
            boolean r1 = r1.element
            r5.p(r6, r1)
            return
    }

    private final void p(com.bxkj.student.databinding.V3ItemForValidRecordListBinding r3, boolean r4) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.rvTrace
            if (r4 == 0) goto L6
            r1 = 0
            goto L8
        L6:
            r1 = 8
        L8:
            r0.setVisibility(r1)
            android.widget.ImageView r3 = r3.ivArrow
            if (r4 == 0) goto L12
            r4 = 1127481344(0x43340000, float:180.0)
            goto L13
        L12:
            r4 = 0
        L13:
            r3.setRotation(r4)
            return
    }

    static /* synthetic */ void q(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment$initAdapter$1 r0, com.bxkj.student.databinding.V3ItemForValidRecordListBinding r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.p(r1, r2)
            return
    }

    @Override // com.bxkj.base.v2.base.BaseAdapter
    public /* bridge */ /* synthetic */ void f(com.bxkj.student.databinding.V3ItemForValidRecordListBinding r1, java.util.Map<java.lang.String, ? extends java.lang.Object> r2, int r3) {
            r0 = this;
            com.bxkj.student.databinding.V3ItemForValidRecordListBinding r1 = (com.bxkj.student.databinding.V3ItemForValidRecordListBinding) r1
            java.util.Map r2 = (java.util.Map) r2
            r0.n(r1, r2, r3)
            return
    }

    public void n(com.bxkj.student.databinding.V3ItemForValidRecordListBinding r9, java.util.Map<java.lang.String, ? extends java.lang.Object> r10, int r11) {
            r8 = this;
            java.lang.String r11 = "itemBinding"
            kotlin.jvm.internal.g0.p(r9, r11)
            java.lang.String r11 = "bean"
            kotlin.jvm.internal.g0.p(r10, r11)
            com.bxkj.base.v2.common.utils.x r11 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r0 = "date"
            java.lang.String r4 = r11.t(r10, r0)
            android.widget.TextView r0 = r9.tvDate
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy年MM月"
            r1.<init>(r2)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyy-MM"
            r2.<init>(r3)
            java.util.Date r2 = r2.parse(r4)
            java.lang.String r1 = r1.format(r2)
            r0.setText(r1)
            android.widget.TextView r0 = r9.tvCountDistance
            com.bxkj.base.v2.common.utils.h r1 = com.bxkj.base.v2.common.utils.h.a
            java.lang.String r2 = "totalRange"
            double r2 = r11.f(r10, r2)
            java.lang.String r1 = r1.a(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "公里"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r9.tvCountTime
            java.lang.String r1 = "totalTime"
            double r1 = r11.f(r10, r1)
            long r1 = (long) r1
            java.lang.String r1 = com.bxkj.student.run.app.utils.i.g(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r9.tvCountNumber
            java.lang.String r1 = "count"
            java.lang.String r10 = r11.t(r10, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            java.lang.String r10 = "次"
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.setText(r10)
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r10 = r8.f
            com.bxkj.base.v2.base.BaseViewModel r10 = r10.C()
            com.bxkj.student.v2.vm.sports.record.RecordVM r10 = (com.bxkj.student.v2.vm.sports.record.RecordVM) r10
            java.util.Map r10 = r10.I()
            java.util.List r5 = r11.n(r10, r4)
            androidx.recyclerview.widget.RecyclerView r10 = r9.rvTrace
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment$initAdapter$1$convert$1 r0 = new com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment$initAdapter$1$convert$1
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r1 = r8.f
            r0.<init>(r5, r1)
            r10.setAdapter(r0)
            kotlin.jvm.internal.Ref$BooleanRef r2 = new kotlin.jvm.internal.Ref$BooleanRef
            r2.<init>()
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r10 = r8.f
            com.bxkj.base.v2.base.BaseViewModel r10 = r10.C()
            com.bxkj.student.v2.vm.sports.record.RecordVM r10 = (com.bxkj.student.v2.vm.sports.record.RecordVM) r10
            java.util.Map r10 = r10.E()
            r0 = 0
            boolean r10 = r11.e(r10, r4, r0)
            r2.element = r10
            r8.p(r9, r10)
            com.google.android.material.card.MaterialCardView r10 = r9.card1
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r3 = r8.f
            com.bxkj.student.v2.ui.sports.v3.record.tab.g r1 = new com.bxkj.student.v2.ui.sports.v3.record.tab.g
            r6 = r8
            r7 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10.setOnClickListener(r1)
            return
    }
}
