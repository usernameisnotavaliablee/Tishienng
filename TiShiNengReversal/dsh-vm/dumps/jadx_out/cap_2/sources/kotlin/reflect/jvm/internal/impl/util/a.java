package kotlin.reflect.jvm.internal.impl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class a<K, V> implements java.lang.Iterable<V>, l3.a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlin.reflect.jvm.internal.impl.util.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0077a<K, V, T extends V> {
        private final int a;

        public AbstractC0077a(int r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @org.jetbrains.annotations.Nullable
        protected final T c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.util.a<K, V> r2) {
                r1 = this;
                java.lang.String r0 = "thisRef"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.util.c r2 = r2.a()
                int r0 = r1.a
                java.lang.Object r2 = r2.get(r0)
                return r2
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    protected abstract kotlin.reflect.jvm.internal.impl.util.c<V> a();

    @org.jetbrains.annotations.NotNull
    protected abstract kotlin.reflect.jvm.internal.impl.util.z<K, V> d();

    protected abstract void e(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull V r2);

    protected final void f(@org.jetbrains.annotations.NotNull kotlin.reflect.d<? extends K> r2, @org.jetbrains.annotations.NotNull V r3) {
            r1 = this;
            java.lang.String r0 = "tClass"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r2 = r2.x()
            kotlin.jvm.internal.g0.m(r2)
            r1.e(r2, r3)
            return
    }

    public final boolean isEmpty() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.util.c r0 = r1.a()
            int r0 = r0.a()
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public final java.util.Iterator<V> iterator() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.util.c r0 = r1.a()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }
}
