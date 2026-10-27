package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class OptionsBundle implements androidx.camera.core.impl.Config {
    private static final androidx.camera.core.impl.OptionsBundle EMPTY_BUNDLE = null;
    protected static final java.util.Comparator<androidx.camera.core.impl.Config.Option<?>> ID_COMPARE = null;
    protected final java.util.TreeMap<androidx.camera.core.impl.Config.Option<?>, java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object>> mOptions;

    static {
            androidx.camera.core.impl.f0 r0 = new androidx.camera.core.impl.f0
            r0.<init>()
            androidx.camera.core.impl.OptionsBundle.ID_COMPARE = r0
            androidx.camera.core.impl.OptionsBundle r1 = new androidx.camera.core.impl.OptionsBundle
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>(r0)
            r1.<init>(r2)
            androidx.camera.core.impl.OptionsBundle.EMPTY_BUNDLE = r1
            return
    }

    OptionsBundle(java.util.TreeMap<androidx.camera.core.impl.Config.Option<?>, java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object>> r1) {
            r0 = this;
            r0.<init>()
            r0.mOptions = r1
            return
    }

    public static /* synthetic */ int a(androidx.camera.core.impl.Config.Option r0, androidx.camera.core.impl.Config.Option r1) {
            java.lang.String r0 = r0.getId()
            java.lang.String r1 = r1.getId()
            int r0 = r0.compareTo(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.OptionsBundle emptyBundle() {
            androidx.camera.core.impl.OptionsBundle r0 = androidx.camera.core.impl.OptionsBundle.EMPTY_BUNDLE
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.OptionsBundle from(@androidx.annotation.NonNull androidx.camera.core.impl.Config r7) {
            java.lang.Class<androidx.camera.core.impl.OptionsBundle> r0 = androidx.camera.core.impl.OptionsBundle.class
            java.lang.Class r1 = r7.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf
            androidx.camera.core.impl.OptionsBundle r7 = (androidx.camera.core.impl.OptionsBundle) r7
            return r7
        Lf:
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator<androidx.camera.core.impl.Config$Option<?>> r1 = androidx.camera.core.impl.OptionsBundle.ID_COMPARE
            r0.<init>(r1)
            java.util.Set r1 = r7.listOptions()
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r1.next()
            androidx.camera.core.impl.Config$Option r2 = (androidx.camera.core.impl.Config.Option) r2
            java.util.Set r3 = r7.getPriorities(r2)
            android.util.ArrayMap r4 = new android.util.ArrayMap
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L37:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L4b
            java.lang.Object r5 = r3.next()
            androidx.camera.core.impl.Config$OptionPriority r5 = (androidx.camera.core.impl.Config.OptionPriority) r5
            java.lang.Object r6 = r7.retrieveOptionWithPriority(r2, r5)
            r4.put(r5, r6)
            goto L37
        L4b:
            r0.put(r2, r4)
            goto L1e
        L4f:
            androidx.camera.core.impl.OptionsBundle r7 = new androidx.camera.core.impl.OptionsBundle
            r7.<init>(r0)
            return r7
    }

    @Override // androidx.camera.core.impl.Config
    public boolean containsOption(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<?> r2) {
            r1 = this;
            java.util.TreeMap<androidx.camera.core.impl.Config$Option<?>, java.util.Map<androidx.camera.core.impl.Config$OptionPriority, java.lang.Object>> r0 = r1.mOptions
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // androidx.camera.core.impl.Config
    public void findOptions(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull androidx.camera.core.impl.Config.OptionMatcher r5) {
            r3 = this;
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r4, r0)
            java.util.TreeMap<androidx.camera.core.impl.Config$Option<?>, java.util.Map<androidx.camera.core.impl.Config$OptionPriority, java.lang.Object>> r1 = r3.mOptions
            java.util.SortedMap r0 = r1.tailMap(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            androidx.camera.core.impl.Config$Option r2 = (androidx.camera.core.impl.Config.Option) r2
            java.lang.String r2 = r2.getId()
            boolean r2 = r2.startsWith(r4)
            if (r2 != 0) goto L31
            goto L3d
        L31:
            java.lang.Object r1 = r1.getKey()
            androidx.camera.core.impl.Config$Option r1 = (androidx.camera.core.impl.Config.Option) r1
            boolean r1 = r5.onOptionMatched(r1)
            if (r1 != 0) goto L14
        L3d:
            return
    }

    @Override // androidx.camera.core.impl.Config
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.Config.OptionPriority getOptionPriority(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<?> r4) {
            r3 = this;
            java.util.TreeMap<androidx.camera.core.impl.Config$Option<?>, java.util.Map<androidx.camera.core.impl.Config$OptionPriority, java.lang.Object>> r0 = r3.mOptions
            java.lang.Object r0 = r0.get(r4)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L15
            java.util.Set r4 = r0.keySet()
            java.lang.Object r4 = java.util.Collections.min(r4)
            androidx.camera.core.impl.Config$OptionPriority r4 = (androidx.camera.core.impl.Config.OptionPriority) r4
            return r4
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Option does not exist: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // androidx.camera.core.impl.Config
    @androidx.annotation.NonNull
    public java.util.Set<androidx.camera.core.impl.Config.OptionPriority> getPriorities(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<?> r2) {
            r1 = this;
            java.util.TreeMap<androidx.camera.core.impl.Config$Option<?>, java.util.Map<androidx.camera.core.impl.Config$OptionPriority, java.lang.Object>> r0 = r1.mOptions
            java.lang.Object r2 = r0.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto Ld
            java.util.Set r2 = java.util.Collections.EMPTY_SET
            return r2
        Ld:
            java.util.Set r2 = r2.keySet()
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r2)
            return r2
    }

    @Override // androidx.camera.core.impl.Config
    @androidx.annotation.NonNull
    public java.util.Set<androidx.camera.core.impl.Config.Option<?>> listOptions() {
            r1 = this;
            java.util.TreeMap<androidx.camera.core.impl.Config$Option<?>, java.util.Map<androidx.camera.core.impl.Config$OptionPriority, java.lang.Object>> r0 = r1.mOptions
            java.util.Set r0 = r0.keySet()
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    @Override // androidx.camera.core.impl.Config
    @androidx.annotation.Nullable
    public <ValueT> ValueT retrieveOption(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<ValueT> r4) {
            r3 = this;
            java.util.TreeMap<androidx.camera.core.impl.Config$Option<?>, java.util.Map<androidx.camera.core.impl.Config$OptionPriority, java.lang.Object>> r0 = r3.mOptions
            java.lang.Object r0 = r0.get(r4)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L19
            java.util.Set r4 = r0.keySet()
            java.lang.Object r4 = java.util.Collections.min(r4)
            androidx.camera.core.impl.Config$OptionPriority r4 = (androidx.camera.core.impl.Config.OptionPriority) r4
            java.lang.Object r4 = r0.get(r4)
            return r4
        L19:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Option does not exist: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // androidx.camera.core.impl.Config
    @androidx.annotation.Nullable
    public <ValueT> ValueT retrieveOption(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<ValueT> r1, @androidx.annotation.Nullable ValueT r2) {
            r0 = this;
            java.lang.Object r1 = r0.retrieveOption(r1)     // Catch: java.lang.IllegalArgumentException -> L5
            return r1
        L5:
            return r2
    }

    @Override // androidx.camera.core.impl.Config
    @androidx.annotation.Nullable
    public <ValueT> ValueT retrieveOptionWithPriority(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<ValueT> r4, @androidx.annotation.NonNull androidx.camera.core.impl.Config.OptionPriority r5) {
            r3 = this;
            java.util.TreeMap<androidx.camera.core.impl.Config$Option<?>, java.util.Map<androidx.camera.core.impl.Config$OptionPriority, java.lang.Object>> r0 = r3.mOptions
            java.lang.Object r0 = r0.get(r4)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "Option does not exist: "
            if (r0 == 0) goto L34
            boolean r2 = r0.containsKey(r5)
            if (r2 == 0) goto L17
            java.lang.Object r4 = r0.get(r5)
            return r4
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r4)
            java.lang.String r4 = " with priority="
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = r2.toString()
            r0.<init>(r4)
            throw r0
        L34:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
    }
}
