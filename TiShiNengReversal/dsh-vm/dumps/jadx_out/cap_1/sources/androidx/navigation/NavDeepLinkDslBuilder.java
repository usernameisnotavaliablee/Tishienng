package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.navigation.NavDeepLinkDsl
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavDeepLinkDslBuilder {

    @org.jetbrains.annotations.Nullable
    private java.lang.String action;
    private final androidx.navigation.NavDeepLink.Builder builder;

    @org.jetbrains.annotations.Nullable
    private java.lang.String mimeType;

    @org.jetbrains.annotations.Nullable
    private java.lang.String uriPattern;

    public NavDeepLinkDslBuilder() {
            r1 = this;
            r1.<init>()
            androidx.navigation.NavDeepLink$Builder r0 = new androidx.navigation.NavDeepLink$Builder
            r0.<init>()
            r1.builder = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.navigation.NavDeepLink build$navigation_common_ktx_release() {
            r3 = this;
            androidx.navigation.NavDeepLink$Builder r0 = r3.builder
            java.lang.String r1 = r3.uriPattern
            if (r1 != 0) goto L11
            java.lang.String r2 = r3.action
            if (r2 != 0) goto L11
            java.lang.String r2 = r3.mimeType
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            if (r2 == 0) goto L31
            if (r1 == 0) goto L19
            r0.setUriPattern(r1)
        L19:
            java.lang.String r1 = r3.action
            if (r1 == 0) goto L20
            r0.setAction(r1)
        L20:
            java.lang.String r1 = r3.mimeType
            if (r1 == 0) goto L27
            r0.setMimeType(r1)
        L27:
            androidx.navigation.NavDeepLink r0 = r0.build()
            java.lang.String r1 = "builder.apply {\n        …eType(it) }\n    }.build()"
            kotlin.jvm.internal.g0.h(r0, r1)
            return r0
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The NavDeepLink must have an uri, action, and/or mimeType."
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAction() {
            r1 = this;
            java.lang.String r0 = r1.action
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMimeType() {
            r1 = this;
            java.lang.String r0 = r1.mimeType
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUriPattern() {
            r1 = this;
            java.lang.String r0 = r1.uriPattern
            return r0
    }

    public final void setAction(@org.jetbrains.annotations.Nullable java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L11
            int r0 = r2.length()
            if (r0 == 0) goto L9
            goto L11
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The NavDeepLink cannot have an empty action."
            r2.<init>(r0)
            throw r2
        L11:
            r1.action = r2
            return
    }

    public final void setMimeType(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.mimeType = r1
            return
    }

    public final void setUriPattern(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.uriPattern = r1
            return
    }
}
