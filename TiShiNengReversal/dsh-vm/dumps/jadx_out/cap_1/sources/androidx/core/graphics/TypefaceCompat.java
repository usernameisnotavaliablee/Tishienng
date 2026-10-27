package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TypefaceCompat {
    private static final androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> sTypefaceCache = null;
    private static final androidx.core.graphics.TypefaceCompatBaseImpl sTypefaceCompatImpl = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static class ResourcesCallbackAdapter extends androidx.core.provider.FontsContractCompat.FontRequestCallback {

        @androidx.annotation.Nullable
        private androidx.core.content.res.ResourcesCompat.FontCallback mFontCallback;

        public ResourcesCallbackAdapter(@androidx.annotation.Nullable androidx.core.content.res.ResourcesCompat.FontCallback r1) {
                r0 = this;
                r0.<init>()
                r0.mFontCallback = r1
                return
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRequestFailed(int r2) {
                r1 = this;
                androidx.core.content.res.ResourcesCompat$FontCallback r0 = r1.mFontCallback
                if (r0 == 0) goto L7
                r0.onFontRetrievalFailed(r2)
            L7:
                return
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRetrieved(@androidx.annotation.NonNull android.graphics.Typeface r2) {
                r1 = this;
                androidx.core.content.res.ResourcesCompat$FontCallback r0 = r1.mFontCallback
                if (r0 == 0) goto L7
                r0.onFontRetrieved(r2)
            L7:
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            androidx.core.graphics.TypefaceCompatApi29Impl r0 = new androidx.core.graphics.TypefaceCompatApi29Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
            goto L3f
        Le:
            r1 = 28
            if (r0 < r1) goto L1a
            androidx.core.graphics.TypefaceCompatApi28Impl r0 = new androidx.core.graphics.TypefaceCompatApi28Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
            goto L3f
        L1a:
            r1 = 26
            if (r0 < r1) goto L26
            androidx.core.graphics.TypefaceCompatApi26Impl r0 = new androidx.core.graphics.TypefaceCompatApi26Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
            goto L3f
        L26:
            r1 = 24
            if (r0 < r1) goto L38
            boolean r0 = androidx.core.graphics.TypefaceCompatApi24Impl.isUsable()
            if (r0 == 0) goto L38
            androidx.core.graphics.TypefaceCompatApi24Impl r0 = new androidx.core.graphics.TypefaceCompatApi24Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
            goto L3f
        L38:
            androidx.core.graphics.TypefaceCompatApi21Impl r0 = new androidx.core.graphics.TypefaceCompatApi21Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
        L3f:
            androidx.collection.LruCache r0 = new androidx.collection.LruCache
            r1 = 16
            r0.<init>(r1)
            androidx.core.graphics.TypefaceCompat.sTypefaceCache = r0
            return
    }

    private TypefaceCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.VisibleForTesting
    public static void clearCache() {
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            r0.evictAll()
            return
    }

    @androidx.annotation.NonNull
    public static android.graphics.Typeface create(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.Nullable android.graphics.Typeface r1, int r2) {
            if (r0 == 0) goto L7
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r1, r2)
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Context cannot be null"
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    public static android.graphics.Typeface create(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.Nullable android.graphics.Typeface r4, @androidx.annotation.IntRange(from = 1, to = 1000) int r5, boolean r6) {
            if (r3 == 0) goto L16
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r1 = "weight"
            r2 = 1
            androidx.core.util.Preconditions.checkArgumentInRange(r5, r2, r0, r1)
            if (r4 != 0) goto Lf
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
        Lf:
            androidx.core.graphics.TypefaceCompatBaseImpl r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            android.graphics.Typeface r3 = r0.createWeightStyle(r3, r4, r5, r6)
            return r3
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Context cannot be null"
            r3.<init>(r4)
            throw r3
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static android.graphics.Typeface createFromFontInfo(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.os.CancellationSignal r2, @androidx.annotation.NonNull androidx.core.provider.FontsContractCompat.FontInfo[] r3, int r4) {
            androidx.core.graphics.TypefaceCompatBaseImpl r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            android.graphics.Typeface r1 = r0.createFromFontInfo(r1, r2, r3, r4)
            return r1
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @java.lang.Deprecated
    public static android.graphics.Typeface createFromResourcesFamilyXml(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry r11, @androidx.annotation.NonNull android.content.res.Resources r12, int r13, int r14, @androidx.annotation.Nullable androidx.core.content.res.ResourcesCompat.FontCallback r15, @androidx.annotation.Nullable android.os.Handler r16, boolean r17) {
            r4 = 0
            r5 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            android.graphics.Typeface r10 = createFromResourcesFamilyXml(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static android.graphics.Typeface createFromResourcesFamilyXml(@androidx.annotation.NonNull android.content.Context r12, @androidx.annotation.NonNull androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry r13, @androidx.annotation.NonNull android.content.res.Resources r14, int r15, @androidx.annotation.Nullable java.lang.String r16, int r17, int r18, @androidx.annotation.Nullable androidx.core.content.res.ResourcesCompat.FontCallback r19, @androidx.annotation.Nullable android.os.Handler r20, boolean r21) {
            r0 = r19
            r1 = r20
            boolean r2 = r13 instanceof androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry
            if (r2 == 0) goto L4a
            androidx.core.content.res.FontResourcesParserCompat$ProviderResourceEntry r13 = (androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry) r13
            java.lang.String r2 = r13.getSystemFontFamilyName()
            android.graphics.Typeface r2 = getSystemFontFamily(r2)
            if (r2 == 0) goto L1a
            if (r0 == 0) goto L19
            r0.callbackSuccessAsync(r2, r1)
        L19:
            return r2
        L1a:
            r2 = 0
            r3 = 1
            if (r21 == 0) goto L28
            int r4 = r13.getFetchStrategy()
            if (r4 != 0) goto L26
        L24:
            r8 = 1
            goto L2b
        L26:
            r8 = 0
            goto L2b
        L28:
            if (r0 != 0) goto L26
            goto L24
        L2b:
            if (r21 == 0) goto L33
            int r2 = r13.getTimeout()
            r9 = r2
            goto L35
        L33:
            r2 = -1
            r9 = -1
        L35:
            android.os.Handler r10 = androidx.core.content.res.ResourcesCompat.FontCallback.getHandler(r1)
            androidx.core.graphics.TypefaceCompat$ResourcesCallbackAdapter r11 = new androidx.core.graphics.TypefaceCompat$ResourcesCallbackAdapter
            r11.<init>(r0)
            androidx.core.provider.FontRequest r6 = r13.getRequest()
            r5 = r12
            r7 = r18
            android.graphics.Typeface r12 = androidx.core.provider.FontsContractCompat.requestFont(r5, r6, r7, r8, r9, r10, r11)
            goto L60
        L4a:
            androidx.core.graphics.TypefaceCompatBaseImpl r2 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry r13 = (androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry) r13
            r7 = r18
            android.graphics.Typeface r12 = r2.createFromFontFamilyFilesResourceEntry(r12, r13, r14, r7)
            if (r0 == 0) goto L60
            if (r12 == 0) goto L5c
            r0.callbackSuccessAsync(r12, r1)
            goto L60
        L5c:
            r13 = -3
            r0.callbackFailAsync(r13, r1)
        L60:
            if (r12 == 0) goto L6b
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r13 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            java.lang.String r14 = createResourceUid(r14, r15, r16, r17, r18)
            r13.put(r14, r12)
        L6b:
            return r12
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @java.lang.Deprecated
    public static android.graphics.Typeface createFromResourcesFontFile(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.NonNull android.content.res.Resources r7, int r8, java.lang.String r9, int r10) {
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            android.graphics.Typeface r6 = createFromResourcesFontFile(r0, r1, r2, r3, r4, r5)
            return r6
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static android.graphics.Typeface createFromResourcesFontFile(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.NonNull android.content.res.Resources r7, int r8, java.lang.String r9, int r10, int r11) {
            androidx.core.graphics.TypefaceCompatBaseImpl r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r11
            android.graphics.Typeface r6 = r0.createFromResourcesFontFile(r1, r2, r3, r4, r5)
            if (r6 == 0) goto L16
            java.lang.String r7 = createResourceUid(r2, r3, r4, r10, r5)
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r8 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            r8.put(r7, r6)
        L16:
            return r6
    }

    private static java.lang.String createResourceUid(android.content.res.Resources r1, int r2, java.lang.String r3, int r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getResourcePackageName(r2)
            r0.append(r1)
            r1 = 45
            r0.append(r1)
            r0.append(r3)
            r0.append(r1)
            r0.append(r4)
            r0.append(r1)
            r0.append(r2)
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @java.lang.Deprecated
    public static android.graphics.Typeface findFromCache(@androidx.annotation.NonNull android.content.res.Resources r2, int r3, int r4) {
            r0 = 0
            r1 = 0
            android.graphics.Typeface r2 = findFromCache(r2, r3, r0, r1, r4)
            return r2
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static android.graphics.Typeface findFromCache(@androidx.annotation.NonNull android.content.res.Resources r1, int r2, @androidx.annotation.Nullable java.lang.String r3, int r4, int r5) {
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            java.lang.String r1 = createResourceUid(r1, r2, r3, r4, r5)
            java.lang.Object r1 = r0.get(r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            return r1
    }

    @androidx.annotation.Nullable
    private static android.graphics.Typeface getBestFontFromFamily(android.content.Context r2, android.graphics.Typeface r3, int r4) {
            androidx.core.graphics.TypefaceCompatBaseImpl r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry r3 = r0.getFontFamily(r3)
            if (r3 != 0) goto La
            r2 = 0
            return r2
        La:
            android.content.res.Resources r1 = r2.getResources()
            android.graphics.Typeface r2 = r0.createFromFontFamilyFilesResourceEntry(r2, r3, r1, r4)
            return r2
    }

    private static android.graphics.Typeface getSystemFontFamily(@androidx.annotation.Nullable java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L1e
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto La
            goto L1e
        La:
            r1 = 0
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r1)
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r2, r1)
            if (r3 == 0) goto L1e
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L1e
            return r3
        L1e:
            return r0
    }
}
