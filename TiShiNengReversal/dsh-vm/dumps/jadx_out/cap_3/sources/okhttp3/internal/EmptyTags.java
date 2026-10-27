package okhttp3.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class EmptyTags extends okhttp3.internal.Tags {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.EmptyTags INSTANCE = null;

    static {
            okhttp3.internal.EmptyTags r0 = new okhttp3.internal.EmptyTags
            r0.<init>()
            okhttp3.internal.EmptyTags.INSTANCE = r0
            return
    }

    private EmptyTags() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @Override // okhttp3.internal.Tags
    @org.jetbrains.annotations.Nullable
    public <T> T get(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 0
            return r2
    }

    @Override // okhttp3.internal.Tags
    @org.jetbrains.annotations.NotNull
    public <T> okhttp3.internal.Tags plus(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r2, @org.jetbrains.annotations.Nullable T r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r3 == 0) goto Ld
            okhttp3.internal.LinkedTags r0 = new okhttp3.internal.LinkedTags
            r0.<init>(r2, r3, r1)
            return r0
        Ld:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "{}"
            return r0
    }
}
