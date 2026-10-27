package androidx.activity.result;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ActivityResultCallerLauncher<I, O> extends androidx.activity.result.ActivityResultLauncher<kotlin.n1> {

    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.contract.ActivityResultContract<I, O> callerContract;
    private final I callerInput;

    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<I> launcher;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s resultContract$delegate;

    public ActivityResultCallerLauncher(@org.jetbrains.annotations.NotNull androidx.activity.result.ActivityResultLauncher<I> r1, @org.jetbrains.annotations.NotNull androidx.activity.result.contract.ActivityResultContract<I, O> r2, I r3) {
            r0 = this;
            r0.<init>()
            r0.launcher = r1
            r0.callerContract = r2
            r0.callerInput = r3
            androidx.activity.result.ActivityResultCallerLauncher$resultContract$2 r1 = new androidx.activity.result.ActivityResultCallerLauncher$resultContract$2
            r1.<init>(r0)
            kotlin.s r1 = kotlin.t.c(r1)
            r0.resultContract$delegate = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.activity.result.contract.ActivityResultContract<I, O> getCallerContract() {
            r1 = this;
            androidx.activity.result.contract.ActivityResultContract<I, O> r0 = r1.callerContract
            return r0
    }

    public final I getCallerInput() {
            r1 = this;
            I r0 = r1.callerInput
            return r0
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    @org.jetbrains.annotations.NotNull
    public androidx.activity.result.contract.ActivityResultContract<kotlin.n1, ?> getContract() {
            r1 = this;
            androidx.activity.result.contract.ActivityResultContract r0 = r1.getResultContract()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.activity.result.ActivityResultLauncher<I> getLauncher() {
            r1 = this;
            androidx.activity.result.ActivityResultLauncher<I> r0 = r1.launcher
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.activity.result.contract.ActivityResultContract<kotlin.n1, O> getResultContract() {
            r1 = this;
            kotlin.s r0 = r1.resultContract$delegate
            java.lang.Object r0 = r0.getValue()
            androidx.activity.result.contract.ActivityResultContract r0 = (androidx.activity.result.contract.ActivityResultContract) r0
            return r0
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public /* bridge */ /* synthetic */ void launch(kotlin.n1 r1, androidx.core.app.ActivityOptionsCompat r2) {
            r0 = this;
            kotlin.n1 r1 = (kotlin.n1) r1
            r0.launch2(r1, r2)
            return
    }

    /* renamed from: launch, reason: avoid collision after fix types in other method */
    public void launch2(@org.jetbrains.annotations.NotNull kotlin.n1 r2, @org.jetbrains.annotations.Nullable androidx.core.app.ActivityOptionsCompat r3) {
            r1 = this;
            androidx.activity.result.ActivityResultLauncher<I> r2 = r1.launcher
            I r0 = r1.callerInput
            r2.launch(r0, r3)
            return
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void unregister() {
            r1 = this;
            androidx.activity.result.ActivityResultLauncher<I> r0 = r1.launcher
            r0.unregister()
            return
    }
}
