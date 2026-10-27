package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o3 extends kotlinx.coroutines.m0 {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.o3 a = null;

    static {
            kotlinx.coroutines.o3 r0 = new kotlinx.coroutines.o3
            r0.<init>()
            kotlinx.coroutines.o3.a = r0
            return
    }

    private o3() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.m0
    public void dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r0 = this;
            kotlinx.coroutines.s3$a r2 = kotlinx.coroutines.s3.b
            kotlin.coroutines.i$b r1 = r1.get(r2)
            kotlinx.coroutines.s3 r1 = (kotlinx.coroutines.s3) r1
            if (r1 == 0) goto Le
            r2 = 1
            r1.a = r2
            return
        Le:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls."
            r1.<init>(r2)
            throw r1
    }

    @Override // kotlinx.coroutines.m0
    public boolean isDispatchNeeded(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // kotlinx.coroutines.m0
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.m0 limitedParallelism(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "limitedParallelism is not supported for Dispatchers.Unconfined"
            r2.<init>(r0)
            throw r2
    }

    @Override // kotlinx.coroutines.m0
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Dispatchers.Unconfined"
            return r0
    }
}
