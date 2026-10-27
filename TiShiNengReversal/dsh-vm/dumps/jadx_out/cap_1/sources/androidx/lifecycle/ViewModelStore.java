package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ViewModelStore {

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, androidx.lifecycle.ViewModel> map;

    public ViewModelStore() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.map = r0
            return
    }

    public final void clear() {
            r2 = this;
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModel> r0 = r2.map
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.lifecycle.ViewModel r1 = (androidx.lifecycle.ViewModel) r1
            r1.clear()
            goto La
        L1a:
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModel> r0 = r2.map
            r0.clear()
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @org.jetbrains.annotations.Nullable
    public final androidx.lifecycle.ViewModel get(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModel> r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            androidx.lifecycle.ViewModel r2 = (androidx.lifecycle.ViewModel) r2
            return r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @org.jetbrains.annotations.NotNull
    public final java.util.Set<java.lang.String> keys() {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModel> r1 = r2.map
            java.util.Set r1 = r1.keySet()
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final void put(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModel r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModel> r0 = r1.map
            java.lang.Object r2 = r0.put(r2, r3)
            androidx.lifecycle.ViewModel r2 = (androidx.lifecycle.ViewModel) r2
            if (r2 == 0) goto L18
            r2.onCleared()
        L18:
            return
    }
}
