package androidx.activity.result;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class ActivityResultLauncher<I> {
    public ActivityResultLauncher() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public abstract androidx.activity.result.contract.ActivityResultContract<I, ?> getContract();

    public void launch(@android.annotation.SuppressLint({"UnknownNullness"}) I r2) {
            r1 = this;
            r0 = 0
            r1.launch(r2, r0)
            return
    }

    public abstract void launch(@android.annotation.SuppressLint({"UnknownNullness"}) I r1, @androidx.annotation.Nullable androidx.core.app.ActivityOptionsCompat r2);

    @androidx.annotation.MainThread
    public abstract void unregister();
}
