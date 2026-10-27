package androidx.core.provider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class FontsContractCompat {

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @java.lang.Deprecated
    public static final java.lang.String PARCEL_FONT_RESULTS = "font_results";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @java.lang.Deprecated
    static final int RESULT_CODE_PROVIDER_NOT_FOUND = -1;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @java.lang.Deprecated
    static final int RESULT_CODE_WRONG_CERTIFICATES = -2;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Columns implements android.provider.BaseColumns {
        public static final java.lang.String FILE_ID = "file_id";
        public static final java.lang.String ITALIC = "font_italic";
        public static final java.lang.String RESULT_CODE = "result_code";
        public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
        public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
        public static final int RESULT_CODE_MALFORMED_QUERY = 3;
        public static final int RESULT_CODE_OK = 0;
        public static final java.lang.String TTC_INDEX = "font_ttc_index";
        public static final java.lang.String VARIATION_SETTINGS = "font_variation_settings";
        public static final java.lang.String WEIGHT = "font_weight";

        public Columns() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class FontFamilyResult {
        public static final int STATUS_OK = 0;
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
        public static final int STATUS_WRONG_CERTIFICATES = 1;
        private final androidx.core.provider.FontsContractCompat.FontInfo[] mFonts;
        private final int mStatusCode;

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @java.lang.Deprecated
        public FontFamilyResult(int r1, @androidx.annotation.Nullable androidx.core.provider.FontsContractCompat.FontInfo[] r2) {
                r0 = this;
                r0.<init>()
                r0.mStatusCode = r1
                r0.mFonts = r2
                return
        }

        static androidx.core.provider.FontsContractCompat.FontFamilyResult create(int r1, @androidx.annotation.Nullable androidx.core.provider.FontsContractCompat.FontInfo[] r2) {
                androidx.core.provider.FontsContractCompat$FontFamilyResult r0 = new androidx.core.provider.FontsContractCompat$FontFamilyResult
                r0.<init>(r1, r2)
                return r0
        }

        public androidx.core.provider.FontsContractCompat.FontInfo[] getFonts() {
                r1 = this;
                androidx.core.provider.FontsContractCompat$FontInfo[] r0 = r1.mFonts
                return r0
        }

        public int getStatusCode() {
                r1 = this;
                int r0 = r1.mStatusCode
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class FontInfo {
        private final boolean mItalic;
        private final int mResultCode;
        private final int mTtcIndex;
        private final android.net.Uri mUri;
        private final int mWeight;

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @java.lang.Deprecated
        public FontInfo(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.IntRange(from = 0) int r2, @androidx.annotation.IntRange(from = 1, to = 1000) int r3, boolean r4, int r5) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
                android.net.Uri r1 = (android.net.Uri) r1
                r0.mUri = r1
                r0.mTtcIndex = r2
                r0.mWeight = r3
                r0.mItalic = r4
                r0.mResultCode = r5
                return
        }

        static androidx.core.provider.FontsContractCompat.FontInfo create(@androidx.annotation.NonNull android.net.Uri r6, @androidx.annotation.IntRange(from = 0) int r7, @androidx.annotation.IntRange(from = 1, to = 1000) int r8, boolean r9, int r10) {
                androidx.core.provider.FontsContractCompat$FontInfo r0 = new androidx.core.provider.FontsContractCompat$FontInfo
                r1 = r6
                r2 = r7
                r3 = r8
                r4 = r9
                r5 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        public int getResultCode() {
                r1 = this;
                int r0 = r1.mResultCode
                return r0
        }

        @androidx.annotation.IntRange(from = 0)
        public int getTtcIndex() {
                r1 = this;
                int r0 = r1.mTtcIndex
                return r0
        }

        @androidx.annotation.NonNull
        public android.net.Uri getUri() {
                r1 = this;
                android.net.Uri r0 = r1.mUri
                return r0
        }

        @androidx.annotation.IntRange(from = 1, to = 1000)
        public int getWeight() {
                r1 = this;
                int r0 = r1.mWeight
                return r0
        }

        public boolean isItalic() {
                r1 = this;
                boolean r0 = r1.mItalic
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class FontRequestCallback {
        public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
        public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
        public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
        public static final int FAIL_REASON_MALFORMED_QUERY = 3;
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
        public static final int FAIL_REASON_SECURITY_VIOLATION = -4;
        public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @java.lang.Deprecated
        public static final int RESULT_OK = 0;
        static final int RESULT_SUCCESS = 0;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public @interface FontRequestFailReason {
        }

        public FontRequestCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onTypefaceRequestFailed(int r1) {
                r0 = this;
                return
        }

        public void onTypefaceRetrieved(android.graphics.Typeface r1) {
                r0 = this;
                return
        }
    }

    private FontsContractCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.graphics.Typeface buildTypeface(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.os.CancellationSignal r2, @androidx.annotation.NonNull androidx.core.provider.FontsContractCompat.FontInfo[] r3) {
            r0 = 0
            android.graphics.Typeface r1 = androidx.core.graphics.TypefaceCompat.createFromFontInfo(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static androidx.core.provider.FontsContractCompat.FontFamilyResult fetchFonts(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.Nullable android.os.CancellationSignal r1, @androidx.annotation.NonNull androidx.core.provider.FontRequest r2) throws android.content.pm.PackageManager.NameNotFoundException {
            androidx.core.provider.FontsContractCompat$FontFamilyResult r0 = androidx.core.provider.FontProvider.getFontFamilyResult(r0, r2, r1)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @java.lang.Deprecated
    public static android.graphics.Typeface getFontSync(android.content.Context r2, androidx.core.provider.FontRequest r3, @androidx.annotation.Nullable androidx.core.content.res.ResourcesCompat.FontCallback r4, @androidx.annotation.Nullable android.os.Handler r5, boolean r6, int r7, int r8) {
            r0 = r4
            r4 = r8
            androidx.core.graphics.TypefaceCompat$ResourcesCallbackAdapter r8 = new androidx.core.graphics.TypefaceCompat$ResourcesCallbackAdapter
            r8.<init>(r0)
            android.os.Handler r5 = androidx.core.content.res.ResourcesCompat.FontCallback.getHandler(r5)
            r1 = r7
            r7 = r5
            r5 = r6
            r6 = r1
            android.graphics.Typeface r2 = requestFont(r2, r3, r4, r5, r6, r7, r8)
            return r2
    }

    @androidx.annotation.VisibleForTesting
    @java.lang.Deprecated
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static android.content.pm.ProviderInfo getProvider(@androidx.annotation.NonNull android.content.pm.PackageManager r0, @androidx.annotation.NonNull androidx.core.provider.FontRequest r1, @androidx.annotation.Nullable android.content.res.Resources r2) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.pm.ProviderInfo r0 = androidx.core.provider.FontProvider.getProvider(r0, r1, r2)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @java.lang.Deprecated
    public static java.util.Map<android.net.Uri, java.nio.ByteBuffer> prepareFontData(android.content.Context r0, androidx.core.provider.FontsContractCompat.FontInfo[] r1, android.os.CancellationSignal r2) {
            java.util.Map r0 = androidx.core.graphics.TypefaceCompatUtil.readFontInfoIntoByteBuffer(r0, r1, r2)
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static android.graphics.Typeface requestFont(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull androidx.core.provider.FontRequest r2, int r3, boolean r4, @androidx.annotation.IntRange(from = 0) int r5, @androidx.annotation.NonNull android.os.Handler r6, @androidx.annotation.NonNull androidx.core.provider.FontsContractCompat.FontRequestCallback r7) {
            androidx.core.provider.CallbackWithHandler r0 = new androidx.core.provider.CallbackWithHandler
            r0.<init>(r7, r6)
            if (r4 == 0) goto Lc
            android.graphics.Typeface r1 = androidx.core.provider.FontRequestWorker.requestFontSync(r1, r2, r0, r3, r5)
            return r1
        Lc:
            r4 = 0
            android.graphics.Typeface r1 = androidx.core.provider.FontRequestWorker.requestFontAsync(r1, r2, r3, r4, r0)
            return r1
    }

    public static void requestFont(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull androidx.core.provider.FontRequest r2, @androidx.annotation.NonNull androidx.core.provider.FontsContractCompat.FontRequestCallback r3, @androidx.annotation.NonNull android.os.Handler r4) {
            androidx.core.provider.CallbackWithHandler r0 = new androidx.core.provider.CallbackWithHandler
            r0.<init>(r3)
            java.util.concurrent.Executor r3 = androidx.core.provider.RequestExecutor.createHandlerExecutor(r4)
            android.content.Context r1 = r1.getApplicationContext()
            r4 = 0
            androidx.core.provider.FontRequestWorker.requestFontAsync(r1, r2, r4, r3, r0)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @java.lang.Deprecated
    public static void resetCache() {
            androidx.core.provider.FontRequestWorker.resetTypefaceCache()
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    @androidx.annotation.VisibleForTesting
    public static void resetTypefaceCache() {
            androidx.core.provider.FontRequestWorker.resetTypefaceCache()
            return
    }
}
