package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class NavDeepLinkRequest {
    private final java.lang.String mAction;
    private final java.lang.String mMimeType;
    private final android.net.Uri mUri;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private java.lang.String mAction;
        private java.lang.String mMimeType;
        private android.net.Uri mUri;

        private Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public static androidx.navigation.NavDeepLinkRequest.Builder fromAction(@androidx.annotation.NonNull java.lang.String r1) {
                boolean r0 = r1.isEmpty()
                if (r0 != 0) goto Lf
                androidx.navigation.NavDeepLinkRequest$Builder r0 = new androidx.navigation.NavDeepLinkRequest$Builder
                r0.<init>()
                r0.setAction(r1)
                return r0
            Lf:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The NavDeepLinkRequest cannot have an empty action."
                r1.<init>(r0)
                throw r1
        }

        @androidx.annotation.NonNull
        public static androidx.navigation.NavDeepLinkRequest.Builder fromMimeType(@androidx.annotation.NonNull java.lang.String r1) {
                androidx.navigation.NavDeepLinkRequest$Builder r0 = new androidx.navigation.NavDeepLinkRequest$Builder
                r0.<init>()
                r0.setMimeType(r1)
                return r0
        }

        @androidx.annotation.NonNull
        public static androidx.navigation.NavDeepLinkRequest.Builder fromUri(@androidx.annotation.NonNull android.net.Uri r1) {
                androidx.navigation.NavDeepLinkRequest$Builder r0 = new androidx.navigation.NavDeepLinkRequest$Builder
                r0.<init>()
                r0.setUri(r1)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.navigation.NavDeepLinkRequest build() {
                r4 = this;
                androidx.navigation.NavDeepLinkRequest r0 = new androidx.navigation.NavDeepLinkRequest
                android.net.Uri r1 = r4.mUri
                java.lang.String r2 = r4.mAction
                java.lang.String r3 = r4.mMimeType
                r0.<init>(r1, r2, r3)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.navigation.NavDeepLinkRequest.Builder setAction(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                boolean r0 = r2.isEmpty()
                if (r0 != 0) goto L9
                r1.mAction = r2
                return r1
            L9:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The NavDeepLinkRequest cannot have an empty action."
                r2.<init>(r0)
                throw r2
        }

        @androidx.annotation.NonNull
        public androidx.navigation.NavDeepLinkRequest.Builder setMimeType(@androidx.annotation.NonNull java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "^[-\\w*.]+/[-\\w+*.]+$"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                java.util.regex.Matcher r0 = r0.matcher(r4)
                boolean r0 = r0.matches()
                if (r0 == 0) goto L13
                r3.mMimeType = r4
                return r3
            L13:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "The given mimeType "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " does not match to required \"type/subtype\" format"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        @androidx.annotation.NonNull
        public androidx.navigation.NavDeepLinkRequest.Builder setUri(@androidx.annotation.NonNull android.net.Uri r1) {
                r0 = this;
                r0.mUri = r1
                return r0
        }
    }

    NavDeepLinkRequest(@androidx.annotation.NonNull android.content.Intent r3) {
            r2 = this;
            android.net.Uri r0 = r3.getData()
            java.lang.String r1 = r3.getAction()
            java.lang.String r3 = r3.getType()
            r2.<init>(r0, r1, r3)
            return
    }

    NavDeepLinkRequest(@androidx.annotation.Nullable android.net.Uri r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.mUri = r1
            r0.mAction = r2
            r0.mMimeType = r3
            return
    }

    @androidx.annotation.Nullable
    public java.lang.String getAction() {
            r1 = this;
            java.lang.String r0 = r1.mAction
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getMimeType() {
            r1 = this;
            java.lang.String r0 = r1.mMimeType
            return r0
    }

    @androidx.annotation.Nullable
    public android.net.Uri getUri() {
            r1 = this;
            android.net.Uri r0 = r1.mUri
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NavDeepLinkRequest"
            r0.append(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            android.net.Uri r1 = r2.mUri
            if (r1 == 0) goto L22
            java.lang.String r1 = " uri="
            r0.append(r1)
            android.net.Uri r1 = r2.mUri
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L22:
            java.lang.String r1 = r2.mAction
            if (r1 == 0) goto L30
            java.lang.String r1 = " action="
            r0.append(r1)
            java.lang.String r1 = r2.mAction
            r0.append(r1)
        L30:
            java.lang.String r1 = r2.mMimeType
            if (r1 == 0) goto L3e
            java.lang.String r1 = " mimetype="
            r0.append(r1)
            java.lang.String r1 = r2.mMimeType
            r0.append(r1)
        L3e:
            java.lang.String r1 = " }"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
