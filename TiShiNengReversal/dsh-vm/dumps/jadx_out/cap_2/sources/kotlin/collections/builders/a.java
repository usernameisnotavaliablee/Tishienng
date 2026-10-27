package kotlin.collections.builders;

import java.util.Map.Entry;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class a<E extends java.util.Map.Entry<? extends K, ? extends V>, K, V> extends kotlin.collections.j<E> {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public final boolean a(@org.jetbrains.annotations.NotNull E r2) {
            r1 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r2 = r1.d(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.Map.Entry
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r2 = r1.a(r2)
            return r2
    }

    public abstract boolean d(@org.jetbrains.annotations.NotNull java.util.Map.Entry<? extends K, ? extends V> r1);

    public /* bridge */ boolean e(java.util.Map.Entry<?, ?> r1) {
            r0 = this;
            boolean r1 = super.remove(r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.Map.Entry
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r2 = r1.e(r2)
            return r2
    }
}
