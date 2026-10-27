package com.bxkj.student.v2.ui.sports.v3.record.tab;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3RecordValidFragment$initAdapter$1$convert$1 extends com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, ? extends java.lang.Object>, com.bxkj.student.databinding.V3ItemForValidRecordListTraceBinding> {
    final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment f;

    V3RecordValidFragment$initAdapter$1$convert$1(java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r1, com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment r2) {
            r0 = this;
            r0.f = r2
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ void m(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment r0, java.util.Map r1, android.view.View r2) {
            o(r0, r1, r2)
            return
    }

    private static final void o(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment r2, java.util.Map r3, android.view.View r4) {
            android.content.Intent r4 = new android.content.Intent
            android.content.Context r0 = r2.G()
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity> r1 = com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity.class
            r4.<init>(r0, r1)
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "id"
            java.lang.String r3 = r0.t(r3, r1)
            java.lang.String r0 = "exerciseRecordId"
            android.content.Intent r3 = r4.putExtra(r0, r3)
            r2.startActivity(r3)
            return
    }

    @Override // com.bxkj.base.v2.base.BaseAdapter
    public /* bridge */ /* synthetic */ void f(com.bxkj.student.databinding.V3ItemForValidRecordListTraceBinding r1, java.util.Map<java.lang.String, ? extends java.lang.Object> r2, int r3) {
            r0 = this;
            com.bxkj.student.databinding.V3ItemForValidRecordListTraceBinding r1 = (com.bxkj.student.databinding.V3ItemForValidRecordListTraceBinding) r1
            java.util.Map r2 = (java.util.Map) r2
            r0.n(r1, r2, r3)
            return
    }

    public void n(com.bxkj.student.databinding.V3ItemForValidRecordListTraceBinding r5, java.util.Map<java.lang.String, ? extends java.lang.Object> r6, int r7) {
            r4 = this;
            java.lang.String r7 = "itemBinding"
            kotlin.jvm.internal.g0.p(r5, r7)
            java.lang.String r7 = "bean"
            kotlin.jvm.internal.g0.p(r6, r7)
            com.bxkj.base.v2.common.utils.x r7 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r0 = "sportType"
            int r0 = r7.k(r6, r0)
            r5.setSportType(r0)
            android.widget.ImageView r1 = r5.ivSportsType
            com.bxkj.student.v2.common.utils.r$a r2 = com.bxkj.student.v2.common.utils.r.a
            int r3 = r2.b(r0)
            r1.setImageResource(r3)
            android.widget.TextView r1 = r5.tvSportsTypeName
            java.lang.String r0 = r2.d(r0)
            r1.setText(r0)
            android.widget.TextView r0 = r5.tvDistance
            com.bxkj.base.v2.common.utils.h r1 = com.bxkj.base.v2.common.utils.h.a
            java.lang.String r2 = "sportRange"
            double r2 = r7.f(r6, r2)
            java.lang.String r1 = r1.a(r2)
            r0.setText(r1)
            android.widget.TextView r0 = r5.tvDuration
            java.lang.String r1 = "sportTime"
            long r1 = r7.o(r6, r1)
            java.lang.String r1 = com.bxkj.student.run.app.utils.i.g(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r5.tvStep
            java.lang.String r1 = "stepNumbers"
            java.lang.String r1 = r7.t(r6, r1)
            int r1 = com.bxkj.student.run.app.utils.i.t(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r5.tvTime
            java.lang.String r1 = "startTime"
            java.lang.String r7 = r7.t(r6, r1)
            java.lang.String r7 = com.bxkj.base.v2.common.utils.g.a(r7)
            r0.setText(r7)
            android.view.View r5 = r5.getRoot()
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment r7 = r4.f
            com.bxkj.student.v2.ui.sports.v3.record.tab.m r0 = new com.bxkj.student.v2.ui.sports.v3.record.tab.m
            r0.<init>(r7, r6)
            r5.setOnClickListener(r0)
            return
    }
}
