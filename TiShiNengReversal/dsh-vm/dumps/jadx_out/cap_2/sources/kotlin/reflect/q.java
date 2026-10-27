package kotlin.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface q<D, E, V> extends kotlin.reflect.n<V>, kotlin.jvm.functions.Function2<D, E, V> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a<D, E, V> extends kotlin.reflect.n.c<V>, kotlin.jvm.functions.Function2<D, E, V> {
    }

    V get(D r1, E r2);

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    java.lang.Object getDelegate(D r1, E r2);

    @Override // kotlin.reflect.n
    @org.jetbrains.annotations.NotNull
    kotlin.reflect.q.a<D, E, V> getGetter();
}
