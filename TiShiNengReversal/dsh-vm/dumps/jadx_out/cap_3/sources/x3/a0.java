package x3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\njavaTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 javaTypes.kt\norg/jetbrains/kotlin/load/java/structure/JavaTypesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class a0 {
    public a0() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final boolean a(@org.jetbrains.annotations.Nullable x3.x r2) {
            boolean r0 = r2 instanceof x3.c0
            if (r0 == 0) goto L7
            x3.c0 r2 = (x3.c0) r2
            goto L8
        L7:
            r2 = 0
        L8:
            r0 = 0
            if (r2 == 0) goto L19
            x3.x r1 = r2.getBound()
            if (r1 == 0) goto L19
            boolean r2 = r2.J()
            if (r2 != 0) goto L19
            r2 = 1
            return r2
        L19:
            return r0
    }
}
