package androidx.core.net;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nUri.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uri.kt\nandroidx/core/net/UriKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class UriKt {
    @org.jetbrains.annotations.NotNull
    public static final java.io.File toFile(@org.jetbrains.annotations.NotNull android.net.Uri r2) {
            java.lang.String r0 = r2.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L33
            java.lang.String r0 = r2.getPath()
            if (r0 == 0) goto L18
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            return r2
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Uri path is null: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Uri lacks 'file' scheme: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.net.Uri toUri(@org.jetbrains.annotations.NotNull java.io.File r0) {
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.net.Uri toUri(@org.jetbrains.annotations.NotNull java.lang.String r0) {
            android.net.Uri r0 = android.net.Uri.parse(r0)
            return r0
    }
}
