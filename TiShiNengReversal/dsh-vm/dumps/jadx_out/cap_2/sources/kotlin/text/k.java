package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHexFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormatKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,845:1\n1088#2,2:846\n*S KotlinDebug\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormatKt\n*L\n843#1:846,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class k {
    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final kotlin.text.j a(kotlin.jvm.functions.Function1<? super kotlin.text.j.a, kotlin.n1> r1) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.text.j$a r0 = new kotlin.text.j$a
            r0.<init>()
            r1.invoke(r0)
            kotlin.text.j r1 = r0.a()
            return r1
    }

    public static final /* synthetic */ boolean b(java.lang.String r0) {
            boolean r0 = c(r0)
            return r0
    }

    private static final boolean c(java.lang.String r4) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.length()
            if (r1 >= r2) goto L20
            char r2 = r4.charAt(r1)
            r3 = 128(0x80, float:1.8E-43)
            int r3 = kotlin.jvm.internal.g0.t(r2, r3)
            if (r3 >= 0) goto L1e
            boolean r2 = java.lang.Character.isLetter(r2)
            if (r2 == 0) goto L1b
            goto L1e
        L1b:
            int r1 = r1 + 1
            goto L2
        L1e:
            r4 = 1
            return r4
        L20:
            return r0
    }
}
