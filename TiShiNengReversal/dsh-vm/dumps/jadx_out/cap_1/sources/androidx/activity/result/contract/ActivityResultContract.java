package androidx.activity.result.contract;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class ActivityResultContract<I, O> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class SynchronousResult<T> {
        private final T value;

        public SynchronousResult(T r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        public final T getValue() {
                r1 = this;
                T r0 = r1.value
                return r0
        }
    }

    public ActivityResultContract() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public abstract android.content.Intent createIntent(@org.jetbrains.annotations.NotNull android.content.Context r1, I r2);

    @org.jetbrains.annotations.Nullable
    public androidx.activity.result.contract.ActivityResultContract.SynchronousResult<O> getSynchronousResult(@org.jetbrains.annotations.NotNull android.content.Context r1, I r2) {
            r0 = this;
            java.lang.String r2 = "context"
            kotlin.jvm.internal.g0.p(r1, r2)
            r1 = 0
            return r1
    }

    public abstract O parseResult(int r1, @org.jetbrains.annotations.Nullable android.content.Intent r2);
}
