package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n361#2,3:451\n364#2,4:455\n1#3:454\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n198#1:451,3\n198#1:455,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SavedStateHandle {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.Class<? extends java.lang.Object>[] ACCEPTABLE_CLASSES = null;

    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.SavedStateHandle.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String KEYS = "keys";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String VALUES = "values";

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, kotlinx.coroutines.flow.t<java.lang.Object>> flows;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?>> liveDatas;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.lang.Object> regular;

    @org.jetbrains.annotations.NotNull
    private final androidx.savedstate.SavedStateRegistry.SavedStateProvider savedStateProvider;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry.SavedStateProvider> savedStateProviders;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        @org.jetbrains.annotations.NotNull
        public final androidx.lifecycle.SavedStateHandle createHandle(@org.jetbrains.annotations.Nullable android.os.Bundle r6, @org.jetbrains.annotations.Nullable android.os.Bundle r7) {
                r5 = this;
                if (r6 != 0) goto L36
                if (r7 != 0) goto La
                androidx.lifecycle.SavedStateHandle r6 = new androidx.lifecycle.SavedStateHandle
                r6.<init>()
                return r6
            La:
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                java.util.Set r0 = r7.keySet()
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L30
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r2 = "key"
                kotlin.jvm.internal.g0.o(r1, r2)
                java.lang.Object r2 = r7.get(r1)
                r6.put(r1, r2)
                goto L17
            L30:
                androidx.lifecycle.SavedStateHandle r7 = new androidx.lifecycle.SavedStateHandle
                r7.<init>(r6)
                return r7
            L36:
                java.lang.String r7 = "keys"
                java.util.ArrayList r7 = r6.getParcelableArrayList(r7)
                java.lang.String r0 = "values"
                java.util.ArrayList r6 = r6.getParcelableArrayList(r0)
                if (r7 == 0) goto L78
                if (r6 == 0) goto L78
                int r0 = r7.size()
                int r1 = r6.size()
                if (r0 != r1) goto L78
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                int r1 = r7.size()
                r2 = 0
            L5b:
                if (r2 >= r1) goto L72
                java.lang.Object r3 = r7.get(r2)
                java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
                kotlin.jvm.internal.g0.n(r3, r4)
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r6.get(r2)
                r0.put(r3, r4)
                int r2 = r2 + 1
                goto L5b
            L72:
                androidx.lifecycle.SavedStateHandle r6 = new androidx.lifecycle.SavedStateHandle
                r6.<init>(r0)
                return r6
            L78:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "Invalid bundle passed as restored state"
                r6.<init>(r7)
                throw r6
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean validateValue(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
                r6 = this;
                r0 = 1
                if (r7 != 0) goto L4
                return r0
            L4:
                java.lang.Class[] r1 = androidx.lifecycle.SavedStateHandle.access$getACCEPTABLE_CLASSES$cp()
                int r2 = r1.length
                r3 = 0
                r4 = 0
            Lb:
                if (r4 >= r2) goto L1c
                r5 = r1[r4]
                kotlin.jvm.internal.g0.m(r5)
                boolean r5 = r5.isInstance(r7)
                if (r5 == 0) goto L19
                return r0
            L19:
                int r4 = r4 + 1
                goto Lb
            L1c:
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class SavingStateLiveData<T> extends androidx.lifecycle.MutableLiveData<T> {

        @org.jetbrains.annotations.Nullable
        private androidx.lifecycle.SavedStateHandle handle;

        @org.jetbrains.annotations.NotNull
        private java.lang.String key;

        public SavingStateLiveData(@org.jetbrains.annotations.Nullable androidx.lifecycle.SavedStateHandle r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.<init>()
                r1.key = r3
                r1.handle = r2
                return
        }

        public SavingStateLiveData(@org.jetbrains.annotations.Nullable androidx.lifecycle.SavedStateHandle r2, @org.jetbrains.annotations.NotNull java.lang.String r3, T r4) {
                r1 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.<init>(r4)
                r1.key = r3
                r1.handle = r2
                return
        }

        public final void detach() {
                r1 = this;
                r0 = 0
                r1.handle = r0
                return
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T r4) {
                r3 = this;
                androidx.lifecycle.SavedStateHandle r0 = r3.handle
                if (r0 == 0) goto L1f
                java.util.Map r1 = androidx.lifecycle.SavedStateHandle.access$getRegular$p(r0)
                java.lang.String r2 = r3.key
                r1.put(r2, r4)
                java.util.Map r0 = androidx.lifecycle.SavedStateHandle.access$getFlows$p(r0)
                java.lang.String r1 = r3.key
                java.lang.Object r0 = r0.get(r1)
                kotlinx.coroutines.flow.t r0 = (kotlinx.coroutines.flow.t) r0
                if (r0 != 0) goto L1c
                goto L1f
            L1c:
                r0.setValue(r4)
            L1f:
                super.setValue(r4)
                return
        }
    }

    static {
            androidx.lifecycle.SavedStateHandle$Companion r0 = new androidx.lifecycle.SavedStateHandle$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.SavedStateHandle.Companion = r0
            r0 = 29
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r2 = 0
            r0[r2] = r1
            java.lang.Class<boolean[]> r1 = boolean[].class
            r2 = 1
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            r2 = 2
            r0[r2] = r1
            java.lang.Class<double[]> r1 = double[].class
            r2 = 3
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 4
            r0[r2] = r1
            java.lang.Class<int[]> r1 = int[].class
            r2 = 5
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r2 = 6
            r0[r2] = r1
            java.lang.Class<long[]> r1 = long[].class
            r2 = 7
            r0[r2] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r2 = 8
            r0[r2] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r2 = 9
            r0[r2] = r1
            java.lang.Class<android.os.Binder> r1 = android.os.Binder.class
            r2 = 10
            r0[r2] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r2 = 11
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Byte.TYPE
            r2 = 12
            r0[r2] = r1
            java.lang.Class<byte[]> r1 = byte[].class
            r2 = 13
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Character.TYPE
            r2 = 14
            r0[r2] = r1
            java.lang.Class<char[]> r1 = char[].class
            r2 = 15
            r0[r2] = r1
            java.lang.Class<java.lang.CharSequence> r1 = java.lang.CharSequence.class
            r2 = 16
            r0[r2] = r1
            java.lang.Class<java.lang.CharSequence[]> r1 = java.lang.CharSequence[].class
            r2 = 17
            r0[r2] = r1
            java.lang.Class<java.util.ArrayList> r1 = java.util.ArrayList.class
            r2 = 18
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r2 = 19
            r0[r2] = r1
            java.lang.Class<float[]> r1 = float[].class
            r2 = 20
            r0[r2] = r1
            java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
            r2 = 21
            r0[r2] = r1
            java.lang.Class<android.os.Parcelable[]> r1 = android.os.Parcelable[].class
            r2 = 22
            r0[r2] = r1
            java.lang.Class<java.io.Serializable> r1 = java.io.Serializable.class
            r2 = 23
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Short.TYPE
            r2 = 24
            r0[r2] = r1
            java.lang.Class<short[]> r1 = short[].class
            r2 = 25
            r0[r2] = r1
            java.lang.Class<android.util.SparseArray> r1 = android.util.SparseArray.class
            r2 = 26
            r0[r2] = r1
            java.lang.Class<android.util.Size> r1 = android.util.Size.class
            r2 = 27
            r0[r2] = r1
            java.lang.Class<android.util.SizeF> r1 = android.util.SizeF.class
            r2 = 28
            r0[r2] = r1
            androidx.lifecycle.SavedStateHandle.ACCEPTABLE_CLASSES = r0
            return
    }

    public SavedStateHandle() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.regular = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.savedStateProviders = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.liveDatas = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.flows = r0
            androidx.lifecycle.k r0 = new androidx.lifecycle.k
            r0.<init>(r1)
            r1.savedStateProvider = r0
            return
    }

    public SavedStateHandle(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r3) {
            r2 = this;
            java.lang.String r0 = "initialState"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.regular = r0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r2.savedStateProviders = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r2.liveDatas = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r2.flows = r1
            androidx.lifecycle.k r1 = new androidx.lifecycle.k
            r1.<init>(r2)
            r2.savedStateProvider = r1
            r0.putAll(r3)
            return
    }

    public static /* synthetic */ android.os.Bundle a(androidx.lifecycle.SavedStateHandle r0) {
            android.os.Bundle r0 = savedStateProvider$lambda$0(r0)
            return r0
    }

    public static final /* synthetic */ java.lang.Class[] access$getACCEPTABLE_CLASSES$cp() {
            java.lang.Class<? extends java.lang.Object>[] r0 = androidx.lifecycle.SavedStateHandle.ACCEPTABLE_CLASSES
            return r0
    }

    public static final /* synthetic */ java.util.Map access$getFlows$p(androidx.lifecycle.SavedStateHandle r0) {
            java.util.Map<java.lang.String, kotlinx.coroutines.flow.t<java.lang.Object>> r0 = r0.flows
            return r0
    }

    public static final /* synthetic */ java.util.Map access$getRegular$p(androidx.lifecycle.SavedStateHandle r0) {
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.regular
            return r0
    }

    @kotlin.jvm.JvmStatic
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.SavedStateHandle createHandle(@org.jetbrains.annotations.Nullable android.os.Bundle r1, @org.jetbrains.annotations.Nullable android.os.Bundle r2) {
            androidx.lifecycle.SavedStateHandle$Companion r0 = androidx.lifecycle.SavedStateHandle.Companion
            androidx.lifecycle.SavedStateHandle r1 = r0.createHandle(r1, r2)
            return r1
    }

    private final <T> androidx.lifecycle.MutableLiveData<T> getLiveDataInternal(java.lang.String r3, boolean r4, T r5) {
            r2 = this;
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r0 = r2.liveDatas
            java.lang.Object r0 = r0.get(r3)
            boolean r1 = r0 instanceof androidx.lifecycle.MutableLiveData
            if (r1 == 0) goto Ld
            androidx.lifecycle.MutableLiveData r0 = (androidx.lifecycle.MutableLiveData) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L11
            return r0
        L11:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.regular
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L25
            androidx.lifecycle.SavedStateHandle$SavingStateLiveData r4 = new androidx.lifecycle.SavedStateHandle$SavingStateLiveData
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.regular
            java.lang.Object r5 = r5.get(r3)
            r4.<init>(r2, r3, r5)
            goto L37
        L25:
            if (r4 == 0) goto L32
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.regular
            r4.put(r3, r5)
            androidx.lifecycle.SavedStateHandle$SavingStateLiveData r4 = new androidx.lifecycle.SavedStateHandle$SavingStateLiveData
            r4.<init>(r2, r3, r5)
            goto L37
        L32:
            androidx.lifecycle.SavedStateHandle$SavingStateLiveData r4 = new androidx.lifecycle.SavedStateHandle$SavingStateLiveData
            r4.<init>(r2, r3)
        L37:
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r5 = r2.liveDatas
            r5.put(r3, r4)
            return r4
    }

    private static final android.os.Bundle savedStateProvider$lambda$0(androidx.lifecycle.SavedStateHandle r5) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r5.savedStateProviders
            java.util.Map r0 = kotlin.collections.i1.D0(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r1 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r1
            android.os.Bundle r1 = r1.saveState()
            r5.set(r2, r1)
            goto L13
        L33:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.regular
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L4f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L68
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.add(r3)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r5.regular
            java.lang.Object r3 = r4.get(r3)
            r2.add(r3)
            goto L4f
        L68:
            java.lang.String r5 = "keys"
            kotlin.Pair r5 = kotlin.o0.a(r5, r1)
            java.lang.String r0 = "values"
            kotlin.Pair r0 = kotlin.o0.a(r0, r2)
            r1 = 2
            kotlin.Pair[] r1 = new kotlin.Pair[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 1
            r1[r5] = r0
            android.os.Bundle r5 = androidx.core.os.BundleKt.bundleOf(r1)
            return r5
    }

    @androidx.annotation.MainThread
    public final void clearSavedStateProvider(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r1.savedStateProviders
            r0.remove(r2)
            return
    }

    @androidx.annotation.MainThread
    public final boolean contains(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.regular
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.Nullable
    public final <T> T get(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.regular     // Catch: java.lang.ClassCastException -> Lc
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.ClassCastException -> Lc
            return r2
        Lc:
            r1.remove(r2)
            r2 = 0
            return r2
    }

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.NotNull
    public final <T> androidx.lifecycle.MutableLiveData<T> getLiveData(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            r1 = 0
            androidx.lifecycle.MutableLiveData r3 = r2.getLiveDataInternal(r3, r0, r1)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>"
            kotlin.jvm.internal.g0.n(r3, r0)
            return r3
    }

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.NotNull
    public final <T> androidx.lifecycle.MutableLiveData<T> getLiveData(@org.jetbrains.annotations.NotNull java.lang.String r2, T r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 1
            androidx.lifecycle.MutableLiveData r2 = r1.getLiveDataInternal(r2, r0, r3)
            return r2
    }

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.NotNull
    public final <T> kotlinx.coroutines.flow.h0<T> getStateFlow(@org.jetbrains.annotations.NotNull java.lang.String r3, T r4) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Map<java.lang.String, kotlinx.coroutines.flow.t<java.lang.Object>> r0 = r2.flows
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L2c
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.regular
            boolean r1 = r1.containsKey(r3)
            if (r1 != 0) goto L1a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.regular
            r1.put(r3, r4)
        L1a:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.regular
            java.lang.Object r4 = r4.get(r3)
            kotlinx.coroutines.flow.t r1 = kotlinx.coroutines.flow.j0.a(r4)
            java.util.Map<java.lang.String, kotlinx.coroutines.flow.t<java.lang.Object>> r4 = r2.flows
            r4.put(r3, r1)
            r0.put(r3, r1)
        L2c:
            kotlinx.coroutines.flow.t r1 = (kotlinx.coroutines.flow.t) r1
            kotlinx.coroutines.flow.h0 r3 = kotlinx.coroutines.flow.k.m(r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>"
            kotlin.jvm.internal.g0.n(r3, r4)
            return r3
    }

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.NotNull
    public final java.util.Set<java.lang.String> keys() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.regular
            java.util.Set r0 = r0.keySet()
            java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r1 = r2.savedStateProviders
            java.util.Set r1 = r1.keySet()
            java.util.Set r0 = kotlin.collections.u1.C(r0, r1)
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r1 = r2.liveDatas
            java.util.Set r1 = r1.keySet()
            java.util.Set r0 = kotlin.collections.u1.C(r0, r1)
            return r0
    }

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.Nullable
    public final <T> T remove(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.regular
            java.lang.Object r0 = r0.remove(r3)
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r1 = r2.liveDatas
            java.lang.Object r1 = r1.remove(r3)
            androidx.lifecycle.SavedStateHandle$SavingStateLiveData r1 = (androidx.lifecycle.SavedStateHandle.SavingStateLiveData) r1
            if (r1 == 0) goto L18
            r1.detach()
        L18:
            java.util.Map<java.lang.String, kotlinx.coroutines.flow.t<java.lang.Object>> r1 = r2.flows
            r1.remove(r3)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @org.jetbrains.annotations.NotNull
    public final androidx.savedstate.SavedStateRegistry.SavedStateProvider savedStateProvider() {
            r1 = this;
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r0 = r1.savedStateProvider
            return r0
    }

    @androidx.annotation.MainThread
    public final <T> void set(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.Nullable T r4) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.lifecycle.SavedStateHandle$Companion r0 = androidx.lifecycle.SavedStateHandle.Companion
            boolean r0 = r0.validateValue(r4)
            if (r0 == 0) goto L35
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r0 = r2.liveDatas
            java.lang.Object r0 = r0.get(r3)
            boolean r1 = r0 instanceof androidx.lifecycle.MutableLiveData
            if (r1 == 0) goto L1a
            androidx.lifecycle.MutableLiveData r0 = (androidx.lifecycle.MutableLiveData) r0
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 == 0) goto L21
            r0.setValue(r4)
            goto L26
        L21:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.regular
            r0.put(r3, r4)
        L26:
            java.util.Map<java.lang.String, kotlinx.coroutines.flow.t<java.lang.Object>> r0 = r2.flows
            java.lang.Object r3 = r0.get(r3)
            kotlinx.coroutines.flow.t r3 = (kotlinx.coroutines.flow.t) r3
            if (r3 != 0) goto L31
            return
        L31:
            r3.setValue(r4)
            return
        L35:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't put value with type "
            r0.append(r1)
            kotlin.jvm.internal.g0.m(r4)
            java.lang.Class r4 = r4.getClass()
            r0.append(r4)
            java.lang.String r4 = " into saved state"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    @androidx.annotation.MainThread
    public final void setSavedStateProvider(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull androidx.savedstate.SavedStateRegistry.SavedStateProvider r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "provider"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r1.savedStateProviders
            r0.put(r2, r3)
            return
    }
}
