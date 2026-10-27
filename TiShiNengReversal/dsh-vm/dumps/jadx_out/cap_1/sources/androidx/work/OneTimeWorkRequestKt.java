package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class OneTimeWorkRequestKt {
    public static final /* synthetic */ <W extends androidx.work.ListenableWorker> androidx.work.OneTimeWorkRequest.Builder OneTimeWorkRequestBuilder() {
            androidx.work.OneTimeWorkRequest$Builder r0 = new androidx.work.OneTimeWorkRequest$Builder
            r1 = 4
            java.lang.String r2 = "W"
            kotlin.jvm.internal.g0.y(r1, r2)
            java.lang.Class<androidx.work.ListenableWorker> r1 = androidx.work.ListenableWorker.class
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.work.OneTimeWorkRequest.Builder setInputMerger(@org.jetbrains.annotations.NotNull androidx.work.OneTimeWorkRequest.Builder r1, @androidx.annotation.NonNull @org.jetbrains.annotations.NotNull kotlin.reflect.d<? extends androidx.work.InputMerger> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "inputMerger"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Class r2 = k3.a.e(r2)
            androidx.work.OneTimeWorkRequest$Builder r1 = r1.setInputMerger(r2)
            java.lang.String r2 = "setInputMerger(inputMerger.java)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }
}
