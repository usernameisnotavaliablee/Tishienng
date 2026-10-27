package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class c {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.reflect.jvm.internal.impl.resolve.scopes.c {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.c.a a = null;
        private static final int b = 0;

        static {
                kotlin.reflect.jvm.internal.impl.resolve.scopes.c$a r0 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.c$a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.resolve.scopes.c.a.a = r0
                kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.c
                int r1 = r0.b()
                int r2 = r0.d()
                int r0 = r0.i()
                r0 = r0 | r2
                int r0 = ~r0
                r0 = r0 & r1
                kotlin.reflect.jvm.internal.impl.resolve.scopes.c.a.b = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
        public int a() {
                r1 = this;
                int r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.c.a.b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends kotlin.reflect.jvm.internal.impl.resolve.scopes.c {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.c.b a = null;

        static {
                kotlin.reflect.jvm.internal.impl.resolve.scopes.c$b r0 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.c$b
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.resolve.scopes.c.b.a = r0
                return
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
        public int a() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract int a();

    public java.lang.String toString() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }
}
