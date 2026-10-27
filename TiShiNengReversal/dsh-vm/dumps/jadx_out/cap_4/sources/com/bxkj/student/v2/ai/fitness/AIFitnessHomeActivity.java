package com.bxkj.student.v2.ai.fitness;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAIFitnessHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIFitnessHomeActivity.kt\ncom/bxkj/student/v2/ai/fitness/AIFitnessHomeActivity\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,67:1\n11561#2:68\n11896#2,3:69\n*S KotlinDebug\n*F\n+ 1 AIFitnessHomeActivity.kt\ncom/bxkj/student/v2/ai/fitness/AIFitnessHomeActivity\n*L\n24#1:68\n24#1:69,3\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class AIFitnessHomeActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.V2AiFitnessHomeBinding, com.bxkj.base.v2.base.BaseViewModel> {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.bxkj.student.v2.ai.fitness.data.FitnessModel> W;

    public AIFitnessHomeActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.W = r0
            return
    }

    private final void N() {
            r2 = this;
            java.util.List<com.bxkj.student.v2.ai.fitness.data.FitnessModel> r0 = r2.W
            com.bxkj.student.v2.ai.fitness.AIFitnessHomeActivity$setAdapter$adapter$1 r1 = new com.bxkj.student.v2.ai.fitness.AIFitnessHomeActivity$setAdapter$adapter$1
            r1.<init>(r2, r0)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V2AiFitnessHomeBinding r0 = (com.bxkj.student.databinding.V2AiFitnessHomeBinding) r0
            com.bxkj.base.v2.common.view.EmptyRecyclerView r0 = r0.recyclerView
            r0.setAdapter(r1)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V2AiFitnessHomeBinding r0 = (com.bxkj.student.databinding.V2AiFitnessHomeBinding) r0
            com.bxkj.base.v2.common.view.EmptyRecyclerView r0 = r0.recyclerView
            com.bxkj.student.v2.ai.fitness.AIFitnessHomeActivity$setAdapter$1 r1 = new com.bxkj.student.v2.ai.fitness.AIFitnessHomeActivity$setAdapter$1
            r1.<init>(r2)
            r0.addItemDecoration(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.bxkj.student.v2.ai.fitness.data.FitnessModel> L() {
            r1 = this;
            java.util.List<com.bxkj.student.v2.ai.fitness.data.FitnessModel> r0 = r1.W
            return r0
    }

    public final void M(@org.jetbrains.annotations.NotNull com.bxkj.student.v2.ai.fitness.data.FitnessModel r5) {
            r4 = this;
            java.lang.String r0 = "fitnessModel"
            kotlin.jvm.internal.g0.p(r5, r0)
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r4.G()
            java.lang.Class<com.bxkj.student.v2.ai.fitness.LivePreviewActivity> r3 = com.bxkj.student.v2.ai.fitness.LivePreviewActivity.class
            r1.<init>(r2, r3)
            android.content.Intent r5 = r1.putExtra(r0, r5)
            r4.startActivity(r5)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r1 = this;
            androidx.databinding.ViewDataBinding r0 = r1.K()
            com.bxkj.student.databinding.V2AiFitnessHomeBinding r0 = (com.bxkj.student.databinding.V2AiFitnessHomeBinding) r0
            r0.setActivity(r1)
            r1.N()
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r6 = this;
            java.util.List<com.bxkj.student.v2.ai.fitness.data.FitnessModel> r0 = r6.W
            com.bxkj.student.v2.ai.fitness.data.FitnessModelConfig[] r1 = com.bxkj.student.v2.ai.fitness.data.FitnessModelConfig.values()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.length
            r2.<init>(r3)
            int r3 = r1.length
            r4 = 0
        Le:
            if (r4 >= r3) goto L1c
            r5 = r1[r4]
            com.bxkj.student.v2.ai.fitness.data.FitnessModel r5 = r5.getFitnessModel()
            r2.add(r5)
            int r4 = r4 + 1
            goto Le
        L1c:
            r0.addAll(r2)
            return
    }
}
