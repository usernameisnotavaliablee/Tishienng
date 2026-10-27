package okhttp3.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class TagsKt {
    public TagsKt() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> T computeIfAbsent(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicReference<okhttp3.internal.Tags> r3, @org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "compute"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
        L10:
            java.lang.Object r1 = r3.get()
            okhttp3.internal.Tags r1 = (okhttp3.internal.Tags) r1
            java.lang.Object r2 = r1.get(r4)
            if (r2 == 0) goto L1d
            return r2
        L1d:
            if (r0 != 0) goto L23
            java.lang.Object r0 = r5.invoke()
        L23:
            okhttp3.internal.Tags r2 = r1.plus(r4, r0)
            boolean r1 = androidx.camera.view.p.a(r3, r1, r2)
            if (r1 == 0) goto L10
            return r0
    }
}
