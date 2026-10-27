package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nutfEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utfEncoding.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/UtfEncodingKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n37#2:74\n36#2,3:75\n1#3:78\n*S KotlinDebug\n*F\n+ 1 utfEncoding.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/UtfEncodingKt\n*L\n55#1:74\n55#1:75,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i {
    @org.jetbrains.annotations.NotNull
    public static final byte[] a(@org.jetbrains.annotations.NotNull java.lang.String[] r10) {
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.g0.p(r10, r0)
            int r0 = r10.length
            r1 = 0
            r2 = 0
            r3 = 0
        L9:
            if (r2 >= r0) goto L15
            r4 = r10[r2]
            int r4 = r4.length()
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L9
        L15:
            byte[] r0 = new byte[r3]
            int r2 = r10.length
            r3 = 0
            r4 = 0
        L1a:
            if (r3 >= r2) goto L35
            r5 = r10[r3]
            int r6 = r5.length()
            r7 = 0
        L23:
            if (r7 >= r6) goto L32
            int r8 = r4 + 1
            char r9 = r5.charAt(r7)
            byte r9 = (byte) r9
            r0[r4] = r9
            int r7 = r7 + 1
            r4 = r8
            goto L23
        L32:
            int r3 = r3 + 1
            goto L1a
        L35:
            return r0
    }
}
