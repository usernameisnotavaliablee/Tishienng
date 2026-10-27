package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MutableOptionsBundle extends androidx.camera.core.impl.OptionsBundle implements androidx.camera.core.impl.MutableConfig {

    @androidx.annotation.NonNull
    private static final androidx.camera.core.impl.Config.OptionPriority DEFAULT_PRIORITY = null;

    static {
            androidx.camera.core.impl.Config$OptionPriority r0 = androidx.camera.core.impl.Config.OptionPriority.OPTIONAL
            androidx.camera.core.impl.MutableOptionsBundle.DEFAULT_PRIORITY = r0
            return
    }

    private MutableOptionsBundle(java.util.TreeMap<androidx.camera.core.impl.Config.Option<?>, java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object>> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.MutableOptionsBundle create() {
            androidx.camera.core.impl.MutableOptionsBundle r0 = new androidx.camera.core.impl.MutableOptionsBundle
            java.util.TreeMap r1 = new java.util.TreeMap
            java.util.Comparator<androidx.camera.core.impl.Config$Option<?>> r2 = androidx.camera.core.impl.OptionsBundle.ID_COMPARE
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.MutableOptionsBundle from(@androidx.annotation.NonNull androidx.camera.core.impl.Config r7) {
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator<androidx.camera.core.impl.Config$Option<?>> r1 = androidx.camera.core.impl.OptionsBundle.ID_COMPARE
            r0.<init>(r1)
            java.util.Set r1 = r7.listOptions()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r1.next()
            androidx.camera.core.impl.Config$Option r2 = (androidx.camera.core.impl.Config.Option) r2
            java.util.Set r3 = r7.getPriorities(r2)
            android.util.ArrayMap r4 = new android.util.ArrayMap
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L28:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L3c
            java.lang.Object r5 = r3.next()
            androidx.camera.core.impl.Config$OptionPriority r5 = (androidx.camera.core.impl.Config.OptionPriority) r5
            java.lang.Object r6 = r7.retrieveOptionWithPriority(r2, r5)
            r4.put(r5, r6)
            goto L28
        L3c:
            r0.put(r2, r4)
            goto Lf
        L40:
            androidx.camera.core.impl.MutableOptionsBundle r7 = new androidx.camera.core.impl.MutableOptionsBundle
            r7.<init>(r0)
            return r7
    }

    @Override // androidx.camera.core.impl.MutableConfig
    public <ValueT> void insertOption(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<ValueT> r6, @androidx.annotation.NonNull androidx.camera.core.impl.Config.OptionPriority r7, @androidx.annotation.Nullable ValueT r8) {
            r5 = this;
            java.util.TreeMap<androidx.camera.core.impl.Config$Option<?>, java.util.Map<androidx.camera.core.impl.Config$OptionPriority, java.lang.Object>> r0 = r5.mOptions
            java.lang.Object r0 = r0.get(r6)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L18
            android.util.ArrayMap r0 = new android.util.ArrayMap
            r0.<init>()
            java.util.TreeMap<androidx.camera.core.impl.Config$Option<?>, java.util.Map<androidx.camera.core.impl.Config$OptionPriority, java.lang.Object>> r1 = r5.mOptions
            r1.put(r6, r0)
            r0.put(r7, r8)
            return
        L18:
            java.util.Set r1 = r0.keySet()
            java.lang.Object r1 = java.util.Collections.min(r1)
            androidx.camera.core.impl.Config$OptionPriority r1 = (androidx.camera.core.impl.Config.OptionPriority) r1
            java.lang.Object r2 = r0.get(r1)
            boolean r2 = java.util.Objects.equals(r2, r8)
            if (r2 != 0) goto L70
            boolean r2 = androidx.camera.core.impl.o.a(r1, r7)
            if (r2 != 0) goto L33
            goto L70
        L33:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Option values conflicts: "
            r3.append(r4)
            java.lang.String r6 = r6.getId()
            r3.append(r6)
            java.lang.String r6 = ", existing value ("
            r3.append(r6)
            r3.append(r1)
            java.lang.String r6 = ")="
            r3.append(r6)
            java.lang.Object r0 = r0.get(r1)
            r3.append(r0)
            java.lang.String r0 = ", conflicting ("
            r3.append(r0)
            r3.append(r7)
            r3.append(r6)
            r3.append(r8)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6)
            throw r2
        L70:
            r0.put(r7, r8)
            return
    }

    @Override // androidx.camera.core.impl.MutableConfig
    public <ValueT> void insertOption(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<ValueT> r2, @androidx.annotation.Nullable ValueT r3) {
            r1 = this;
            androidx.camera.core.impl.Config$OptionPriority r0 = androidx.camera.core.impl.MutableOptionsBundle.DEFAULT_PRIORITY
            r1.insertOption(r2, r0, r3)
            return
    }

    @Override // androidx.camera.core.impl.MutableConfig
    @androidx.annotation.Nullable
    public <ValueT> ValueT removeOption(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<ValueT> r2) {
            r1 = this;
            java.util.TreeMap<androidx.camera.core.impl.Config$Option<?>, java.util.Map<androidx.camera.core.impl.Config$OptionPriority, java.lang.Object>> r0 = r1.mOptions
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }
}
