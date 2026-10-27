package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class HandlerKt {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.Runnable postAtTime(@org.jetbrains.annotations.NotNull android.os.Handler r1, long r2, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r5) {
            androidx.core.os.HandlerKt$postAtTime$runnable$1 r0 = new androidx.core.os.HandlerKt$postAtTime$runnable$1
            r0.<init>(r5)
            r1.postAtTime(r0, r4, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Runnable postAtTime$default(android.os.Handler r0, long r1, java.lang.Object r3, kotlin.jvm.functions.Function0 r4, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L5
            r3 = 0
        L5:
            androidx.core.os.HandlerKt$postAtTime$runnable$1 r5 = new androidx.core.os.HandlerKt$postAtTime$runnable$1
            r5.<init>(r4)
            r0.postAtTime(r5, r3, r1)
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Runnable postDelayed(@org.jetbrains.annotations.NotNull android.os.Handler r1, long r2, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r5) {
            androidx.core.os.HandlerKt$postDelayed$runnable$1 r0 = new androidx.core.os.HandlerKt$postDelayed$runnable$1
            r0.<init>(r5)
            if (r4 != 0) goto Lb
            r1.postDelayed(r0, r2)
            return r0
        Lb:
            androidx.core.os.HandlerCompat.postDelayed(r1, r0, r4, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Runnable postDelayed$default(android.os.Handler r0, long r1, java.lang.Object r3, kotlin.jvm.functions.Function0 r4, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L5
            r3 = 0
        L5:
            androidx.core.os.HandlerKt$postDelayed$runnable$1 r5 = new androidx.core.os.HandlerKt$postDelayed$runnable$1
            r5.<init>(r4)
            if (r3 != 0) goto L10
            r0.postDelayed(r5, r1)
            return r5
        L10:
            androidx.core.os.HandlerCompat.postDelayed(r0, r5, r3, r1)
            return r5
    }
}
