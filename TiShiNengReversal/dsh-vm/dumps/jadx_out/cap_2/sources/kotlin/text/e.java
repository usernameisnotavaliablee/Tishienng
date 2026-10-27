package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.text.e a = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.nio.charset.Charset b = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.nio.charset.Charset c = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.nio.charset.Charset d = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.nio.charset.Charset e = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.nio.charset.Charset f = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.nio.charset.Charset g = null;

    @org.jetbrains.annotations.Nullable
    private static volatile java.nio.charset.Charset h;

    @org.jetbrains.annotations.Nullable
    private static volatile java.nio.charset.Charset i;

    @org.jetbrains.annotations.Nullable
    private static volatile java.nio.charset.Charset j;

    static {
            kotlin.text.e r0 = new kotlin.text.e
            r0.<init>()
            kotlin.text.e.a = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r1 = "forName(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.text.e.b = r0
            java.lang.String r0 = "UTF-16"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.text.e.c = r0
            java.lang.String r0 = "UTF-16BE"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.text.e.d = r0
            java.lang.String r0 = "UTF-16LE"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.text.e.e = r0
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.text.e.f = r0
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.text.e.g = r0
            return
    }

    private e() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmName(name = "UTF32")
    @org.jetbrains.annotations.NotNull
    public final java.nio.charset.Charset a() {
            r2 = this;
            java.nio.charset.Charset r0 = kotlin.text.e.h
            if (r0 != 0) goto L11
            java.lang.String r0 = "UTF-32"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r1 = "forName(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.text.e.h = r0
        L11:
            return r0
    }

    @kotlin.jvm.JvmName(name = "UTF32_BE")
    @org.jetbrains.annotations.NotNull
    public final java.nio.charset.Charset b() {
            r2 = this;
            java.nio.charset.Charset r0 = kotlin.text.e.j
            if (r0 != 0) goto L11
            java.lang.String r0 = "UTF-32BE"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r1 = "forName(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.text.e.j = r0
        L11:
            return r0
    }

    @kotlin.jvm.JvmName(name = "UTF32_LE")
    @org.jetbrains.annotations.NotNull
    public final java.nio.charset.Charset c() {
            r2 = this;
            java.nio.charset.Charset r0 = kotlin.text.e.i
            if (r0 != 0) goto L11
            java.lang.String r0 = "UTF-32LE"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r1 = "forName(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.text.e.i = r0
        L11:
            return r0
    }
}
