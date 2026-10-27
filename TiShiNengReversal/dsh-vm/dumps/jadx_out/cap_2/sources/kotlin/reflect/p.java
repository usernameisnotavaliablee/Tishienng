package kotlin.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface p<T, V> extends kotlin.reflect.n<V>, kotlin.jvm.functions.Function1<T, V> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a<T, V> extends kotlin.reflect.n.c<V>, kotlin.jvm.functions.Function1<T, V> {
    }

    V get(T r1);

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    java.lang.Object getDelegate(T r1);

    @Override // kotlin.reflect.n
    @org.jetbrains.annotations.NotNull
    kotlin.reflect.p.a<T, V> getGetter();
}
