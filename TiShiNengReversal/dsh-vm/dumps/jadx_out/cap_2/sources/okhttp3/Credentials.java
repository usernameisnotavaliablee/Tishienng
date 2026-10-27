package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Credentials {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Credentials INSTANCE = null;

    static {
            okhttp3.Credentials r0 = new okhttp3.Credentials
            r0.<init>()
            okhttp3.Credentials.INSTANCE = r0
            return
    }

    private Credentials() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String basic(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            java.lang.String r0 = "username"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "password"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            r1 = 4
            java.lang.String r2 = basic$default(r2, r3, r0, r1, r0)
            return r2
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String basic(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
            java.lang.String r0 = "username"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "password"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            okio.ByteString$Companion r2 = okio.ByteString.Companion
            okio.ByteString r1 = r2.encodeString(r1, r3)
            java.lang.String r1 = r1.base64()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Basic "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
    }

    public static /* synthetic */ java.lang.String basic$default(java.lang.String r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
            r3 = r3 & 4
            if (r3 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.e.g
        L6:
            java.lang.String r0 = basic(r0, r1, r2)
            return r0
    }
}
