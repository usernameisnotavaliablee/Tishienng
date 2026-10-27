package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class InputMergerFactory {


    public InputMergerFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static androidx.work.InputMergerFactory getDefaultInputMergerFactory() {
            androidx.work.InputMergerFactory$1 r0 = new androidx.work.InputMergerFactory$1
            r0.<init>()
            return r0
    }

    @androidx.annotation.Nullable
    public abstract androidx.work.InputMerger createInputMerger(@androidx.annotation.NonNull java.lang.String r1);

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final androidx.work.InputMerger createInputMergerWithDefaultFallback(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            androidx.work.InputMerger r0 = r1.createInputMerger(r2)
            if (r0 != 0) goto Lb
            androidx.work.InputMerger r2 = androidx.work.InputMerger.fromClassName(r2)
            return r2
        Lb:
            return r0
    }
}
