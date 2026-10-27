package com.bxkj.student.v2.ui.sports.v3.record;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3RecordListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3RecordListActivity.kt\ncom/bxkj/student/v2/ui/sports/v3/record/V3RecordListActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3RecordListActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.AcV3RecordListBinding, com.bxkj.student.v2.vm.sports.record.RecordVM> {
    private boolean W;

    public V3RecordListActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r0 = this;
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r6 = this;
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = "toLocal"
            boolean r0 = r0.hasExtra(r1)
            r2 = 0
            if (r0 == 0) goto L17
            android.content.Intent r0 = r6.getIntent()
            boolean r0 = r0.getBooleanExtra(r1, r2)
            r6.W = r0
        L17:
            androidx.fragment.app.FragmentActivity r0 = r6.q()
            android.content.Context r1 = r6.G()
            r3 = 2131100712(0x7f060428, float:1.7813813E38)
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r3)
            com.bxkj.student.common.utils.k.g(r0, r1)
            androidx.databinding.ViewDataBinding r0 = r6.K()
            com.bxkj.student.databinding.AcV3RecordListBinding r0 = (com.bxkj.student.databinding.AcV3RecordListBinding) r0
            r0.setMActivity(r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3StatisticsFragment r1 = new com.bxkj.student.v2.ui.sports.v3.record.tab.V3StatisticsFragment
            r1.<init>()
            r0.add(r1)
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment r1 = new com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment
            r1.<init>()
            r0.add(r1)
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r1 = new com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment
            r1.<init>()
            r0.add(r1)
            cn.bluemobi.dylan.base.adapter.b r1 = new cn.bluemobi.dylan.base.adapter.b
            androidx.fragment.app.FragmentManager r3 = r6.getSupportFragmentManager()
            androidx.databinding.ViewDataBinding r4 = r6.K()
            com.bxkj.student.databinding.AcV3RecordListBinding r4 = (com.bxkj.student.databinding.AcV3RecordListBinding) r4
            com.google.android.material.tabs.TabLayout r4 = r4.tb
            r5 = 2131298030(0x7f0906ee, float:1.8214022E38)
            r1.<init>(r3, r0, r5, r4)
            boolean r0 = r6.W
            r1 = 0
            if (r0 == 0) goto L6a
            r0 = r6
            goto L6b
        L6a:
            r0 = r1
        L6b:
            if (r0 == 0) goto L7f
            androidx.databinding.ViewDataBinding r0 = r6.K()
            com.bxkj.student.databinding.AcV3RecordListBinding r0 = (com.bxkj.student.databinding.AcV3RecordListBinding) r0
            com.google.android.material.tabs.TabLayout r0 = r0.tb
            r3 = 2
            com.google.android.material.tabs.TabLayout$Tab r0 = r0.getTabAt(r3)
            if (r0 == 0) goto L7f
            r0.select()
        L7f:
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r3 = "tabIndex"
            boolean r0 = r0.hasExtra(r3)
            if (r0 == 0) goto L8c
            r1 = r6
        L8c:
            if (r1 == 0) goto La7
            android.content.Intent r0 = r6.getIntent()
            int r0 = r0.getIntExtra(r3, r2)
            androidx.databinding.ViewDataBinding r1 = r6.K()
            com.bxkj.student.databinding.AcV3RecordListBinding r1 = (com.bxkj.student.databinding.AcV3RecordListBinding) r1
            com.google.android.material.tabs.TabLayout r1 = r1.tb
            com.google.android.material.tabs.TabLayout$Tab r0 = r1.getTabAt(r0)
            if (r0 == 0) goto La7
            r0.select()
        La7:
            return
    }
}
