package com.bxkj.student.v2.ui.sports.v3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3PassPointDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3PassPointDialog.kt\ncom/bxkj/student/v2/ui/sports/v3/V3PassPointDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1563#2:92\n1634#2,3:93\n774#2:96\n865#2,2:97\n1056#2:99\n1869#2,2:100\n*S KotlinDebug\n*F\n+ 1 V3PassPointDialog.kt\ncom/bxkj/student/v2/ui/sports/v3/V3PassPointDialog\n*L\n79#1:92\n79#1:93,3\n80#1:96\n80#1:97,2\n82#1:99\n83#1:100,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3PassPointDialog extends com.bxkj.base.v2.base.BaseDialog<com.bxkj.student.databinding.V3PassPointDialogBinding, com.bxkj.student.v2.vm.sports.SportsVM> {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> k;

    /* renamed from: l, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.ItemForV3PassPointDialogBinding> f1439l;

    /* renamed from: m, reason: collision with root package name */
    private int f1440m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 V3PassPointDialog.kt\ncom/bxkj/student/v2/ui/sports/v3/V3PassPointDialog\n*L\n1#1,328:1\n82#2:329\n*E\n"})
    public static final class a<T> implements java.util.Comparator {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r3, T r4) {
                r2 = this;
                java.util.Map r3 = (java.util.Map) r3
                com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
                java.lang.String r1 = "sort"
                int r3 = r0.k(r3, r1)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.util.Map r4 = (java.util.Map) r4
                int r4 = r0.k(r4, r1)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                int r3 = kotlin.comparisons.a.l(r3, r4)
                return r3
        }
    }

    public V3PassPointDialog() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.k = r0
            r0 = 1
            r1.f1440m = r0
            return
    }

    public static final /* synthetic */ int L(com.bxkj.student.v2.ui.sports.v3.V3PassPointDialog r0) {
            int r0 = r0.f1440m
            return r0
    }

    private final void M() {
            r7 = this;
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            com.bxkj.base.v2.base.BaseViewModel r1 = r7.C()
            com.bxkj.student.v2.vm.sports.SportsVM r1 = (com.bxkj.student.v2.vm.sports.SportsVM) r1
            java.util.Map r1 = r1.M()
            java.lang.String r2 = "list"
            java.util.List r0 = r0.n(r1, r2)
            com.bxkj.student.v2.common.data.i$a r1 = com.bxkj.student.v2.common.data.i.a
            java.util.List r1 = r1.x()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.f0.d0(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L29:
            boolean r3 = r1.hasNext()
            java.lang.String r4 = "id"
            if (r3 == 0) goto L41
            java.lang.Object r3 = r1.next()
            java.util.Map r3 = (java.util.Map) r3
            com.bxkj.base.v2.common.utils.x r5 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r3 = r5.t(r3, r4)
            r2.add(r3)
            goto L29
        L41:
            java.util.Set r1 = kotlin.collections.f0.f6(r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L50:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r0.next()
            r5 = r3
            java.util.Map r5 = (java.util.Map) r5
            com.bxkj.base.v2.common.utils.x r6 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r5 = r6.t(r5, r4)
            boolean r5 = r1.contains(r5)
            if (r5 != 0) goto L50
            r2.add(r3)
            goto L50
        L6d:
            com.bxkj.student.v2.ui.sports.v3.V3PassPointDialog$a r0 = new com.bxkj.student.v2.ui.sports.v3.V3PassPointDialog$a
            r0.<init>()
            java.util.List r0 = kotlin.collections.f0.z5(r2, r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L7c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La9
            java.lang.Object r1 = r0.next()
            java.util.Map r1 = (java.util.Map) r1
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            com.bxkj.base.v2.common.utils.x r3 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r4 = "sort"
            java.lang.String r5 = r3.t(r1, r4)
            r2.put(r4, r5)
            java.lang.String r4 = "content"
            java.lang.String r1 = r3.t(r1, r4)
            java.lang.String r3 = "name"
            r2.put(r3, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r7.k
            r1.add(r2)
            goto L7c
        La9:
            com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.ItemForV3PassPointDialogBinding> r0 = r7.f1439l
            if (r0 == 0) goto Lb0
            r0.notifyDataSetChanged()
        Lb0:
            return
    }

    private final void P() {
            r2 = this;
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.k
            com.bxkj.student.v2.ui.sports.v3.V3PassPointDialog$initAdapter$1 r1 = new com.bxkj.student.v2.ui.sports.v3.V3PassPointDialog$initAdapter$1
            r1.<init>(r2, r0)
            r2.f1439l = r1
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V3PassPointDialogBinding r0 = (com.bxkj.student.databinding.V3PassPointDialogBinding) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.rv
            com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.ItemForV3PassPointDialogBinding> r1 = r2.f1439l
            r0.setAdapter(r1)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.ItemForV3PassPointDialogBinding> N() {
            r1 = this;
            com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.ItemForV3PassPointDialogBinding> r0 = r1.f1439l
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> O() {
            r1 = this;
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r1.k
            return r0
    }

    public final void Q(@org.jetbrains.annotations.Nullable com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.ItemForV3PassPointDialogBinding> r1) {
            r0 = this;
            r0.f1439l = r1
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r0 = this;
            return
    }

    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            r2 = 2
            r0 = 2132017957(0x7f140325, float:1.9674207E38)
            r1.setStyle(r2, r0)
            return
    }

    public void onStart() {
            r2 = this;
            super.onStart()
            android.app.Dialog r0 = r2.getDialog()
            if (r0 == 0) goto L15
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L15
            r1 = 2131100584(0x7f0603a8, float:1.7813554E38)
            r0.setBackgroundDrawableResource(r1)
        L15:
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r4 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.SportsVM r0 = (com.bxkj.student.v2.vm.sports.SportsVM) r0
            com.bxkj.student.v2.common.data.i$a r1 = com.bxkj.student.v2.common.data.i.a
            java.util.Map r1 = r1.B()
            r0.S(r1)
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            com.bxkj.base.v2.base.BaseViewModel r1 = r4.C()
            com.bxkj.student.v2.vm.sports.SportsVM r1 = (com.bxkj.student.v2.vm.sports.SportsVM) r1
            java.util.Map r1 = r1.M()
            java.lang.String r2 = "pointShowMode"
            r3 = 1
            int r0 = r0.l(r1, r2, r3)
            r4.f1440m = r0
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.V3PassPointDialogBinding r0 = (com.bxkj.student.databinding.V3PassPointDialogBinding) r0
            r0.setDialog(r4)
            r4.M()
            r4.P()
            return
    }
}
