package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(26)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TypefaceCompatApi26Impl extends androidx.core.graphics.TypefaceCompatApi21Impl {
    private static final java.lang.String ABORT_CREATION_METHOD = "abortCreation";
    private static final java.lang.String ADD_FONT_FROM_ASSET_MANAGER_METHOD = "addFontFromAssetManager";
    private static final java.lang.String ADD_FONT_FROM_BUFFER_METHOD = "addFontFromBuffer";
    private static final java.lang.String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final java.lang.String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final java.lang.String FREEZE_METHOD = "freeze";
    private static final int RESOLVE_BY_FONT_TABLE = -1;
    private static final java.lang.String TAG = "TypefaceCompatApi26Impl";
    protected final java.lang.reflect.Method mAbortCreation;
    protected final java.lang.reflect.Method mAddFontFromAssetManager;
    protected final java.lang.reflect.Method mAddFontFromBuffer;
    protected final java.lang.reflect.Method mCreateFromFamiliesWithDefault;
    protected final java.lang.Class<?> mFontFamily;
    protected final java.lang.reflect.Constructor<?> mFontFamilyCtor;
    protected final java.lang.reflect.Method mFreeze;

    public TypefaceCompatApi26Impl() {
            r7 = this;
            r7.<init>()
            java.lang.Class r0 = r7.obtainFontFamily()     // Catch: java.lang.Throwable -> L20
            java.lang.reflect.Constructor r1 = r7.obtainFontFamilyCtor(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.reflect.Method r2 = r7.obtainAddFontFromAssetManagerMethod(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.reflect.Method r3 = r7.obtainAddFontFromBufferMethod(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.reflect.Method r4 = r7.obtainFreezeMethod(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.reflect.Method r5 = r7.obtainAbortCreationMethod(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.reflect.Method r6 = r7.obtainCreateFromFamiliesWithDefaultMethod(r0)     // Catch: java.lang.Throwable -> L20
            goto L27
        L20:
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        L27:
            r7.mFontFamily = r0
            r7.mFontFamilyCtor = r1
            r7.mAddFontFromAssetManager = r2
            r7.mAddFontFromBuffer = r3
            r7.mFreeze = r4
            r7.mAbortCreation = r5
            r7.mCreateFromFamiliesWithDefault = r6
            return
    }

    private void abortCreation(java.lang.Object r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.mAbortCreation     // Catch: java.lang.Throwable -> L6
            r1 = 0
            r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> L6
        L6:
            return
    }

    private boolean addFontFromAssetManager(android.content.Context r5, java.lang.Object r6, java.lang.String r7, int r8, int r9, int r10, @androidx.annotation.Nullable android.graphics.fonts.FontVariationAxis[] r11) {
            r4 = this;
            r0 = 0
            java.lang.reflect.Method r1 = r4.mAddFontFromAssetManager     // Catch: java.lang.Throwable -> L3f
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L3f
            r3 = 8
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3f
            r3[r0] = r5     // Catch: java.lang.Throwable -> L3f
            r5 = 1
            r3[r5] = r7     // Catch: java.lang.Throwable -> L3f
            r5 = 2
            r3[r5] = r2     // Catch: java.lang.Throwable -> L3f
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L3f
            r7 = 3
            r3[r7] = r5     // Catch: java.lang.Throwable -> L3f
            r5 = 4
            r3[r5] = r8     // Catch: java.lang.Throwable -> L3f
            r5 = 5
            r3[r5] = r9     // Catch: java.lang.Throwable -> L3f
            r5 = 6
            r3[r5] = r10     // Catch: java.lang.Throwable -> L3f
            r5 = 7
            r3[r5] = r11     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r5 = r1.invoke(r6, r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L3f
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L3f
            return r5
        L3f:
            return r0
    }

    private boolean addFontFromBuffer(java.lang.Object r4, java.nio.ByteBuffer r5, int r6, int r7, int r8) {
            r3 = this;
            r0 = 0
            java.lang.reflect.Method r1 = r3.mAddFontFromBuffer     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L2c
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2c
            r2[r0] = r5     // Catch: java.lang.Throwable -> L2c
            r5 = 1
            r2[r5] = r6     // Catch: java.lang.Throwable -> L2c
            r5 = 2
            r6 = 0
            r2[r5] = r6     // Catch: java.lang.Throwable -> L2c
            r5 = 3
            r2[r5] = r7     // Catch: java.lang.Throwable -> L2c
            r5 = 4
            r2[r5] = r8     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = r1.invoke(r4, r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L2c
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L2c
            return r4
        L2c:
            return r0
    }

    private boolean freeze(java.lang.Object r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.mFreeze     // Catch: java.lang.Throwable -> Le
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> Le
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> Le
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Le
            return r3
        Le:
            r3 = 0
            return r3
    }

    private boolean isFontFamilyPrivateAPIAvailable() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.mAddFontFromAssetManager
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    private java.lang.Object newFamily() {
            r2 = this;
            r0 = 0
            java.lang.reflect.Constructor<?> r1 = r2.mFontFamilyCtor     // Catch: java.lang.Throwable -> L7
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L7
        L7:
            return r0
    }

    @androidx.annotation.Nullable
    protected android.graphics.Typeface createFromFamiliesWithDefault(java.lang.Object r7) {
            r6 = this;
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.Class<?> r2 = r6.mFontFamily     // Catch: java.lang.Throwable -> L24
            r3 = 1
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r3)     // Catch: java.lang.Throwable -> L24
            r4 = 0
            java.lang.reflect.Array.set(r2, r4, r7)     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Method r7 = r6.mCreateFromFamiliesWithDefault     // Catch: java.lang.Throwable -> L24
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L24
            r5[r4] = r2     // Catch: java.lang.Throwable -> L24
            r5[r3] = r0     // Catch: java.lang.Throwable -> L24
            r2 = 2
            r5[r2] = r0     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r7.invoke(r1, r5)     // Catch: java.lang.Throwable -> L24
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7     // Catch: java.lang.Throwable -> L24
            return r7
        L24:
            return r1
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    @androidx.annotation.Nullable
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context r10, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r11, android.content.res.Resources r12, int r13) {
            r9 = this;
            boolean r0 = r9.isFontFamilyPrivateAPIAvailable()
            if (r0 != 0) goto Lb
            android.graphics.Typeface r10 = super.createFromFontFamilyFilesResourceEntry(r10, r11, r12, r13)
            return r10
        Lb:
            java.lang.Object r2 = r9.newFamily()
            r12 = 0
            if (r2 != 0) goto L13
            return r12
        L13:
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r11 = r11.getEntries()
            int r13 = r11.length
            r0 = 0
            r8 = 0
        L1a:
            if (r8 >= r13) goto L46
            r0 = r11[r8]
            java.lang.String r3 = r0.getFileName()
            int r4 = r0.getTtcIndex()
            int r5 = r0.getWeight()
            boolean r6 = r0.isItalic()
            java.lang.String r0 = r0.getVariationSettings()
            android.graphics.fonts.FontVariationAxis[] r7 = android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(r0)
            r0 = r9
            r1 = r10
            boolean r10 = r0.addFontFromAssetManager(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != 0) goto L42
            r9.abortCreation(r2)
            return r12
        L42:
            int r8 = r8 + 1
            r10 = r1
            goto L1a
        L46:
            r0 = r9
            boolean r10 = r9.freeze(r2)
            if (r10 != 0) goto L4e
            return r12
        L4e:
            android.graphics.Typeface r10 = r9.createFromFamiliesWithDefault(r2)
            return r10
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    @androidx.annotation.Nullable
    public android.graphics.Typeface createFromFontInfo(android.content.Context r10, @androidx.annotation.Nullable android.os.CancellationSignal r11, @androidx.annotation.NonNull androidx.core.provider.FontsContractCompat.FontInfo[] r12, int r13) {
            r9 = this;
            int r0 = r12.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L6
            return r1
        L6:
            boolean r0 = r9.isFontFamilyPrivateAPIAvailable()
            if (r0 != 0) goto L54
            androidx.core.provider.FontsContractCompat$FontInfo r12 = r9.findBestInfo(r12, r13)
            android.content.ContentResolver r10 = r10.getContentResolver()
            android.net.Uri r13 = r12.getUri()     // Catch: java.io.IOException -> L53
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r10 = r10.openFileDescriptor(r13, r0, r11)     // Catch: java.io.IOException -> L53
            if (r10 != 0) goto L26
            if (r10 == 0) goto L25
            r10.close()     // Catch: java.io.IOException -> L53
        L25:
            return r1
        L26:
            android.graphics.Typeface$Builder r11 = new android.graphics.Typeface$Builder     // Catch: java.lang.Throwable -> L47
            java.io.FileDescriptor r13 = r10.getFileDescriptor()     // Catch: java.lang.Throwable -> L47
            r11.<init>(r13)     // Catch: java.lang.Throwable -> L47
            int r13 = r12.getWeight()     // Catch: java.lang.Throwable -> L47
            android.graphics.Typeface$Builder r11 = r11.setWeight(r13)     // Catch: java.lang.Throwable -> L47
            boolean r12 = r12.isItalic()     // Catch: java.lang.Throwable -> L47
            android.graphics.Typeface$Builder r11 = r11.setItalic(r12)     // Catch: java.lang.Throwable -> L47
            android.graphics.Typeface r11 = r11.build()     // Catch: java.lang.Throwable -> L47
            r10.close()     // Catch: java.io.IOException -> L53
            return r11
        L47:
            r0 = move-exception
            r11 = r0
            r10.close()     // Catch: java.lang.Throwable -> L4d
            goto L52
        L4d:
            r0 = move-exception
            r10 = r0
            r11.addSuppressed(r10)     // Catch: java.io.IOException -> L53
        L52:
            throw r11     // Catch: java.io.IOException -> L53
        L53:
            return r1
        L54:
            java.util.Map r10 = androidx.core.graphics.TypefaceCompatUtil.readFontInfoIntoByteBuffer(r10, r12, r11)
            java.lang.Object r4 = r9.newFamily()
            if (r4 != 0) goto L5f
            return r1
        L5f:
            int r11 = r12.length
            r0 = 0
            r3 = 0
        L62:
            if (r0 >= r11) goto L95
            r5 = r12[r0]
            android.net.Uri r6 = r5.getUri()
            java.lang.Object r6 = r10.get(r6)
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            if (r6 != 0) goto L75
            r6 = r4
            r4 = r9
            goto L91
        L75:
            r3 = r5
            r5 = r6
            int r6 = r3.getTtcIndex()
            int r7 = r3.getWeight()
            boolean r8 = r3.isItalic()
            r3 = r9
            boolean r5 = r3.addFontFromBuffer(r4, r5, r6, r7, r8)
            r6 = r4
            r4 = r3
            if (r5 != 0) goto L90
            r9.abortCreation(r6)
            return r1
        L90:
            r3 = 1
        L91:
            int r0 = r0 + 1
            r4 = r6
            goto L62
        L95:
            r6 = r4
            r4 = r9
            if (r3 != 0) goto L9d
            r9.abortCreation(r6)
            return r1
        L9d:
            boolean r10 = r9.freeze(r6)
            if (r10 != 0) goto La4
            return r1
        La4:
            android.graphics.Typeface r10 = r9.createFromFamiliesWithDefault(r6)
            if (r10 != 0) goto Lab
            return r1
        Lab:
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r13)
            return r10
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    @androidx.annotation.Nullable
    public android.graphics.Typeface createFromResourcesFontFile(android.content.Context r10, android.content.res.Resources r11, int r12, java.lang.String r13, int r14) {
            r9 = this;
            boolean r0 = r9.isFontFamilyPrivateAPIAvailable()
            if (r0 != 0) goto Lb
            android.graphics.Typeface r10 = super.createFromResourcesFontFile(r10, r11, r12, r13, r14)
            return r10
        Lb:
            java.lang.Object r3 = r9.newFamily()
            r11 = 0
            if (r3 != 0) goto L13
            return r11
        L13:
            r7 = -1
            r8 = 0
            r5 = 0
            r6 = -1
            r1 = r9
            r2 = r10
            r4 = r13
            boolean r10 = r1.addFontFromAssetManager(r2, r3, r4, r5, r6, r7, r8)
            if (r10 != 0) goto L24
            r9.abortCreation(r3)
            return r11
        L24:
            boolean r10 = r9.freeze(r3)
            if (r10 != 0) goto L2b
            return r11
        L2b:
            android.graphics.Typeface r10 = r9.createFromFamiliesWithDefault(r3)
            return r10
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    @androidx.annotation.NonNull
    android.graphics.Typeface createWeightStyle(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.graphics.Typeface r3, int r4, boolean r5) {
            r1 = this;
            android.graphics.Typeface r0 = androidx.core.graphics.WeightTypefaceApi26.createWeightStyle(r3, r4, r5)     // Catch: java.lang.RuntimeException -> L5
            goto L6
        L5:
            r0 = 0
        L6:
            if (r0 != 0) goto Lc
            android.graphics.Typeface r0 = super.createWeightStyle(r2, r3, r4, r5)
        Lc:
            return r0
    }

    protected java.lang.reflect.Method obtainAbortCreationMethod(java.lang.Class<?> r3) throws java.lang.NoSuchMethodException {
            r2 = this;
            java.lang.String r0 = "abortCreation"
            r1 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r0, r1)
            return r3
    }

    protected java.lang.reflect.Method obtainAddFontFromAssetManagerMethod(java.lang.Class<?> r5) throws java.lang.NoSuchMethodException {
            r4 = this;
            r0 = 8
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<android.content.res.AssetManager> r1 = android.content.res.AssetManager.class
            r2 = 0
            r0[r2] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r2 = 1
            r0[r2] = r1
            r1 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r3 = 3
            r0[r3] = r1
            r1 = 4
            r0[r1] = r2
            r1 = 5
            r0[r1] = r2
            r1 = 6
            r0[r1] = r2
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r1 = android.graphics.fonts.FontVariationAxis[].class
            r2 = 7
            r0[r2] = r1
            java.lang.String r1 = "addFontFromAssetManager"
            java.lang.reflect.Method r5 = r5.getMethod(r1, r0)
            return r5
    }

    protected java.lang.reflect.Method obtainAddFontFromBufferMethod(java.lang.Class<?> r5) throws java.lang.NoSuchMethodException {
            r4 = this;
            r0 = 5
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            r2 = 0
            r0[r2] = r1
            r1 = 1
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r1] = r2
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r1 = android.graphics.fonts.FontVariationAxis[].class
            r3 = 2
            r0[r3] = r1
            r1 = 3
            r0[r1] = r2
            r1 = 4
            r0[r1] = r2
            java.lang.String r1 = "addFontFromBuffer"
            java.lang.reflect.Method r5 = r5.getMethod(r1, r0)
            return r5
    }

    protected java.lang.reflect.Method obtainCreateFromFamiliesWithDefaultMethod(java.lang.Class<?> r4) throws java.lang.NoSuchMethodException {
            r3 = this;
            r0 = 1
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Class r4 = r4.getClass()
            r1 = 3
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r1[r0] = r4
            r2 = 2
            r1[r2] = r4
            java.lang.Class<android.graphics.Typeface> r4 = android.graphics.Typeface.class
            java.lang.String r2 = "createFromFamiliesWithDefault"
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r2, r1)
            r4.setAccessible(r0)
            return r4
    }

    protected java.lang.Class<?> obtainFontFamily() throws java.lang.ClassNotFoundException {
            r1 = this;
            java.lang.String r0 = "android.graphics.FontFamily"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            return r0
    }

    protected java.lang.reflect.Constructor<?> obtainFontFamilyCtor(java.lang.Class<?> r2) throws java.lang.NoSuchMethodException {
            r1 = this;
            r0 = 0
            java.lang.reflect.Constructor r2 = r2.getConstructor(r0)
            return r2
    }

    protected java.lang.reflect.Method obtainFreezeMethod(java.lang.Class<?> r3) throws java.lang.NoSuchMethodException {
            r2 = this;
            java.lang.String r0 = "freeze"
            r1 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r0, r1)
            return r3
    }
}
