package com.bxkj.student.v2.ui.sports.v3.record.tab;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3RecordInValidFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3RecordInValidFragment.kt\ncom/bxkj/student/v2/ui/sports/v3/record/tab/V3RecordInValidFragment$initAdapter$1$convert$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n1#2:354\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3RecordInValidFragment$initAdapter$1$convert$1 extends com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, ? extends java.lang.Object>, com.bxkj.student.databinding.V3ItemForInvalidRecordListBinding> {
    final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment f;

    V3RecordInValidFragment$initAdapter$1$convert$1(java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r1, com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r2) {
            r0 = this;
            r0.f = r2
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ void m(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r0, java.util.Map r1, android.view.View r2) {
            p(r0, r1, r2)
            return
    }

    public static /* synthetic */ void n(java.util.Map r0, com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r1, android.view.View r2) {
            q(r0, r1, r2)
            return
    }

    private static final void p(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r0, java.util.Map r1, android.view.View r2) {
            r0.P(r1)
            return
    }

    private static final void q(java.util.Map r3, com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r4, android.view.View r5) {
            com.bxkj.student.v2.ui.dialog.TipsDialog r5 = new com.bxkj.student.v2.ui.dialog.TipsDialog
            r5.<init>()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r2 = "remarkExp"
            java.lang.String r3 = r1.t(r3, r2)
            java.lang.String r1 = "contentText"
            r0.putCharSequence(r1, r3)
            r5.setArguments(r0)
            androidx.fragment.app.FragmentManager r3 = r4.getChildFragmentManager()
            java.lang.String r4 = "getChildFragmentManager(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            java.lang.String r4 = "TipsDialog"
            r0 = 1
            r5.i(r3, r4, r0)
            return
    }

    @Override // com.bxkj.base.v2.base.BaseAdapter
    public /* bridge */ /* synthetic */ void f(com.bxkj.student.databinding.V3ItemForInvalidRecordListBinding r1, java.util.Map<java.lang.String, ? extends java.lang.Object> r2, int r3) {
            r0 = this;
            com.bxkj.student.databinding.V3ItemForInvalidRecordListBinding r1 = (com.bxkj.student.databinding.V3ItemForInvalidRecordListBinding) r1
            java.util.Map r2 = (java.util.Map) r2
            r0.o(r1, r2, r3)
            return
    }

    public void o(com.bxkj.student.databinding.V3ItemForInvalidRecordListBinding r5, java.util.Map<java.lang.String, ? extends java.lang.Object> r6, int r7) {
            r4 = this;
            java.lang.String r7 = "itemBinding"
            kotlin.jvm.internal.g0.p(r5, r7)
            java.lang.String r7 = "bean"
            kotlin.jvm.internal.g0.p(r6, r7)
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r7 = r4.f
            r5.setMActivity(r7)
            r5.setMap(r6)
            java.util.Map r7 = r5.getMap()
            if (r7 == 0) goto L39
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "sportTypeName"
            java.lang.String r2 = r0.t(r7, r1)
            int r2 = r2.length()
            if (r2 != 0) goto L27
            goto L28
        L27:
            r7 = 0
        L28:
            if (r7 == 0) goto L39
            com.bxkj.student.v2.common.utils.r$a r2 = com.bxkj.student.v2.common.utils.r.a
            java.lang.String r3 = "sportType"
            int r0 = r0.k(r7, r3)
            java.lang.String r0 = r2.d(r0)
            r7.put(r1, r0)
        L39:
            android.widget.Button r7 = r5.btFace
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "faceUrl"
            java.lang.String r1 = r0.t(r6, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            if (r1 == 0) goto L4d
            r1 = 8
            goto L4e
        L4d:
            r1 = 0
        L4e:
            r7.setVisibility(r1)
            java.lang.String r7 = "isLocal"
            boolean r7 = r0.d(r6, r7)
            if (r7 == 0) goto L84
            androidx.cardview.widget.CardView r7 = r5.card
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r0 = r4.f
            android.content.Context r0 = r0.G()
            r1 = 2131100550(0x7f060386, float:1.7813485E38)
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
            r7.setCardBackgroundColor(r0)
            android.widget.Button r7 = r5.btAppeal
            r7.setVisibility(r2)
            android.widget.Button r7 = r5.btAppeal
            java.lang.String r0 = "立即上传"
            r7.setText(r0)
            android.widget.Button r7 = r5.btAppeal
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r0 = r4.f
            com.bxkj.student.v2.ui.sports.v3.record.tab.h r1 = new com.bxkj.student.v2.ui.sports.v3.record.tab.h
            r1.<init>(r0, r6)
            r7.setOnClickListener(r1)
            goto Lae
        L84:
            androidx.cardview.widget.CardView r7 = r5.card
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r0 = r4.f
            android.content.Context r0 = r0.G()
            r1 = 2131099737(0x7f060059, float:1.7811836E38)
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
            r7.setCardBackgroundColor(r0)
            android.widget.Button r7 = r5.btAppeal
            r7.setVisibility(r2)
            android.widget.Button r7 = r5.btAppeal
            java.lang.String r0 = "我要申诉"
            r7.setText(r0)
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r7 = r4.f
            android.widget.Button r0 = r5.btAppeal
            java.lang.String r1 = "btAppeal"
            kotlin.jvm.internal.g0.o(r0, r1)
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment.m(r7, r0, r6)
        Lae:
            android.widget.LinearLayout r5 = r5.llQuestion
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r7 = r4.f
            com.bxkj.student.v2.ui.sports.v3.record.tab.i r0 = new com.bxkj.student.v2.ui.sports.v3.record.tab.i
            r0.<init>(r6, r7)
            r5.setOnClickListener(r0)
            return
    }
}
