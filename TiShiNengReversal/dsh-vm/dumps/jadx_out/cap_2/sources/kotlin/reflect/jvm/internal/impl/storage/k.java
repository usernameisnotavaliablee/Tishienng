package kotlin.reflect.jvm.internal.impl.storage;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface k {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.storage.k.a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        static final /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.k.a a = null;

        static {
                kotlin.reflect.jvm.internal.impl.storage.k$a r0 = new kotlin.reflect.jvm.internal.impl.storage.k$a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.storage.k.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.storage.d a(@org.jetbrains.annotations.Nullable java.lang.Runnable r2, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.InterruptedException, kotlin.n1> r3) {
                r1 = this;
                if (r2 == 0) goto La
                if (r3 == 0) goto La
                kotlin.reflect.jvm.internal.impl.storage.c r0 = new kotlin.reflect.jvm.internal.impl.storage.c
                r0.<init>(r2, r3)
                return r0
            La:
                kotlin.reflect.jvm.internal.impl.storage.d r2 = new kotlin.reflect.jvm.internal.impl.storage.d
                r3 = 1
                r0 = 0
                r2.<init>(r0, r3, r0)
                return r2
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.storage.k$a r0 = kotlin.reflect.jvm.internal.impl.storage.k.a.a
            kotlin.reflect.jvm.internal.impl.storage.k.a = r0
            return
    }

    void lock();

    void unlock();
}
