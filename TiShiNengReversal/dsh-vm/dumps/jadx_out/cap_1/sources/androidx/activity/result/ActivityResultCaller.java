package androidx.activity.result;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface ActivityResultCaller {
    @androidx.annotation.NonNull
    <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(@androidx.annotation.NonNull androidx.activity.result.contract.ActivityResultContract<I, O> r1, @androidx.annotation.NonNull androidx.activity.result.ActivityResultCallback<O> r2);

    @androidx.annotation.NonNull
    <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(@androidx.annotation.NonNull androidx.activity.result.contract.ActivityResultContract<I, O> r1, @androidx.annotation.NonNull androidx.activity.result.ActivityResultRegistry r2, @androidx.annotation.NonNull androidx.activity.result.ActivityResultCallback<O> r3);
}
